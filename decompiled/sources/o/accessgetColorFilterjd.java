package o;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetColorFilterjd extends CoroutineDispatcher {
    public static final accessgetColorFilterjd IconCompatParcelizer = new accessgetColorFilterjd();
    public static final DefaultScheduler serializer = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        textAnnouncementContentCardView.getClass();
        runnable.getClass();
        serializer.dispatch(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        textAnnouncementContentCardView.getClass();
        return serializer.isDispatchNeeded(textAnnouncementContentCardView);
    }
}
