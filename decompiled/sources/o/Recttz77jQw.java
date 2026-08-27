package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Recttz77jQw extends drawRawPoints {
    public final Rect0a9Yr6o IconCompatParcelizer;
    public AnimatorSet read;

    public Recttz77jQw(Rect0a9Yr6o rect0a9Yr6o) {
        this.IconCompatParcelizer = rect0a9Yr6o;
    }

    @Override // o.drawRawPoints
    public final void IconCompatParcelizer(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.read;
        getInternalCanvasannotations getinternalcanvasannotations = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        if (animatorSet == null) {
            getinternalcanvasannotations.RemoteActionCompatParcelizer(this);
            return;
        }
        if (getinternalcanvasannotations.MediaSessionCompatQueueItem) {
            lerp.serializer.read(animatorSet);
        } else {
            animatorSet.end();
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            getinternalcanvasannotations.toString();
        }
    }

    @Override // o.drawRawPoints
    public final void read(ViewGroup viewGroup) {
        viewGroup.getClass();
        getInternalCanvasannotations getinternalcanvasannotations = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        AnimatorSet animatorSet = this.read;
        if (animatorSet == null) {
            getinternalcanvasannotations.RemoteActionCompatParcelizer(this);
            return;
        }
        animatorSet.start();
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(getinternalcanvasannotations);
        }
    }

    @Override // o.drawRawPoints
    public final void read(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys, ViewGroup viewGroup) {
        viewGroup.getClass();
        getInternalCanvasannotations getinternalcanvasannotations = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        AnimatorSet animatorSet = this.read;
        if (animatorSet == null) {
            getinternalcanvasannotations.RemoteActionCompatParcelizer(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !getinternalcanvasannotations.RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras) {
            return;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            getinternalcanvasannotations.toString();
        }
        long jIconCompatParcelizer = RectKt.RemoteActionCompatParcelizer.IconCompatParcelizer(animatorSet);
        long j = (long) (r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer * jIconCompatParcelizer);
        if (j == 0) {
            j = 1;
        }
        if (j == jIconCompatParcelizer) {
            j = jIconCompatParcelizer - 1;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            animatorSet.toString();
            getinternalcanvasannotations.toString();
        }
        lerp.serializer.RemoteActionCompatParcelizer(animatorSet, j);
    }

    @Override // o.drawRawPoints
    public final void write(ViewGroup viewGroup) {
        viewGroup.getClass();
        Rect0a9Yr6o rect0a9Yr6o = this.IconCompatParcelizer;
        if (rect0a9Yr6o.serializer()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        RoundRectsniSvfs roundRectsniSvfsIconCompatParcelizer = rect0a9Yr6o.IconCompatParcelizer(context);
        this.read = roundRectsniSvfsIconCompatParcelizer != null ? roundRectsniSvfsIconCompatParcelizer.read : null;
        getInternalCanvasannotations getinternalcanvasannotations = rect0a9Yr6o.RemoteActionCompatParcelizer;
        androidx.fragment.app.Fragment fragment = getinternalcanvasannotations.RemoteActionCompatParcelizer;
        boolean z = getinternalcanvasannotations.serializer == clipRectN_I0leg.GONE;
        View view = fragment.getActivityResultRegistry;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.read;
        if (animatorSet != null) {
            animatorSet.addListener(new Rect3MmeM6k(viewGroup, view, z, getinternalcanvasannotations, this));
        }
        AnimatorSet animatorSet2 = this.read;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
