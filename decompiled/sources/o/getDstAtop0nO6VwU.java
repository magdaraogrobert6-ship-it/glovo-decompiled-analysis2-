package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getDstAtop0nO6VwU extends BlurEffect {
    public final /* synthetic */ androidx.recyclerview.widget.FastScroller IconCompatParcelizer;

    public getDstAtop0nO6VwU(androidx.recyclerview.widget.FastScroller fastScroller) {
        this.IconCompatParcelizer = fastScroller;
    }

    @Override // o.BlurEffect
    public final void IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        androidx.recyclerview.widget.FastScroller fastScroller = this.IconCompatParcelizer;
        int i3 = fastScroller.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iComputeVerticalScrollRange = fastScroller.ResultReceiver.computeVerticalScrollRange();
        int i4 = fastScroller.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        fastScroller.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = fastScroller.ResultReceiver.computeHorizontalScrollRange();
        int i5 = fastScroller.ComponentActivity;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        fastScroller.PlaybackStateCompat = z;
        boolean z2 = fastScroller.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!z2 && !z) {
            if (fastScroller.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != 0) {
                fastScroller.serializer(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            fastScroller.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            fastScroller.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (fastScroller.PlaybackStateCompat) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            fastScroller.MediaBrowserCompatMediaItem = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            fastScroller.MediaSessionCompatResultReceiverWrapper = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = fastScroller.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (i6 == 0 || i6 == 1) {
            fastScroller.serializer(1);
        }
    }
}
