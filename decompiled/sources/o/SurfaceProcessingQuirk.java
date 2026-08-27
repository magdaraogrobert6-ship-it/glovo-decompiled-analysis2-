package o;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceProcessingQuirk implements newChildScope {
    public final newChildScope RemoteActionCompatParcelizer;
    public final long write;

    @Override // o.newChildScope
    public final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.newChildScope
    public final CryptoObjectUtils serializer(nativeConvertAndroid420ToBitmap nativeconvertandroid420tobitmap) {
        CryptoObjectUtils cryptoObjectUtilsSerializer = this.RemoteActionCompatParcelizer.serializer(nativeconvertandroid420tobitmap);
        long j = this.write;
        return (j <= 0 || nativeconvertandroid420tobitmap.IconCompatParcelizer < j - cryptoObjectUtilsSerializer.read) ? cryptoObjectUtilsSerializer : CryptoObjectUtils.IconCompatParcelizer;
    }

    public SurfaceProcessingQuirk(long j, newChildScope newchildscope) {
        coil3.util.UtilsKt.IconCompatParcelizer("Timeout must be non-negative.", j >= 0);
        this.write = j;
        this.RemoteActionCompatParcelizer = newchildscope;
    }
}
