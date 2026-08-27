package o;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdae_SED_dzoC8sDVx5kB603UawVc implements PrivilegedExceptionAction {
    public final /* synthetic */ int read;

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? SSLSocket.class.getMethod("getApplicationProtocol", null) : SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
        return SSLEngine.class.getMethod("getApplicationProtocol", null);
    }
}
