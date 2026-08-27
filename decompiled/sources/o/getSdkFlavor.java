package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public final class getSdkFlavor extends getLoggerInitialLogLevel {
    @Override // o.getLoggerInitialLogLevel
    public final SSLContext serializer() {
        try {
            return SSLContext.getInstance("TLSv1.3", write());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", write());
            } catch (NoSuchAlgorithmException unused) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No TLS provider", e);
                return null;
            }
        }
    }

    public static getSdkFlavor RemoteActionCompatParcelizer() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new getSdkFlavor();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static java.security.Provider write() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // o.getLoggerInitialLogLevel
    public final String IconCompatParcelizer(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o.getLoggerInitialLogLevel
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) getLoggerInitialLogLevel.serializer(list).toArray(new String[0]));
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public final void RemoteActionCompatParcelizer(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
