package o;

import com.google.android.gms.tasks.zzc;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadDelegate implements Executor {
    public static final java.util.logging.Logger serializer = java.util.logging.Logger.getLogger(LookaheadDelegate.class.getName());
    public final Executor IconCompatParcelizer;
    public final ArrayDeque RemoteActionCompatParcelizer = new ArrayDeque();
    public LookaheadCapablePlaceablecaptureRulers1 MediaSessionCompatQueueItem = LookaheadCapablePlaceablecaptureRulers1.IDLE;
    public long read = 0;
    public final zzc write = new zzc(this);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        LookaheadCapablePlaceablecaptureRulers1 lookaheadCapablePlaceablecaptureRulers1;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(runnable);
        synchronized (this.RemoteActionCompatParcelizer) {
            LookaheadCapablePlaceablecaptureRulers1 lookaheadCapablePlaceablecaptureRulers2 = this.MediaSessionCompatQueueItem;
            if (lookaheadCapablePlaceablecaptureRulers2 != LookaheadCapablePlaceablecaptureRulers1.RUNNING && lookaheadCapablePlaceablecaptureRulers2 != (lookaheadCapablePlaceablecaptureRulers1 = LookaheadCapablePlaceablecaptureRulers1.QUEUED)) {
                long j = this.read;
                accessgetTvRadioServicecp accessgettvradioservicecp = new accessgetTvRadioServicecp(runnable, 3);
                this.RemoteActionCompatParcelizer.add(accessgettvradioservicecp);
                LookaheadCapablePlaceablecaptureRulers1 lookaheadCapablePlaceablecaptureRulers3 = LookaheadCapablePlaceablecaptureRulers1.QUEUING;
                this.MediaSessionCompatQueueItem = lookaheadCapablePlaceablecaptureRulers3;
                try {
                    this.IconCompatParcelizer.execute(this.write);
                    if (this.MediaSessionCompatQueueItem != lookaheadCapablePlaceablecaptureRulers3) {
                        return;
                    }
                    synchronized (this.RemoteActionCompatParcelizer) {
                        if (this.read == j && this.MediaSessionCompatQueueItem == lookaheadCapablePlaceablecaptureRulers3) {
                            this.MediaSessionCompatQueueItem = lookaheadCapablePlaceablecaptureRulers1;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.RemoteActionCompatParcelizer) {
                        LookaheadCapablePlaceablecaptureRulers1 lookaheadCapablePlaceablecaptureRulers4 = this.MediaSessionCompatQueueItem;
                        boolean z = (lookaheadCapablePlaceablecaptureRulers4 == LookaheadCapablePlaceablecaptureRulers1.IDLE || lookaheadCapablePlaceablecaptureRulers4 == LookaheadCapablePlaceablecaptureRulers1.QUEUING) && this.RemoteActionCompatParcelizer.removeLastOccurrence(accessgettvradioservicecp);
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.RemoteActionCompatParcelizer.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.IconCompatParcelizer + "}";
    }

    public LookaheadDelegate(Executor executor) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(executor);
        this.IconCompatParcelizer = executor;
    }
}
