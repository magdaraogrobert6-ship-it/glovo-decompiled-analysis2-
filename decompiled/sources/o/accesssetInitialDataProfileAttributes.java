package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accesssetInitialDataProfileAttributes extends FWFRequest {
    public final byte[] serializer;

    public accesssetInitialDataProfileAttributes(accesssetInitialDataHoldouts accesssetinitialdataholdouts, byte[] bArr) {
        super(accesssetinitialdataholdouts, false);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}
