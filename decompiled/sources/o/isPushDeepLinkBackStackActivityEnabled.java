package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class isPushDeepLinkBackStackActivityEnabled {
    public static final isPushNotificationHtmlRenderingEnabled write = new isPushNotificationHtmlRenderingEnabled();
    public long IconCompatParcelizer;
    public long read;
    public boolean serializer;

    public isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer(long j) {
        this.serializer = true;
        this.IconCompatParcelizer = j;
        return this;
    }

    public boolean write() {
        return this.serializer;
    }

    public long IconCompatParcelizer() {
        if (this.serializer) {
            return this.IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("No deadline");
        return 0L;
    }

    public void RemoteActionCompatParcelizer() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.serializer && this.IconCompatParcelizer - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public isPushDeepLinkBackStackActivityEnabled serializer() {
        this.serializer = false;
        return this;
    }

    public isPushDeepLinkBackStackActivityEnabled read(long j) {
        if (j >= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (timeUnit != null) {
                this.read = timeUnit.toNanos(j);
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unit == null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "timeout < 0: "));
        return null;
    }

    public isPushDeepLinkBackStackActivityEnabled read() {
        this.read = 0L;
        return this;
    }
}
