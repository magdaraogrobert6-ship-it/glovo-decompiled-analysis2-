package o;

import io.sentry.CombinedScopeView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ {
    public static final r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ RemoteActionCompatParcelizer;
    public static final java.util.logging.Logger serializer;
    public static final String[] write;
    public final java.security.Provider read;

    public void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
    }

    public String read(SSLSocket sSLSocket) {
        return null;
    }

    public r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ read() {
        return r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.NONE;
    }

    public void write(SSLSocket sSLSocket) {
    }

    static {
        Object obj;
        java.security.Provider provider;
        r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ r8lambdac_htdlzeudqulpnwj5kgesh7eq;
        r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq;
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.class.getName());
        serializer = logger;
        write = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        java.security.Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i = 0;
        loop0: while (true) {
            obj = null;
            if (i >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            java.security.Provider provider2 = providers[i];
            for (String str : write) {
                if (str.equals(provider2.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i++;
        }
        if (provider != null) {
            int i2 = 27;
            CombinedScopeView combinedScopeView = new CombinedScopeView(obj, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i2);
            CombinedScopeView combinedScopeView2 = new CombinedScopeView(obj, "setHostname", new Class[]{String.class}, i2);
            CombinedScopeView combinedScopeView3 = new CombinedScopeView(byte[].class, "getAlpnSelectedProtocol", new Class[0], i2);
            CombinedScopeView combinedScopeView4 = new CombinedScopeView(obj, "setAlpnProtocols", new Class[]{byte[].class}, i2);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq = r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.ALPN_AND_NPN;
            } else {
                try {
                    r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.class.getClassLoader().loadClass("android.net.Network");
                    r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq = r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.ALPN_AND_NPN;
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq = r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.NPN;
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq = r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.NONE;
                    }
                }
            }
            r8lambdac_htdlzeudqulpnwj5kgesh7eq = new r8lambdatZvvlfpdQ851eBNGFxdZdLW0Ok4(combinedScopeView, combinedScopeView2, combinedScopeView3, combinedScopeView4, provider, r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq);
        } else {
            try {
                java.security.Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new r8lambdae_SED_dzoC8sDVx5kB603UawVc(0))).invoke(sSLContext.createSSLEngine(), null);
                        r8lambdac_htdlzeudqulpnwj5kgesh7eq = new r8lambdalQ_i7SgKuoiHsV0nzpyx8w0AodI(provider3, (Method) AccessController.doPrivileged(new r8lambdae_SED_dzoC8sDVx5kB603UawVc(1)), (Method) AccessController.doPrivileged(new r8lambdae_SED_dzoC8sDVx5kB603UawVc(2)));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        r8lambdac_htdlzeudqulpnwj5kgesh7eq = new r8lambdaqUKZCZ63GsRUjOP4deaOf3AB51Y(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    r8lambdac_htdlzeudqulpnwj5kgesh7eq = new r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ(provider3);
                }
            } catch (NoSuchAlgorithmException e3) {
                DrawableTransformation.read((Throwable) e3);
                return;
            }
        }
        RemoteActionCompatParcelizer = r8lambdac_htdlzeudqulpnwj5kgesh7eq;
    }

    public static byte[] serializer(List list) {
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e = (r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E) list.get(i);
            if (r8lambdax9cqozr3ps0lcwn_msrw5cdl8e != r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_1_0) {
                registryMissingComponentException.read(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e.toString().length());
                registryMissingComponentException.IconCompatParcelizer(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e.toString());
            }
        }
        return registryMissingComponentException.read(registryMissingComponentException.size);
    }

    public r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ(java.security.Provider provider) {
        this.read = provider;
    }
}
