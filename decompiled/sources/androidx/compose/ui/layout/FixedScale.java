package androidx.compose.ui.layout;

import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public final float component1() {
        return this.value;
    }

    public final float getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
    public long mo2202computeScaleFactorH7hwNQA(long j, long j2) {
        float f = this.value;
        return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))));
    }

    public final FixedScale copy(float f) {
        return new FixedScale(f);
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public FixedScale(float f) {
        this.value = f;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fixedScale.value;
        }
        return fixedScale.copy(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.serializer(new StringBuilder("FixedScale(value="), this.value, ')');
    }
}
