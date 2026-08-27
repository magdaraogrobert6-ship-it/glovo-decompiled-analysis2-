package o;

import android.os.Handler;
import android.os.Looper;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.net.zza;
import com.google.android.gms.oss.licenses.zzm;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class getNativeFilterQuality implements Runnable {
    public static Handler IconCompatParcelizer;
    public final /* synthetic */ zzm MediaSessionCompatQueueItem;
    public volatile getNativeStrokeWidth RemoteActionCompatParcelizer = getNativeStrokeWidth.PENDING;
    public final AtomicBoolean serializer = new AtomicBoolean();
    public final AtomicBoolean write = new AtomicBoolean();
    public final getNativeStyle read = new getNativeStyle(this, new ModernAsyncTask$1(0, this));

    public final void IconCompatParcelizer(Object obj) {
        Handler handler;
        synchronized (getNativeFilterQuality.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new Handler(Looper.getMainLooper());
            }
            handler = IconCompatParcelizer;
        }
        handler.post(new zza(this, obj, false, 6));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.MediaSessionCompatQueueItem.write();
    }

    public getNativeFilterQuality(zzm zzmVar) {
        this.MediaSessionCompatQueueItem = zzmVar;
    }
}
