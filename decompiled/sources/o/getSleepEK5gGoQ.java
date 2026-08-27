package o;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getSleepEK5gGoQ implements Runnable {
    public final boolean MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final /* synthetic */ getSoftRightEK5gGoQ MediaSessionCompatResultReceiverWrapper;

    public void IconCompatParcelizer() {
    }

    public abstract void zza();

    @Override // java.lang.Runnable
    public final void run() {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.MediaSessionCompatResultReceiverWrapper;
        if (getsoftrightek5ggoq.MediaBrowserCompatMediaItem) {
            IconCompatParcelizer();
            return;
        }
        try {
            zza();
        } catch (Exception e) {
            getsoftrightek5ggoq.RemoteActionCompatParcelizer(e, false, this.MediaDescriptionCompat);
            IconCompatParcelizer();
        }
    }

    public getSleepEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, boolean z) {
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.MediaSessionCompatResultReceiverWrapper = getsoftrightek5ggoq;
        this.MediaSessionCompatQueueItem = System.currentTimeMillis();
        this.MediaMetadataCompat = SystemClock.elapsedRealtime();
        this.MediaDescriptionCompat = z;
    }
}
