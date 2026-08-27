package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ColorSpaceVerificationHelperV34 extends AnimatorListenerAdapter {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public ColorSpaceVerificationHelperV34(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0, ImageKt imageKt) {
        this.RemoteActionCompatParcelizer = 0;
        this.serializer = colorSpaceVerificationHelperExternalSyntheticLambda0;
        this.IconCompatParcelizer = imageKt;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            ((ImageKt) obj2).remove(animator);
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).ParcelableVolumeInfo.remove(animator);
        } else if (i != 1) {
            super.onAnimationEnd(animator);
            ((ViewGroup) obj2).animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(((Application) obj).getResources().getInteger(android.R.integer.config_longAnimTime)).setListener(null);
        } else {
            component14 component14Var = (component14) obj2;
            component14Var.IconCompatParcelizer.serializer(1.0f);
            component11.write((View) obj, component14Var);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.RemoteActionCompatParcelizer != 0) {
            super.onAnimationStart(animator);
        } else {
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) this.serializer).ParcelableVolumeInfo.add(animator);
        }
    }

    public /* synthetic */ ColorSpaceVerificationHelperV34(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
    }
}
