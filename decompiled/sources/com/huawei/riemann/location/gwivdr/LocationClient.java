package com.huawei.riemann.location.gwivdr;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.huawei.riemann.location.common.bean.RotationAngle;
import com.huawei.riemann.location.common.bean.VdrInputData;
import com.huawei.riemann.location.common.utils.Constant;
import com.huawei.riemann.location.gwivdr.utils.KeepAliveManager;
import o.IconCompatParcelizer;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes5.dex */
public class LocationClient {
    private static final String TAG = "LocationClient";
    private static volatile boolean isStarted = false;
    private static volatile LocationClient locationClient;
    private GwiVdrClient gwiVdrClient;
    private KeepAliveManager keepAliveManager;

    public static void releaseInstance() {
        locationClient = null;
        setIsStarted(false);
        GwiVdrClient.releaseInstance();
    }

    private static void setIsStarted(boolean z) {
        isStarted = z;
    }

    /* JADX INFO: renamed from: com.huawei.riemann.location.gwivdr.LocationClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType;

        static {
            int[] iArr = new int[VdrInputData.DataType.values().length];
            $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType = iArr;
            try {
                iArr[VdrInputData.DataType.ACC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.GYRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.VEHICLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.GNSS_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.ROAD_AREA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.WHEEL_ANGLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.TEMPERATURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static LocationClient getInstance(Context context, String str, RotationAngle rotationAngle) {
        if (locationClient == null) {
            synchronized (LocationClient.class) {
                if (locationClient == null) {
                    locationClient = new LocationClient(context, str, rotationAngle);
                }
            }
        }
        return locationClient;
    }

    public Location getVdrResult() {
        Location location;
        Bundle bundle;
        String str;
        int i;
        if (this.gwiVdrClient == null || !isStarted) {
            WrappedCompositionsetContent1211.read(TAG, "vdr not start yet, getVdrResult failed!");
            location = new Location(Constant.LOCATION_NAME_INVALID);
            bundle = new Bundle();
            str = Constant.SDK_RESULT_ERROR_CODE;
            i = Constant.ERROR_ALGO_NOT_START;
        } else {
            KeepAliveManager keepAliveManager = this.keepAliveManager;
            str = Constant.ALGO_RESULT_ERROR_CODE;
            if (keepAliveManager != null && !keepAliveManager.isVdrStopped()) {
                Location vdrResult = this.gwiVdrClient.getVdrResult();
                if (vdrResult.getExtras() != null) {
                    this.keepAliveManager.setErrorCode(vdrResult.getExtras().getInt(Constant.ALGO_RESULT_ERROR_CODE));
                }
                return vdrResult;
            }
            location = new Location("fake");
            bundle = new Bundle();
            i = -1;
        }
        bundle.putInt(str, i);
        location.setExtras(bundle);
        return location;
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("LocationClient{isStarted="), isStarted, '}');
    }

    private LocationClient(Context context, String str, RotationAngle rotationAngle) {
        if (str == null || str.isEmpty()) {
            WrappedCompositionsetContent1211.read(TAG, "invalid input!");
            return;
        }
        GwiVdrClient gwiVdrClient = GwiVdrClient.getInstance(context, str, rotationAngle);
        this.gwiVdrClient = gwiVdrClient;
        this.keepAliveManager = new KeepAliveManager(gwiVdrClient);
    }

    public boolean startVdr() {
        if (isStarted) {
            WrappedCompositionsetContent1211.read(TAG, "vdr already started!");
            return true;
        }
        if (this.gwiVdrClient == null) {
            WrappedCompositionsetContent1211.read(TAG, "null vdr client!");
            return false;
        }
        setIsStarted(true);
        return this.gwiVdrClient.startVdr();
    }

    public void stopVdr() {
        String str;
        if (isStarted) {
            setIsStarted(false);
            GwiVdrClient gwiVdrClient = this.gwiVdrClient;
            if (gwiVdrClient != null) {
                gwiVdrClient.stopVdr();
                return;
            }
            str = "null vdr client!";
        } else {
            str = "vdr not start yet, stopVdr failed!";
        }
        WrappedCompositionsetContent1211.read(TAG, str);
    }

    public boolean setVdrInput(VdrInputData vdrInputData) {
        String str;
        if (!isStarted) {
            str = "vdr not start yet, setInput failed!";
        } else if (this.gwiVdrClient != null) {
            if (vdrInputData != null) {
                switch (AnonymousClass1.$SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[vdrInputData.getDataType().ordinal()]) {
                    case 1:
                        return this.gwiVdrClient.setAcc(vdrInputData.getAcc());
                    case 2:
                        return this.gwiVdrClient.setGyroUncal(vdrInputData.getGyro());
                    case 3:
                        return this.gwiVdrClient.setWss(vdrInputData.getVehicle());
                    case 4:
                        return this.gwiVdrClient.setLocation(vdrInputData.getLocation());
                    case 5:
                        return this.gwiVdrClient.setGnssInfo(vdrInputData.getGnssInfo());
                    case 6:
                        return this.gwiVdrClient.setRoadArea(vdrInputData.getRoadArea());
                    case 7:
                        return this.gwiVdrClient.setWheelAngle(vdrInputData.getWheelAngleInfo());
                    case 8:
                        return this.gwiVdrClient.setTemperature(vdrInputData.getTemperatureInfo());
                    default:
                        str = "unknown input: " + vdrInputData.getDataType();
                        break;
                }
            } else {
                str = "null VdrInputData!";
            }
        } else {
            str = "null vdr client!";
        }
        WrappedCompositionsetContent1211.read(TAG, str);
        return false;
    }
}
