package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class onPreDraw extends ApiErrorResponseCompanion {
    public static final Condition IconCompatParcelizer;
    public static final CSSParseException MediaBrowserCompatMediaItem;
    public static final ReentrantLock RatingCompat;
    public static final long read;
    public static onPreDraw serializer;
    public static final long write;
    public int MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public int MediaSessionCompatQueueItem = -1;

    public void read() {
    }

    public final void IconCompatParcelizer() {
        long j = this.MediaSessionCompatToken;
        boolean z = this.ParcelableVolumeInfo;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = RatingCompat;
            reentrantLock.lock();
            try {
                if (this.MediaDescriptionCompat != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.MediaDescriptionCompat = 1;
                io.sentry.util.MediaBrowserCompatMediaItem.write(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean write() {
        ReentrantLock reentrantLock = RatingCompat;
        reentrantLock.lock();
        try {
            int i = this.MediaDescriptionCompat;
            this.MediaDescriptionCompat = 0;
            if (i != 1) {
                return i == 2;
            }
            MediaBrowserCompatMediaItem.read(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    static {
        char c = 0;
        CSSParseException cSSParseException = new CSSParseException(c, c);
        cSSParseException.RemoteActionCompatParcelizer = new onPreDraw[8];
        MediaBrowserCompatMediaItem = cSSParseException;
        ReentrantLock reentrantLock = new ReentrantLock();
        RatingCompat = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        IconCompatParcelizer = conditionNewCondition;
        write = 60000L;
        read = TimeUnit.MILLISECONDS.toNanos(60000L);
    }
}
