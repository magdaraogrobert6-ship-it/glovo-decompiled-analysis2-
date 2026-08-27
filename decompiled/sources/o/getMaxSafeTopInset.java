package o;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.AndroidPlatform$Companion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getMaxSafeTopInset {
    public static volatile getMaxSafeTopInset MediaDescriptionCompat;
    public static final java.util.logging.Logger RemoteActionCompatParcelizer;

    public abstract SSLContext IconCompatParcelizer();

    public abstract String RemoteActionCompatParcelizer(SSLSocket sSLSocket);

    public abstract boolean serializer(String str);

    public abstract getHttpClientfwf_client_release write(X509TrustManager x509TrustManager);

    public abstract void write(SSLSocket sSLSocket, String str, List list);

    static {
        try {
            for (Map.Entry entry : getStatusBarHeight.IconCompatParcelizer.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(str);
                if (getStatusBarHeight.write.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(isDeviceInNightMode.write);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        getMaxSafeTopInset r8lambdafpjtzdks78ehlcxgd9ic6zhuuma = r8lambdafpJtzdks78ehLcXGD9Ic6zHuuMA.IconCompatParcelizer ? new r8lambdafpJtzdks78ehLcXGD9Ic6zHuuMA() : null;
        if (r8lambdafpjtzdks78ehlcxgd9ic6zhuuma == null) {
            boolean z = r8lambdayCqONI5qtI0P4J7deuwwogdnEs.read;
            r8lambdafpjtzdks78ehlcxgd9ic6zhuuma = AndroidPlatform$Companion.write();
        }
        if (r8lambdafpjtzdks78ehlcxgd9ic6zhuuma == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            MediaDescriptionCompat = r8lambdafpjtzdks78ehlcxgd9ic6zhuuma;
            RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class.getName());
        }
    }

    public Object RemoteActionCompatParcelizer() {
        if (RemoteActionCompatParcelizer.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void read(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        RemoteActionCompatParcelizer.log(level, str, th);
    }

    public void read(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public void RemoteActionCompatParcelizer(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        read(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
