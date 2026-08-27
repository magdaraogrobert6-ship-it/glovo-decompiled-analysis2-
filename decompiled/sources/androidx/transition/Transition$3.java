package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckPulsingAnimator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.ColorSpaceVerificationHelperExternalSyntheticLambda0;
import o.getCancel;
import o.getEndYimpl;
import o.getMediumfv9h1I;
import o.getSlotToReusedFromOnDeactivateNjRlDlw;
import o.isAdditionimpl;
import o.obtainColorMatrixp10uLo;
import o.onDestroy;
import o.onRemeasurementAvailable;
import o.removeIf;
import o.times44nBxM0;

/* JADX INFO: loaded from: classes.dex */
public final class Transition$3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public Transition$3(getCancel getcancel, View view) {
        this.read = 2;
        this.write = getcancel;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.read;
        Object obj = this.write;
        if (i == 1) {
            onDestroy ondestroy = (onDestroy) obj;
            ondestroy.PlaybackStateCompatCustomAction = null;
            ondestroy.MediaMetadataCompat = false;
        } else if (i != 2) {
            super.onAnimationCancel(animator);
        } else {
            ((getCancel) obj).read();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        int i = this.read;
        Object obj = this.write;
        if (i == 6) {
            super.onAnimationRepeat(animator);
            times44nBxM0 times44nbxm0 = (times44nBxM0) obj;
            times44nbxm0.RatingCompat = (times44nbxm0.RatingCompat + 1) % times44nbxm0.read.IconCompatParcelizer.length;
            times44nbxm0.MediaBrowserCompatMediaItem = true;
            return;
        }
        if (i != 10) {
            super.onAnimationRepeat(animator);
            return;
        }
        animator.getClass();
        super.onAnimationRepeat(animator);
        PuckPulsingAnimator puckPulsingAnimator = (PuckPulsingAnimator) obj;
        puckPulsingAnimator.setObjectValues(Double.valueOf(0.0d), Double.valueOf(puckPulsingAnimator.maxRadius));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.read;
        Object obj = this.write;
        if (i == 2) {
            ((getCancel) obj).RemoteActionCompatParcelizer();
            return;
        }
        if (i != 3) {
            super.onAnimationStart(animator);
            return;
        }
        getMediumfv9h1I getmediumfv9h1i = (getMediumfv9h1I) obj;
        ArrayList arrayList = new ArrayList(getmediumfv9h1i.RemoteActionCompatParcelizer);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((onRemeasurementAvailable) arrayList.get(i2)).IconCompatParcelizer(getmediumfv9h1i);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.read;
        Object obj = this.write;
        switch (i) {
            case 0:
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).MediaDescriptionCompat();
                animator.removeListener(this);
                break;
            case 1:
                onDestroy ondestroy = (onDestroy) obj;
                ondestroy.PlaybackStateCompatCustomAction = null;
                ondestroy.MediaMetadataCompat = false;
                break;
            case 2:
                ((getCancel) obj).serializer();
                break;
            case 3:
                getMediumfv9h1I getmediumfv9h1i = (getMediumfv9h1I) obj;
                ArrayList arrayList = new ArrayList(getmediumfv9h1i.RemoteActionCompatParcelizer);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((onRemeasurementAvailable) arrayList.get(i2)).read(getmediumfv9h1i);
                }
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) obj).RemoteActionCompatParcelizer = null;
                break;
            case 5:
                getSlotToReusedFromOnDeactivateNjRlDlw getslottoreusedfromondeactivatenjrldlw = (getSlotToReusedFromOnDeactivateNjRlDlw) obj;
                getslottoreusedfromondeactivatenjrldlw.MediaBrowserCompatMediaItem.setTranslationY(0.0f);
                getslottoreusedfromondeactivatenjrldlw.IconCompatParcelizer(0.0f);
                break;
            case 6:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.serializer(5);
                WeakReference weakReference = sideSheetBehavior.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get()).requestLayout();
                    break;
                }
                break;
            case 8:
                removeIf removeif = (removeIf) obj;
                removeif.MediaSessionCompatToken();
                removeif.RatingCompat.start();
                break;
            case 9:
                getEndYimpl getendyimpl = (getEndYimpl) obj;
                View view = getendyimpl.PlaybackStateCompatCustomAction;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int height = view.getHeight();
                ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(getendyimpl.serializer);
                duration.addListener(new isAdditionimpl(getendyimpl, layoutParams, height));
                duration.addUpdateListener(new obtainColorMatrixp10uLo(getendyimpl, 1, layoutParams));
                duration.start();
                break;
        }
    }

    public /* synthetic */ Transition$3(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }
}
