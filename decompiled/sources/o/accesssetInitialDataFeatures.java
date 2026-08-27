package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accesssetInitialDataFeatures extends writeTo {
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] write;

    public accesssetInitialDataFeatures(accessgetStoragep accessgetstoragep, byte[] bArr) {
        super(accessgetstoragep, false);
        byte[] bArrSerializer = accessbootstrapIfNeeded.serializer(bArr, 0, 32);
        this.RemoteActionCompatParcelizer = bArrSerializer;
        this.write = accessbootstrapIfNeeded.serializer(bArr, bArrSerializer.length, bArr.length);
    }
}
