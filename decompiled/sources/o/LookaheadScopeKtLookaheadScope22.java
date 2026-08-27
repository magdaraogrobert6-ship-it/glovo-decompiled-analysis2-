package o;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScopeKtLookaheadScope22 extends Thread {
    public final Object IconCompatParcelizer;
    public final BlockingQueue RemoteActionCompatParcelizer;
    public final /* synthetic */ LookaheadScopeKtLookaheadScope4 read;
    public boolean write = false;

    public LookaheadScopeKtLookaheadScope22(LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4, String str, BlockingQueue blockingQueue) {
        this.read = lookaheadScopeKtLookaheadScope4;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(blockingQueue);
        this.IconCompatParcelizer = new Object();
        this.RemoteActionCompatParcelizer = blockingQueue;
        setName(str);
    }

    public final void IconCompatParcelizer() {
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.read;
        synchronized (lookaheadScopeKtLookaheadScope4.MediaDescriptionCompat) {
            if (!this.write) {
                lookaheadScopeKtLookaheadScope4.MediaSessionCompatQueueItem.release();
                lookaheadScopeKtLookaheadScope4.MediaDescriptionCompat.notifyAll();
                if (this == lookaheadScopeKtLookaheadScope4.IconCompatParcelizer) {
                    lookaheadScopeKtLookaheadScope4.IconCompatParcelizer = null;
                } else if (this == lookaheadScopeKtLookaheadScope4.write) {
                    lookaheadScopeKtLookaheadScope4.write = null;
                } else {
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKtLookaheadScope4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Current scheduler thread is neither worker nor network");
                }
                this.write = true;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.read.MediaSessionCompatQueueItem.acquire();
                z = true;
            } catch (InterruptedException e) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.RemoteActionCompatParcelizer;
                accessgetDefaultPlacementApproachInProgressp accessgetdefaultplacementapproachinprogressp = (accessgetDefaultPlacementApproachInProgressp) blockingQueue.poll();
                if (accessgetdefaultplacementapproachinprogressp != null) {
                    Process.setThreadPriority(true != accessgetdefaultplacementapproachinprogressp.serializer ? 10 : threadPriority);
                    accessgetdefaultplacementapproachinprogressp.run();
                } else {
                    Object obj = this.IconCompatParcelizer;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.read.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.MediaSessionCompatQueueItem.serializer(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.read.MediaDescriptionCompat) {
                        if (this.RemoteActionCompatParcelizer.peek() == null) {
                            IconCompatParcelizer();
                            IconCompatParcelizer();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            IconCompatParcelizer();
            throw th;
        }
    }
}
