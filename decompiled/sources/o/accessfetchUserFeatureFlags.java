package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessfetchUserFeatureFlags extends FWFRequest {
    public final byte[] serializer;

    public accessfetchUserFeatureFlags(getUserFeatureFlags getuserfeatureflags, byte[] bArr) {
        super(getuserfeatureflags, false);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}
