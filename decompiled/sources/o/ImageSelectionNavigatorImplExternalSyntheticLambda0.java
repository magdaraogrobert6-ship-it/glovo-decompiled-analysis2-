package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageSelectionNavigatorImplExternalSyntheticLambda0 extends provideRequest {
    public final byte[] serializer;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.serializer.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.serializer);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 20, this.serializer);
    }

    public final String toString() {
        return evaluateFeaturefwf_client_releasedefault.read(this.serializer);
    }

    public ImageSelectionNavigatorImplExternalSyntheticLambda0(byte[] bArr) {
        this.serializer = bArr;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof ImageSelectionNavigatorImplExternalSyntheticLambda0) {
            return Arrays.equals(this.serializer, ((ImageSelectionNavigatorImplExternalSyntheticLambda0) providerequest).serializer);
        }
        return false;
    }
}
