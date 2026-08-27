package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.oss.licenses.zzm;
import java.util.List;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class getNativeStrokeJoin extends AndroidGraphicsContext2 {
    public accessisRenderNodeCompatiblecp IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final zzm serializer;
    public getNativePaint write;

    @Override // o.accessunregisterComponentCallback
    public final void RemoteActionCompatParcelizer() {
        zzm zzmVar = this.serializer;
        zzmVar.MediaDescriptionCompat = true;
        zzmVar.MediaMetadataCompat = false;
        zzmVar.IconCompatParcelizer = false;
        if (zzmVar.read != 0) {
            ((Semaphore) zzmVar.MediaSessionCompatResultReceiverWrapper).drainPermits();
            zzmVar.IconCompatParcelizer();
            return;
        }
        List list = (List) zzmVar.MediaSessionCompatResultReceiverWrapper;
        if (list != null) {
            zzmVar.serializer(list);
        } else {
            zzmVar.IconCompatParcelizer();
        }
    }

    @Override // o.accessunregisterComponentCallback
    public final void read() {
        zzm zzmVar = this.serializer;
        zzmVar.MediaDescriptionCompat = false;
        if (zzmVar.read != 0) {
            return;
        }
        zzmVar.RemoteActionCompatParcelizer();
    }

    public final void serializer() {
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.IconCompatParcelizer;
        getNativePaint getnativepaint = this.write;
        if (accessisrendernodecompatiblecp == null || getnativepaint == null) {
            return;
        }
        super.RemoteActionCompatParcelizer((unregisterComponentCallback) getnativepaint);
        serializer(accessisrendernodecompatiblecp, getnativepaint);
    }

    public final void write() {
        zzm zzmVar = this.serializer;
        zzmVar.RemoteActionCompatParcelizer();
        zzmVar.IconCompatParcelizer = true;
        getNativePaint getnativepaint = this.write;
        if (getnativepaint != null) {
            RemoteActionCompatParcelizer((unregisterComponentCallback) getnativepaint);
            if (getnativepaint.RemoteActionCompatParcelizer) {
                getnativepaint.read.serializer();
            }
        }
        getNativeStrokeJoin getnativestrokejoin = zzmVar.MediaBrowserCompatMediaItem;
        if (getnativestrokejoin == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No listener register");
            return;
        }
        if (getnativestrokejoin != this) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attempting to unregister the wrong listener");
            return;
        }
        zzmVar.MediaBrowserCompatMediaItem = null;
        if (getnativepaint != null) {
            boolean z = getnativepaint.RemoteActionCompatParcelizer;
        }
        zzmVar.MediaMetadataCompat = true;
        zzmVar.MediaDescriptionCompat = false;
        zzmVar.IconCompatParcelizer = false;
        zzmVar.write = false;
    }

    public getNativeStrokeJoin(int i, zzm zzmVar) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = zzmVar;
        if (zzmVar.MediaBrowserCompatMediaItem != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("There is already a listener registered");
            throw null;
        }
        zzmVar.MediaBrowserCompatMediaItem = this;
        zzmVar.MediaSessionCompatQueueItem = i;
    }

    @Override // o.accessunregisterComponentCallback
    public final void RemoteActionCompatParcelizer(unregisterComponentCallback unregistercomponentcallback) {
        super.RemoteActionCompatParcelizer(unregistercomponentcallback);
        this.IconCompatParcelizer = null;
        this.write = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" : ");
        Class<?> cls = this.serializer.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
