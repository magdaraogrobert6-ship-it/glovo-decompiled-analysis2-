package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class replacePrefetchedUrlsWithLocalAssets implements Runnable {
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(replacePrefetchedUrlsWithLocalAssets.class.getName());
    public final Runnable read;

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.read;
        try {
            runnable.run();
        } catch (Throwable th) {
            write.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            requireView.read(th);
            ScreenStartObserver$$ExternalSyntheticLambda0.write(th);
        }
    }

    public replacePrefetchedUrlsWithLocalAssets(Runnable runnable) {
        this.read = runnable;
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.read + ")";
    }
}
