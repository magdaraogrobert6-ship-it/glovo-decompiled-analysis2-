package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setInitialDataFeatures extends FWFRequest {
    public final byte[] IconCompatParcelizer;

    public setInitialDataFeatures(String str, byte[] bArr) {
        super(str, false);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}
