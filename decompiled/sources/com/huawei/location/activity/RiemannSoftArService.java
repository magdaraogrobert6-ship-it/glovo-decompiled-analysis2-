package com.huawei.location.activity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.location.entity.activity.ActivityRecognitionResult;
import com.huawei.hms.location.entity.activity.ActivityTransition;
import com.huawei.hms.location.entity.activity.ActivityTransitionRequest;
import com.huawei.hms.location.entity.activity.DetectedActivity;
import com.huawei.location.activity.util.JniUtils;
import com.huawei.location.base.activity.AbstractARServiceManager;
import com.huawei.location.base.activity.ActivityRecognitionConstantsMapping;
import com.huawei.location.base.activity.ActivityRecognitionMappingManager;
import com.huawei.location.base.activity.ActivityTransitionMappingManager;
import com.huawei.location.base.activity.callback.ARCallback;
import com.huawei.location.base.activity.callback.ATCallback;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.base.activity.entity.ClientInfo;
import com.huawei.location.base.activity.entity.MovementEvent;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.location.logic.zp;
import com.huawei.location.nlp.scan.FB;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.MenuItemOption;
import o.WeakCache;
import o.WindowInfo;
import o.WindowInfoImpl;
import o.WrappedCompositionsetContent1211;
import o.accessgetGlobalKeyboardModifierscp;
import o.clearWeakReferences;
import o.getHostDefault;
import o.getOnViewCreatedCallbackannotations;
import o.getOrder;
import o.placeAtf8xVGno;
import o.setContainerDpSizeEaSLcWc;
import o.setContainerSizeozmzZPI;

/* JADX INFO: loaded from: classes2.dex */
public class RiemannSoftArService extends AbstractARServiceManager implements SensorEventListener {
    private static final int ACQUISITION_FREQUENCY = 10000;
    public static final long ACTIVITY_TRANSITION_UPDATETIMNE = 1000;
    private static final int BASE_CONFIDENCE = 50;
    private static final int FULL_CONFIDENCE = 100;
    private static final long INIT_VALUE = -1;
    private static final int JUDGE_INVALID_TIME = 100000000;
    private static final int MAX_INVALID_TIME = 10000;
    private static final int ONE = 1;
    private static final int SAMPLE_LIST_SIZE = 100;
    private static final int SAMPLE_SIZE = 4;
    private static final int SENSOR_LIST_ALL = 656;
    private static final int SENSOR_LIST_SIZE = 256;
    private static final String TAG = "RiemannSoftArService";
    private static final int ZERO = 0;
    private static volatile RiemannSoftArService instance;
    private Sensor acc;
    private List<accessgetGlobalKeyboardModifierscp> accRecordList;
    private boolean alreadyRegister;
    private boolean alreadyRequestAR;
    private setContainerSizeozmzZPI atProvider;
    private Context context;
    private long delay;
    private boolean needToWait;
    private Sensor ori;
    private List<accessgetGlobalKeyboardModifierscp> oriRecordList;
    private SensorManager sensorManager;
    private long updatTime;
    private static final byte[] SYNC_LOCK = new byte[0];
    private static final byte[] SYNC_LIST_LOCK = new byte[0];

    private boolean checkDateVilid(List<accessgetGlobalKeyboardModifierscp> list, List<accessgetGlobalKeyboardModifierscp> list2) {
        String str;
        if (Math.abs(list.get(0).read - list2.get(0).read) > 100000000) {
            str = "difference time  is : " + (list.get(0).read - list2.get(0).read);
        } else {
            int size = list.size() - 1;
            if (Math.abs(list.get(size).read - list2.get(size).read) <= 100000000) {
                return true;
            }
            str = "difference time  is : " + (list.get(size).read - list2.get(size).read);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, str);
        return false;
    }

