package o;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class dotMe4OoYI extends Animation {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SwipeRefreshLayout RemoteActionCompatParcelizer;

    public /* synthetic */ dotMe4OoYI(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.IconCompatParcelizer;
        SwipeRefreshLayout swipeRefreshLayout = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            swipeRefreshLayout.setAnimationProgress(f);
            return;
        }
        if (i == 1) {
            swipeRefreshLayout.setAnimationProgress(1.0f - f);
            return;
        }
        if (i != 2) {
            swipeRefreshLayout.serializer(f);
            return;
        }
        int i2 = swipeRefreshLayout.accessensureViewModelStore;
        int iAbs = Math.abs(swipeRefreshLayout.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        int i3 = swipeRefreshLayout.PlaybackStateCompat;
        swipeRefreshLayout.setTargetOffsetTopAndBottom((i3 + ((int) (((i2 - iAbs) - i3) * f))) - swipeRefreshLayout.MediaSessionCompatQueueItem.getTop());
        getValues getvalues = swipeRefreshLayout.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        float f2 = 1.0f - f;
        ColorMatrixKt colorMatrixKt = getvalues.MediaBrowserCompatMediaItem;
        if (f2 != colorMatrixKt.serializer) {
            colorMatrixKt.serializer = f2;
        }
        getvalues.invalidateSelf();
    }
}
