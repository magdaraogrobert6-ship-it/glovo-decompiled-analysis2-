package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class isAdditionimpl extends AnimatorListenerAdapter {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ ViewGroup.LayoutParams RemoteActionCompatParcelizer;
    public final /* synthetic */ getEndYimpl read;

    public isAdditionimpl(getEndYimpl getendyimpl, ViewGroup.LayoutParams layoutParams, int i) {
        this.read = getendyimpl;
        this.RemoteActionCompatParcelizer = layoutParams;
        this.IconCompatParcelizer = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        getEndYimpl getendyimpl = this.read;
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = getendyimpl.write;
        View view = getendyimpl.PlaybackStateCompatCustomAction;
        SortedSet sortedSet = (SortedSet) pinnableContainerKtLocalPinnableContainer1.serializer;
        if (sortedSet.read() != null) {
            sortedSet.read().onClick(view);
        }
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        int i = this.IconCompatParcelizer;
        ViewGroup.LayoutParams layoutParams = this.RemoteActionCompatParcelizer;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
