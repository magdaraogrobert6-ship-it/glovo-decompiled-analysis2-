package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {
    public final r8lambdaU31FnmCtqQics3i75Jr9dkZcEk serializer;

    public final void IconCompatParcelizer(Activity activity) {
        r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = this.serializer;
        r8lambdau31fnmctqqics3i75jr9dkzcek.getClass();
        if (r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.RemoteActionCompatParcelizer == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.RemoteActionCompatParcelizer = handlerThread;
            handlerThread.start();
            r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer = new Handler(r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.RemoteActionCompatParcelizer.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat;
            if (sparseIntArrayArr[i] == null && (r8lambdau31fnmctqqics3i75jr9dkzcek.MediaBrowserCompatMediaItem & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((FrameMetricsAggregator$FrameMetricsApi24Impl$1) r8lambdau31fnmctqqics3i75jr9dkzcek.write, r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.serializer);
        ((ArrayList) r8lambdau31fnmctqqics3i75jr9dkzcek.read).add(new WeakReference(activity));
    }

    public final void RemoteActionCompatParcelizer(Activity activity) {
        r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = this.serializer;
        ArrayList<WeakReference> arrayList = (ArrayList) r8lambdau31fnmctqqics3i75jr9dkzcek.read;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((FrameMetricsAggregator$FrameMetricsApi24Impl$1) r8lambdau31fnmctqqics3i75jr9dkzcek.write);
    }

    public FrameMetricsAggregator(int i) {
        this.serializer = new r8lambdaU31FnmCtqQics3i75Jr9dkZcEk(i);
    }

    public FrameMetricsAggregator() {
        this(1);
    }
}
