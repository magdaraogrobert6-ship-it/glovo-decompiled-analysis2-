package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzgs;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScopeKtLookaheadScope4 extends Measurable {
    public static final AtomicLong read = new AtomicLong(Long.MIN_VALUE);
    public LookaheadScopeKtLookaheadScope22 IconCompatParcelizer;
    public final approachLayoutdefault MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public final approachLayoutdefault MediaMetadataCompat;
    public final Semaphore MediaSessionCompatQueueItem;
    public final LinkedBlockingQueue RemoteActionCompatParcelizer;
    public final PriorityBlockingQueue serializer;
    public LookaheadScopeKtLookaheadScope22 write;

    @Override // o.Measurable
    public final boolean read() {
        return false;
    }

    public final void serializer(accessgetDefaultPlacementApproachInProgressp accessgetdefaultplacementapproachinprogressp) {
        synchronized (this.MediaDescriptionCompat) {
            PriorityBlockingQueue priorityBlockingQueue = this.serializer;
            priorityBlockingQueue.add(accessgetdefaultplacementapproachinprogressp);
            LookaheadScopeKtLookaheadScope22 lookaheadScopeKtLookaheadScope22 = this.IconCompatParcelizer;
            if (lookaheadScopeKtLookaheadScope22 == null) {
                LookaheadScopeKtLookaheadScope22 lookaheadScopeKtLookaheadScope23 = new LookaheadScopeKtLookaheadScope22(this, "Measurement Worker", priorityBlockingQueue);
                this.IconCompatParcelizer = lookaheadScopeKtLookaheadScope23;
                lookaheadScopeKtLookaheadScope23.setUncaughtExceptionHandler(this.MediaBrowserCompatMediaItem);
                this.IconCompatParcelizer.start();
            } else {
                Object obj = lookaheadScopeKtLookaheadScope22.IconCompatParcelizer;
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
        }
    }

    public final Object write(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgs zzgsVar = getlookaheaddelegate.MediaSessionCompatQueueItem;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                zzgsVar.RemoteActionCompatParcelizer(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void write(Runnable runnable) {
        ComponentActivity();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(runnable);
        serializer(new accessgetDefaultPlacementApproachInProgressp(this, runnable, false, "Task exception on worker thread"));
    }

    public final boolean MediaMetadataCompat() {
        return Thread.currentThread() == this.IconCompatParcelizer;
    }

    public final void MediaSessionCompatQueueItem() {
        if (Thread.currentThread() != this.IconCompatParcelizer) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Call not expected from worker thread");
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void MediaSessionCompatToken() {
        if (Thread.currentThread() == this.IconCompatParcelizer) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Call expected from worker thread");
    }

    public final void serializer() {
        if (Thread.currentThread() == this.write) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Call expected from network thread");
    }

    public LookaheadScopeKtLookaheadScope4(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.MediaDescriptionCompat = new Object();
        this.MediaSessionCompatQueueItem = new Semaphore(2);
        this.serializer = new PriorityBlockingQueue();
        this.RemoteActionCompatParcelizer = new LinkedBlockingQueue();
        this.MediaBrowserCompatMediaItem = new approachLayoutdefault(this, "Thread death: Uncaught exception on worker thread");
        this.MediaMetadataCompat = new approachLayoutdefault(this, "Thread death: Uncaught exception on network thread");
    }

    public final accessgetDefaultPlacementApproachInProgressp read(Callable callable) {
        ComponentActivity();
        accessgetDefaultPlacementApproachInProgressp accessgetdefaultplacementapproachinprogressp = new accessgetDefaultPlacementApproachInProgressp(this, callable, false);
        if (Thread.currentThread() != this.IconCompatParcelizer) {
            serializer(accessgetdefaultplacementapproachinprogressp);
            return accessgetdefaultplacementapproachinprogressp;
        }
        if (!this.serializer.isEmpty()) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Callable skipped the worker queue.");
        }
        accessgetdefaultplacementapproachinprogressp.run();
        return accessgetdefaultplacementapproachinprogressp;
    }

    public final accessgetDefaultPlacementApproachInProgressp serializer(Callable callable) {
        ComponentActivity();
        accessgetDefaultPlacementApproachInProgressp accessgetdefaultplacementapproachinprogressp = new accessgetDefaultPlacementApproachInProgressp(this, callable, true);
        if (Thread.currentThread() == this.IconCompatParcelizer) {
            accessgetdefaultplacementapproachinprogressp.run();
            return accessgetdefaultplacementapproachinprogressp;
        }
        serializer(accessgetdefaultplacementapproachinprogressp);
        return accessgetdefaultplacementapproachinprogressp;
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        ComponentActivity();
        serializer(new accessgetDefaultPlacementApproachInProgressp(this, runnable, true, "Task exception on worker thread"));
    }

    public final void serializer(Runnable runnable) {
        ComponentActivity();
        accessgetDefaultPlacementApproachInProgressp accessgetdefaultplacementapproachinprogressp = new accessgetDefaultPlacementApproachInProgressp(this, runnable, false, "Task exception on network thread");
        synchronized (this.MediaDescriptionCompat) {
            LinkedBlockingQueue linkedBlockingQueue = this.RemoteActionCompatParcelizer;
            linkedBlockingQueue.add(accessgetdefaultplacementapproachinprogressp);
            LookaheadScopeKtLookaheadScope22 lookaheadScopeKtLookaheadScope22 = this.write;
            if (lookaheadScopeKtLookaheadScope22 == null) {
                LookaheadScopeKtLookaheadScope22 lookaheadScopeKtLookaheadScope23 = new LookaheadScopeKtLookaheadScope22(this, "Measurement Network", linkedBlockingQueue);
                this.write = lookaheadScopeKtLookaheadScope23;
                lookaheadScopeKtLookaheadScope23.setUncaughtExceptionHandler(this.MediaMetadataCompat);
                this.write.start();
            } else {
                Object obj = lookaheadScopeKtLookaheadScope22.IconCompatParcelizer;
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
        }
    }
}
