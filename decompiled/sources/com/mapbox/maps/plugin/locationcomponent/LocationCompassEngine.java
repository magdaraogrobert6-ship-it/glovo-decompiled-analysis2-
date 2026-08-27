package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.WindowManager;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.maps.MapboxLogger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.isInteropViewHost;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationCompassEngine implements SensorEventListener {
    public final LinkedHashSet calibrationListeners;
    public final LinkedHashSet compassListeners;
    public final Sensor compassSensor;
    public long compassUpdateNextTimestamp;
    public final Sensor gravitySensor;
    public float[] gravityValues;
    public final Sensor magneticFieldSensor;
    public float[] magneticValues;
    public final float[] orientation;
    public final float[] rotationMatrix;
    public float[] rotationVectorValue;
    public final SensorManager sensorManager;
    public final WindowManager windowManager;

    public LocationCompassEngine(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        Object systemService2 = context.getApplicationContext().getSystemService("sensor");
        systemService2.getClass();
        SensorManager sensorManager = (SensorManager) systemService2;
        this.sensorManager = sensorManager;
        this.compassListeners = new LinkedHashSet();
        this.calibrationListeners = new LinkedHashSet();
        this.rotationMatrix = new float[9];
        this.gravityValues = new float[3];
        this.magneticValues = new float[3];
        this.orientation = new float[3];
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        this.compassSensor = defaultSensor;
        if (defaultSensor == null) {
            MapboxLogger.logW("LocationCompassProvider", "Rotation vector sensor not supported on device, falling back to accelerometer and magnetic field.");
            this.gravitySensor = sensorManager.getDefaultSensor(1);
            this.magneticFieldSensor = sensorManager.getDefaultSensor(2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        int i2;
        sensorEvent.getClass();
        int type = sensorEvent.sensor.getType();
        int i3 = 2;
        int i4 = 1;
        if (type == 1) {
            float[] fArr = sensorEvent.values;
            fArr.getClass();
            float[] fArr2 = this.gravityValues;
            if (fArr2 != null) {
                int length = fArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    float f = fArr2[i5];
                    fArr2[i5] = c8$$ExternalSyntheticOutline0.m(fArr[i5], f, 0.45f, f);
                }
                fArr = fArr2;
            }
            this.gravityValues = fArr;
        } else if (type == 2) {
            float[] fArr3 = sensorEvent.values;
            fArr3.getClass();
            float[] fArr4 = this.magneticValues;
            if (fArr4 != null) {
                int length2 = fArr3.length;
                for (int i6 = 0; i6 < length2; i6++) {
                    float f2 = fArr4[i6];
                    fArr4[i6] = c8$$ExternalSyntheticOutline0.m(fArr3[i6], f2, 0.45f, f2);
                }
                fArr3 = fArr4;
            }
            this.magneticValues = fArr3;
        } else if (type == 11) {
            this.rotationVectorValue = sensorEvent.values;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.compassUpdateNextTimestamp) {
            return;
        }
        float[] fArr5 = this.rotationVectorValue;
        float[] fArr6 = this.rotationMatrix;
        if (fArr5 != null) {
            SensorManager.getRotationMatrixFromVector(fArr6, fArr5);
        } else {
            SensorManager.getRotationMatrix(fArr6, null, this.gravityValues, this.magneticValues);
        }
        WindowManager windowManager = this.windowManager;
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 1) {
            i = 2;
            i2 = 129;
        } else if (rotation == 2) {
            i = 129;
            i2 = 130;
        } else if (rotation != 3) {
            i2 = 2;
            i = 1;
        } else {
            i2 = 1;
            i = 130;
        }
        float[] fArr7 = new float[9];
        SensorManager.remapCoordinateSystem(fArr6, i, i2, fArr7);
        float[] fArr8 = this.orientation;
        SensorManager.getOrientation(fArr7, fArr8);
        double d = fArr8[1];
        if (d < -0.7853981633974483d) {
            int rotation2 = windowManager.getDefaultDisplay().getRotation();
            if (rotation2 == 1) {
                i3 = 3;
                i4 = 129;
            } else if (rotation2 == 2) {
                i3 = 131;
                i4 = i3;
                i3 = 129;
            } else if (rotation2 != 3) {
                i3 = 1;
                i4 = 3;
            } else {
                i3 = 131;
            }
        } else if (d > 0.7853981633974483d) {
            int rotation3 = windowManager.getDefaultDisplay().getRotation();
            if (rotation3 == 1) {
                i3 = 131;
                i4 = 129;
            } else if (rotation3 == 2) {
                i3 = 3;
                i4 = i3;
                i3 = 129;
            } else if (rotation3 != 3) {
                i3 = 1;
                i4 = 131;
            } else {
                i3 = 3;
            }
        } else if (Math.abs(fArr8[2]) > 1.5707963267948966d) {
            int rotation4 = windowManager.getDefaultDisplay().getRotation();
            if (rotation4 == 1) {
                i3 = 130;
                i4 = 129;
            } else if (rotation4 == 2) {
                i4 = i3;
                i3 = 129;
            } else if (rotation4 != 3) {
                i3 = 1;
                i4 = 130;
            }
        } else {
            i3 = i;
            i4 = i2;
        }
        SensorManager.remapCoordinateSystem(fArr6, i3, i4, fArr7);
        SensorManager.getOrientation(fArr7, fArr8);
        float degrees = (float) Math.toDegrees(fArr8[0]);
        Iterator it = this.compassListeners.iterator();
        while (it.hasNext()) {
            isInteropViewHost.RemoteActionCompatParcelizer(Double.valueOf(degrees), ((DefaultLocationProvider$deviceOrientationFlow$1$$ExternalSyntheticLambda0) it.next()).f$0);
        }
        this.compassUpdateNextTimestamp = jElapsedRealtime + 500;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (i == 0) {
            MapboxLogger.logW("LocationCompassProvider", "Compass sensor is unreliable, device calibration is needed.");
            Iterator it = this.calibrationListeners.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
    }
}
