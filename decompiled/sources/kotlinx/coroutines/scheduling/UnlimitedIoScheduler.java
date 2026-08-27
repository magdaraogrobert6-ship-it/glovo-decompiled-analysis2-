package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.NamedDispatcher;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class UnlimitedIoScheduler extends CoroutineDispatcher {
    public static final UnlimitedIoScheduler IconCompatParcelizer = new UnlimitedIoScheduler();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        DefaultScheduler.serializer.IconCompatParcelizer.read(runnable, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        DefaultScheduler.serializer.IconCompatParcelizer.read(runnable, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.RemoteActionCompatParcelizer(i);
        if (i >= TasksKt.serializer) {
            return str != null ? new NamedDispatcher(this, str) : this;
        }
        return super.limitedParallelism(i, str);
    }
}
