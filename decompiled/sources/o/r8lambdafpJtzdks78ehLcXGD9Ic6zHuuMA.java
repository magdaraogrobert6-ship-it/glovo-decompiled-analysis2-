package o;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdafpJtzdks78ehLcXGD9Ic6zHuuMA extends getMaxSafeTopInset implements getMaxSafeLeftInset {
    public static final boolean IconCompatParcelizer;
    public Context read;
    public final ArrayList serializer;

    @Override // o.getMaxSafeLeftInset
    public final void RemoteActionCompatParcelizer(Context context) {
        this.read = context;
    }

    @Override // o.getMaxSafeLeftInset
    public final Context serializer() {
        return this.read;
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

    public r8lambdafpJtzdks78ehLcXGD9Ic6zHuuMA() {
        ArrayList arrayListRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new isRunningOnTablet[]{Build.VERSION.SDK_INT >= 29 ? new getMaxSafeRightInset() : null, new isDeviceNotInTouchMode(isCurrentOrientationValidlambda0.write), new isDeviceNotInTouchMode(isCurrentOrientationValid.serializer), new isDeviceNotInTouchMode(isCurrentOrientationValidlambda2.read)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListRemoteActionCompatParcelizer) {
            if (((isRunningOnTablet) obj).write()) {
                arrayList.add(obj);
            }
        }
        this.serializer = arrayList;
    }

    @Override // o.getMaxSafeTopInset
    public final SSLContext IconCompatParcelizer() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new removeViewFromParentlambda2(new setFocusableInTouchModeAndRequestFocuslambda0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // o.getMaxSafeTopInset
    public final void RemoteActionCompatParcelizer(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.RemoteActionCompatParcelizer(obj, str);
        } else {
            obj.getClass();
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(obj).warnIfOpen();
        }
    }

    @Override // o.getMaxSafeTopInset
    public final Object RemoteActionCompatParcelizer() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.RemoteActionCompatParcelizer();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    static {
        IconCompatParcelizer = Build.VERSION.SDK_INT >= 29;
    }
}
