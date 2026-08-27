package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class logInfo extends provideRequest {
    public final byte IconCompatParcelizer;
    public static final logInfo write = new logInfo((byte) 0);
    public static final logInfo read = new logInfo((byte) -1);

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(1, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return this.IconCompatParcelizer != 0 ? 1 : 0;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(1, z);
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(1);
        userAgentHeaderInterceptorKt.write(this.IconCompatParcelizer);
    }

    public logInfo(byte b) {
        this.IconCompatParcelizer = b;
    }

    @Override // o.provideRequest
    public final provideRequest toDERObject() {
        return this.IconCompatParcelizer != 0 ? read : write;
    }

    public static logInfo serializer(byte[] bArr) {
        if (bArr.length != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("BOOLEAN value should have 1 byte in it");
            return null;
        }
        byte b = bArr[0];
        if (b != -1) {
            return b != 0 ? new logInfo(b) : write;
        }
        return read;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof logInfo) {
            if ((this.IconCompatParcelizer != 0) == (((logInfo) providerequest).IconCompatParcelizer != 0)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.IconCompatParcelizer != 0 ? "TRUE" : "FALSE";
    }
}
