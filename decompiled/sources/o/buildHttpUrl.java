package o;

/* JADX INFO: loaded from: classes4.dex */
public final class buildHttpUrl extends provideRequest {
    public static final buildHttpUrl write = new buildHttpUrl();
    public static final byte[] serializer = new byte[0];

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(0, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return -1;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 5, serializer);
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        return providerequest instanceof buildHttpUrl;
    }

    public final String toString() {
        return "NULL";
    }
}
