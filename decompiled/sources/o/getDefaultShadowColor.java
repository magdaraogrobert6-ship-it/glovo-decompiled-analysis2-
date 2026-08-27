package o;

import android.content.Context;
import android.os.PowerManager;
import bo.app.w4$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class getDefaultShadowColor {
    public static final String write = setRotationX.IconCompatParcelizer("Processor");
    public final Context IconCompatParcelizer;
    public final androidx.work.impl.WorkDatabase MediaBrowserCompatMediaItem;
    public final accessgetStrokecp PlaybackStateCompat;
    public final graphicsLayerpANQ8Wgdefault RemoteActionCompatParcelizer;
    public final HashMap read = new HashMap();
    public final HashMap RatingCompat = new HashMap();
    public final HashSet serializer = new HashSet();
    public final ArrayList MediaDescriptionCompat = new ArrayList();
    public PowerManager.WakeLock MediaSessionCompatQueueItem = null;
    public final Object MediaMetadataCompat = new Object();
    public final HashMap MediaSessionCompatResultReceiverWrapper = new HashMap();

    public static boolean IconCompatParcelizer(androidx.work.impl.WorkerWrapper workerWrapper, int i) {
        if (workerWrapper == null) {
            setRotationX.read().getClass();
            return false;
        }
        workerWrapper.PlaybackStateCompat.RemoteActionCompatParcelizer((CancellationException) new androidx.work.impl.WorkerStoppedException(i));
        setRotationX.read().getClass();
        return true;
    }

    public final void RemoteActionCompatParcelizer(rememberGraphicsLayer remembergraphicslayer) {
        synchronized (this.MediaMetadataCompat) {
            this.MediaDescriptionCompat.add(remembergraphicslayer);
        }
    }

    public final androidx.work.impl.WorkerWrapper read(String str) {
        androidx.work.impl.WorkerWrapper workerWrapper = (androidx.work.impl.WorkerWrapper) this.RatingCompat.remove(str);
        boolean z = workerWrapper != null;
        if (!z) {
            workerWrapper = (androidx.work.impl.WorkerWrapper) this.read.remove(str);
        }
        this.MediaSessionCompatResultReceiverWrapper.remove(str);
        if (z) {
            synchronized (this.MediaMetadataCompat) {
                if (this.RatingCompat.isEmpty()) {
                    try {
                        this.IconCompatParcelizer.startService(IntervalTreeKt.serializer(this.IconCompatParcelizer));
                    } catch (Throwable th) {
                        setRotationX.read().IconCompatParcelizer(write, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.MediaSessionCompatQueueItem;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.MediaSessionCompatQueueItem = null;
                    }
                }
            }
        }
        return workerWrapper;
    }

    public final androidx.work.impl.WorkerWrapper write(String str) {
        androidx.work.impl.WorkerWrapper workerWrapper = (androidx.work.impl.WorkerWrapper) this.RatingCompat.get(str);
        return workerWrapper == null ? (androidx.work.impl.WorkerWrapper) this.read.get(str) : workerWrapper;
    }

    public final void write(mapMKHz9U mapmkhz9u) {
        this.PlaybackStateCompat.write.execute(new w4$$ExternalSyntheticLambda0(this, 6, mapmkhz9u));
    }

    public getDefaultShadowColor(Context context, graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault, accessgetStrokecp accessgetstrokecp, androidx.work.impl.WorkDatabase workDatabase) {
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = graphicslayerpanq8wgdefault;
        this.PlaybackStateCompat = accessgetstrokecp;
        this.MediaBrowserCompatMediaItem = workDatabase;
    }
}
