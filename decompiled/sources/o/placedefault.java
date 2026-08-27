package o;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class placedefault implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout IconCompatParcelizer;
    public final /* synthetic */ AppBarLayout.BaseBehavior serializer;
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout write;

    public placedefault(AppBarLayout.BaseBehavior baseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.serializer = baseBehavior;
        this.write = coordinatorLayout;
        this.IconCompatParcelizer = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.serializer.RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
