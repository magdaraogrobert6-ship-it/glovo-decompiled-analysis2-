package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getHoldoutKeysfwf_client_release extends setAccountConfigfwf_client_release {
    public final int IconCompatParcelizer;
    public final int serializer;

    public getHoldoutKeysfwf_client_release(getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release) {
        super(getfeaturestoupdatefwf_client_release);
        this.serializer = getfeaturestoupdatefwf_client_release.write;
        this.IconCompatParcelizer = getfeaturestoupdatefwf_client_release.RemoteActionCompatParcelizer;
    }

    @Override // o.setAccountConfigfwf_client_release
    public final byte[] serializer() {
        byte[] bArrSerializer = super.serializer();
        createCache.read(bArrSerializer, 0, 16);
        createCache.read(bArrSerializer, this.serializer, 20);
        createCache.read(bArrSerializer, this.IconCompatParcelizer, 24);
        return bArrSerializer;
    }
}
