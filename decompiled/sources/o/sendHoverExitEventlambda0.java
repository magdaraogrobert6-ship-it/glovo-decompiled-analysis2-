package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class sendHoverExitEventlambda0 implements ViewTreeObserver.OnDrawListener {
    public final Handler IconCompatParcelizer = new Handler(Looper.getMainLooper());
    public final AppStartTrace$$ExternalSyntheticLambda0 read;
    public final AtomicReference write;

    public static void IconCompatParcelizer(View view, AppStartTrace$$ExternalSyntheticLambda0 appStartTrace$$ExternalSyntheticLambda0) {
        view.getViewTreeObserver().addOnDrawListener(new sendHoverExitEventlambda0(view, appStartTrace$$ExternalSyntheticLambda0));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.write.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.scheduleMeasureAndLayoutdefault
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnDrawListener(this.RemoteActionCompatParcelizer);
            }
        });
        this.IconCompatParcelizer.postAtFrontOfQueue(this.read);
    }

    public sendHoverExitEventlambda0(View view, AppStartTrace$$ExternalSyntheticLambda0 appStartTrace$$ExternalSyntheticLambda0) {
        this.write = new AtomicReference(view);
        this.read = appStartTrace$$ExternalSyntheticLambda0;
    }
}