    private static void freeAssets() {
        JniUtils.freeBuffer();
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public boolean connectService() {
        return false;
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public boolean disConnectService() {
        return false;
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public boolean isConnected() {
        return false;
    }

    public void modelFileLoadFail(int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    private RiemannSoftArService() {
        super(new ActivityTransitionMappingManager(), new ActivityRecognitionMappingManager());
        this.accRecordList = new CopyOnWriteArrayList();
        this.oriRecordList = new CopyOnWriteArrayList();
        this.context = placeAtf8xVGno.RemoteActionCompatParcelizer;
        this.needToWait = false;
        this.updatTime = System.currentTimeMillis();
        this.alreadyRegister = false;
        this.alreadyRequestAR = false;
        Object systemService = this.context.getSystemService("sensor");
        if (!(systemService instanceof SensorManager)) {
            WrappedCompositionsetContent1211.read();
            return;
        }
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.acc = sensorManager.getDefaultSensor(1);
        this.ori = this.sensorManager.getDefaultSensor(3);
        setContainerSizeozmzZPI setcontainersizeozmzzpi = new setContainerSizeozmzZPI();
        setcontainersizeozmzzpi.read = -2;
        setcontainersizeozmzzpi.IconCompatParcelizer = -2;
        setcontainersizeozmzzpi.RemoteActionCompatParcelizer = -2;
        setcontainersizeozmzzpi.MediaMetadataCompat = 0;
        setcontainersizeozmzzpi.serializer = 0;
        setcontainersizeozmzzpi.write = 0;
        setcontainersizeozmzzpi.RatingCompat = 0;
        setcontainersizeozmzzpi.MediaDescriptionCompat = new i$d.a(12, setcontainersizeozmzzpi);
        this.atProvider = setcontainersizeozmzzpi;
    }

    private accessgetGlobalKeyboardModifierscp event2Acc(SensorEvent sensorEvent) {
        accessgetGlobalKeyboardModifierscp accessgetglobalkeyboardmodifierscp = new accessgetGlobalKeyboardModifierscp();
        accessgetglobalkeyboardmodifierscp.read = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        accessgetglobalkeyboardmodifierscp.serializer = fArr[0];
        accessgetglobalkeyboardmodifierscp.write = fArr[1];
        accessgetglobalkeyboardmodifierscp.IconCompatParcelizer = fArr[2];
        return accessgetglobalkeyboardmodifierscp;
    }

    private List<DetectedActivity> mergeList(List<DetectedActivity> list, List<DetectedActivity> list2) {
        if (list2 == null || list2.size() == 0) {
            WrappedCompositionsetContent1211.read(TAG, "ResultPredict.predict result is null !");
            return list;
        }
        if (list == null || list.size() == 0) {
            return list2;
        }
        for (int i = 0; i < list.size(); i++) {
            int confidence = list.get(i).getConfidence();
            list.get(i).setConfidence(list2.get(i).getConfidence() + confidence);
        }
        return list;
    }

    private void unregister() {
        try {
            if (this.alreadyRegister) {
                freeAssets();
                SensorManager sensorManager = this.sensorManager;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.acc);
                    this.sensorManager.unregisterListener(this, this.ori);
                    this.alreadyRegister = false;
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "unregister acc & ori success");
                }
            }
        } catch (LocationServiceException e) {
            throw e;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read(TAG, "unregister sensor listener failed");
        }
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public getOnViewCreatedCallbackannotations getTask() {
        return new getOnViewCreatedCallbackannotations(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1 || sensorEvent.sensor.getType() == 3) {
            checkIfValid();
            this.updatTime = System.currentTimeMillis();
            if (sensorEvent.sensor.getType() == 1) {
                this.accRecordList.add(event2Acc(sensorEvent));
                synchronized (SYNC_LIST_LOCK) {
                    if (this.accRecordList.size() > SENSOR_LIST_ALL) {
                        this.accRecordList.remove(0);
                    }
                }
            } else {
                this.oriRecordList.add(event2Acc(sensorEvent));
                synchronized (SYNC_LIST_LOCK) {
                    if (this.oriRecordList.size() > SENSOR_LIST_ALL) {
                        this.oriRecordList.remove(0);
                    }
                }
            }
            if (!this.needToWait || this.oriRecordList.size() < 256 || this.accRecordList.size() < 256) {
                return;
            }
            byte[] bArr = SYNC_LOCK;
            synchronized (bArr) {
                bArr.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DetectedActivity> getDetectedActivities() {
        checkIfValid();
        try {
            if (this.accRecordList.size() < 256 || this.oriRecordList.size() < 256) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "need to wait for data !");
                this.needToWait = true;
                byte[] bArr = SYNC_LOCK;
                synchronized (bArr) {
                    bArr.wait();
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "wait end!");
                this.needToWait = false;
            }
        } catch (InterruptedException unused) {
            WrappedCompositionsetContent1211.read();
        }
        ArrayList arrayList = new ArrayList(dealWithDatas());
        Collections.sort(arrayList, new FB(15));
        return arrayList;
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, ATCallback aTCallback, ClientInfo clientInfo) {
        setContainerSizeozmzZPI setcontainersizeozmzzpi;
        MenuItemOption.IconCompatParcelizer(activityTransitionRequest);
        List<ActivityTransition> transitions = activityTransitionRequest.getTransitions();
        if (transitions == null || transitions.size() < 1) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "requestActivityTransitionUpdates ,null == transitions || transitions.size() < 1");
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "requestActivityTransitionUpdates");
        this.transitionMappingManager.addActivityTransitionMappingInfo(transitions, aTCallback, clientInfo);
        if (!this.alreadyRequestAR && (setcontainersizeozmzzpi = this.atProvider) != null) {
            this.recognitionMappingManager.addActivityUpdatesMappingInfo(1000L, setcontainersizeozmzzpi.MediaDescriptionCompat, clientInfo);
            this.alreadyRequestAR = true;
        }
        scheduleTimer();
    }

    private void checkIfValid() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (SYNC_LIST_LOCK) {
            if (jCurrentTimeMillis - this.updatTime > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "sensor data is not valid !");
                this.oriRecordList.clear();
                this.accRecordList.clear();
            }
        }
    }

    private List<DetectedActivity> dealWithDatas() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        String str;
        int i5;
        int i6;
        List<DetectedActivity> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList(this.accRecordList);
        CopyOnWriteArrayList copyOnWriteArrayList5 = new CopyOnWriteArrayList(this.oriRecordList);
        int i7 = 256;
        int i8 = 256;
        int i9 = 0;
        int i10 = 0;
        boolean z2 = false;
        int i11 = 0;
        while (i9 <= 4 && copyOnWriteArrayList4.size() >= i8 && copyOnWriteArrayList5.size() >= i8) {
            if (!checkDateVilid(copyOnWriteArrayList4.subList(i10, i8), copyOnWriteArrayList5.subList(i10, i8))) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "data not valid ! drop it ");
                i8 += 100;
                i4 = i7;
                copyOnWriteArrayList = copyOnWriteArrayList4;
                copyOnWriteArrayList2 = copyOnWriteArrayList5;
                i = i9;
                i5 = i10 + 100;
                z2 = true;
            } else {
                int i12 = i11 + 1;
                List listSubList = copyOnWriteArrayList4.subList(i10, i8);
                List listSubList2 = copyOnWriteArrayList5.subList(i10, i8);
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ResultPredict", "predict...");
                ArrayList arrayList = new ArrayList(i7);
                ArrayList arrayList2 = new ArrayList(i7);
                int i13 = 0;
                while (i13 < i7) {
                    int i14 = i12;
                    float[] fArr = {((accessgetGlobalKeyboardModifierscp) listSubList.get(i13)).serializer, ((accessgetGlobalKeyboardModifierscp) listSubList.get(i13)).write, ((accessgetGlobalKeyboardModifierscp) listSubList.get(i13)).IconCompatParcelizer};
                    float[] fArr2 = {((accessgetGlobalKeyboardModifierscp) listSubList2.get(i13)).serializer, ((accessgetGlobalKeyboardModifierscp) listSubList2.get(i13)).write, ((accessgetGlobalKeyboardModifierscp) listSubList2.get(i13)).IconCompatParcelizer};
                    arrayList.add(fArr);
                    arrayList2.add(fArr2);
                    i13++;
                    copyOnWriteArrayList5 = copyOnWriteArrayList5;
                    copyOnWriteArrayList4 = copyOnWriteArrayList4;
                    i12 = i14;
                    listSubList = listSubList;
                    i7 = 256;
                }
                copyOnWriteArrayList = copyOnWriteArrayList4;
                copyOnWriteArrayList2 = copyOnWriteArrayList5;
                int i15 = i12;
                ArrayList arrayListIconCompatParcelizer = WindowInfoImpl.IconCompatParcelizer(arrayList);
                ArrayList arrayListIconCompatParcelizer2 = WindowInfoImpl.IconCompatParcelizer(arrayList2);
                int[] iArr = {arrayListIconCompatParcelizer.size(), ((float[]) arrayListIconCompatParcelizer.get(0)).length};
                Class cls = Float.TYPE;
                float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, iArr);
                float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, arrayListIconCompatParcelizer2.size(), ((float[]) arrayListIconCompatParcelizer2.get(0)).length);
                for (int i16 = 0; i16 < arrayListIconCompatParcelizer.size(); i16++) {
                    System.arraycopy(arrayListIconCompatParcelizer.get(i16), 0, fArr3[i16], 0, ((float[]) arrayListIconCompatParcelizer.get(i16)).length);
                }
                for (int i17 = 0; i17 < arrayListIconCompatParcelizer2.size(); i17++) {
                    System.arraycopy(arrayListIconCompatParcelizer2.get(i17), 0, fArr4[i17], 0, ((float[]) arrayListIconCompatParcelizer2.get(i17)).length);
                }
                char c = 0;
                if (fArr3.length < 1) {
                    i = i9;
                    i2 = i8;
                    i3 = i10;
                    z = z2;
                } else {
                    float[][] fArr5 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, fArr3.length, fArr3[0].length);
                    int i18 = 0;
                    while (i18 < fArr3.length) {
                        float[] fArr6 = fArr4[i18];
                        float f = fArr6[c];
                        float f2 = fArr6[1];
                        float f3 = fArr6[2];
                        float[][] fArr7 = fArr4;
                        float[] fArr8 = new float[3];
                        fArr8[c] = f;
                        fArr8[1] = f2;
                        fArr8[2] = f3;
                        float[] fArr9 = fArr3[i18];
                        float[] fArr10 = new float[1];
                        fArr10[c] = fArr9[c];
                        float[][] fArr11 = fArr3;
                        float[] fArr12 = new float[1];
                        fArr12[c] = fArr9[1];
                        float[] fArr13 = new float[1];
                        fArr13[c] = fArr9[2];
                        float[][] fArr14 = {fArr10, fArr12, fArr13};
                        float f4 = fArr8[c];
                        float f5 = fArr8[1];
                        float f6 = fArr8[2];
                        double d = f4 * 0.017453292f;
                        boolean z3 = z2;
                        float fCos = (float) Math.cos(d);
                        float fSin = (float) Math.sin(d);
                        double d2 = f6 * 0.017453292f;
                        int i19 = i9;
                        float fCos2 = (float) Math.cos(d2);
                        float fSin2 = (float) Math.sin(d2);
                        double d3 = f5 * 0.017453292f;
                        float fCos3 = (float) Math.cos(d3);
                        float fSin3 = (float) Math.sin(d3);
                        int i20 = i8;
                        float[][] fArr15 = {new float[]{fCos, fSin * (-1.0f), 0.0f}, new float[]{fSin, fCos, 0.0f}, new float[]{0.0f, 0.0f, 1.0f}};
                        int i21 = i10;
                        float[][] fArr16 = {new float[]{fCos2, 0.0f, fSin2}, new float[]{0.0f, 1.0f, 0.0f}, new float[]{fSin2 * (-1.0f), 0.0f, fCos2}};
                        float[][] fArr17 = {new float[]{1.0f, 0.0f, 0.0f}, new float[]{0.0f, fCos3, fSin3 * (-1.0f)}, new float[]{0.0f, fSin3, fCos3}};
                        ArrayList arrayList3 = new ArrayList(3);
                        for (int i22 = 0; i22 < 3; i22++) {
                            arrayList3.add(fArr17[i22]);
                        }
                        ArrayList arrayList4 = new ArrayList(3);
                        for (int i23 = 0; i23 < 3; i23++) {
                            arrayList4.add(fArr16[i23]);
                        }
                        ArrayList arrayList5 = new ArrayList(3);
                        for (int i24 = 0; i24 < 3; i24++) {
                            arrayList5.add(fArr15[i24]);
                        }
                        ArrayList arrayListIconCompatParcelizer3 = WindowInfo.IconCompatParcelizer(arrayList3, arrayList4, arrayList3.size());
                        ArrayList arrayListIconCompatParcelizer4 = WindowInfo.IconCompatParcelizer(arrayListIconCompatParcelizer3, arrayList5, arrayListIconCompatParcelizer3.size());
                        new ArrayList(3);
                        float[][] fArr18 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, arrayListIconCompatParcelizer4.size(), ((float[]) arrayListIconCompatParcelizer4.get(0)).length);
                        for (int i25 = 0; i25 < arrayListIconCompatParcelizer4.size(); i25++) {
                            System.arraycopy(arrayListIconCompatParcelizer4.get(i25), 0, fArr18[i25], 0, ((float[]) arrayListIconCompatParcelizer4.get(i25)).length);
                        }
                        int length = fArr18.length;
                        int length2 = fArr18[0].length;
                        float[][] fArr19 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, length2, length);
                        for (int i26 = 0; i26 < length; i26++) {
                            for (int i27 = 0; i27 < length2; i27++) {
                                fArr19[i27][i26] = fArr18[i26][i27];
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(length);
                        for (float[] fArr20 : fArr19) {
                            arrayList6.add(fArr20);
                        }
                        ArrayList arrayList7 = new ArrayList(3);
                        int i28 = 0;
                        for (int i29 = 3; i28 < i29; i29 = 3) {
                            arrayList7.add(fArr14[i28]);
                            i28++;
                        }
                        float[][] fArr21 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, arrayList6.size(), ((float[]) arrayList6.get(0)).length);
                        for (int i30 = 0; i30 < arrayList6.size(); i30++) {
                            System.arraycopy(arrayList6.get(i30), 0, fArr21[i30], 0, ((float[]) arrayList6.get(i30)).length);
                        }
                        float[][] fArr22 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, arrayList7.size(), ((float[]) arrayList7.get(0)).length);
                        for (int i31 = 0; i31 < arrayList7.size(); i31++) {
                            System.arraycopy(arrayList7.get(i31), 0, fArr22[i31], 0, ((float[]) arrayList7.get(i31)).length);
                        }
                        int i32 = 0;
                        float[][] fArr23 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, fArr21.length, fArr22[0].length);
                        int i33 = 0;
                        while (i33 < fArr21.length) {
                            int i34 = i32;
                            while (i34 < fArr22[i32].length) {
                                float f7 = 0.0f;
                                for (int i35 = 0; i35 < fArr22.length; i35++) {
                                    f7 += fArr21[i33][i35] * fArr22[i35][i34];
                                }
                                fArr23[i33][i34] = f7;
                                i34++;
                                i32 = 0;
                            }
                            i33++;
                            i32 = 0;
                        }
                        float[] fArr24 = fArr5[i18];
                        fArr24[0] = fArr23[0][0];
                        fArr24[1] = fArr23[1][0];
                        fArr24[2] = fArr23[2][0];
                        i18++;
                        i10 = i21;
                        fArr4 = fArr7;
                        fArr3 = fArr11;
                        z2 = z3;
                        i9 = i19;
                        i8 = i20;
                        c = 0;
                    }
                    i = i9;
                    i2 = i8;
                    i3 = i10;
                    z = z2;
                    ArrayList arrayList8 = new ArrayList(arrayListIconCompatParcelizer.size());
                    for (float[] fArr25 : fArr5) {
                        arrayList8.add(fArr25);
                    }
                    arrayListIconCompatParcelizer = arrayList8;
                }
                for (int i36 = 0; i36 < 256; i36++) {
                    ((float[]) arrayListIconCompatParcelizer.get(i36))[2] = (float) (((double) ((float[]) arrayListIconCompatParcelizer.get(i36))[2]) - 9.81d);
                }
                float[][] fArr26 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, arrayListIconCompatParcelizer.size(), ((float[]) arrayListIconCompatParcelizer.get(0)).length);
                for (int i37 = 0; i37 < arrayListIconCompatParcelizer.size(); i37++) {
                    System.arraycopy(arrayListIconCompatParcelizer.get(i37), 0, fArr26[i37], 0, ((float[]) arrayListIconCompatParcelizer.get(i37)).length);
                }
                if (fArr26.length != 0) {
                    float[][] fArr27 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, fArr26.length, fArr26[0].length);
                    int i38 = 0;
                    for (int i39 = 0; i38 < fArr26[i39].length; i39 = 0) {
                        float[][] fArr28 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, arrayListIconCompatParcelizer.size(), ((float[]) arrayListIconCompatParcelizer.get(i39)).length);
                        for (int i40 = 0; i40 < arrayListIconCompatParcelizer.size(); i40++) {
                            System.arraycopy(arrayListIconCompatParcelizer.get(i40), 0, fArr28[i40], 0, ((float[]) arrayListIconCompatParcelizer.get(i40)).length);
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (float[] fArr29 : fArr28) {
                            if (i38 >= 0) {
                                if (i38 < fArr29.length) {
                                    arrayList9.add(Float.valueOf(fArr29[i38]));
                                }
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        for (int i41 = -40; i41 < 41; i41++) {
                            arrayList10.add(Float.valueOf((float) Math.exp(((double) (i41 * i41)) * (-0.005d))));
                        }
                        int size = (arrayList10.size() - 1) / 2;
                        int size2 = arrayList9.size();
                        int i42 = (size * 2) + size2;
                        ArrayList arrayList11 = new ArrayList(i42);
                        for (int i43 = 0; i43 < i42; i43++) {
                            if (i43 < size) {
                                i6 = size - i43;
                            } else {
                                int i44 = size2 + size;
                                if (i43 < i44) {
                                    i6 = i43 - size;
                                } else {
                                    if (i43 >= i44) {
                                        i6 = (((i44 - 1) * 2) - i43) - size;
                                    }
                                }
                            }
                            arrayList11.add((Float) arrayList9.get(i6));
                        }
                        ArrayList arrayList12 = new ArrayList();
                        int i45 = 0;
                        while (i45 < size2) {
                            int i46 = i45 + size;
                            ArrayList arrayList13 = new ArrayList(arrayList11.subList(i46 - size, i46 + size + 1));
                            double dFloatValue = 0.0d;
                            double dFloatValue2 = 0.0d;
                            int i47 = 0;
                            while (i47 < arrayList10.size()) {
                                dFloatValue += (double) (((Float) arrayList13.get(i47)).floatValue() * ((Float) arrayList10.get(i47)).floatValue());
                                dFloatValue2 += (double) ((Float) arrayList10.get(i47)).floatValue();
                                i47++;
                                size2 = size2;
                            }
                            arrayList12.add(Float.valueOf((float) (dFloatValue / dFloatValue2)));
                            i45++;
                            size2 = size2;
                        }
                        for (int i48 = 0; i48 < fArr26.length; i48++) {
                            fArr27[i48][i38] = ((Float) arrayList12.get(i48)).floatValue();
                        }
                        i38++;
                    }
                    ArrayList arrayList14 = new ArrayList(arrayListIconCompatParcelizer.size());
                    for (float[] fArr30 : fArr27) {
                        arrayList14.add(fArr30);
                    }
                    arrayListIconCompatParcelizer = arrayList14;
                }
                for (int i49 = 0; i49 < 3; i49++) {
                    float[][] fArr31 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, arrayListIconCompatParcelizer.size(), ((float[]) arrayListIconCompatParcelizer.get(0)).length);
                    for (int i50 = 0; i50 < arrayListIconCompatParcelizer.size(); i50++) {
                        System.arraycopy(arrayListIconCompatParcelizer.get(i50), 0, fArr31[i50], 0, ((float[]) arrayListIconCompatParcelizer.get(i50)).length);
                    }
                    int length3 = fArr31.length;
                    float[] fArr32 = new float[length3];
                    for (int i51 = 0; i51 < fArr31.length; i51++) {
                        if (i49 >= 0) {
                            float[] fArr33 = fArr31[i51];
                            if (i49 < fArr33.length) {
                                fArr32[i51] = fArr33[i49];
                            }
                        }
                    }
                    float f8 = 0.0f;
                    for (int i52 = 0; i52 < length3; i52++) {
                        f8 += fArr32[i52];
                    }
                    float f9 = f8 / length3;
                    for (int i53 = 0; i53 < 256; i53++) {
                        ((float[]) arrayListIconCompatParcelizer.get(i53))[i49] = ((float[]) arrayListIconCompatParcelizer.get(i53))[i49] - f9;
                    }
                }
                i4 = 256;
                float[] fArr34 = new float[768];
                float[][] fArr35 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, arrayListIconCompatParcelizer.size(), ((float[]) arrayListIconCompatParcelizer.get(0)).length);
                for (int i54 = 0; i54 < arrayListIconCompatParcelizer.size(); i54++) {
                    System.arraycopy(arrayListIconCompatParcelizer.get(i54), 0, fArr35[i54], 0, ((float[]) arrayListIconCompatParcelizer.get(i54)).length);
                }
                int i55 = 0;
                int length4 = fArr35.length;
                int i56 = 0;
                int i57 = 0;
                while (i56 < length4) {
                    float[] fArr36 = fArr35[i56];
                    int i58 = i55;
                    int i59 = i57;
                    while (i58 < fArr35[i55].length) {
                        fArr34[i59] = fArr36[i58];
                        i58++;
                        i59++;
                        i55 = 0;
                    }
                    i56++;
                    i57 = i59;
                    i55 = 0;
                }
                float[][] fArr37 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 1, 5);
                try {
                    if (JniUtils.analysisData(fArr34, fArr37) == 0) {
                        float[] fArr38 = fArr37[0];
                        setContainerDpSizeEaSLcWc.IconCompatParcelizer = new CopyOnWriteArrayList();
                        for (int i60 = 0; i60 < fArr38.length; i60++) {
                            DetectedActivity detectedActivity = new DetectedActivity();
                            if (i60 == 0) {
                                detectedActivity.setConfidence((int) (fArr38[i60] * 100.0f));
                                detectedActivity.setType(3);
                            }
                            if (i60 == 1) {
                                detectedActivity.setConfidence((int) (fArr38[i60] * 100.0f));
                                detectedActivity.setType(7);
                            }
                            if (i60 == 2) {
                                detectedActivity.setConfidence((int) (fArr38[i60] * 100.0f));
                                detectedActivity.setType(8);
                            }
                            if (i60 == 3) {
                                detectedActivity.setConfidence((int) (fArr38[i60] * 100.0f));
                                detectedActivity.setType(1);
                            }
                            if (i60 == 4) {
                                detectedActivity.setConfidence((int) (fArr38[i60] * 100.0f));
                                detectedActivity.setType(0);
                            }
                            setContainerDpSizeEaSLcWc.IconCompatParcelizer.add(detectedActivity);
                        }
                        setContainerDpSizeEaSLcWc.IconCompatParcelizer.add(new DetectedActivity(2, (int) ((fArr38[1] + fArr38[2]) * 100.0f)));
                        copyOnWriteArrayList3 = mergeList(copyOnWriteArrayList3, setContainerDpSizeEaSLcWc.IconCompatParcelizer);
                        i5 = i3 + 100;
                        i8 = i2 + 100;
                        i11 = i15;
                        z2 = z;
                    } else {
                        str = "analysis result fail";
                        WrappedCompositionsetContent1211.read("ResultPredict", str);
                        MapboxMap$$ExternalSyntheticLambda0.m4699m((Object) ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE));
                        return null;
                    }
                } catch (Throwable unused) {
                    str = "init so file fail";
                }
            }
            i9 = i + 1;
            i10 = i5;
            i7 = i4;
            copyOnWriteArrayList5 = copyOnWriteArrayList2;
            copyOnWriteArrayList4 = copyOnWriteArrayList;
        }
        boolean z4 = z2;
        synchronized (SYNC_LIST_LOCK) {
            if (z4) {
                this.oriRecordList.clear();
                this.accRecordList.clear();
            }
        }
        for (int i61 = 0; i61 < copyOnWriteArrayList3.size(); i61++) {
            copyOnWriteArrayList3.get(i61).setConfidence(copyOnWriteArrayList3.get(i61).getConfidence() / i11);
        }
        Iterator<DetectedActivity> it = copyOnWriteArrayList3.iterator();
        while (it.hasNext()) {
            if (it.next().getConfidence() >= 50) {
                return copyOnWriteArrayList3;
            }
        }
        copyOnWriteArrayList3.add(new DetectedActivity(4, 100));
        return copyOnWriteArrayList3;
    }

    public static RiemannSoftArService getInstance() {
        if (instance == null) {
            synchronized (SYNC_LOCK) {
                if (instance == null) {
                    instance = new RiemannSoftArService();
                }
            }
        }
        return instance;
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public ActivityRecognitionResult getDetectedActivity(int i, int i2) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "getDetectedActivity");
        return null;
    }

    public void modelFileLoadSuccess() {
        try {
            SensorManager sensorManager = this.sensorManager;
            if (sensorManager == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "sensorManager is null");
                throw new LocationServiceException(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE, ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE) + ":end request.");
            }
            boolean zRegisterListener = sensorManager.registerListener(this, this.acc, 10000);
            boolean zRegisterListener2 = this.sensorManager.registerListener(this, this.ori, 10000);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "register accResult: " + zRegisterListener + " register oriResult: " + zRegisterListener2);
            if (!zRegisterListener || !zRegisterListener2) {
                throw new LocationServiceException(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE, ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE) + ":end request.");
            }
            this.alreadyRegister = true;
            if (this.scheduledExecutorService == null) {
                this.scheduledExecutorService = Executors.newScheduledThreadPool(1);
            }
            this.scheduledFuture = this.scheduledExecutorService.scheduleWithFixedDelay(getTask(), 0L, this.delay, TimeUnit.MILLISECONDS);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startScheduled exit");
        } catch (LocationServiceException e) {
            throw e;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read(TAG, "register sensor listener failed");
        }
    }

    public void onStatusChanged(int i, int i2) {
        MovementEvent movementEvent = new MovementEvent(ActivityRecognitionConstantsMapping.getActivityType(Integer.valueOf(i)), i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(movementEvent);
        if (i == 7 || i == 8) {
            arrayList.add(new MovementEvent(ActivityRecognitionConstantsMapping.getActivityType(2), i2));
        }
        this.transitionMappingManager.sendActivityTransitionMappingInfo(arrayList, this.mContext);
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public void removeActivityTransitionUpdates(ATCallback aTCallback, ClientInfo clientInfo) {
        setContainerSizeozmzZPI setcontainersizeozmzzpi;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeActivityTransitionUpdates");
        this.transitionMappingManager.removeActivityTransitionMappingInfo(aTCallback);
        if (this.transitionMappingManager.getInfos().size() != 0 || (setcontainersizeozmzzpi = this.atProvider) == null) {
            return;
        }
        this.recognitionMappingManager.removeActivityUpdatesMappingInfo(setcontainersizeozmzzpi.MediaDescriptionCompat);
        scheduleTimer();
        setContainerSizeozmzZPI setcontainersizeozmzzpi2 = this.atProvider;
        setcontainersizeozmzzpi2.read = -2;
        setcontainersizeozmzzpi2.IconCompatParcelizer = -2;
        setcontainersizeozmzzpi2.RemoteActionCompatParcelizer = -2;
        setcontainersizeozmzzpi2.MediaMetadataCompat = 0;
        setcontainersizeozmzzpi2.serializer = 0;
        setcontainersizeozmzzpi2.write = 0;
        setcontainersizeozmzzpi2.RatingCompat = 0;
        this.alreadyRequestAR = false;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "no activity transition request ");
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public void removeActivityUpdates(ARCallback aRCallback, ClientInfo clientInfo) {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeActivityUpdates");
            this.recognitionMappingManager.removeActivityUpdatesMappingInfo(aRCallback);
            scheduleTimer();
        }
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public void requestActivityUpdates(long j, ARCallback aRCallback, ClientInfo clientInfo) {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "requestActivityUpdates");
            this.recognitionMappingManager.addActivityUpdatesMappingInfo(j, aRCallback, clientInfo);
            scheduleTimer();
        }
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public void startScheduled(long j) {
        this.delay = j;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startScheduled enter");
        register();
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public void stopScheduled() {
        String str;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "stopScheduled enter");
        unregister();
        try {
            ScheduledFuture scheduledFuture = this.scheduledFuture;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                str = "stopScheduled exit:" + this.scheduledFuture.cancel(true);
            } else {
                str = "scheduled not init or cancelled";
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, str);
        } catch (LocationServiceException e) {
            throw e;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer(TAG, "stopScheduled exit exception");
        }
    }

    @Override // com.huawei.location.base.activity.AbstractARServiceManager
    public void scheduleTimer() {
        synchronized (this) {
            try {
                long minTime = this.recognitionMappingManager.getMinTime();
                if (-1 == minTime) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "scheduleTimer return time is " + minTime);
                    this.lastTimeByTimer = -1L;
                    stopScheduled();
                    return;
                }
                long j = this.lastTimeByTimer;
                if (j == -1) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "scheduleTimer begin time is " + minTime);
                    this.lastTimeByTimer = minTime;
                    startScheduled(minTime);
                } else if (minTime != j) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "scheduleTimer begin again time is " + minTime);
                    this.lastTimeByTimer = minTime;
                    restartScheduled(minTime);
                } else {
                    register();
                }
            } catch (LocationServiceException e) {
                throw e;
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.serializer(TAG, "scheduleTimer exception");
            }
        }
    }

    private void register() {
        if (this.alreadyRegister) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, " already registered");
            return;
        }
        zp zpVar = new zp(8);
        zpVar.write = 0;
        zpVar.IconCompatParcelizer = this;
        getOrder getorder = new getOrder("spSoFileName");
        zpVar.serializer = getorder;
        long jWrite = getorder.write("spSoLastTime");
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "sp--lastTimeMillis:" + jWrite);
        if (System.currentTimeMillis() - jWrite < 604800000 && zp.RemoteActionCompatParcelizer(placeAtf8xVGno.read(), "activity.7z")) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "so file is exists and is not need update");
            zpVar.IconCompatParcelizer();
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "so file is not exists or determine whether the model file needs to be updated ");
        DownloadFileParam downloadFileParam = new DownloadFileParam();
        downloadFileParam.setFileName("activity.7z");
        downloadFileParam.setSaveFilePath(clearWeakReferences.write);
        downloadFileParam.setServiceType("activityRecognitionSo");
        downloadFileParam.setSubType("mlso");
        new x(downloadFileParam, 10, new WeakCache(zpVar, "spSoVersionNum", "activity.7z")).IconCompatParcelizer(new getHostDefault(zpVar, "activity.7z", "spSoLastTime"));
    }
}
