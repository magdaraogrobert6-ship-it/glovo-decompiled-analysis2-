package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes.dex */
public abstract class MouseWheelScrollingLogicKt {
    public static final float write = Dp.m3673constructorimpl(6.0f);
    public static final float read = Dp.m3673constructorimpl(1.0f);

    public static final boolean write(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }
}
