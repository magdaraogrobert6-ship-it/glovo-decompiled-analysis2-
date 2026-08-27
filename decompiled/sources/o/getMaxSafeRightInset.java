package o;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class getMaxSafeRightInset implements isRunningOnTablet {
    @Override // o.isRunningOnTablet
    public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // o.isRunningOnTablet
    public final boolean write() {
        getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // o.isRunningOnTablet
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) throws IOException {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
            sSLParameters.setApplicationProtocols((String[]) AndroidUiDispatcherCompanioncurrentThread1.IconCompatParcelizer(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // o.isRunningOnTablet
    public final String write(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
