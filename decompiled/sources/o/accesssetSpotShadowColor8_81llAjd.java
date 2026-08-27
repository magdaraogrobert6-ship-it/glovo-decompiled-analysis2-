package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class accesssetSpotShadowColor8_81llAjd {
    public boolean IconCompatParcelizer;
    public final androidx.work.WorkerParameters MediaBrowserCompatMediaItem;
    public final Context RemoteActionCompatParcelizer;
    public final AtomicInteger read = new AtomicInteger(-256);

    public abstract onDrawBehind IconCompatParcelizer();

    public abstract onDrawBehind write();

    public accesssetSpotShadowColor8_81llAjd(Context context, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("WorkerParameters is null");
            throw null;
        }
        this.RemoteActionCompatParcelizer = context;
        this.MediaBrowserCompatMediaItem = workerParameters;
    }
}
