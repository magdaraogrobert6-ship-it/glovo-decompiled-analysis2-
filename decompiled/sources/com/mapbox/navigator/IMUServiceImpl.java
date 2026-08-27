package com.mapbox.navigator;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.mapbox.geojson.Point;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
final class IMUServiceImpl implements IMUService, SensorEventListener {
    private static final long CALLBACK_UPDATE_DELAY_MILLIS = 10;
    public static final Companion Companion = new Companion(null);
    private static final int SENSOR_DELAY_MICROS = 20000;
    public static final String TAG = "MBNNIMUService";
    private final Sensor accelerometerSensor;
    private final Map<Integer, AltimeterUpdateCallback> altimeterCallbacks;
    private final Map<Integer, CompassUpdateCallback> compassCallbacks;
    private final Context context;
    private final float[] geomagneticXyz;
    private final float[] gravity;
    private final Sensor gravitySensor;
    private final Sensor gyroscopeSensor;
    private Handler handler;
    private HandlerThread handlerThread;
    private final Map<Integer, IMUUpdateCallback> imuCallbacks;
    private long lastTimestampNanoseconds;
    private long lastTimestampNotifiedNanoseconds;
    private final AtomicInteger magneticDeclination;
    private final Sensor magneticSensor;
    private final AtomicInteger nextCallbackId;
    private final Runnable notifyCallbacksRunnable;
    private final float[] orientations;
    private final Sensor pressureSensor;
    private final float[] rotationMatrix;
    private final Sensor rotationSensor;
    private final float[] rotations;
    private final SensorManager sensorManager;
    private final float[] userAccelerationWithGravity;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IMUService createPlatformIMUService() {
            return new IMUServiceImpl(MapboxNavigationNative.INSTANCE.getAppContext$dash_native_release());
        }

        private Companion() {
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final void handlePressure(long j, float[] fArr) {
        synchronized (this) {
            fArr.getClass();
            AltimeterData altimeterData = new AltimeterData((float) (((double) fArr[0]) * 0.1d), j);
            Iterator<Map.Entry<Integer, AltimeterUpdateCallback>> it = this.altimeterCallbacks.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().run(altimeterData);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.mapbox.navigator.IMUService
    public int registerAltimeterUpdateCallback(AltimeterUpdateCallback altimeterUpdateCallback) {
        int iMakeNextCallbackId;
        synchronized (this) {
            altimeterUpdateCallback.getClass();
            iMakeNextCallbackId = makeNextCallbackId();
            this.altimeterCallbacks.put(Integer.valueOf(iMakeNextCallbackId), altimeterUpdateCallback);
            start();
        }
        return iMakeNextCallbackId;
    }

    @Override // com.mapbox.navigator.IMUService
    public int registerCompassUpdateCallback(CompassUpdateCallback compassUpdateCallback) {
        int iMakeNextCallbackId;
        synchronized (this) {
            compassUpdateCallback.getClass();
            iMakeNextCallbackId = makeNextCallbackId();
            this.compassCallbacks.put(Integer.valueOf(iMakeNextCallbackId), compassUpdateCallback);
            start();
        }
        return iMakeNextCallbackId;
    }

    @Override // com.mapbox.navigator.IMUService
    public int registerIMUUpdateCallback(IMUUpdateCallback iMUUpdateCallback) {
        int iMakeNextCallbackId;
        synchronized (this) {
            iMUUpdateCallback.getClass();
            iMakeNextCallbackId = makeNextCallbackId();
            this.imuCallbacks.put(Integer.valueOf(iMakeNextCallbackId), iMUUpdateCallback);
            start();
        }
        return iMakeNextCallbackId;
    }

    @Override // com.mapbox.navigator.IMUService
    public void unregisterCallback(int i) {
        synchronized (this) {
            this.compassCallbacks.remove(Integer.valueOf(i));
            this.imuCallbacks.remove(Integer.valueOf(i));
            this.altimeterCallbacks.remove(Integer.valueOf(i));
            if (this.compassCallbacks.isEmpty() && this.imuCallbacks.isEmpty() && this.altimeterCallbacks.isEmpty()) {
                stop();
            }
        }
    }

    public static final IMUService createPlatformIMUService() {
        return Companion.createPlatformIMUService();
    }

    private final void notifyCallbacks() {
        double dNormalizeAngle = IMUServiceKt.normalizeAngle(Math.toDegrees(this.orientations[0]));
        double dNormalizeAngle2 = IMUServiceKt.normalizeAngle(((double) Float.intBitsToFloat(this.magneticDeclination.get())) + dNormalizeAngle);
        float[] fArr = this.userAccelerationWithGravity;
        float f = fArr[0];
        float[] fArr2 = this.gravity;
        Point3d point3d = new Point3d((f - fArr2[0]) / 9.80665f, (fArr[1] - fArr2[1]) / 9.80665f, (fArr[2] - fArr2[2]) / 9.80665f);
        float[] fArr3 = this.orientations;
        float f2 = (float) dNormalizeAngle;
        MotionData motionData = new MotionData(new AttitudeData(fArr3[1], fArr3[0], fArr3[2]), IMUServiceKt.toPoint3d(this.rotations), IMUServiceKt.toPoint3d(this.gravity), point3d, IMUServiceKt.toPoint3d(this.geomagneticXyz), f2, this.lastTimestampNanoseconds);
        CompassData compassData = new CompassData(Float.valueOf((float) dNormalizeAngle2), Float.valueOf(f2), null, IMUServiceKt.toPoint3d(this.geomagneticXyz), this.lastTimestampNanoseconds);
        synchronized (this) {
            if (this.lastTimestampNanoseconds > this.lastTimestampNotifiedNanoseconds) {
                Iterator<Map.Entry<Integer, IMUUpdateCallback>> it = this.imuCallbacks.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().run(motionData);
                }
                Iterator<Map.Entry<Integer, CompassUpdateCallback>> it2 = this.compassCallbacks.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().run(compassData);
                }
                this.lastTimestampNotifiedNanoseconds = this.lastTimestampNanoseconds;
            }
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.notifyCallbacksRunnable, 10L);
        }
    }

