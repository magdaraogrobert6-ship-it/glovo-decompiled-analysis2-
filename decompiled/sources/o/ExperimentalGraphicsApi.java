package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class ExperimentalGraphicsApi extends AnimatorListenerAdapter implements obtainAndroidColorSpace {
    public final View MediaMetadataCompat;
    public boolean read;
    public final ViewGroup serializer;
    public final int write;
    public boolean RemoteActionCompatParcelizer = false;
    public final boolean IconCompatParcelizer = true;

    @Override // o.obtainAndroidColorSpace
    public final void IconCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // o.obtainAndroidColorSpace
    public final void read() {
        IconCompatParcelizer(false);
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        getAutoNrFUSI.write(this.write, this.MediaMetadataCompat);
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer() {
        IconCompatParcelizer(true);
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        getAutoNrFUSI.write(0, this.MediaMetadataCompat);
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    @Override // o.obtainAndroidColorSpace
    public final void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.RemoteActionCompatParcelizer) {
            getAutoNrFUSI.write(this.write, this.MediaMetadataCompat);
            ViewGroup viewGroup = this.serializer;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        IconCompatParcelizer(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            getAutoNrFUSI.write(0, this.MediaMetadataCompat);
            ViewGroup viewGroup = this.serializer;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public ExperimentalGraphicsApi(int i, View view) {
        this.MediaMetadataCompat = view;
        this.write = i;
        this.serializer = (ViewGroup) view.getParent();
        IconCompatParcelizer(true);
    }

    public final void IconCompatParcelizer(boolean z) {
        ViewGroup viewGroup;
        if (!this.IconCompatParcelizer || this.read == z || (viewGroup = this.serializer) == null) {
            return;
        }
        this.read = z;
        getModulateAlphaNrFUSI.serializer(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.RemoteActionCompatParcelizer) {
            getAutoNrFUSI.write(this.write, this.MediaMetadataCompat);
            ViewGroup viewGroup = this.serializer;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        IconCompatParcelizer(false);
    }
}
