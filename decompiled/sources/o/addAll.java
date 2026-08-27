package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class addAll extends AnimatorListenerAdapter {
    public final /* synthetic */ containsAll RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ addAll(containsAll containsall, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = containsall;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.write != 1) {
            super.onAnimationEnd(animator);
        } else {
            this.RemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.setEndIconVisible(false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.write != 0) {
            super.onAnimationStart(animator);
        } else {
            this.RemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.setEndIconVisible(true);
        }
    }
}
