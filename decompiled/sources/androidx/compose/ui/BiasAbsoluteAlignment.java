package androidx.compose.ui;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public final float component1() {
            return this.bias;
        }

        public final float getBias() {
            return this.bias;
        }

        public final Horizontal copy(float f) {
            return new Horizontal(f);
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public Horizontal(float f) {
            this.bias = f;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontal.bias;
            }
            return horizontal.copy(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public String toString() {
            return MediaSessionCompatQueueItem.serializer(new StringBuilder("Horizontal(bias="), this.bias, ')');
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public Alignment plus(Alignment.Vertical vertical) {
            return vertical instanceof BiasAlignment.Vertical ? new BiasAbsoluteAlignment(this.bias, ((BiasAlignment.Vertical) vertical).getBias()) : super.plus(vertical);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i, int i2, LayoutDirection layoutDirection) {
            return Math.round((this.bias + 1.0f) * ((i2 - i) / 2.0f));
        }
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public final BiasAbsoluteAlignment copy(float f, float f2) {
        return new BiasAbsoluteAlignment(f, f2);
    }

    public int hashCode() {
        return Float.hashCode(this.verticalBias) + (Float.hashCode(this.horizontalBias) * 31);
    }

    public BiasAbsoluteAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb.append(this.horizontalBias);
        sb.append(", verticalBias=");
        return MediaSessionCompatQueueItem.serializer(sb, this.verticalBias, ')');
    }

    @Override // androidx.compose.ui.Alignment
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo139alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        int i = (int) (j >> 32);
        long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L) | (((long) (((int) (j2 >> 32)) - i)) << 32));
        float f = this.horizontalBias;
        float f2 = this.verticalBias;
        return IntOffset.m3795constructorimpl((((long) Math.round((f + 1.0f) * (((int) (jM3839constructorimpl >> 32)) / 2.0f))) << 32) | (((long) Math.round((f2 + 1.0f) * (((int) (jM3839constructorimpl & 4294967295L)) / 2.0f))) & 4294967295L));
    }
}
