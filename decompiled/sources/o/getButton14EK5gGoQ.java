package o;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.sentry.MovePreviousSession;

/* JADX INFO: loaded from: classes2.dex */
public final class getButton14EK5gGoQ {
    public static getButton14EK5gGoQ RemoteActionCompatParcelizer;
    public static final Object read = new Object();
    public volatile AdvertisingIdClient.Info IconCompatParcelizer;
    public final Context MediaBrowserCompatMediaItem;
    public volatile long MediaDescriptionCompat;
    public final Thread RatingCompat;
    public volatile long serializer;
    public volatile boolean write = true;
    public final Object MediaMetadataCompat = new Object();
    public final getMediaEjectEK5gGoQ MediaSessionCompatQueueItem = new getMediaEjectEK5gGoQ(this);

    public getButton14EK5gGoQ(Context context) {
        if (context != null) {
            this.MediaBrowserCompatMediaItem = context.getApplicationContext();
        } else {
            this.MediaBrowserCompatMediaItem = null;
        }
        this.serializer = System.currentTimeMillis();
        this.RatingCompat = new Thread(new MovePreviousSession(8, this));
    }

    public static getButton14EK5gGoQ serializer(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (read) {
                if (RemoteActionCompatParcelizer == null) {
                    getButton14EK5gGoQ getbutton14ek5ggoq = new getButton14EK5gGoQ(context);
                    RemoteActionCompatParcelizer = getbutton14ek5ggoq;
                    getbutton14ek5ggoq.RatingCompat.start();
                }
            }
        }
        return RemoteActionCompatParcelizer;
    }

    public final void serializer() {
        if (System.currentTimeMillis() - this.serializer > 30000) {
            Object obj = this.MediaMetadataCompat;
            synchronized (obj) {
                obj.notify();
            }
            this.serializer = System.currentTimeMillis();
        }
    }
}
