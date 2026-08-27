package androidx.compose.ui.unit;

import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public final DensityImpl copy(float f, float f2) {
        return new DensityImpl(f, f2);
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale) + (Float.hashCode(this.density) * 31);
    }

    public DensityImpl(float f, float f2) {
        this.density = f;
        this.fontScale = f2;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = densityImpl.density;
        }
        if ((i & 2) != 0) {
            f2 = densityImpl.fontScale;
        }
        return densityImpl.copy(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.density, densityImpl.density) == 0 && Float.compare(this.fontScale, densityImpl.fontScale) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.density);
        sb.append(", fontScale=");
        return MediaSessionCompatQueueItem.serializer(sb, this.fontScale, ')');
    }
}
