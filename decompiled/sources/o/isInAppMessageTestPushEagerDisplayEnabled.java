package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public class isInAppMessageTestPushEagerDisplayEnabled extends isPushDeepLinkBackStackActivityEnabled {
    public static isInAppMessageTestPushEagerDisplayEnabled RemoteActionCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public isInAppMessageTestPushEagerDisplayEnabled MediaSessionCompatQueueItem;
    public long RatingCompat;

    public void MediaSessionCompatQueueItem() {
    }

    public static isInAppMessageTestPushEagerDisplayEnabled MediaDescriptionCompat() throws InterruptedException {
        isInAppMessageTestPushEagerDisplayEnabled isinappmessagetestpusheagerdisplayenabled = RemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
        if (isinappmessagetestpusheagerdisplayenabled == null) {
            long jNanoTime = System.nanoTime();
            isInAppMessageTestPushEagerDisplayEnabled.class.wait(60000L);
            if (RemoteActionCompatParcelizer.MediaSessionCompatQueueItem != null || System.nanoTime() - jNanoTime < 60000000000L) {
                return null;
            }
            return RemoteActionCompatParcelizer;
        }
        long jNanoTime2 = isinappmessagetestpusheagerdisplayenabled.RatingCompat - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            isInAppMessageTestPushEagerDisplayEnabled.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        RemoteActionCompatParcelizer.MediaSessionCompatQueueItem = isinappmessagetestpusheagerdisplayenabled.MediaSessionCompatQueueItem;
        isinappmessagetestpusheagerdisplayenabled.MediaSessionCompatQueueItem = null;
        return isinappmessagetestpusheagerdisplayenabled;
    }

    public final void MediaMetadataCompat() {
        isInAppMessageTestPushEagerDisplayEnabled isinappmessagetestpusheagerdisplayenabled;
        if (this.MediaBrowserCompatMediaItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unbalanced enter/exit");
            return;
        }
        long j = this.read;
        boolean z = this.serializer;
        if (j != 0 || z) {
            this.MediaBrowserCompatMediaItem = true;
            synchronized (isInAppMessageTestPushEagerDisplayEnabled.class) {
                if (RemoteActionCompatParcelizer == null) {
                    RemoteActionCompatParcelizer = new isInAppMessageTestPushEagerDisplayEnabled();
                    CachedConfigurationProvider cachedConfigurationProvider = new CachedConfigurationProvider("Okio Watchdog");
                    cachedConfigurationProvider.setDaemon(true);
                    cachedConfigurationProvider.start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.RatingCompat = Math.min(j, IconCompatParcelizer() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.RatingCompat = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.RatingCompat = IconCompatParcelizer();
                }
                long j2 = this.RatingCompat;
                isInAppMessageTestPushEagerDisplayEnabled isinappmessagetestpusheagerdisplayenabled2 = RemoteActionCompatParcelizer;
                while (true) {
                    isinappmessagetestpusheagerdisplayenabled = isinappmessagetestpusheagerdisplayenabled2.MediaSessionCompatQueueItem;
                    if (isinappmessagetestpusheagerdisplayenabled == null || j2 - jNanoTime < isinappmessagetestpusheagerdisplayenabled.RatingCompat - jNanoTime) {
                        break;
                        break;
                    }
                    isinappmessagetestpusheagerdisplayenabled2 = isinappmessagetestpusheagerdisplayenabled;
                }
                this.MediaSessionCompatQueueItem = isinappmessagetestpusheagerdisplayenabled;
                isinappmessagetestpusheagerdisplayenabled2.MediaSessionCompatQueueItem = this;
                if (isinappmessagetestpusheagerdisplayenabled2 == RemoteActionCompatParcelizer) {
                    isInAppMessageTestPushEagerDisplayEnabled.class.notify();
                }
            }
        }
    }

    public IOException write(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final boolean RatingCompat() {
        if (!this.MediaBrowserCompatMediaItem) {
            return false;
        }
        this.MediaBrowserCompatMediaItem = false;
        synchronized (isInAppMessageTestPushEagerDisplayEnabled.class) {
            isInAppMessageTestPushEagerDisplayEnabled isinappmessagetestpusheagerdisplayenabled = RemoteActionCompatParcelizer;
            while (isinappmessagetestpusheagerdisplayenabled != null) {
                isInAppMessageTestPushEagerDisplayEnabled isinappmessagetestpusheagerdisplayenabled2 = isinappmessagetestpusheagerdisplayenabled.MediaSessionCompatQueueItem;
                if (isinappmessagetestpusheagerdisplayenabled2 == this) {
                    isinappmessagetestpusheagerdisplayenabled.MediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem;
                    this.MediaSessionCompatQueueItem = null;
                    return false;
                }
                isinappmessagetestpusheagerdisplayenabled = isinappmessagetestpusheagerdisplayenabled2;
            }
            return true;
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z) throws IOException {
        if (RatingCompat() && z) {
            throw write(null);
        }
    }
}
