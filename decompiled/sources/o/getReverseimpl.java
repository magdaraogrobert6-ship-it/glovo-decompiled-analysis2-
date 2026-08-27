package o;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public final class getReverseimpl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ getEndYimpl read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ float write;

    public getReverseimpl(getEndYimpl getendyimpl, float f, float f2, float f3, float f4) {
        this.read = getendyimpl;
        this.write = f;
        this.IconCompatParcelizer = f2;
        this.serializer = f3;
        this.RemoteActionCompatParcelizer = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = this.IconCompatParcelizer;
        float f2 = this.write;
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        float f3 = this.RemoteActionCompatParcelizer;
        float f4 = this.serializer;
        getEndYimpl getendyimpl = this.read;
        getendyimpl.serializer((animatedFraction * f) + f2);
        getendyimpl.PlaybackStateCompatCustomAction.setAlpha((animatedFraction2 * f3) + f4);
    }
}
