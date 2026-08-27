package o;

import android.os.Looper;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import io.sentry.android.core.performance.AppStartMetrics;

/* JADX INFO: loaded from: classes4.dex */
public final class setViewBackgroundColorFilter implements Runnable {
    public final /* synthetic */ ConstraintSetForInlineDsl$applyTo$1 read;
    public final /* synthetic */ int write;

    public /* synthetic */ setViewBackgroundColorFilter(ConstraintSetForInlineDsl$applyTo$1 constraintSetForInlineDsl$applyTo$1, int i) {
        this.write = i;
        this.read = constraintSetForInlineDsl$applyTo$1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.write != 0) {
            ((cancelPendingWebViewPause) this.read.RemoteActionCompatParcelizer).IconCompatParcelizer = true;
        } else {
            Looper.myQueue().addIdleHandler(new AppStartMetrics.AnonymousClass2(2, this));
        }
    }
}
