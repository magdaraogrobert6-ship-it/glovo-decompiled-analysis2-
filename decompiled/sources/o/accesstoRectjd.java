package o;

/* JADX INFO: loaded from: classes.dex */
public final class accesstoRectjd extends DropShadowScope {
    public float RemoteActionCompatParcelizer;

    public accesstoRectjd(float f) {
        super(null);
        this.RemoteActionCompatParcelizer = f;
    }

    @Override // o.DropShadowScope
    public final float IconCompatParcelizer() {
        char[] cArr;
        if (Float.isNaN(this.RemoteActionCompatParcelizer) && (cArr = this.read) != null && cArr.length >= 1) {
            this.RemoteActionCompatParcelizer = Float.parseFloat(write());
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.DropShadowScope
    public final int MediaMetadataCompat() {
        char[] cArr;
        if (Float.isNaN(this.RemoteActionCompatParcelizer) && (cArr = this.read) != null && cArr.length >= 1) {
            this.RemoteActionCompatParcelizer = Integer.parseInt(write());
        }
        return (int) this.RemoteActionCompatParcelizer;
    }

    @Override // o.DropShadowScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accesstoRectjd)) {
            return false;
        }
        float fIconCompatParcelizer = IconCompatParcelizer();
        float fIconCompatParcelizer2 = ((accesstoRectjd) obj).IconCompatParcelizer();
        return (Float.isNaN(fIconCompatParcelizer) && Float.isNaN(fIconCompatParcelizer2)) || fIconCompatParcelizer == fIconCompatParcelizer2;
    }

    @Override // o.DropShadowScope
    public final int hashCode() {
        int iHashCode = super.hashCode();
        float f = this.RemoteActionCompatParcelizer;
        return (iHashCode * 31) + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }
}
