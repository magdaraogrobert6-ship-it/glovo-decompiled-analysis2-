package o;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.camera.core.ImageCapture$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TileMode implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;

    public /* synthetic */ TileMode(ImageCapture$1 imageCapture$1, View view) {
        this.IconCompatParcelizer = 2;
        this.RemoteActionCompatParcelizer = imageCapture$1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            accessgetMirrorcp accessgetmirrorcp = (accessgetMirrorcp) obj;
            getMiterLxFBmk8 getmiterlxfbmk8 = accessgetmirrorcp.serializer;
            if (getmiterlxfbmk8 == null) {
                getmiterlxfbmk8 = getRoundLxFBmk8.read;
            }
            if (getmiterlxfbmk8 == getMiterLxFBmk8.ENABLED) {
                accessgetmirrorcp.invalidateSelf();
                return;
            }
            getBt2020 getbt2020 = accessgetmirrorcp.PlaybackStateCompat;
            if (getbt2020 != null) {
                getbt2020.serializer(accessgetmirrorcp.RemoteActionCompatParcelizer.serializer());
                return;
            }
            return;
        }
        if (i == 1) {
            ((Float) valueAnimator.getAnimatedValue()).getClass();
            setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
            ((shrinkKibmq7A) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 2) {
            ((View) ((run) ((ImageCapture$1) obj).MediaSessionCompatQueueItem).write.getParent()).invalidate();
            return;
        }
        if (i == 3) {
            getFloat getfloat = (getFloat) obj;
            int i2 = getFloat.IconCompatParcelizer;
            valueAnimator.getClass();
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            getfloat.write = ((Float) animatedValue).floatValue();
            getfloat.read = valueAnimator.getAnimatedFraction();
            getfloat.invalidate();
            return;
        }
        if (i != 4) {
            ((removeIf) obj).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        RectRulersCompanion rectRulersCompanion = (RectRulersCompanion) obj;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rectRulersCompanion.MediaDescriptionCompat.setAlpha((int) (255.0f * fFloatValue));
        rectRulersCompanion.serializer = fFloatValue;
    }

    public /* synthetic */ TileMode(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
    }
}
