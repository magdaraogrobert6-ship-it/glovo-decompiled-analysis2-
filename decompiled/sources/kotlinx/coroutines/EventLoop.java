package kotlinx.coroutines;

import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.NamedDispatcher;
import o.BrazeContentCardsManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EventLoop extends CoroutineDispatcher {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public long MediaBrowserCompatMediaItem;
    public BrazeContentCardsManager MediaSessionCompatQueueItem;
    public boolean serializer;

    public abstract long read();

    public abstract void write();

    public final boolean IconCompatParcelizer() {
        DispatchedTask dispatchedTask;
        BrazeContentCardsManager brazeContentCardsManager = this.MediaSessionCompatQueueItem;
        if (brazeContentCardsManager == null || (dispatchedTask = (DispatchedTask) brazeContentCardsManager.RatingCompat()) == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    public final void write(DispatchedTask dispatchedTask) {
        BrazeContentCardsManager brazeContentCardsManager = this.MediaSessionCompatQueueItem;
        if (brazeContentCardsManager == null) {
            brazeContentCardsManager = new BrazeContentCardsManager();
            this.MediaSessionCompatQueueItem = brazeContentCardsManager;
        }
        brazeContentCardsManager.addLast(dispatchedTask);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.RemoteActionCompatParcelizer(i);
        return str != null ? new NamedDispatcher(this, str) : this;
    }

    public final void read(boolean z) {
        long j = this.MediaBrowserCompatMediaItem - (z ? 4294967296L : 1L);
        this.MediaBrowserCompatMediaItem = j;
        if (j <= 0 && this.serializer) {
            write();
        }
    }

    public final void serializer(boolean z) {
        this.MediaBrowserCompatMediaItem = (z ? 4294967296L : 1L) + this.MediaBrowserCompatMediaItem;
        if (z) {
            return;
        }
        this.serializer = true;
    }
}
