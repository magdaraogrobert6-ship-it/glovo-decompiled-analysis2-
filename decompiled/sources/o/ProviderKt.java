package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ProviderKt extends provideRequest {
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
        userAgentHeaderInterceptorKt.read(z, 23, this.serializer);
    }

    public final String toString() {
        return evaluateFeaturefwf_client_releasedefault.read(this.serializer);
    }

    public ProviderKt(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("UTCTime string too short");
            throw null;
        }
        this.serializer = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("illegal characters in UTCTime string");
            throw null;
        }
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (!(providerequest instanceof ProviderKt)) {
            return false;
        }
        return Arrays.equals(this.serializer, ((ProviderKt) providerequest).serializer);
    }
}
