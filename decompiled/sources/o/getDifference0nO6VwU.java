package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class getDifference0nO6VwU extends AnimatorListenerAdapter {
    public boolean serializer = false;
    public final /* synthetic */ androidx.recyclerview.widget.FastScroller write;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.serializer = true;
    }

    public getDifference0nO6VwU(androidx.recyclerview.widget.FastScroller fastScroller) {
        this.write = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.serializer) {
            this.serializer = false;
            return;
        }
        androidx.recyclerview.widget.FastScroller fastScroller = this.write;
        if (((Float) fastScroller.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.getAnimatedValue()).floatValue() == 0.0f) {
            fastScroller.IconCompatParcelizer = 0;
            fastScroller.serializer(0);
        } else {
            fastScroller.IconCompatParcelizer = 2;
            fastScroller.ResultReceiver.invalidate();
        }
    }
}
