package o;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HoverableNodeonPointerEvent1 extends Drawable {
    public static final double read = Math.cos(Math.toRadians(45.0d));

    public static float write(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - read) * ((double) f2)) + ((double) f));
    }

    public static float read(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - read) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
