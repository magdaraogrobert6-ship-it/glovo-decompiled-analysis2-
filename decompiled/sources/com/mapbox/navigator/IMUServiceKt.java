package com.mapbox.navigator;

import o.onContentCardClicked;

/* JADX INFO: loaded from: classes5.dex */
public final class IMUServiceKt {
    private static final float[] copyFrom(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        onContentCardClicked.write(fArr2, fArr, i, i2, i3);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double normalizeAngle(double d) {
        while (d < 0.0d) {
            d += 360.0d;
        }
        while (d > 360.0d) {
            d -= 360.0d;
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point3d toPoint3d(float[] fArr) {
        return new Point3d(fArr[0], fArr[1], fArr[2]);
    }

    public static /* synthetic */ float[] copyFrom$default(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr2.length;
        }
        return copyFrom(fArr, fArr2, i, i2, i3);
    }
}
