package o;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class obtainColorMatrixp10uLo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ obtainColorMatrixp10uLo(Object obj, int i, Object obj2) {
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.write;
        if (i != 0) {
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj2;
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((getEndYimpl) obj).PlaybackStateCompatCustomAction.setLayoutParams(layoutParams);
        } else {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            getValues getvalues = (getValues) obj;
            ColorMatrixKt colorMatrixKt = (ColorMatrixKt) obj2;
            getValues.write(fFloatValue, colorMatrixKt);
            getvalues.serializer(fFloatValue, colorMatrixKt, false);
            getvalues.invalidateSelf();
        }
    }
}
