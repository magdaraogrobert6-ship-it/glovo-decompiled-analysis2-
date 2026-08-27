package o;

/* JADX INFO: loaded from: classes.dex */
public final class getViewPortScaleType implements DisplayInfoManager {
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;

    @Override // o.DisplayInfoManager
    public final float IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.DisplayInfoManager
    public final float RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.DisplayInfoManager
    public final float read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.DisplayInfoManager
    public final float write() {
        return this.RemoteActionCompatParcelizer;
    }

    public static getViewPortScaleType read(DisplayInfoManager displayInfoManager) {
        return new getViewPortScaleType(displayInfoManager.read(), displayInfoManager.RemoteActionCompatParcelizer(), displayInfoManager.IconCompatParcelizer(), displayInfoManager.write());
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.IconCompatParcelizer);
        int iFloatToIntBits2 = Float.floatToIntBits(this.serializer);
        return ((((((iFloatToIntBits ^ 1000003) * 1000003) ^ iFloatToIntBits2) * 1000003) ^ Float.floatToIntBits(this.read)) * 1000003) ^ Float.floatToIntBits(this.RemoteActionCompatParcelizer);
    }

    public getViewPortScaleType(float f, float f2, float f3, float f4) {
        this.IconCompatParcelizer = f;
        this.serializer = f2;
        this.read = f3;
        this.RemoteActionCompatParcelizer = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getViewPortScaleType)) {
            return false;
        }
        getViewPortScaleType getviewportscaletype = (getViewPortScaleType) obj;
        return Float.floatToIntBits(this.IconCompatParcelizer) == Float.floatToIntBits(getviewportscaletype.IconCompatParcelizer) && Float.floatToIntBits(this.serializer) == Float.floatToIntBits(getviewportscaletype.serializer) && Float.floatToIntBits(this.read) == Float.floatToIntBits(getviewportscaletype.read) && Float.floatToIntBits(this.RemoteActionCompatParcelizer) == Float.floatToIntBits(getviewportscaletype.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.IconCompatParcelizer + ", maxZoomRatio=" + this.serializer + ", minZoomRatio=" + this.read + ", linearZoom=" + this.RemoteActionCompatParcelizer + "}";
    }
}
