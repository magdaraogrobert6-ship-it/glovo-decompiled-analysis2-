package androidx.compose.ui.layout;

import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public final class ValueInsets_androidKt {
    private static final long ZeroValueInsets = ValueInsets.m2349constructorimpl(0);
    private static final long UnsetValueInsets = ValueInsets.m2349constructorimpl(-1);

    public static final long getUnsetValueInsets() {
        return UnsetValueInsets;
    }

    public static final long getZeroValueInsets() {
        return ZeroValueInsets;
    }

    public static final long ValueInsets(setRight setright) {
        return ValueInsets.m2349constructorimpl((((long) setright.RemoteActionCompatParcelizer) << 48) | (((long) setright.write) << 32) | (((long) setright.read) << 16) | ((long) setright.serializer));
    }

    public static final long ValueInsets(int i, int i2, int i3, int i4) {
        return ValueInsets.m2349constructorimpl((((long) i2) << 32) | (((long) i) << 48) | (((long) i3) << 16) | ((long) i4));
    }
}
