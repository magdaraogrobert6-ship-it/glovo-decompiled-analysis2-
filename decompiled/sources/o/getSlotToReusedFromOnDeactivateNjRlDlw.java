package o;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class getSlotToReusedFromOnDeactivateNjRlDlw extends getReuseDeactivationViaHostNjRlDlw {
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;

    public final void IconCompatParcelizer(float f) {
        float interpolation = this.write.getInterpolation(f);
        View view = this.MediaBrowserCompatMediaItem;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.MediaDescriptionCompat / width;
        float f3 = this.MediaMetadataCompat / height;
        float fWrite = 1.0f - handleMotionFrameOfReferencePlacement.write(0.0f, f2, interpolation);
        float fWrite2 = 1.0f - handleMotionFrameOfReferencePlacement.write(0.0f, f3, interpolation);
        view.setScaleX(fWrite);
        view.setPivotY(height);
        view.setScaleY(fWrite2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fWrite2 != 0.0f ? fWrite / fWrite2 : 1.0f);
            }
        }
    }

    public final AnimatorSet write() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.MediaBrowserCompatMediaItem;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new restore(0));
        return animatorSet;
    }

    public getSlotToReusedFromOnDeactivateNjRlDlw(View view) {
        super(view);
        Resources resources = view.getResources();
        this.MediaDescriptionCompat = resources.getDimension(com.logistics.rider.glovo.R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.MediaMetadataCompat = resources.getDimension(com.logistics.rider.glovo.R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }
}
