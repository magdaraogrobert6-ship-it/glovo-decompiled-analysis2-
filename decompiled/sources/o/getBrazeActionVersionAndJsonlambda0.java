package o;

import io.sentry.HostnameCache$$ExternalSyntheticLambda0;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class getBrazeActionVersionAndJsonlambda0 {
    public static final io.sentry.util.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
    public static volatile getBrazeActionVersionAndJsonlambda0 serializer;
    public volatile long IconCompatParcelizer;
    public final AtomicBoolean MediaBrowserCompatMediaItem;
    public volatile String MediaMetadataCompat;
    public final HostnameCache$$ExternalSyntheticLambda0 MediaSessionCompatQueueItem;
    public final long read;
    public final ExecutorService write;

    public final void RemoteActionCompatParcelizer() {
        this.write.shutdown();
    }

    public final String write() {
        if (this.IconCompatParcelizer < System.currentTimeMillis() && this.MediaBrowserCompatMediaItem.compareAndSet(false, true)) {
            read();
        }
        return this.MediaMetadataCompat;
    }

    public getBrazeActionVersionAndJsonlambda0() {
        HostnameCache$$ExternalSyntheticLambda0 hostnameCache$$ExternalSyntheticLambda0 = new HostnameCache$$ExternalSyntheticLambda0(0);
        this.MediaBrowserCompatMediaItem = new AtomicBoolean(false);
        this.write = Executors.newSingleThreadExecutor(new parselambda0(0));
        this.read = 18000000L;
        this.MediaSessionCompatQueueItem = hostnameCache$$ExternalSyntheticLambda0;
        read();
    }

    public final void read() {
        try {
            this.write.submit(new HostnameCache$$ExternalSyntheticLambda1(0, this)).get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.IconCompatParcelizer = System.currentTimeMillis() + 1000;
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.IconCompatParcelizer = System.currentTimeMillis() + 1000;
        }
    }

    public static getBrazeActionVersionAndJsonlambda0 serializer() {
        if (serializer == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = RemoteActionCompatParcelizer.serializer();
            try {
                if (serializer == null) {
                    serializer = new getBrazeActionVersionAndJsonlambda0();
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return serializer;
    }
}
