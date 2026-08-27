package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zau;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o.accessgetNumPad6cp;
import o.accessgetNumPadCommacp;
import o.accessgetNumPadDirectionDowncp;
import o.accessgetNumPadDirectionLeftcp;
import o.accessgetNumPadSubtractcp;
import o.accessgetSystemNavigationDowncp;
import o.getE;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public abstract class BasePendingResult<R extends accessgetNumPadCommacp> extends accessgetNumPadDirectionDowncp {
    public static final getE IconCompatParcelizer = new getE(8);
    public Status MediaBrowserCompatMediaItem;
    public volatile boolean MediaMetadataCompat;
    public accessgetNumPadCommacp MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public final Object serializer = new Object();
    public final CountDownLatch read = new CountDownLatch(1);
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final AtomicReference MediaDescriptionCompat = new AtomicReference();
    public boolean PlaybackStateCompat = false;

    public abstract accessgetNumPadCommacp serializer(Status status);

    public final void IconCompatParcelizer(Status status) {
        synchronized (this.serializer) {
            if (!RemoteActionCompatParcelizer()) {
                write(serializer(status));
                this.RatingCompat = true;
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.read.getCount() == 0;
    }

    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final void write(accessgetNumPadCommacp accessgetnumpadcommacp) {
        synchronized (this.serializer) {
            if (this.RatingCompat) {
                return;
            }
            RemoteActionCompatParcelizer();
            accessgetSystemNavigationDowncp.serializer("Results have already been set", !RemoteActionCompatParcelizer());
            accessgetSystemNavigationDowncp.serializer("Result has already been consumed", !this.MediaMetadataCompat);
            this.MediaSessionCompatQueueItem = accessgetnumpadcommacp;
            this.MediaBrowserCompatMediaItem = accessgetnumpadcommacp.getStatus();
            this.read.countDown();
            ArrayList arrayList = this.RemoteActionCompatParcelizer;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((zau) arrayList.get(i)).serializer(this.MediaBrowserCompatMediaItem);
            }
            arrayList.clear();
        }
    }

    public final void write(zau zauVar) {
        synchronized (this.serializer) {
            if (RemoteActionCompatParcelizer()) {
                zauVar.serializer(this.MediaBrowserCompatMediaItem);
            } else {
                this.RemoteActionCompatParcelizer.add(zauVar);
            }
        }
    }

    public BasePendingResult(accessgetNumPad6cp accessgetnumpad6cp) {
        new accessgetNumPadDirectionLeftcp(accessgetnumpad6cp != null ? ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.PlaybackStateCompat : Looper.getMainLooper(), 0);
        new WeakReference(accessgetnumpad6cp);
    }

    public final void IconCompatParcelizer() {
        this.PlaybackStateCompat = this.PlaybackStateCompat || ((Boolean) IconCompatParcelizer.get()).booleanValue();
    }
}
