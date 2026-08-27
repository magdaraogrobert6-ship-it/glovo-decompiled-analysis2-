package o;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidVectorResources implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ AndroidVectorResources(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i != 0) {
            ((TextInputLayout) obj).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            ((getString) obj).invalidateSelf();
        }
    }
}
