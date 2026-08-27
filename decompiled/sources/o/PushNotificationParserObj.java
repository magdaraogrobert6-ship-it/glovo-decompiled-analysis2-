package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class PushNotificationParserObj extends provideRequest {
    public final byte[] IconCompatParcelizer;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.IconCompatParcelizer.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.IconCompatParcelizer);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 25, this.IconCompatParcelizer);
    }

    static {
        new ProvidernetworkModule12(PushNotificationParserObj.class, 2);
    }

    public PushNotificationParserObj(byte[] bArr) {
        if (bArr != null) {
            this.IconCompatParcelizer = bArr;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'contents' cannot be null");
            throw null;
        }
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof PushNotificationParserObj) {
            return Arrays.equals(this.IconCompatParcelizer, ((PushNotificationParserObj) providerequest).IconCompatParcelizer);
        }
        return false;
    }
}