    private final void stop() {
        this.sensorManager.unregisterListener(this);
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.handler = null;
        this.compassCallbacks.clear();
        this.imuCallbacks.clear();
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.handlerThread = null;
    }

    public IMUServiceImpl(Context context) {
        context.getClass();
        this.context = context;
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.accelerometerSensor = sensorManager.getDefaultSensor(1);
        this.magneticSensor = sensorManager.getDefaultSensor(2);
        this.rotationSensor = sensorManager.getDefaultSensor(11);
        this.gyroscopeSensor = sensorManager.getDefaultSensor(4);
        this.gravitySensor = sensorManager.getDefaultSensor(9);
        this.pressureSensor = sensorManager.getDefaultSensor(6);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = -1.0f;
        }
        this.gravity = fArr;
        float[] fArr2 = new float[3];
        for (int i2 = 0; i2 < 3; i2++) {
            fArr2[i2] = -1.0f;
        }
        this.geomagneticXyz = fArr2;
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = -1.0f;
        }
        this.rotations = fArr3;
        float[] fArr4 = new float[3];
        for (int i4 = 0; i4 < 3; i4++) {
            fArr4[i4] = -1.0f;
        }
        this.orientations = fArr4;
        float[] fArr5 = new float[3];
        for (int i5 = 0; i5 < 3; i5++) {
            fArr5[i5] = -1.0f;
        }
        this.userAccelerationWithGravity = fArr5;
        float[] fArr6 = new float[9];
        for (int i6 = 0; i6 < 9; i6++) {
            fArr6[i6] = -1.0f;
        }
        this.rotationMatrix = fArr6;
        this.compassCallbacks = new LinkedHashMap();
        this.imuCallbacks = new LinkedHashMap();
        this.altimeterCallbacks = new LinkedHashMap();
        this.nextCallbackId = new AtomicInteger(0);
        this.magneticDeclination = new AtomicInteger(Float.floatToIntBits(0.0f));
        this.notifyCallbacksRunnable = new Runnable() { // from class: com.mapbox.navigator.IMUServiceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IMUServiceImpl.notifyCallbacksRunnable$lambda$0(this.f$0);
            }
        };
    }

    private final int makeNextCallbackId() {
        return this.nextCallbackId.addAndGet(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyCallbacksRunnable$lambda$0(IMUServiceImpl iMUServiceImpl) {
        iMUServiceImpl.getClass();
        iMUServiceImpl.notifyCallbacks();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        if (sensorEvent.accuracy == 0) {
            return;
        }
        if (sensorEvent.sensor.getType() == 6) {
            long j = sensorEvent.timestamp;
            float[] fArr = sensorEvent.values;
            fArr.getClass();
            handlePressure(j, fArr);
            return;
        }
        synchronized (this) {
            this.lastTimestampNanoseconds = sensorEvent.timestamp;
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                float[] fArr2 = this.userAccelerationWithGravity;
                float[] fArr3 = sensorEvent.values;
                fArr3.getClass();
                IMUServiceKt.copyFrom$default(fArr2, fArr3, 0, 0, 0, 14, null);
            } else if (type == 2) {
                float[] fArr4 = this.geomagneticXyz;
                float[] fArr5 = sensorEvent.values;
                fArr5.getClass();
                IMUServiceKt.copyFrom$default(fArr4, fArr5, 0, 0, 0, 14, null);
            } else if (type == 4) {
                float[] fArr6 = this.rotations;
                float[] fArr7 = sensorEvent.values;
                fArr7.getClass();
                IMUServiceKt.copyFrom$default(fArr6, fArr7, 0, 0, 0, 14, null);
            } else if (type == 9) {
                float[] fArr8 = this.gravity;
                float[] fArr9 = sensorEvent.values;
                fArr9.getClass();
                IMUServiceKt.copyFrom$default(fArr8, fArr9, 0, 0, 0, 14, null);
            } else if (type == 11) {
                SensorManager.getRotationMatrixFromVector(this.rotationMatrix, sensorEvent.values);
                SensorManager.getOrientation(this.rotationMatrix, this.orientations);
            }
        }
    }

    @Override // com.mapbox.navigator.IMUService
    public void update(Point point, Float f) {
        point.getClass();
        this.magneticDeclination.set(Float.floatToIntBits(new GeomagneticField((float) point.coordinates().get(1).doubleValue(), (float) point.coordinates().get(0).doubleValue(), f != null ? f.floatValue() : 0.0f, System.currentTimeMillis()).getDeclination()));
    }

    private final void start() {
        if (this.handlerThread != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("com.mapbox.navnative.imu");
        this.handlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.handlerThread;
        handlerThread2.getClass();
        Handler handler = new Handler(handlerThread2.getLooper());
        this.handler = handler;
        this.sensorManager.registerListener(this, this.accelerometerSensor, SENSOR_DELAY_MICROS, handler);
        SensorManager sensorManager = this.sensorManager;
        Sensor sensor = this.magneticSensor;
        Handler handler2 = this.handler;
        handler2.getClass();
        sensorManager.registerListener(this, sensor, SENSOR_DELAY_MICROS, handler2);
        SensorManager sensorManager2 = this.sensorManager;
        Sensor sensor2 = this.rotationSensor;
        Handler handler3 = this.handler;
        handler3.getClass();
        sensorManager2.registerListener(this, sensor2, SENSOR_DELAY_MICROS, handler3);
        SensorManager sensorManager3 = this.sensorManager;
        Sensor sensor3 = this.gravitySensor;
        Handler handler4 = this.handler;
        handler4.getClass();
        sensorManager3.registerListener(this, sensor3, SENSOR_DELAY_MICROS, handler4);
        SensorManager sensorManager4 = this.sensorManager;
        Sensor sensor4 = this.gyroscopeSensor;
        Handler handler5 = this.handler;
        handler5.getClass();
        sensorManager4.registerListener(this, sensor4, SENSOR_DELAY_MICROS, handler5);
        Sensor sensor5 = this.pressureSensor;
        if (sensor5 != null) {
            SensorManager sensorManager5 = this.sensorManager;
            Handler handler6 = this.handler;
            handler6.getClass();
            sensorManager5.registerListener(this, sensor5, SENSOR_DELAY_MICROS, handler6);
        }
        Handler handler7 = this.handler;
        if (handler7 != null) {
            handler7.postDelayed(this.notifyCallbacksRunnable, 10L);
        }
    }
}
