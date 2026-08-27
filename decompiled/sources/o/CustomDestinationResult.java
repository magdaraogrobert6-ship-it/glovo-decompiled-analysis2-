package o;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomDestinationResult implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout read;

    public CustomDestinationResult(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.read = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.read.RemoteActionCompatParcelizer(0);
        return true;
    }
}
