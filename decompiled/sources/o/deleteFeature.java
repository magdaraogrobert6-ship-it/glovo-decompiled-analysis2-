package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class deleteFeature extends FwFDataQueriesSelectItemsQuery {
    public final r8lambda1MNczrzuv4oWduWgKg6cjtSWs IconCompatParcelizer;
    public final setInitialDataHoldouts RemoteActionCompatParcelizer;

    public deleteFeature(bootstrapInitialDatafwf_client_release bootstrapinitialdatafwf_client_release, byte[] bArr) {
        super(bootstrapinitialdatafwf_client_release, true);
        int iWrite = bootstrapinitialdatafwf_client_release.defaultViewModelProviderFactory_delegatelambda0.write();
        int i = iWrite * 4;
        if (bArr.length != i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("private key encoding does not match parameters");
            throw null;
        }
        int i2 = iWrite * 2;
        this.RemoteActionCompatParcelizer = new setInitialDataHoldouts(accessbootstrapIfNeeded.serializer(bArr, 0, iWrite), accessbootstrapIfNeeded.serializer(bArr, iWrite, i2));
        int i3 = iWrite * 3;
        this.IconCompatParcelizer = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(accessbootstrapIfNeeded.serializer(bArr, i2, i3), accessbootstrapIfNeeded.serializer(bArr, i3, i));
    }

    public final byte[] serializer() {
        setInitialDataHoldouts setinitialdataholdouts = this.RemoteActionCompatParcelizer;
        byte[] bArr = (byte[]) setinitialdataholdouts.IconCompatParcelizer;
        byte[] bArr2 = (byte[]) setinitialdataholdouts.write;
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = this.IconCompatParcelizer;
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(new byte[][]{bArr, bArr2, (byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.write, (byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer});
    }

    public deleteFeature(bootstrapInitialDatafwf_client_release bootstrapinitialdatafwf_client_release, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(bootstrapinitialdatafwf_client_release, true);
        this.RemoteActionCompatParcelizer = new setInitialDataHoldouts(bArr, bArr2);
        this.IconCompatParcelizer = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(bArr3, bArr4);
    }
}
