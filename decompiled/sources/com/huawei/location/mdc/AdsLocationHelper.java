package com.huawei.location.mdc;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.adsdataservice.bean.Point;
import com.huawei.adsdataservice.bean.Quaternion;
import com.huawei.hmiuikitsdk.adsdata.receiver.EgoTfSd;
import o.SweepGradientShader9KIMszodefault;
import o.WrappedCompositionsetContent1211;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public class AdsLocationHelper {
    private static final double DEFAULT_LATITUDE_MAX = 90.0d;
    private static final double DEFAULT_LATITUDE_MIN = -90.0d;
    private static final double DEFAULT_LONGITUDE_MAX = 180.0d;
    private static final double DEFAULT_LONGITUDE_MIN = -180.0d;
    public static final String MDC_COORDINATE_TYPE = "mdcCoordinateType";
    public static final int MDC_COORDINATE_TYPE_GCJ02 = 1;
    public static final int MDC_COORDINATE_TYPE_WGS84 = 0;
    private static final String TAG = "AdsLocationHelper";

    public static float calSpeed(Quaternion quaternion, Point point) {
        if (quaternion == null) {
            WrappedCompositionsetContent1211.read(TAG, "orientation is null, set speed 0");
            return 0.0f;
        }
        if (point == null) {
            WrappedCompositionsetContent1211.read(TAG, "linear is null, set speed 0");
            return 0.0f;
        }
        double w = quaternion.getW();
        double x = quaternion.getX();
        double y = quaternion.getY();
        double z = quaternion.getZ();
        double x2 = point.getX();
        double d = x * 2.0d;
        double d2 = w * 2.0d;
        double d3 = (d * z) - (d2 * y);
        float fAbs = (float) Math.abs((d3 * point.getZ()) + (((d2 * z) + (d * y)) * point.getY()) + (((1.0d - ((y * 2.0d) * y)) - ((2.0d * z) * z)) * x2));
        WrappedCompositionsetContent1211.read();
        return fAbs;
    }

    private static boolean isMdcCoordinateValid(int i) {
        WrappedCompositionsetContent1211.read();
        return i == EgoTfSd.CoordTypeEnum.WGS84.ordinal() || i == EgoTfSd.CoordTypeEnum.GCJ02.ordinal();
    }

    private static boolean isMdcLocationValid(Point point) {
        String str;
        if (point == null) {
            str = "position is null";
        } else {
            double x = point.getX();
            double y = point.getY();
            if (y > 90.0d || y < -90.0d) {
                str = "invalid latitude";
            } else {
                if (x <= 180.0d && x >= -180.0d) {
                    return true;
                }
                str = "invalid longitude";
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str);
        return false;
    }

    public static float getBearing(Quaternion quaternion) {
        if (quaternion == null) {
            WrappedCompositionsetContent1211.read(TAG, "orientation is null, set bearing 0");
            return 0.0f;
        }
        float w = (float) quaternion.getW();
        float x = (float) quaternion.getX();
        float y = (float) quaternion.getY();
        float z = (float) quaternion.getZ();
        return 360.0f - ((((float) ((((double) (((float) Math.atan2(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(x, y, w * z, 2.0f), 1.0f - (((z * z) + (y * y)) * 2.0f))) * 180.0f)) / 3.141592653589793d) + 360.0d)) + 270.0f) % 360.0f);
    }

    public static Location getLocation(EgoTfSd egoTfSd) {
        String str;
        if (egoTfSd == null) {
            str = "egoTfSd is null ";
        } else {
            if (egoTfSd.getWorkState() != 1) {
                str = "egoTfSd workState is: " + egoTfSd.getWorkState();
            } else {
                if (egoTfSd.getPoseLLA() == null || egoTfSd.getPoseLLA().getPose() == null || egoTfSd.getPoseLLA().getPose().getPosition() == null) {
                    return null;
                }
                Point position = egoTfSd.getPoseLLA().getPose().getPosition();
                if (!isMdcLocationValid(position)) {
                    return null;
                }
                if (isMdcCoordinateValid(egoTfSd.getCoordType())) {
                    int i = egoTfSd.getCoordType() == EgoTfSd.CoordTypeEnum.WGS84.ordinal() ? 0 : 1;
                    Quaternion orientation = egoTfSd.getPoseLLA().getPose().getOrientation();
                    Location location = new Location("gps");
                    location.setTime(egoTfSd.getTimeStamp() / 1000000);
                    location.setLongitude(position.getX());
                    location.setLatitude(position.getY());
                    location.setAltitude(position.getZ());
                    location.setBearing(getBearing(orientation));
                    location.setSpeed(calSpeed(orientation, egoTfSd.getLinear()));
                    location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                    Bundle extras = location.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    try {
                        extras.putInt("LocationSource", 16);
                    } catch (Throwable th) {
                        SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("putInt exception: "), th);
                    }
                    try {
                        extras.putInt(MDC_COORDINATE_TYPE, i);
                    } catch (Throwable th2) {
                        SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("putInt exception: "), th2);
                    }
                    location.setExtras(extras);
                    return location;
                }
                str = "invalid coordinate type, drop mdc location here";
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str);
        return null;
    }
}
