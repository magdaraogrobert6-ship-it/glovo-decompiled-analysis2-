package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class isCurrentOrientationValidlambda2 implements isRunningOnTablet {
    public static final boolean RemoteActionCompatParcelizer;
    public static final isCurrentOrientationValidlambda1 read = new isCurrentOrientationValidlambda1();

    @Override // o.isRunningOnTablet
    public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        return false;
    }

    @Override // o.isRunningOnTablet
    public final boolean write() {
        return RemoteActionCompatParcelizer;
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, coil3.util.ContextsKt.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        RemoteActionCompatParcelizer = z;
    }

    @Override // o.isRunningOnTablet
    public final String write(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.isRunningOnTablet
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (RemoteActionCompatParcelizer(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
            parameters.setApplicationProtocols((String[]) AndroidUiDispatcherCompanioncurrentThread1.IconCompatParcelizer(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
