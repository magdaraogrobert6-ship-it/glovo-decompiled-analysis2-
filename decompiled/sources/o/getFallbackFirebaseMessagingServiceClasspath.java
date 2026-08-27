package o;

import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.Protocol;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class getFallbackFirebaseMessagingServiceClasspath extends getLoggerInitialLogLevel {
    public final Object IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final Object serializer;
    public final Object write;

    public getFallbackFirebaseMessagingServiceClasspath(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy, r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy2, r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy3, r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy4) throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method = cls.getMethod("open", String.class);
            method2 = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.MediaBrowserCompatMediaItem = new getPushDeepLinkBackStackActivityClassName(method3, method, method2);
        this.serializer = r8lambdadeozq815xuuwmllyyvm_qv79qy;
        this.IconCompatParcelizer = r8lambdadeozq815xuuwmllyyvm_qv79qy2;
        this.write = r8lambdadeozq815xuuwmllyyvm_qv79qy3;
        this.RemoteActionCompatParcelizer = r8lambdadeozq815xuuwmllyyvm_qv79qy4;
    }

    @Override // o.getLoggerInitialLogLevel
    public void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        int i = this.read;
        Object obj = this.serializer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            try {
                ((Method) obj).invoke(null, sSLSocket, Proxy.newProxyInstance(getLoggerInitialLogLevel.class.getClassLoader(), new Class[]{(Class) obj2, (Class) this.MediaBrowserCompatMediaItem}, new getLargeNotificationIconResourceId(getLoggerInitialLogLevel.serializer(list))));
                return;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to set alpn", e);
            }
        }
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = (r8lambdadeOzq815xUUwmlLYYvm_QV79QY) obj2;
        if (str != null) {
            ((r8lambdadeOzq815xUUwmlLYYvm_QV79QY) obj).read(sSLSocket, Boolean.TRUE);
            ((r8lambdadeOzq815xUUwmlLYYvm_QV79QY) this.IconCompatParcelizer).read(sSLSocket, str);
        }
        if (r8lambdadeozq815xuuwmllyyvm_qv79qy == null || r8lambdadeozq815xuuwmllyyvm_qv79qy.read(sSLSocket.getClass()) == null) {
            return;
        }
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Protocol protocol = (Protocol) list.get(i2);
            if (protocol != Protocol.HTTP_1_0) {
                r8lambdabeyrnr8p6809bwlboro_stans.write(protocol.toString().length());
                String string = protocol.toString();
                r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer(0, string.length(), string);
            }
        }
        try {
            r8lambdadeozq815xuuwmllyyvm_qv79qy.IconCompatParcelizer(sSLSocket, r8lambdabeyrnr8p6809bwlboro_stans.RatingCompat());
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public SSLContext serializer() {
        if (this.read != 0) {
            return super.serializer();
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No TLS provider", e);
            return null;
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public String IconCompatParcelizer(SSLSocket sSLSocket) {
        if (this.read != 0) {
            try {
                getLargeNotificationIconResourceId getlargenotificationiconresourceid = (getLargeNotificationIconResourceId) Proxy.getInvocationHandler(((Method) this.IconCompatParcelizer).invoke(null, sSLSocket));
                boolean z = getlargenotificationiconresourceid.write;
                if (!z && getlargenotificationiconresourceid.read == null) {
                    getLoggerInitialLogLevel.RatingCompat.read(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                    return null;
                }
                if (z) {
                    return null;
                }
                return getlargenotificationiconresourceid.read;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to get selected protocol", e);
            }
        }
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = (r8lambdadeOzq815xUUwmlLYYvm_QV79QY) this.write;
        if (r8lambdadeozq815xuuwmllyyvm_qv79qy == null || r8lambdadeozq815xuuwmllyyvm_qv79qy.read(sSLSocket.getClass()) == null) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) r8lambdadeozq815xuuwmllyyvm_qv79qy.IconCompatParcelizer(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaMetadataCompat);
            }
            return null;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public getFallbackFirebaseMessagingServiceClasspath(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.serializer = method;
        this.IconCompatParcelizer = method2;
        this.write = method3;
        this.RemoteActionCompatParcelizer = cls;
        this.MediaBrowserCompatMediaItem = cls2;
    }

    @Override // o.getLoggerInitialLogLevel
    public boolean read(String str) {
        if (this.read != 0) {
            return super.read(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return IconCompatParcelizer(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to determine cleartext support", e);
        }
    }

    public static boolean IconCompatParcelizer(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public isAdmMessagingRegistrationEnabled read(X509TrustManager x509TrustManager) {
        if (this.read != 0) {
            return super.read(x509TrustManager);
        }
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new getInAppMessageWebViewClientOnPageFinishedMaxWaitMs(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new getShouldPersistWebViewWhenBackgroundingApp(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public void write(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        if (this.read != 0) {
            super.write(socket, inetSocketAddress, i);
            return;
        }
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public void write(SSLSocket sSLSocket) {
        if (this.read != 1) {
            return;
        }
        try {
            ((Method) this.write).invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to remove alpn", e);
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public void read(int i, String str, Throwable th) {
        int iMin;
        if (this.read != 0) {
            super.read(i, str, th);
            return;
        }
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int iIndexOf = str.indexOf(10, i3);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i3 = iMin;
                }
            }
            i3 = iMin + 1;
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public Object read() {
        if (this.read != 0) {
            return super.read();
        }
        getPushDeepLinkBackStackActivityClassName getpushdeeplinkbackstackactivityclassname = (getPushDeepLinkBackStackActivityClassName) this.MediaBrowserCompatMediaItem;
        Method method = getpushdeeplinkbackstackactivityclassname.read;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            getpushdeeplinkbackstackactivityclassname.write.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public void IconCompatParcelizer(String str, Object obj) {
        if (this.read != 0) {
            super.IconCompatParcelizer(str, obj);
            return;
        }
        getPushDeepLinkBackStackActivityClassName getpushdeeplinkbackstackactivityclassname = (getPushDeepLinkBackStackActivityClassName) this.MediaBrowserCompatMediaItem;
        getpushdeeplinkbackstackactivityclassname.getClass();
        if (obj != null) {
            try {
                getpushdeeplinkbackstackactivityclassname.IconCompatParcelizer.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        read(5, str, null);
    }

    @Override // o.getLoggerInitialLogLevel
    public getShouldAddStatusBarPaddingToInAppMessages serializer(X509TrustManager x509TrustManager) {
        if (this.read != 0) {
            return super.serializer(x509TrustManager);
        }
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new getEphemeralEventKeys(cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class), cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager));
        } catch (Exception unused) {
            return super.serializer(x509TrustManager);
        }
    }
}
