package o;

import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.Protocol;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class getLoggerInitialLogLevel {
    public static final java.util.logging.Logger MediaSessionCompatQueueItem;
    public static final getLoggerInitialLogLevel RatingCompat;

    public String IconCompatParcelizer(SSLSocket sSLSocket) {
        return null;
    }

    public void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
    }

    public void RemoteActionCompatParcelizer(SSLSocketFactory sSLSocketFactory) {
    }

    public boolean read(String str) {
        return true;
    }

    public void write(SSLSocket sSLSocket) {
    }

    public static ArrayList serializer(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public isAdmMessagingRegistrationEnabled read(X509TrustManager x509TrustManager) {
        return new getShouldPersistWebViewWhenBackgroundingApp(x509TrustManager.getAcceptedIssuers());
    }

    public SSLContext serializer() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No TLS provider", e);
            return null;
        }
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    static {
        getLoggerInitialLogLevel getloggerinitialloglevel;
        getLoggerInitialLogLevel getloggerinitialloglevelRemoteActionCompatParcelizer;
        getSdkMetadata getsdkmetadata;
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy;
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy2;
        Class<byte[]> cls = byte[].class;
        getFallbackFirebaseMessagingServiceClasspath getfallbackfirebasemessagingserviceclasspath = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                getloggerinitialloglevel = new getDoesPushStoryDismissOnClick(null, null, null, null);
            } else {
                getloggerinitialloglevel = null;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (getloggerinitialloglevel == null) {
            try {
                if (Build.VERSION.SDK_INT == 0) {
                    getloggerinitialloglevelRemoteActionCompatParcelizer = null;
                } else {
                    try {
                        Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                    } catch (ClassNotFoundException unused2) {
                        Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
                    }
                    int i = 10;
                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy3 = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(getfallbackfirebasemessagingserviceclasspath, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i);
                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy4 = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(getfallbackfirebasemessagingserviceclasspath, "setHostname", new Class[]{String.class}, i);
                    if (Security.getProvider("GMSCore_OpenSSL") == null) {
                        try {
                            Class.forName("android.net.Network");
                        } catch (ClassNotFoundException unused3) {
                            r8lambdadeozq815xuuwmllyyvm_qv79qy = null;
                            r8lambdadeozq815xuuwmllyyvm_qv79qy2 = null;
                        }
                    }
                    r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(cls, "getAlpnSelectedProtocol", new Class[0], i);
                    r8lambdadeozq815xuuwmllyyvm_qv79qy2 = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(getfallbackfirebasemessagingserviceclasspath, "setAlpnProtocols", new Class[]{byte[].class}, i);
                    getloggerinitialloglevelRemoteActionCompatParcelizer = new getFallbackFirebaseMessagingServiceClasspath(r8lambdadeozq815xuuwmllyyvm_qv79qy3, r8lambdadeozq815xuuwmllyyvm_qv79qy4, r8lambdadeozq815xuuwmllyyvm_qv79qy, r8lambdadeozq815xuuwmllyyvm_qv79qy2);
                }
            } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
            }
            if (getloggerinitialloglevelRemoteActionCompatParcelizer == null && (!("conscrypt".equals(System.getProperty("okhttp.platform")) || "Conscrypt".equals(Security.getProviders()[0].getName())) || (getloggerinitialloglevelRemoteActionCompatParcelizer = getSdkFlavor.RemoteActionCompatParcelizer()) == null)) {
                try {
                    getsdkmetadata = new getSdkMetadata(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused5) {
                    getsdkmetadata = null;
                }
                if (getsdkmetadata != null) {
                    getloggerinitialloglevel = getsdkmetadata;
                } else {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        getfallbackfirebasemessagingserviceclasspath = new getFallbackFirebaseMessagingServiceClasspath(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                    }
                    getloggerinitialloglevel = getfallbackfirebasemessagingserviceclasspath != null ? getfallbackfirebasemessagingserviceclasspath : new getLoggerInitialLogLevel();
                }
            } else {
                getloggerinitialloglevel = getloggerinitialloglevelRemoteActionCompatParcelizer;
            }
        }
        RatingCompat = getloggerinitialloglevel;
        MediaSessionCompatQueueItem = java.util.logging.Logger.getLogger(isFirebaseCloudMessagingRegistrationEnabled.class.getName());
    }

    public void write(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void read(int i, String str, Throwable th) {
        MediaSessionCompatQueueItem.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object read() {
        if (MediaSessionCompatQueueItem.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void IconCompatParcelizer(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        read(5, str, (Throwable) obj);
    }

    public getShouldAddStatusBarPaddingToInAppMessages serializer(X509TrustManager x509TrustManager) {
        return new getShouldOptInWhenPushAuthorized(read(x509TrustManager));
    }
}
