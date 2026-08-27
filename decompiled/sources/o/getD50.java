package o;

import android.graphics.PointF;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public abstract class getD50 {
    public static final PointF write = new PointF();

    public static float serializer(float f, float f2, float f3) {
        return c8$$ExternalSyntheticOutline0.m(f2, f, f3, f);
    }

    public static PointF read(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int write(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i % i2 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static int write(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static float IconCompatParcelizer(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
