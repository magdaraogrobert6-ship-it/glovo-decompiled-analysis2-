package o;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class handleMotionFrameOfReferencePlacement {
    public static final LinearInterpolator write = new LinearInterpolator();
    public static final restore RemoteActionCompatParcelizer = new restore(0);
    public static final drawVerticesTPEHhCM serializer = new drawVerticesTPEHhCM();
    public static final restore IconCompatParcelizer = new restore(1);
    public static final DecelerateInterpolator read = new DecelerateInterpolator();

    public static int write(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float write(float f, float f2, float f3) {
        return c8$$ExternalSyntheticOutline0.m(f2, f, f3, f);
    }
}
