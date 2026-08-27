package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getZeroannotations extends drawRawPoints {
    public final Rect0a9Yr6o IconCompatParcelizer;

    public getZeroannotations(Rect0a9Yr6o rect0a9Yr6o) {
        this.IconCompatParcelizer = rect0a9Yr6o;
    }

    @Override // o.drawRawPoints
    public final void IconCompatParcelizer(ViewGroup viewGroup) {
        viewGroup.getClass();
        getInternalCanvasannotations getinternalcanvasannotations = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        View view = getinternalcanvasannotations.RemoteActionCompatParcelizer.getActivityResultRegistry;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        getinternalcanvasannotations.RemoteActionCompatParcelizer(this);
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            getinternalcanvasannotations.toString();
        }
    }

    @Override // o.drawRawPoints
    public final void read(ViewGroup viewGroup) {
        viewGroup.getClass();
        Rect0a9Yr6o rect0a9Yr6o = this.IconCompatParcelizer;
        getInternalCanvasannotations getinternalcanvasannotations = rect0a9Yr6o.RemoteActionCompatParcelizer;
        if (rect0a9Yr6o.serializer()) {
            getinternalcanvasannotations.RemoteActionCompatParcelizer(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = getinternalcanvasannotations.RemoteActionCompatParcelizer.getActivityResultRegistry;
        context.getClass();
        RoundRectsniSvfs roundRectsniSvfsIconCompatParcelizer = rect0a9Yr6o.IconCompatParcelizer(context);
        if (roundRectsniSvfsIconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
            return;
        }
        Animation animation = roundRectsniSvfsIconCompatParcelizer.write;
        if (animation == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
            return;
        }
        if (getinternalcanvasannotations.serializer != clipRectN_I0leg.REMOVED) {
            view.startAnimation(animation);
            getinternalcanvasannotations.RemoteActionCompatParcelizer(this);
            return;
        }
        viewGroup.startViewTransition(view);
        isRect isrect = new isRect(animation, viewGroup, view);
        isrect.setAnimationListener(new getZero(getinternalcanvasannotations, viewGroup, view, this));
        view.startAnimation(isrect);
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            getinternalcanvasannotations.toString();
        }
    }
}
