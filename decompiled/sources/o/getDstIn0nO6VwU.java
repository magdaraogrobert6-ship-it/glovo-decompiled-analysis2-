package o;

import android.animation.ValueAnimator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getDstIn0nO6VwU implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getDstIn0nO6VwU(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    @Override // java.lang.Runnable
    public final void run() {
        int iInterpolateOutOfBoundsScroll;
        int iInterpolateOutOfBoundsScroll2;
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            androidx.recyclerview.widget.FastScroller fastScroller = (androidx.recyclerview.widget.FastScroller) obj;
            ValueAnimator valueAnimator = fastScroller.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            int i2 = fastScroller.IconCompatParcelizer;
            if (i2 == 1) {
                valueAnimator.cancel();
            } else if (i2 != 2) {
                return;
            }
            fastScroller.IconCompatParcelizer = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500L);
            valueAnimator.start();
            return;
        }
        if (i != 1) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager) obj).serializer();
            return;
        }
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = (androidx.recyclerview.widget.ItemTouchHelper) obj;
        com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = itemTouchHelper.serializer;
        if (itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = itemTouchHelper.RemoteActionCompatParcelizer;
            long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = itemTouchHelper.ComponentActivity.getLayoutManager();
            if (itemTouchHelper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
                itemTouchHelper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new android.graphics.Rect();
            }
            layoutManager.serializer(itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem, itemTouchHelper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            if (layoutManager.RatingCompat()) {
                int i3 = (int) (itemTouchHelper.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + itemTouchHelper.MediaBrowserCompatMediaItem);
                int paddingLeft = (i3 - itemTouchHelper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.left) - itemTouchHelper.ComponentActivity.getPaddingLeft();
                float f = itemTouchHelper.MediaBrowserCompatMediaItem;
                if (f >= 0.0f || paddingLeft >= 0) {
                    if (f > 0.0f) {
                        paddingLeft = ((itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getWidth() + i3) + itemTouchHelper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.right) - (itemTouchHelper.ComponentActivity.getWidth() - itemTouchHelper.ComponentActivity.getPaddingRight());
                        if (paddingLeft > 0) {
                        }
                    }
                    iInterpolateOutOfBoundsScroll = 0;
                }
                iInterpolateOutOfBoundsScroll = paddingLeft;
            } else {
                iInterpolateOutOfBoundsScroll = 0;
            }
            if (layoutManager.MediaBrowserCompatMediaItem()) {
                int i4 = (int) (itemTouchHelper.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + itemTouchHelper.MediaSessionCompatQueueItem);
                int paddingTop = (i4 - itemTouchHelper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.top) - itemTouchHelper.ComponentActivity.getPaddingTop();
                float f2 = itemTouchHelper.MediaSessionCompatQueueItem;
                if (f2 < 0.0f && paddingTop < 0) {
                    iInterpolateOutOfBoundsScroll2 = paddingTop;
                } else if (f2 > 0.0f) {
                    iInterpolateOutOfBoundsScroll2 = ((itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getHeight() + i4) + itemTouchHelper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.bottom) - (itemTouchHelper.ComponentActivity.getHeight() - itemTouchHelper.ComponentActivity.getPaddingBottom());
                    if (iInterpolateOutOfBoundsScroll2 <= 0) {
                        iInterpolateOutOfBoundsScroll2 = 0;
                    }
                } else {
                    iInterpolateOutOfBoundsScroll2 = 0;
                }
            } else {
                iInterpolateOutOfBoundsScroll2 = 0;
            }
            if (iInterpolateOutOfBoundsScroll != 0) {
                iInterpolateOutOfBoundsScroll = simpleItemTouchHelperCallback.interpolateOutOfBoundsScroll(itemTouchHelper.ComponentActivity, itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getWidth(), iInterpolateOutOfBoundsScroll, itemTouchHelper.ComponentActivity.getWidth(), j2);
            }
            int i5 = iInterpolateOutOfBoundsScroll;
            if (iInterpolateOutOfBoundsScroll2 != 0) {
                iInterpolateOutOfBoundsScroll2 = simpleItemTouchHelperCallback.interpolateOutOfBoundsScroll(itemTouchHelper.ComponentActivity, itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getHeight(), iInterpolateOutOfBoundsScroll2, itemTouchHelper.ComponentActivity.getHeight(), j2);
            }
            if (i5 == 0 && iInterpolateOutOfBoundsScroll2 == 0) {
                itemTouchHelper.RemoteActionCompatParcelizer = -9223372036854775808;
                return;
            }
            if (itemTouchHelper.RemoteActionCompatParcelizer == r11) {
                itemTouchHelper.RemoteActionCompatParcelizer = jCurrentTimeMillis;
            }
            itemTouchHelper.ComponentActivity.scrollBy(i5, iInterpolateOutOfBoundsScroll2);
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (viewHolder != null) {
                itemTouchHelper.serializer(viewHolder);
            }
            itemTouchHelper.ComponentActivity.removeCallbacks(itemTouchHelper.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            androidx.recyclerview.widget.RecyclerView recyclerView = itemTouchHelper.ComponentActivity;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            recyclerView.postOnAnimation(this);
        }
    }
}
