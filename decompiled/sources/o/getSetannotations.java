package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class getSetannotations extends AnimatorListenerAdapter {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getSetRootui serializer;

    public /* synthetic */ getSetannotations(getSetRootui getsetrootui, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = getsetrootui;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.IconCompatParcelizer;
        getSetRootui getsetrootui = this.serializer;
        if (i == 0) {
            getsetrootui.IconCompatParcelizer();
            return;
        }
        if (i == 1) {
            getsetrootui.write();
        } else if (i != 2) {
            getsetrootui.write();
        } else {
            getsetrootui.IconCompatParcelizer();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.IconCompatParcelizer;
        getSetRootui getsetrootui = this.serializer;
        if (i == 2) {
            fastForEach fastforeach = getsetrootui.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int i2 = getsetrootui.PlaybackStateCompatCustomAction;
            int i3 = getsetrootui.MediaBrowserCompatMediaItem;
            fastforeach.IconCompatParcelizer.setAlpha(0.0f);
            long j = i3;
            ViewPropertyAnimator duration = fastforeach.IconCompatParcelizer.animate().alpha(1.0f).setDuration(j);
            TimeInterpolator timeInterpolator = fastforeach.serializer;
            long j2 = i2 - i3;
            duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
            if (fastforeach.RemoteActionCompatParcelizer.getVisibility() == 0) {
                fastforeach.RemoteActionCompatParcelizer.setAlpha(0.0f);
                fastforeach.RemoteActionCompatParcelizer.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                return;
            }
            return;
        }
        if (i != 3) {
            super.onAnimationStart(animator);
            return;
        }
        fastForEach fastforeach2 = getsetrootui.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i4 = getsetrootui.RatingCompat;
        fastforeach2.IconCompatParcelizer.setAlpha(1.0f);
        long j3 = i4;
        ViewPropertyAnimator duration2 = fastforeach2.IconCompatParcelizer.animate().alpha(0.0f).setDuration(j3);
        TimeInterpolator timeInterpolator2 = fastforeach2.serializer;
        duration2.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
        if (fastforeach2.RemoteActionCompatParcelizer.getVisibility() == 0) {
            fastforeach2.RemoteActionCompatParcelizer.setAlpha(1.0f);
            fastforeach2.RemoteActionCompatParcelizer.animate().alpha(0.0f).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
        }
    }

    public /* synthetic */ getSetannotations(getSetRootui getsetrootui, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.serializer = getsetrootui;
    }
}
