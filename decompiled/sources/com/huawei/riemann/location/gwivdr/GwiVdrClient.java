package com.huawei.riemann.location.gwivdr;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.riemann.location.common.bean.Acceleration;
import com.huawei.riemann.location.common.bean.BiasData;
import com.huawei.riemann.location.common.bean.CalibrationPara;
import com.huawei.riemann.location.common.bean.GnssInfo;
import com.huawei.riemann.location.common.bean.Gyroscope;
import com.huawei.riemann.location.common.bean.LocationInfo;
import com.huawei.riemann.location.common.bean.RoadArea;
import com.huawei.riemann.location.common.bean.RotationAngle;
import com.huawei.riemann.location.common.bean.SatInfo;
import com.huawei.riemann.location.common.bean.TemperatureInfo;
import com.huawei.riemann.location.common.bean.Vehicle;
import com.huawei.riemann.location.common.bean.WheelAngleInfo;
import com.huawei.riemann.location.common.bean.obs.VdrGnssStatus;
import com.huawei.riemann.location.common.bean.obs.VdrResult;
import com.huawei.riemann.location.common.utils.Constant;
import com.huawei.riemann.location.gwivdr.utils.ErrorCodeManager;
import com.huawei.riemann.location.gwivdr.utils.InputFreqCheckThread;
import com.huawei.riemann.location.gwivdr.utils.InputValueChecker;
import com.huawei.riemann.location.gwivdr.utils.SharedPreferencesUtils;
import o.WindowInfoImplCompanion;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class GwiVdrClient {
    private static final String TAG = "GwiVdrClient";
    private static volatile GwiVdrClient gwiVdrClient;
    private GwiVdrAlgoWrapper algoWrapper;
    private InputFreqCheckThread freqCheckThread;
    private RotationAngle rotationAngle;
    private SharedPreferencesUtils spUtils;
    private int accFreq = 0;
    private long accFreqStartTime = System.currentTimeMillis();
    private int gyroFreq = 0;
    private long gyroFreqStartTime = System.currentTimeMillis();

    public static void releaseInstance() {
        gwiVdrClient = null;
    }

    private void storeData(VdrResult vdrResult) {
        if (vdrResult == null || !vdrResult.isNeedUpdateBias()) {
            return;
        }
        WrappedCompositionsetContent1211.read();
        this.spUtils.storeBiasData(vdrResult.getBiasData());
        this.spUtils.storeCalibrationPara(vdrResult.getCalibrationPara());
    }

    public void stopVdr() {
        stopAlgo();
        InputFreqCheckThread inputFreqCheckThread = this.freqCheckThread;
        if (inputFreqCheckThread != null) {
            inputFreqCheckThread.stopChecker();
        }
    }

    private GwiVdrClient(Context context, String str, RotationAngle rotationAngle) {
        String str2;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "start, UTCTime: " + System.currentTimeMillis() + "bootTime: " + SystemClock.elapsedRealtime());
        if (str == null || str.isEmpty() || !InputValueChecker.isRotationAngleValid(rotationAngle)) {
            str2 = "invalid input!";
        } else {
            try {
                this.rotationAngle = rotationAngle;
                this.algoWrapper = GwiVdrAlgoWrapper.getInstance(str);
                this.spUtils = SharedPreferencesUtils.getInstance(context);
                return;
            } catch (IllegalArgumentException e) {
                str2 = "gwi vdr client error: " + e.getMessage();
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str2);
    }

    public static GwiVdrClient getInstance(Context context, String str, RotationAngle rotationAngle) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "getInstance start!");
        if (gwiVdrClient == null) {
            synchronized (GwiVdrClient.class) {
                if (gwiVdrClient == null) {
                    gwiVdrClient = new GwiVdrClient(context, str, rotationAngle);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "create ok.");
                }
            }
        }
        return gwiVdrClient;
    }

    private void stopAlgo() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "stopAlgo start!");
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper != null && gwiVdrAlgoWrapper.isLibraryLoaded()) {
            this.algoWrapper.stopVdr();
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "stopGwiVdr finished!");
    }

    public boolean setRoadArea(RoadArea roadArea) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "setRoadArea");
        if (!InputValueChecker.isRoadAreaValid(roadArea)) {
            WrappedCompositionsetContent1211.read(TAG, "invalid roadArea!");
            return false;
        }
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper == null || !gwiVdrAlgoWrapper.isLibraryLoaded()) {
            return false;
        }
        this.algoWrapper.processRoadArea(roadArea);
        return true;
    }

    public boolean startVdr() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "Vdr start!");
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper != null && gwiVdrAlgoWrapper.isLibraryLoaded()) {
            BiasData biasData = new BiasData();
            CalibrationPara calibrationPara = new CalibrationPara();
            SharedPreferencesUtils sharedPreferencesUtils = this.spUtils;
            if (sharedPreferencesUtils != null) {
                biasData = sharedPreferencesUtils.getBiasData();
                calibrationPara = this.spUtils.getCalibrationPara();
            }
            this.algoWrapper.vdrInit2(biasData, calibrationPara, this.rotationAngle);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "rotationAngle: " + this.rotationAngle);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "BiasData: " + biasData);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "calibrationPara: " + calibrationPara);
            InputFreqCheckThread inputFreqCheckThread = InputFreqCheckThread.getInstance();
            this.freqCheckThread = inputFreqCheckThread;
            inputFreqCheckThread.start();
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startVdr finished!");
            return true;
        }
        WrappedCompositionsetContent1211.read(TAG, "Algo so not loaded!");
        return false;
    }

    public String toString() {
        return TAG + super.toString();
    }

    public boolean setGnssInfo(GnssInfo gnssInfo) {
        try {
            if (!InputValueChecker.isGnssInfoValid(gnssInfo)) {
                WrappedCompositionsetContent1211.read(TAG, "invalid GnssInfo!");
                return false;
            }
            GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
            if (gwiVdrAlgoWrapper != null && gwiVdrAlgoWrapper.isLibraryLoaded()) {
                int size = gnssInfo.getSatInfoList().size();
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "satCount: " + size);
                if (size == 0) {
                    return true;
                }
                VdrGnssStatus[] vdrGnssStatusArr = new VdrGnssStatus[size];
                for (int i = 0; i < size; i++) {
                    SatInfo satInfo = gnssInfo.getSatInfoList().get(i);
                    VdrGnssStatus vdrGnssStatus = new VdrGnssStatus();
                    vdrGnssStatus.setBootTime(satInfo.getBootTime());
                    vdrGnssStatus.setAzimuth(satInfo.getAzimuth());
                    vdrGnssStatus.setCn0DbHz(satInfo.getSnr());
                    vdrGnssStatus.setConstellationType(satInfo.getConstellationType());
                    vdrGnssStatus.setElevationDegrees(satInfo.getElevation());
                    vdrGnssStatus.setSvid(satInfo.getSatNum());
                    vdrGnssStatus.setUsedInFix(satInfo.isUsedInFix());
                    vdrGnssStatusArr[i] = vdrGnssStatus;
                }
                this.algoWrapper.processGnssStatus(vdrGnssStatusArr);
                return true;
            }
            return false;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read(TAG, "set GnssInfo error!");
            return false;
        }
    }

    public boolean setAcc(Acceleration acceleration) {
        boolean z = false;
        if (!InputValueChecker.isAccValid(acceleration)) {
            WrappedCompositionsetContent1211.read(TAG, "invalid acc!");
            return false;
        }
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper != null && gwiVdrAlgoWrapper.isLibraryLoaded()) {
            InputFreqCheckThread inputFreqCheckThread = this.freqCheckThread;
            if (inputFreqCheckThread != null) {
                inputFreqCheckThread.accEnqueue(System.currentTimeMillis());
            }
            this.algoWrapper.processAcc(acceleration);
            if (this.accFreq == 0) {
                this.accFreqStartTime = System.currentTimeMillis();
            }
            z = true;
            this.accFreq++;
            if (System.currentTimeMillis() - this.accFreqStartTime >= 1000) {
                StringBuilder sb = new StringBuilder("BT: ");
                sb.append(acceleration.getBootTime());
                sb.append(", acc freq in client: ");
                WindowInfoImplCompanion.serializer(this.accFreq, TAG, sb);
                this.accFreq = 1;
                this.accFreqStartTime = System.currentTimeMillis();
            }
        }
        return z;
    }

    public boolean setGyroUncal(Gyroscope gyroscope) {
        boolean z = false;
        if (!InputValueChecker.isGyroValid(gyroscope)) {
            WrappedCompositionsetContent1211.read(TAG, "invalid gyro!");
            return false;
        }
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper != null && gwiVdrAlgoWrapper.isLibraryLoaded()) {
            InputFreqCheckThread inputFreqCheckThread = this.freqCheckThread;
            if (inputFreqCheckThread != null) {
                inputFreqCheckThread.gyroEnqueue(System.currentTimeMillis());
            }
            this.algoWrapper.processGyroUncal(gyroscope);
            if (this.gyroFreq == 0) {
                this.gyroFreqStartTime = System.currentTimeMillis();
            }
            z = true;
            this.gyroFreq++;
            if (System.currentTimeMillis() - this.gyroFreqStartTime >= 1000) {
                StringBuilder sb = new StringBuilder("BT: ");
                sb.append(gyroscope.getBootTime());
                sb.append(", gyro freq in client: ");
                WindowInfoImplCompanion.serializer(this.gyroFreq, TAG, sb);
                this.gyroFreq = 1;
                this.gyroFreqStartTime = System.currentTimeMillis();
            }
        }
        return z;
    }

    public boolean setTemperature(TemperatureInfo temperatureInfo) {
        if (temperatureInfo == null) {
            WrappedCompositionsetContent1211.read(TAG, "invalid temperatureInfo!");
            return false;
        }
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        return gwiVdrAlgoWrapper != null && gwiVdrAlgoWrapper.isLibraryLoaded();
    }

    public boolean setWheelAngle(WheelAngleInfo wheelAngleInfo) {
        if (wheelAngleInfo == null) {
            WrappedCompositionsetContent1211.read(TAG, "invalid wheelAngleInfo!");
            return false;
        }
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        return gwiVdrAlgoWrapper != null && gwiVdrAlgoWrapper.isLibraryLoaded();
    }

    public Location getVdrResult() {
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper == null || !gwiVdrAlgoWrapper.isLibraryLoaded()) {
            WrappedCompositionsetContent1211.read(TAG, "null wrapper, getVdrResult failed!");
            Location location = new Location(Constant.LOCATION_NAME_INVALID);
            Bundle bundle = new Bundle();
            bundle.putInt(Constant.SDK_RESULT_ERROR_CODE, 400);
            location.setExtras(bundle);
            return location;
        }
        VdrResult result = this.algoWrapper.getResult();
        if (result == null) {
            WrappedCompositionsetContent1211.read(TAG, "null gwi result!");
            Location location2 = new Location(Constant.LOCATION_NAME_INVALID);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(Constant.SDK_RESULT_ERROR_CODE, Constant.ERROR_ALGO_NULL_RESULT);
            location2.setExtras(bundle2);
            return location2;
        }
        storeData(result);
        Location location3 = result.toLocation();
        Bundle extras = location3.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putInt(Constant.SDK_RESULT_ERROR_CODE, ErrorCodeManager.getErrorCode());
        extras.putInt(Constant.ALGO_RESULT_ERROR_CODE, result.getErrCode());
        location3.setExtras(extras);
        return location3;
    }

    public boolean setLocation(Location location) {
        if (!InputValueChecker.isLocationValid(location)) {
            WrappedCompositionsetContent1211.read(TAG, "invalid location!");
            return false;
        }
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper == null || !gwiVdrAlgoWrapper.isLibraryLoaded()) {
            return false;
        }
        this.algoWrapper.processGnss(LocationInfo.newBuilder(location).build());
        return true;
    }

    public boolean setWss(Vehicle vehicle) {
        if (!InputValueChecker.isWssValid(vehicle)) {
            WrappedCompositionsetContent1211.read(TAG, "invalid wss!");
            return false;
        }
        GwiVdrAlgoWrapper gwiVdrAlgoWrapper = this.algoWrapper;
        if (gwiVdrAlgoWrapper == null || !gwiVdrAlgoWrapper.isLibraryLoaded()) {
            return false;
        }
        InputFreqCheckThread inputFreqCheckThread = this.freqCheckThread;
        if (inputFreqCheckThread != null) {
            inputFreqCheckThread.wssEnqueue(System.currentTimeMillis());
        }
        this.algoWrapper.processWss(vehicle);
        return true;
    }
}
