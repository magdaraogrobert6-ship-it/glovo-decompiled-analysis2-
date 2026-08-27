package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerChatActivityobserveState1 extends provideRequest {
    public final byte[] write;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.write.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.write);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 26, this.write);
    }

    public final String toString() {
        return evaluateFeaturefwf_client_releasedefault.read(this.write);
    }

    public CustomerChatActivityobserveState1(byte[] bArr) {
        this.write = bArr;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof CustomerChatActivityobserveState1) {
            return Arrays.equals(this.write, ((CustomerChatActivityobserveState1) providerequest).write);
        }
        return false;
    }
}
