package o;

import android.os.SystemClock;
import android.util.Log;
import com.deliveryhero.fwf_http.ConstantKt;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class didUpdate {
    public final setLayoutState IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final ThreadPoolExecutor MediaMetadataCompat;
    public final double MediaSessionCompatQueueItem;
    public final accessgetF3cp MediaSessionCompatToken;
    public int RatingCompat;
    public final ArrayBlockingQueue RemoteActionCompatParcelizer;
    public final double read;
    public long serializer;
    public final int write;

    public didUpdate(accessgetF3cp accessgetf3cp, getAdapters getadapters, setLayoutState setlayoutstate) {
        double d = getadapters.serializer;
        double d2 = getadapters.IconCompatParcelizer;
        long j = getadapters.RemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = d;
        this.read = d2;
        this.MediaDescriptionCompat = j * 1000;
        this.MediaSessionCompatToken = accessgetf3cp;
        this.IconCompatParcelizer = setlayoutstate;
        this.MediaBrowserCompatMediaItem = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.write = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.RemoteActionCompatParcelizer = arrayBlockingQueue;
        this.MediaMetadataCompat = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.RatingCompat = 0;
        this.serializer = 0L;
    }

    public final void serializer(final LookaheadDelegateKt lookaheadDelegateKt, final ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        Log.isLoggable("FirebaseCrashlytics", 3);
        final boolean z = SystemClock.elapsedRealtime() - this.MediaBrowserCompatMediaItem < ConstantKt.DEFAULT_REQUEST_TIMEOUT;
        this.MediaSessionCompatToken.read(new accessgetBackspacecp(lookaheadDelegateKt.write, accessgetBrowsercp.HIGHEST, null), new accessgetButton12cp() { // from class: o.willInsert
            @Override // o.accessgetButton12cp
            public final void write(Exception exc) throws Throwable {
                ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2 = parentDataModifierDefaultImpls;
                if (exc != null) {
                    parentDataModifierDefaultImpls2.IconCompatParcelizer(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new ND$$ExternalSyntheticLambda0(this.IconCompatParcelizer, 18, countDownLatch)).start();
                    ExecutorService executorService = setLayoutPending.write;
                    boolean z3 = false;
                    try {
                        long jNanoTime = System.nanoTime();
                        long jNanoTime2 = 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(jNanoTime2, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                jNanoTime2 = (jNanoTime + 2000000000) - System.nanoTime();
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                parentDataModifierDefaultImpls2.write(lookaheadDelegateKt);
            }
        });
    }

    public final int RemoteActionCompatParcelizer() {
        if (this.serializer == 0) {
            this.serializer = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.serializer) / this.MediaDescriptionCompat);
        int size = this.RemoteActionCompatParcelizer.size();
        int i = this.RatingCompat;
        int iMin = size == this.write ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.RatingCompat != iMin) {
            this.RatingCompat = iMin;
            this.serializer = System.currentTimeMillis();
        }
        return iMin;
    }
}
