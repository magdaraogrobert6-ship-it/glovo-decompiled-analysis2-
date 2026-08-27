package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: classes4.dex */
public final class RenderEffectKt {
    public static final OffsetEffect OffsetEffect(float f, float f2) {
        return new OffsetEffect(null, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32)), null);
    }

    /* JADX INFO: renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m1050BlurEffect3YTHUZs$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = TileMode.Companion.m1120getClamp3opZhB0();
        }
        return m1049BlurEffect3YTHUZs(f, f2, i);
    }

    /* JADX INFO: renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m1049BlurEffect3YTHUZs(float f, float f2, int i) {
        return new BlurEffect(null, f, f2, i, null);
    }
}
