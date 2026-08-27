package o;

import android.os.SystemClock;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.Closeable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ApproachMeasureScopeImpl implements Closeable {
    public static final HashMap IconCompatParcelizer = new HashMap();
    public long MediaBrowserCompatMediaItem = 2147483647L;
    public long MediaSessionCompatQueueItem = -2147483648L;
    public int RemoteActionCompatParcelizer;
    public long read;
    public long write;

    public void serializer(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.write;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.RemoteActionCompatParcelizer = 0;
            this.read = 0L;
            this.MediaBrowserCompatMediaItem = 2147483647L;
            this.MediaSessionCompatQueueItem = -2147483648L;
        }
        this.write = jElapsedRealtimeNanos;
        this.RemoteActionCompatParcelizer++;
        this.MediaBrowserCompatMediaItem = Math.min(this.MediaBrowserCompatMediaItem, j);
        this.MediaSessionCompatQueueItem = Math.max(this.MediaSessionCompatQueueItem, j);
        if (this.RemoteActionCompatParcelizer % 50 == 0) {
            java.util.Locale locale = java.util.Locale.US;
            setApproachMeasureRequiredui.RemoteActionCompatParcelizer();
        }
        if (this.RemoteActionCompatParcelizer % Constant.ERROR_UNKNOWN == 0) {
            this.RemoteActionCompatParcelizer = 0;
            this.read = 0L;
            this.MediaBrowserCompatMediaItem = 2147483647L;
            this.MediaSessionCompatQueueItem = -2147483648L;
        }
    }

    public ApproachMeasureScopeImpl(String str) {
    }

    public void RemoteActionCompatParcelizer() {
        this.read = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void RemoteActionCompatParcelizer(long j) {
        serializer((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.read;
        if (j != 0) {
            RemoteActionCompatParcelizer(j);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Did you forget to call start()?");
        }
    }
}
