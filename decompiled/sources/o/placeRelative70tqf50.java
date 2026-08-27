package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes4.dex */
public final class placeRelative70tqf50 extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomSheetBehavior RemoteActionCompatParcelizer;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomSheetBehavior bottomSheetBehavior = this.RemoteActionCompatParcelizer;
        bottomSheetBehavior.setStateInternal(5);
        Reference reference = bottomSheetBehavior.ComponentActivity;
        if (reference == null || reference.get() == null) {
            return;
        }
        ((View) bottomSheetBehavior.ComponentActivity.get()).requestLayout();
    }

    public placeRelative70tqf50(BottomSheetBehavior bottomSheetBehavior) {
        this.RemoteActionCompatParcelizer = bottomSheetBehavior;
    }
}
