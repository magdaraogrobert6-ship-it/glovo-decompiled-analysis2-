package o;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getSubcomposePausableNjRlDlw extends getReuseDeactivationViaHostNjRlDlw {
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;

    public final void serializer(float f, int i, boolean z) {
        float interpolation = this.write.getInterpolation(f);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        View view = this.MediaBrowserCompatMediaItem;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.MediaSessionCompatQueueItem / f2;
            float f5 = this.MediaDescriptionCompat / f2;
            float f6 = this.MediaMetadataCompat / f3;
            if (z2) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float fWrite = handleMotionFrameOfReferencePlacement.write(0.0f, f5, interpolation);
            float f7 = fWrite + 1.0f;
            view.setScaleX(f7);
            float fWrite2 = 1.0f - handleMotionFrameOfReferencePlacement.write(0.0f, f6, interpolation);
            view.setScaleY(fWrite2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - fWrite : 1.0f;
                    float f9 = fWrite2 != 0.0f ? (f7 / fWrite2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }

    public getSubcomposePausableNjRlDlw(View view) {
        super(view);
        Resources resources = view.getResources();
        this.MediaSessionCompatQueueItem = resources.getDimension(com.logistics.rider.glovo.R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.MediaDescriptionCompat = resources.getDimension(com.logistics.rider.glovo.R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.MediaMetadataCompat = resources.getDimension(com.logistics.rider.glovo.R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }
}
