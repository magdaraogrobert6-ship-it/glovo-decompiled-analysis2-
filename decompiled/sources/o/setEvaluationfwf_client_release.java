package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setEvaluationfwf_client_release extends setAccountConfigfwf_client_release {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;

    public setEvaluationfwf_client_release(setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release) {
        super(setcustomerprofilefwf_client_release);
        this.IconCompatParcelizer = setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = setcustomerprofilefwf_client_release.write;
        this.read = setcustomerprofilefwf_client_release.read;
    }

    @Override // o.setAccountConfigfwf_client_release
    public final byte[] serializer() {
        byte[] bArrSerializer = super.serializer();
        createCache.read(bArrSerializer, this.IconCompatParcelizer, 16);
        createCache.read(bArrSerializer, this.RemoteActionCompatParcelizer, 20);
        createCache.read(bArrSerializer, this.read, 24);
        return bArrSerializer;
    }
}
