package o;

import android.animation.ValueAnimator;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.view.ScreenFlashView$2;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class clickableXHw0xAIdefault implements setTitleMarginBottom {
    public float IconCompatParcelizer;
    public final /* synthetic */ shrinkKibmq7A RemoteActionCompatParcelizer;
    public ValueAnimator read;

    public clickableXHw0xAIdefault(shrinkKibmq7A shrinkkibmq7a) {
        this.RemoteActionCompatParcelizer = shrinkkibmq7a;
    }

    @Override // o.setTitleMarginBottom
    public final void IconCompatParcelizer(long j, getDefaultDisplay getdefaultdisplay) {
        setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
        shrinkKibmq7A shrinkkibmq7a = this.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = shrinkkibmq7a.getBrightness();
        shrinkkibmq7a.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.read;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(getdefaultdisplay);
        Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(28, getdefaultdisplay);
        setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(shrinkkibmq7a.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new TileMode(1, shrinkkibmq7a));
        valueAnimatorOfFloat.addListener(new ScreenFlashView$2(0, preview$$ExternalSyntheticLambda0));
        valueAnimatorOfFloat.start();
        this.read = valueAnimatorOfFloat;
    }

    @Override // o.setTitleMarginBottom
    public final void read() {
        setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
        ValueAnimator valueAnimator = this.read;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.read = null;
        }
        shrinkKibmq7A shrinkkibmq7a = this.RemoteActionCompatParcelizer;
        shrinkkibmq7a.setAlpha(0.0f);
        shrinkkibmq7a.setBrightness(this.IconCompatParcelizer);
    }
}
