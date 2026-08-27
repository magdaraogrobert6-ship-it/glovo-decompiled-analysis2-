package o;

import android.view.animation.Interpolator;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class BrushCompanion {
    public int IconCompatParcelizer;
    public int MediaSessionCompatQueueItem;
    public Interpolator RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final void IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i = this.MediaSessionCompatQueueItem;
        if (i >= 0) {
            this.MediaSessionCompatQueueItem = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.RemoteActionCompatParcelizer = false;
            return;
        }
        if (!this.RemoteActionCompatParcelizer) {
            this.serializer = 0;
            return;
        }
        Interpolator interpolator = this.RatingCompat;
        if (interpolator != null && this.write < 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.write;
        if (i2 < 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Scroll duration must be a positive number");
            return;
        }
        recyclerView.onPreparePanel.write(this.read, this.IconCompatParcelizer, i2, interpolator);
        int i3 = this.serializer + 1;
        this.serializer = i3;
        if (i3 > 10) {
            SentryLogcatAdapter.serializer("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.RemoteActionCompatParcelizer = false;
    }
}
