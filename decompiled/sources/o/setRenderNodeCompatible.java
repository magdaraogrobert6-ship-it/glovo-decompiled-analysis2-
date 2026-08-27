package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
public final class setRenderNodeCompatible extends CoroutineDispatcher {
    public final actualColorMatrixColorFilterjHGOpc RemoteActionCompatParcelizer = new actualColorMatrixColorFilterjHGOpc();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        textAnnouncementContentCardView.getClass();
        runnable.getClass();
        actualColorMatrixColorFilterjHGOpc actualcolormatrixcolorfilterjhgopc = this.RemoteActionCompatParcelizer;
        actualcolormatrixcolorfilterjhgopc.getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer = MainDispatcherLoader.read.IconCompatParcelizer();
        if (mainCoroutineDispatcherIconCompatParcelizer.isDispatchNeeded(textAnnouncementContentCardView) || actualcolormatrixcolorfilterjhgopc.IconCompatParcelizer || !actualcolormatrixcolorfilterjhgopc.read) {
            mainCoroutineDispatcherIconCompatParcelizer.dispatch(textAnnouncementContentCardView, new ND$$ExternalSyntheticLambda0(actualcolormatrixcolorfilterjhgopc, 3, runnable));
        } else if (actualcolormatrixcolorfilterjhgopc.serializer.offer(runnable)) {
            actualcolormatrixcolorfilterjhgopc.IconCompatParcelizer();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("cannot enqueue any more runnables");
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        textAnnouncementContentCardView.getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        if (MainDispatcherLoader.read.IconCompatParcelizer().isDispatchNeeded(textAnnouncementContentCardView)) {
            return true;
        }
        actualColorMatrixColorFilterjHGOpc actualcolormatrixcolorfilterjhgopc = this.RemoteActionCompatParcelizer;
        return !(actualcolormatrixcolorfilterjhgopc.IconCompatParcelizer || !actualcolormatrixcolorfilterjhgopc.read);
    }
}
