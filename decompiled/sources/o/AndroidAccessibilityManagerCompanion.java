package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.zzw;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidAccessibilityManagerCompanion implements Closeable {
    public final URL RemoteActionCompatParcelizer;
    public zzw read;
    public volatile Future write;

    public AndroidAccessibilityManagerCompanion(URL url) {
        this.RemoteActionCompatParcelizer = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.cancel(true);
    }

    public final Bitmap read() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.RemoteActionCompatParcelizer;
        if (zIsLoggable) {
            Objects.toString(url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() <= 1048576) {
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            try {
                byte[] bArrIconCompatParcelizer = AccessibilityIteratorsTextSegmentIterator.IconCompatParcelizer(new isStartBoundary(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Objects.toString(url);
                }
                if (bArrIconCompatParcelizer.length <= 1048576) {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrIconCompatParcelizer, 0, bArrIconCompatParcelizer.length);
                    if (bitmapDecodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Objects.toString(url);
                        }
                        return bitmapDecodeByteArray;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(url, "Failed to decode image: ");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Image exceeds max size of 1048576");
                return null;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Content-Length exceeds max size of 1048576");
        return null;
    }
}
