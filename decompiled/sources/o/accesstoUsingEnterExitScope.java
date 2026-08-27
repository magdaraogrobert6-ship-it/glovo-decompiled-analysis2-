package o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class accesstoUsingEnterExitScope implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final Runnable IconCompatParcelizer;
    public final View RemoteActionCompatParcelizer;
    public ViewTreeObserver read;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.read.isAlive();
        View view = this.RemoteActionCompatParcelizer;
        if (zIsAlive) {
            this.read.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.IconCompatParcelizer.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.read.isAlive();
        View view2 = this.RemoteActionCompatParcelizer;
        if (zIsAlive) {
            this.read.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }

    public accesstoUsingEnterExitScope(View view, Runnable runnable) {
        this.RemoteActionCompatParcelizer = view;
        this.read = view.getViewTreeObserver();
        this.IconCompatParcelizer = runnable;
    }

    public static void read(View view, Runnable runnable) {
        if (view != null) {
            accesstoUsingEnterExitScope accesstousingenterexitscope = new accesstoUsingEnterExitScope(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(accesstousingenterexitscope);
            view.addOnAttachStateChangeListener(accesstousingenterexitscope);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("view == null");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.read = view.getViewTreeObserver();
    }
}
