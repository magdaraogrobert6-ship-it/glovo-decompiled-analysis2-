package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetSrcIncp extends AnimatorListenerAdapter {
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder IconCompatParcelizer;
    public final /* synthetic */ accessgetSoftlightcp RemoteActionCompatParcelizer;
    public final /* synthetic */ ViewPropertyAnimator read;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ View write;

    public accessgetSrcIncp(accessgetSoftlightcp accessgetsoftlightcp, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.RemoteActionCompatParcelizer = accessgetsoftlightcp;
        this.IconCompatParcelizer = viewHolder;
        this.read = viewPropertyAnimator;
        this.write = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.serializer;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.IconCompatParcelizer;
        accessgetSoftlightcp accessgetsoftlightcp = this.RemoteActionCompatParcelizer;
        ViewPropertyAnimator viewPropertyAnimator = this.read;
        if (i != 0) {
            viewPropertyAnimator.setListener(null);
            accessgetsoftlightcp.dispatchAnimationFinished(viewHolder);
            accessgetsoftlightcp.write.remove(viewHolder);
            accessgetsoftlightcp.RemoteActionCompatParcelizer();
            return;
        }
        viewPropertyAnimator.setListener(null);
        this.write.setAlpha(1.0f);
        accessgetsoftlightcp.dispatchAnimationFinished(viewHolder);
        accessgetsoftlightcp.ParcelableVolumeInfo.remove(viewHolder);
        accessgetsoftlightcp.RemoteActionCompatParcelizer();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.serializer != 1) {
            super.onAnimationCancel(animator);
        } else {
            this.write.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.serializer != 0) {
            this.RemoteActionCompatParcelizer.getClass();
        } else {
            this.RemoteActionCompatParcelizer.getClass();
        }
    }

    public accessgetSrcIncp(accessgetSoftlightcp accessgetsoftlightcp, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.RemoteActionCompatParcelizer = accessgetsoftlightcp;
        this.IconCompatParcelizer = viewHolder;
        this.write = view;
        this.read = viewPropertyAnimator;
    }
}
