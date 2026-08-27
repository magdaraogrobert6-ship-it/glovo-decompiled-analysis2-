package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class androidColorSpacelambda0 extends AnimatorListenerAdapter implements obtainAndroidColorSpace {
    public boolean RemoteActionCompatParcelizer = false;
    public final View write;

    @Override // o.obtainAndroidColorSpace
    public final void IconCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    @Override // o.obtainAndroidColorSpace
    public final void RemoteActionCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    @Override // o.obtainAndroidColorSpace
    public final void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        getAutoNrFUSI.IconCompatParcelizer.IconCompatParcelizer(this.write, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.RemoteActionCompatParcelizer;
        View view = this.write;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        degrees degreesVar = getAutoNrFUSI.IconCompatParcelizer;
        degreesVar.IconCompatParcelizer(view, 1.0f);
        degreesVar.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.write;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.RemoteActionCompatParcelizer = true;
            view.setLayerType(2, null);
        }
    }

    @Override // o.obtainAndroidColorSpace
    public final void read() {
        View view = this.write;
        view.setTag(com.logistics.rider.glovo.R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? getAutoNrFUSI.IconCompatParcelizer.RemoteActionCompatParcelizer(view) : 0.0f));
    }

    public androidColorSpacelambda0(View view) {
        this.write = view;
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer() {
        this.write.setTag(com.logistics.rider.glovo.R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
