package o;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutStatesetCompositionContext1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getSetRootui read;

    public SubcomposeLayoutStatesetCompositionContext1(getSetRootui getsetrootui, int i) {
        this.RemoteActionCompatParcelizer = 2;
        this.read = getsetrootui;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.RemoteActionCompatParcelizer;
        getSetRootui getsetrootui = this.read;
        if (i == 0) {
            getsetrootui.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 1) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet = getsetrootui.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            subcomposeSlotReusePolicySlotIdsSet.setScaleX(fFloatValue);
            subcomposeSlotReusePolicySlotIdsSet.setScaleY(fFloatValue);
            return;
        }
        if (i != 2) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            restore restoreVar = getSetRootui.IconCompatParcelizer;
            getsetrootui.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setTranslationY(iIntValue);
        } else {
            int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            restore restoreVar2 = getSetRootui.IconCompatParcelizer;
            getsetrootui.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setTranslationY(iIntValue2);
        }
    }

    public /* synthetic */ SubcomposeLayoutStatesetCompositionContext1(getSetRootui getsetrootui, int i, byte b) {
        this.RemoteActionCompatParcelizer = i;
        this.read = getsetrootui;
    }
}
