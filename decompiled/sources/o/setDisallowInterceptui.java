package o;

/* JADX INFO: loaded from: classes2.dex */
public enum setDisallowInterceptui implements clearOnDeviceChange {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    @Override // o.clearOnDeviceChange
    public final int zza() {
        return this.zzf;
    }

    setDisallowInterceptui(int i) {
        this.zzf = i;
    }
}
