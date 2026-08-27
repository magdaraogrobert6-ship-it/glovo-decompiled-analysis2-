package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class FilterQualityCompanion extends AnimatorListenerAdapter implements obtainAndroidColorSpace {
    public final /* synthetic */ androidColorSpace IconCompatParcelizer;
    public final ViewGroup RemoteActionCompatParcelizer;
    public boolean read = true;
    public final View serializer;
    public final View write;

    @Override // o.obtainAndroidColorSpace
    public final void IconCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    @Override // o.obtainAndroidColorSpace
    public final void read() {
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer() {
    }

    @Override // o.obtainAndroidColorSpace
    public final void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
    }

    public FilterQualityCompanion(androidColorSpace androidcolorspace, ViewGroup viewGroup, View view, View view2) {
        this.IconCompatParcelizer = androidcolorspace;
        this.RemoteActionCompatParcelizer = viewGroup;
        this.serializer = view;
        this.write = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        RemoteActionCompatParcelizer();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.RemoteActionCompatParcelizer.getOverlay().remove(this.serializer);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.serializer;
        if (view.getParent() == null) {
            FocusPropertiesNode.read(view, this.RemoteActionCompatParcelizer);
        } else {
            this.IconCompatParcelizer.read();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.write;
            View view2 = this.serializer;
            view.setTag(com.logistics.rider.glovo.R.id.save_overlay_view, view2);
            FocusPropertiesNode.read(view2, this.RemoteActionCompatParcelizer);
            this.read = true;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.setTag(com.logistics.rider.glovo.R.id.save_overlay_view, null);
        this.RemoteActionCompatParcelizer.getOverlay().remove(this.serializer);
        this.read = false;
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        if (this.read) {
            RemoteActionCompatParcelizer();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RemoteActionCompatParcelizer();
    }
}
