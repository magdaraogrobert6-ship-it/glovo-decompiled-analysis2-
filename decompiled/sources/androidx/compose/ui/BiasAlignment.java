package androidx.compose.ui;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class BiasAlignment implements Alignment {
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
        public int align(int i, int i2, LayoutDirection layoutDirection) {
            float f = (i2 - i) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float f2 = this.bias;
            if (layoutDirection != layoutDirection2) {
                f2 *= -1.0f;
            }
            return Math.round((f2 + 1.0f) * f);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public Alignment plus(Alignment.Vertical vertical) {
            return vertical instanceof Vertical ? new BiasAlignment(this.bias, ((Vertical) vertical).getBias()) : super.plus(vertical);
        }
    }

    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public final float component1() {
            return this.bias;
        }

        public final float getBias() {
            return this.bias;
        }

        public final Vertical copy(float f) {
            return new Vertical(f);
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public Vertical(float f) {
            this.bias = f;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = vertical.bias;
            }
            return vertical.copy(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public String toString() {
            return MediaSessionCompatQueueItem.serializer(new StringBuilder("Vertical(bias="), this.bias, ')');
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public Alignment plus(Alignment.Horizontal horizontal) {
            if (horizontal instanceof Horizontal) {
                return new BiasAlignment(((Horizontal) horizontal).getBias(), this.bias);
            }
            return horizontal instanceof BiasAbsoluteAlignment.Horizontal ? new BiasAbsoluteAlignment(((BiasAbsoluteAlignment.Horizontal) horizontal).getBias(), this.bias) : super.plus(horizontal);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int i, int i2) {
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

    public final BiasAlignment copy(float f, float f2) {
        return new BiasAlignment(f, f2);
    }

    public int hashCode() {
        return Float.hashCode(this.verticalBias) + (Float.hashCode(this.horizontalBias) * 31);
    }

    public BiasAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = biasAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.horizontalBias);
        sb.append(", verticalBias=");
        return MediaSessionCompatQueueItem.serializer(sb, this.verticalBias, ')');
    }

    @Override // androidx.compose.ui.Alignment
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo139alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f3 = this.horizontalBias;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1.0f;
        }
        float f4 = this.verticalBias;
        return IntOffset.m3795constructorimpl((((long) Math.round((f3 + 1.0f) * f)) << 32) | (((long) Math.round((f4 + 1.0f) * f2)) & 4294967295L));
    }
}
