package o;

import bo.app.w$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaChdSTjsE0tA1e46Psywe07pQFQ {
    public static final java.util.logging.Logger IconCompatParcelizer;
    public static final r8lambdaChdSTjsE0tA1e46Psywe07pQFQ write;
    public final r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ serializer;

    static {
        r8lambdaChdSTjsE0tA1e46Psywe07pQFQ r8lambdachdstjse0ta1e46psywe07pqfq;
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(r8lambdaChdSTjsE0tA1e46Psywe07pQFQ.class.getName());
        IconCompatParcelizer = logger;
        r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ r8lambdac_htdlzeudqulpnwj5kgesh7eq = r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.RemoteActionCompatParcelizer;
        ClassLoader classLoader = r8lambdaChdSTjsE0tA1e46Psywe07pQFQ.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                r8lambdachdstjse0ta1e46psywe07pqfq = new r8lambdaChdSTjsE0tA1e46Psywe07pQFQ(r8lambdac_htdlzeudqulpnwj5kgesh7eq);
            }
        }
        r8lambdachdstjse0ta1e46psywe07pqfq = new r8lambdaABDVpIo7QoW7E_BX5QIwCg1Xa3s(r8lambdac_htdlzeudqulpnwj5kgesh7eq);
        write = r8lambdachdstjse0ta1e46psywe07pqfq;
    }

    public static boolean RemoteActionCompatParcelizer(String str) {
        if (str.contains(BundleUtil.UNDERLINE_TAG)) {
            return false;
        }
        try {
            TextStreamsKt.read(new Object[]{"Userinfo must not be present on authority: '%s'", str, Boolean.valueOf(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.write(str).getAuthority().indexOf(64) == -1)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        this.serializer.RemoteActionCompatParcelizer(sSLSocket, str, list);
    }

    public String read(SSLSocket sSLSocket) {
        return this.serializer.read(sSLSocket);
    }

    public r8lambdaChdSTjsE0tA1e46Psywe07pQFQ(r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ r8lambdac_htdlzeudqulpnwj5kgesh7eq) {
        TextStreamsKt.serializer(r8lambdac_htdlzeudqulpnwj5kgesh7eq, "platform");
        this.serializer = r8lambdac_htdlzeudqulpnwj5kgesh7eq;
    }

    public String read(SSLSocket sSLSocket, String str, List list) {
        r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ r8lambdac_htdlzeudqulpnwj5kgesh7eq = this.serializer;
        if (list != null) {
            RemoteActionCompatParcelizer(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String str2 = read(sSLSocket);
            if (str2 != null) {
                r8lambdac_htdlzeudqulpnwj5kgesh7eq.write(sSLSocket);
                return str2;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th) {
            r8lambdac_htdlzeudqulpnwj5kgesh7eq.write(sSLSocket);
            throw th;
        }
    }
}
