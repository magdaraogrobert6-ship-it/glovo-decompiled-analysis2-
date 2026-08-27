package androidx.compose.ui.node;

/* JADX INFO: loaded from: classes.dex */
public final class HitTestResultKt {
    private static final long IS_IN_EXPANDED_BOUNDS = 2;
    private static final long IS_IN_LAYER = 1;

    public static /* synthetic */ long DistanceAndFlags$default(float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return DistanceAndFlags(f, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndFlags(float f, boolean z, boolean z2) {
        return DistanceAndFlags.m2410constructorimpl((((z ? IS_IN_LAYER : 0L) | (z2 ? IS_IN_EXPANDED_BOUNDS : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }
}
