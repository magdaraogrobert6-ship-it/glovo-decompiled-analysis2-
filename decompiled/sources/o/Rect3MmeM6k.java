package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Rect3MmeM6k extends AnimatorListenerAdapter {
    public final /* synthetic */ getInternalCanvasannotations IconCompatParcelizer;
    public final /* synthetic */ View RemoteActionCompatParcelizer;
    public final /* synthetic */ Recttz77jQw read;
    public final /* synthetic */ ViewGroup serializer;
    public final /* synthetic */ boolean write;

    public Rect3MmeM6k(ViewGroup viewGroup, View view, boolean z, getInternalCanvasannotations getinternalcanvasannotations, Recttz77jQw recttz77jQw) {
        this.serializer = viewGroup;
        this.RemoteActionCompatParcelizer = view;
        this.write = z;
        this.IconCompatParcelizer = getinternalcanvasannotations;
        this.read = recttz77jQw;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.serializer;
        View view = this.RemoteActionCompatParcelizer;
        viewGroup.endViewTransition(view);
        boolean z = this.write;
        getInternalCanvasannotations getinternalcanvasannotations = this.IconCompatParcelizer;
        if (z || getinternalcanvasannotations.serializer == clipRectN_I0leg.GONE) {
            clipRectN_I0leg cliprectn_i0leg = getinternalcanvasannotations.serializer;
            view.getClass();
            cliprectn_i0leg.applyState(view, viewGroup);
        }
        Recttz77jQw recttz77jQw = this.read;
        recttz77jQw.IconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(recttz77jQw);
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(getinternalcanvasannotations);
        }
    }
}
