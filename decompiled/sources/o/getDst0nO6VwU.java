package o;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class getDst0nO6VwU implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ getDst0nO6VwU(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i != 0) {
            ((getDstOut0nO6VwU) obj).serializer = valueAnimator.getAnimatedFraction();
            return;
        }
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        androidx.recyclerview.widget.FastScroller fastScroller = (androidx.recyclerview.widget.FastScroller) obj;
        fastScroller.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.setAlpha(iFloatValue);
        fastScroller.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setAlpha(iFloatValue);
        fastScroller.ResultReceiver.invalidate();
    }
}
