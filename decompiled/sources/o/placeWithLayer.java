package o;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class placeWithLayer implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior RemoteActionCompatParcelizer;

    public placeWithLayer(BottomSheetBehavior bottomSheetBehavior) {
        this.RemoteActionCompatParcelizer = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheetBehavior bottomSheetBehavior = this.RemoteActionCompatParcelizer;
        if (bottomSheetBehavior.fullyDrawnReporter_delegatelambda0 != null) {
            bottomSheetBehavior.fullyDrawnReporter_delegatelambda0.MediaSessionCompatQueueItem(fFloatValue);
        }
    }
}
