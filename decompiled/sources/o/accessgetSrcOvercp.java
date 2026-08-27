package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetSrcOvercp extends AnimatorListenerAdapter {
    public final /* synthetic */ accessgetSrcAtopcp IconCompatParcelizer;
    public final /* synthetic */ accessgetSoftlightcp RemoteActionCompatParcelizer;
    public final /* synthetic */ View read;
    public final /* synthetic */ ViewPropertyAnimator serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ accessgetSrcOvercp(accessgetSoftlightcp accessgetsoftlightcp, accessgetSrcAtopcp accessgetsrcatopcp, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = accessgetsoftlightcp;
        this.IconCompatParcelizer = accessgetsrcatopcp;
        this.serializer = viewPropertyAnimator;
        this.read = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.write;
        accessgetSrcAtopcp accessgetsrcatopcp = this.IconCompatParcelizer;
        accessgetSoftlightcp accessgetsoftlightcp = this.RemoteActionCompatParcelizer;
        View view = this.read;
        ViewPropertyAnimator viewPropertyAnimator = this.serializer;
        if (i != 0) {
            viewPropertyAnimator.setListener(null);
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            accessgetsoftlightcp.dispatchAnimationFinished(accessgetsrcatopcp.read);
            accessgetsoftlightcp.IconCompatParcelizer.remove(accessgetsrcatopcp.read);
            accessgetsoftlightcp.RemoteActionCompatParcelizer();
            return;
        }
        viewPropertyAnimator.setListener(null);
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        accessgetsoftlightcp.dispatchAnimationFinished(accessgetsrcatopcp.serializer);
        accessgetsoftlightcp.IconCompatParcelizer.remove(accessgetsrcatopcp.serializer);
        accessgetsoftlightcp.RemoteActionCompatParcelizer();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.write != 0) {
            this.RemoteActionCompatParcelizer.getClass();
        } else {
            this.RemoteActionCompatParcelizer.getClass();
        }
    }
}
