package o;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdayCqONI5qtI0P4J7deuwwogdnEs extends getMaxSafeTopInset implements getMaxSafeLeftInset {
    public static final boolean read;
    public final ArrayList serializer;
    public Context write;

    @Override // o.getMaxSafeLeftInset
    public final void RemoteActionCompatParcelizer(Context context) {
        this.write = context;
    }

    @Override // o.getMaxSafeLeftInset
    public final Context serializer() {
        return this.write;
    }

    @Override // o.getMaxSafeTopInset
    public final SSLContext IconCompatParcelizer() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // o.getMaxSafeTopInset
    public final String RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.serializer.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((isRunningOnTablet) next).RemoteActionCompatParcelizer(sSLSocket));
        isRunningOnTablet isrunningontablet = (isRunningOnTablet) next;
        if (isrunningontablet != null) {
            return isrunningontablet.write(sSLSocket);
        }
        return null;
    }

    @Override // o.getMaxSafeTopInset
    public final void read(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    @Override // o.getMaxSafeTopInset
    public final boolean serializer(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // o.getMaxSafeTopInset
    public final void write(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.serializer.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((isRunningOnTablet) next).RemoteActionCompatParcelizer(sSLSocket));
        isRunningOnTablet isrunningontablet = (isRunningOnTablet) next;
        if (isrunningontablet != null) {
            isrunningontablet.RemoteActionCompatParcelizer(sSLSocket, str, list);
        }
    }

    @Override // o.getMaxSafeTopInset
    public final getHttpClientfwf_client_release write(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        ViewUtilsExternalSyntheticLambda6 setfocusableintouchmodeandrequestfocuslambda0;
        x509TrustManager.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        getMaxSafeBottomInset getmaxsafebottominset = x509TrustManagerExtensions != null ? new getMaxSafeBottomInset(x509TrustManager, x509TrustManagerExtensions) : null;
        if (getmaxsafebottominset != null) {
            return getmaxsafebottominset;
        }
        x509TrustManager.getClass();
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            setfocusableintouchmodeandrequestfocuslambda0 = new r8lambdaoU7YHvonsNQ38BqQA_zMYiWhM(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            setfocusableintouchmodeandrequestfocuslambda0 = new setFocusableInTouchModeAndRequestFocuslambda0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new removeViewFromParentlambda2(setfocusableintouchmodeandrequestfocuslambda0);
    }

    @Override // o.getMaxSafeTopInset
    public final void read(int i, String str, Throwable th) {
        if (i == 5) {
            SentryLogcatAdapter.write("OkHttp", str, th);
        }
    }

    static {
        read = Build.VERSION.SDK_INT < 29;
    }

    public r8lambdayCqONI5qtI0P4J7deuwwogdnEs() {
        setActivityRequestedOrientation setactivityrequestedorientation;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            setactivityrequestedorientation = new setActivityRequestedOrientation(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = getStatusBarHeight.write;
            getStatusBarHeight.read(5, r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class.getName(), "unable to load android socket classes", e);
            setactivityrequestedorientation = null;
        }
        ArrayList arrayListRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new isRunningOnTablet[]{setactivityrequestedorientation, new isDeviceNotInTouchMode(isCurrentOrientationValidlambda0.write), new isDeviceNotInTouchMode(isCurrentOrientationValid.serializer), new isDeviceNotInTouchMode(isCurrentOrientationValidlambda2.read)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListRemoteActionCompatParcelizer) {
            if (((isRunningOnTablet) obj).write()) {
                arrayList.add(obj);
            }
        }
        this.serializer = arrayList;
    }
}
