package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class setRuntimeFeatureKeys extends FwFDataQueriesSelectItemsQuery {
    public final r8lambda1MNczrzuv4oWduWgKg6cjtSWs RemoteActionCompatParcelizer;

    public setRuntimeFeatureKeys(bootstrapInitialDatafwf_client_release bootstrapinitialdatafwf_client_release, byte[] bArr) {
        super(bootstrapinitialdatafwf_client_release, false);
        int iWrite = bootstrapinitialdatafwf_client_release.defaultViewModelProviderFactory_delegatelambda0.write();
        int i = iWrite * 2;
        if (bArr.length == i) {
            this.RemoteActionCompatParcelizer = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(accessbootstrapIfNeeded.serializer(bArr, 0, iWrite), accessbootstrapIfNeeded.serializer(bArr, iWrite, i));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("public key encoding does not match parameters");
            throw null;
        }
    }
}
