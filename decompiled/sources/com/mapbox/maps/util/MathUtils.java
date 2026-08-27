package com.mapbox.maps.util;

/* JADX INFO: loaded from: classes2.dex */
public final class MathUtils {
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    private final double normalize(double d) {
        return ((d % 360.0d) + 360.0d) % 360.0d;
    }

    public final double shortestRotation$sdk_base_release(double d, double d2) {
        double d3 = d2 - d;
        if (d3 > 180.0d) {
            return d + 360.0d;
        }
        return d3 < -180.0d ? d - 360.0d : d;
    }

    public final double[] prepareOptimalBearingPath(double[] dArr) {
        double dShortestRotation$sdk_base_release;
        dArr.getClass();
        double[] dArr2 = new double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                dShortestRotation$sdk_base_release = INSTANCE.normalize(dArr[i]);
            } else {
                MathUtils mathUtils = INSTANCE;
                dShortestRotation$sdk_base_release = mathUtils.shortestRotation$sdk_base_release(mathUtils.normalize(dArr[i]), dArr2[i - 1]);
            }
            dArr2[i] = dShortestRotation$sdk_base_release;
        }
        return dArr2;
    }
}
