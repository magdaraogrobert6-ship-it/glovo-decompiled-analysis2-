package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class sendSimulatedEvent implements ViewTreeObserver.OnPreDrawListener {
    public final AtomicReference IconCompatParcelizer;
    public final AppStartTrace$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public final Handler read = new Handler(Looper.getMainLooper());
    public final AppStartTrace$$ExternalSyntheticLambda0 serializer;

    public static void RemoteActionCompatParcelizer(View view, AppStartTrace$$ExternalSyntheticLambda0 appStartTrace$$ExternalSyntheticLambda0, AppStartTrace$$ExternalSyntheticLambda0 appStartTrace$$ExternalSyntheticLambda1) {
        view.getViewTreeObserver().addOnPreDrawListener(new sendSimulatedEvent(view, appStartTrace$$ExternalSyntheticLambda0, appStartTrace$$ExternalSyntheticLambda1));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.IconCompatParcelizer.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        AppStartTrace$$ExternalSyntheticLambda0 appStartTrace$$ExternalSyntheticLambda0 = this.serializer;
        Handler handler = this.read;
        handler.post(appStartTrace$$ExternalSyntheticLambda0);
        handler.postAtFrontOfQueue(this.RemoteActionCompatParcelizer);
        return true;
    }

    public sendSimulatedEvent(View view, AppStartTrace$$ExternalSyntheticLambda0 appStartTrace$$ExternalSyntheticLambda0, AppStartTrace$$ExternalSyntheticLambda0 appStartTrace$$ExternalSyntheticLambda1) {
        this.IconCompatParcelizer = new AtomicReference(view);
        this.serializer = appStartTrace$$ExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = appStartTrace$$ExternalSyntheticLambda1;
    }
}
