package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetXorcp extends AnimatorListenerAdapter {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ View MediaSessionCompatQueueItem;
    public final /* synthetic */ accessgetSoftlightcp RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ ViewPropertyAnimator write;

    public accessgetXorcp(accessgetSoftlightcp accessgetsoftlightcp, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.RemoteActionCompatParcelizer = accessgetsoftlightcp;
        this.read = viewHolder;
        this.serializer = i;
        this.MediaSessionCompatQueueItem = view;
        this.IconCompatParcelizer = i2;
        this.write = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.RemoteActionCompatParcelizer.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.serializer;
        View view = this.MediaSessionCompatQueueItem;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.IconCompatParcelizer != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.write.setListener(null);
        accessgetSoftlightcp accessgetsoftlightcp = this.RemoteActionCompatParcelizer;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.read;
        accessgetsoftlightcp.dispatchAnimationFinished(viewHolder);
        accessgetsoftlightcp.MediaBrowserCompatMediaItem.remove(viewHolder);
        accessgetsoftlightcp.RemoteActionCompatParcelizer();
    }
}
