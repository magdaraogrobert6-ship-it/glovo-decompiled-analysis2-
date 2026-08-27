package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class PathHitTester extends CoroutineDispatcher {
    public static final /* synthetic */ AtomicIntegerFieldUpdater serializer = AtomicIntegerFieldUpdater.newUpdater(PathHitTester.class, "IconCompatParcelizer");
    public volatile /* synthetic */ int IconCompatParcelizer = 1;
    public final CoroutineDispatcher write;

    public final CoroutineDispatcher write() {
        return serializer.get(this) == 1 ? prepareForActivityTransitionCarryover.read : this.write;
    }

    public PathHitTester(CoroutineDispatcher coroutineDispatcher) {
        this.write = coroutineDispatcher;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        write().dispatch(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        write().dispatchYield(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return write().isDispatchNeeded(textAnnouncementContentCardView);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        return write().limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.write + ")";
    }
}
