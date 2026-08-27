package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class cacheImageFile extends provideRequest {
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
        userAgentHeaderInterceptorKt.read(z, 21, this.IconCompatParcelizer);
    }

    public cacheImageFile(byte[] bArr) {
        this.IconCompatParcelizer = bArr;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof cacheImageFile) {
            return Arrays.equals(this.IconCompatParcelizer, ((cacheImageFile) providerequest).IconCompatParcelizer);
        }
        return false;
    }
}
