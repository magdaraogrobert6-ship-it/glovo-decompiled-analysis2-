package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class RoundRectsniSvfs {
    public final AnimatorSet read;
    public final Animation write;

    public RoundRectsniSvfs(Animator animator) {
        this.write = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.read = animatorSet;
        animatorSet.play(animator);
    }

    public RoundRectsniSvfs(Animation animation) {
        this.write = animation;
        this.read = null;
    }
}
