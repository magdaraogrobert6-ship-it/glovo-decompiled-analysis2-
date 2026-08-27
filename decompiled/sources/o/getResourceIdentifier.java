package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getResourceIdentifier {
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(getResourceIdentifier.class.getName());

    public static isSessionStartBasedTimeoutEnabled RemoteActionCompatParcelizer(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                getConfigurationCache getconfigurationcache = new getConfigurationCache(0, socket);
                OutputStream outputStream = socket.getOutputStream();
                if (outputStream != null) {
                    return new isSessionStartBasedTimeoutEnabled(getconfigurationcache, new isSessionStartBasedTimeoutEnabled(getconfigurationcache, outputStream));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("out == null");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("socket's output stream == null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("socket == null");
        return null;
    }

    public static isSdkAuthenticationEnabled serializer(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                getConfigurationCache getconfigurationcache = new getConfigurationCache(0, socket);
                InputStream inputStream = socket.getInputStream();
                if (inputStream != null) {
                    return new isSdkAuthenticationEnabled(getconfigurationcache, new isSdkAuthenticationEnabled(getconfigurationcache, inputStream));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("in == null");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("socket's input stream == null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("socket == null");
        return null;
    }

    public static isSdkAuthenticationEnabled IconCompatParcelizer(File file) {
        if (file != null) {
            return new isSdkAuthenticationEnabled(new isPushDeepLinkBackStackActivityEnabled(), new FileInputStream(file));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("file == null");
        return null;
    }

    public static isSessionStartBasedTimeoutEnabled serializer(File file) {
        if (file != null) {
            return new isSessionStartBasedTimeoutEnabled(new isPushDeepLinkBackStackActivityEnabled(), new FileOutputStream(file));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("file == null");
        return null;
    }

    public static isSessionStartBasedTimeoutEnabled write(File file) {
        return new isSessionStartBasedTimeoutEnabled(new isPushDeepLinkBackStackActivityEnabled(), new FileOutputStream(file, true));
    }
}
