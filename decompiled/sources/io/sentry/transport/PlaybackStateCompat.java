package io.sentry.transport;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import io.sentry.SentryOptions;
import io.socket.client.Manager$7;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.UriActionExternalSyntheticLambda4;
import o.openUriWithActionViewFromPush;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompat implements Closeable {
    public final /* synthetic */ int IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public PlaybackStateCompat(SentryOptions sentryOptions) {
        this.IconCompatParcelizer = 0;
        this.write = new ConcurrentHashMap();
        this.serializer = new CopyOnWriteArrayList();
        this.MediaBrowserCompatMediaItem = null;
        this.RatingCompat = new io.sentry.util.RemoteActionCompatParcelizer();
        this.read = IconCompatParcelizer.write;
        this.RemoteActionCompatParcelizer = sentryOptions;
    }

    public void read(openUriWithActionViewFromPush openuriwithactionviewfrompush, Date date) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.write;
        Date date2 = (Date) concurrentHashMap.get(openuriwithactionviewfrompush);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(openuriwithactionviewfrompush, date);
            Iterator it = ((CopyOnWriteArrayList) this.serializer).iterator();
            while (it.hasNext()) {
                ((r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) it.next()).serializer(this);
            }
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((io.sentry.util.RemoteActionCompatParcelizer) this.RatingCompat).serializer();
            try {
                if (((Timer) this.MediaBrowserCompatMediaItem) == null) {
                    this.MediaBrowserCompatMediaItem = new Timer(true);
                }
                ((Timer) this.MediaBrowserCompatMediaItem).schedule(new Manager$7(4, this), date);
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
    }

    public boolean serializer(openUriWithActionViewFromPush openuriwithactionviewfrompush) {
        Date date;
        ((IconCompatParcelizer) this.read).getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.write;
        Date date3 = (Date) concurrentHashMap.get(openUriWithActionViewFromPush.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (openUriWithActionViewFromPush.Unknown.equals(openuriwithactionviewfrompush) || (date = (Date) concurrentHashMap.get(openuriwithactionviewfrompush)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.IconCompatParcelizer != 0) {
            ((SQLiteEventStore) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) this.MediaBrowserCompatMediaItem).write()).close();
            return;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((io.sentry.util.RemoteActionCompatParcelizer) this.RatingCompat).serializer();
        try {
            Timer timer = (Timer) this.MediaBrowserCompatMediaItem;
            if (timer != null) {
                timer.cancel();
                this.MediaBrowserCompatMediaItem = null;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            ((CopyOnWriteArrayList) this.serializer).clear();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ PlaybackStateCompat() {
        this.IconCompatParcelizer = 1;
    }
}
