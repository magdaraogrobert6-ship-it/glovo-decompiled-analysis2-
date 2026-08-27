package o;

import android.os.Handler;
import com.google.android.gms.tasks.zzc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LayoutNodeSubcompositionsStatecreateMeasureResult1 {
    public static volatile getBackEK5gGoQ read;
    public volatile long IconCompatParcelizer;
    public final zzc RemoteActionCompatParcelizer;
    public final layoutdefault serializer;

    public abstract void serializer();

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer = 0L;
        RemoteActionCompatParcelizer().removeCallbacks(this.RemoteActionCompatParcelizer);
    }

    public LayoutNodeSubcompositionsStatecreateMeasureResult1(layoutdefault layoutdefaultVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(layoutdefaultVar);
        this.serializer = layoutdefaultVar;
        this.RemoteActionCompatParcelizer = new zzc(this, layoutdefaultVar, false, 11);
    }

    public final Handler RemoteActionCompatParcelizer() {
        getBackEK5gGoQ getbackek5ggoq;
        if (read != null) {
            return read;
        }
        synchronized (LayoutNodeSubcompositionsStatecreateMeasureResult1.class) {
            if (read == null) {
                read = new getBackEK5gGoQ(this.serializer.PlaybackStateCompatCustomAction().getMainLooper(), 3);
            }
            getbackek5ggoq = read;
        }
        return getbackek5ggoq;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        IconCompatParcelizer();
        if (j >= 0) {
            layoutdefault layoutdefaultVar = this.serializer;
            this.IconCompatParcelizer = layoutdefaultVar.ParcelableVolumeInfo().serializer();
            if (RemoteActionCompatParcelizer().postDelayed(this.RemoteActionCompatParcelizer, j)) {
                return;
            }
            layoutdefaultVar.RatingCompat().serializer.serializer(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }
}
