package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import bo.app.wg$$ExternalSyntheticLambda0;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import o.BroadcastFrameClock;
import o.getBundleFromUrl;
import o.withFrameNanos;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPrefetchScheduler implements withFrameNanos, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long read;
    public final View MediaMetadataCompat;
    public boolean RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public long write;
    public final PriorityQueue IconCompatParcelizer = new PriorityQueue(11, new wg$$ExternalSyntheticLambda0(3));
    public final Choreographer serializer = Choreographer.getInstance();
    public final getBundleFromUrl MediaBrowserCompatMediaItem = new getBundleFromUrl();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.RemoteActionCompatParcelizer = false;
        this.MediaMetadataCompat.removeCallbacks(this);
        this.serializer.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.IconCompatParcelizer;
        if (!priorityQueue.isEmpty() && this.RatingCompat && this.RemoteActionCompatParcelizer) {
            View view = this.MediaMetadataCompat;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (read * 2) + nanos;
                getBundleFromUrl getbundlefromurl = this.MediaBrowserCompatMediaItem;
                getbundlefromurl.serializer = z;
                getbundlefromurl.IconCompatParcelizer = Math.max(this.write, nanos) + read;
                boolean zWrite = false;
                while (!priorityQueue.isEmpty() && !zWrite) {
                    if (getbundlefromurl.serializer) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zWrite = write();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zWrite = write();
                    }
                }
                if (zWrite) {
                    this.serializer.postFrameCallback(this);
                } else {
                    this.RatingCompat = false;
                }
                AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.RatingCompat = false;
    }

    public final boolean write() {
        getBundleFromUrl getbundlefromurl = this.MediaBrowserCompatMediaItem;
        long jRemoteActionCompatParcelizer = getbundlefromurl.RemoteActionCompatParcelizer();
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", jRemoteActionCompatParcelizer);
        boolean z = true;
        if (jRemoteActionCompatParcelizer > 0) {
            PriorityQueue priorityQueue = this.IconCompatParcelizer;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((BroadcastFrameClock) objPeek).IconCompatParcelizer.execute(getbundlefromurl)) {
                priorityQueue.poll();
                z = false;
            }
            getbundlefromurl.serializer = false;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public AndroidPrefetchScheduler(View view) {
        float refreshRate;
        this.MediaMetadataCompat = view;
        if (read == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            read = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.RemoteActionCompatParcelizer = true;
        }
    }

    @Override // o.withFrameNanos
    public final void write(PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl) {
        this.IconCompatParcelizer.add(new BroadcastFrameClock(1, prefetchHandleProvider$HandleAndRequestImpl));
        if (this.RatingCompat) {
            return;
        }
        this.RatingCompat = true;
        this.MediaMetadataCompat.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.RemoteActionCompatParcelizer) {
            this.write = j;
            this.MediaMetadataCompat.post(this);
        }
    }
}
