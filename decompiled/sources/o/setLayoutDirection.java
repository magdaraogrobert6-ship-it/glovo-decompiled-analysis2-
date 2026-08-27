package o;

/* JADX INFO: loaded from: classes.dex */
public final class setLayoutDirection extends accessasDrawTransform {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // o.accessasDrawTransform
    public final inset RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        return this.IconCompatParcelizer != 0 ? inset.QUALITY : inset.QUALITY;
    }

    @Override // o.accessasDrawTransform
    public final float read(int i, int i2, int i3, int i4) {
        if (this.IconCompatParcelizer != 0) {
            return Math.max(i3 / i, i4 / i2);
        }
        return 1.0f;
    }
}
