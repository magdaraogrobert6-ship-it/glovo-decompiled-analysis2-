package o;

import bo.app.w4$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.scheduling.UnlimitedIoScheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class invalidateRootLayer {
    public static final Executor write;
    public getWindowInfo IconCompatParcelizer = new getTextToolbar();

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        getWindowInfo getwindowinfo = this.IconCompatParcelizer;
        if (!(getwindowinfo instanceof getTextToolbar)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("submit() may not be called after drain()");
            return;
        }
        ((getTextToolbar) getwindowinfo).RemoteActionCompatParcelizer++;
        write.execute(new w4$$ExternalSyntheticLambda0(runnable, 22, getwindowinfo));
    }

    public final void write() {
        getWindowInfo getwindowinfo = this.IconCompatParcelizer;
        if (!(getwindowinfo instanceof getTextToolbar)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("drain() may not be called more than once");
            return;
        }
        this.IconCompatParcelizer = incrementKeepScreenOnCount.RemoteActionCompatParcelizer;
        getTextToolbar gettexttoolbar = (getTextToolbar) getwindowinfo;
        gettexttoolbar.IconCompatParcelizer.acquire(gettexttoolbar.RemoteActionCompatParcelizer);
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors < 2) {
            iAvailableProcessors = 2;
        }
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler.RemoteActionCompatParcelizer.getClass();
        write = coil3.util.IntPair.write(UnlimitedIoScheduler.IconCompatParcelizer.limitedParallelism(iAvailableProcessors, "firestore.BackgroundQueue"));
    }
}
