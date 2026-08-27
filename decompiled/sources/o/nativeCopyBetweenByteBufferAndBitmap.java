package o;

/* JADX INFO: loaded from: classes.dex */
public final class nativeCopyBetweenByteBufferAndBitmap implements newChildScope {
    public final /* synthetic */ long write;

    @Override // o.newChildScope
    public final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    public nativeCopyBetweenByteBufferAndBitmap(long j) {
        this.write = j;
    }

    @Override // o.newChildScope
    public final CryptoObjectUtils serializer(nativeConvertAndroid420ToBitmap nativeconvertandroid420tobitmap) {
        return nativeconvertandroid420tobitmap.read == 1 ? CryptoObjectUtils.IconCompatParcelizer : CryptoObjectUtils.write;
    }
}
