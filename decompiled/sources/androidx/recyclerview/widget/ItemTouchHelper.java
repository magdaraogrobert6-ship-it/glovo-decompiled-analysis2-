package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.TextView;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import o.DrawModifierNodeKt;
import o.FocusPropertiesNode;
import o.InterfaceC0185m;
import o.PendingValue;
import o.VideoQualityQuirk;
import o.getDstIn0nO6VwU;
import o.getDstOut0nO6VwU;
import o.getExclusion0nO6VwU;
import o.getHardlight0nO6VwU;
import o.getIntrinsicSizeNHjbRc;
import o.getLighten0nO6VwU;
import o.getLuminosity0nO6VwU;
import o.getMultiply0nO6VwU;
import o.getSoftlight0nO6VwU;
import o.getSrcOut0nO6VwU;
import o.onDrawWithContent;

/* JADX INFO: loaded from: classes.dex */
public final class ItemTouchHelper extends RecyclerView.ItemDecoration implements InterfaceC0185m {
    public RecyclerView ComponentActivity;
    public ArrayList IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public GestureDetector MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public float ParcelableVolumeInfo;
    public getExclusion0nO6VwU PlaybackStateCompat;
    public float RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public float r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public ArrayList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public float r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public float r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public Rect r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public VelocityTracker r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final SimpleItemTouchHelperCallback serializer;
    public final ArrayList MediaSessionCompatToken = new ArrayList();
    public final float[] r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new float[2];
    public RecyclerView.ViewHolder r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
    public int read = -1;
    public int write = 0;
    public final ArrayList r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new ArrayList();
    public final getDstIn0nO6VwU r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new getDstIn0nO6VwU(1, this);
    public View PlaybackStateCompatCustomAction = null;
    public final getHardlight0nO6VwU MediaSessionCompatResultReceiverWrapper = new getHardlight0nO6VwU(this);

    public abstract class Callback {
        private static final Interpolator IconCompatParcelizer = new getSrcOut0nO6VwU(1);
        private static final Interpolator RemoteActionCompatParcelizer = new getSrcOut0nO6VwU(2);
        private int serializer = -1;

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static getMultiply0nO6VwU getDefaultUIUtil() {
            return getLuminosity0nO6VwU.write;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 65280) != 0;
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            View view = viewHolder.MediaSessionCompatQueueItem;
        }

        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        }

        @SuppressLint
        public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = viewHolder.MediaSessionCompatQueueItem.getWidth();
            int height = viewHolder.MediaSessionCompatQueueItem.getHeight();
            int left2 = i - viewHolder.MediaSessionCompatQueueItem.getLeft();
            int top2 = i2 - viewHolder.MediaSessionCompatQueueItem.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.MediaSessionCompatQueueItem.getRight() - (width + i)) < 0 && viewHolder3.MediaSessionCompatQueueItem.getRight() > viewHolder.MediaSessionCompatQueueItem.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = viewHolder3.MediaSessionCompatQueueItem.getLeft() - i) > 0 && viewHolder3.MediaSessionCompatQueueItem.getLeft() < viewHolder.MediaSessionCompatQueueItem.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = viewHolder3.MediaSessionCompatQueueItem.getTop() - i2) > 0 && viewHolder3.MediaSessionCompatQueueItem.getTop() < viewHolder.MediaSessionCompatQueueItem.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.MediaSessionCompatQueueItem.getBottom() - (height + i2)) < 0 && viewHolder3.MediaSessionCompatQueueItem.getBottom() > viewHolder.MediaSessionCompatQueueItem.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs;
                }
            }
            return viewHolder2;
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<getDstOut0nO6VwU> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                getDstOut0nO6VwU getdstout0no6vwu = list.get(i2);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, getdstout0no6vwu.PlaybackStateCompat, getdstout0no6vwu.MediaSessionCompatResultReceiverWrapper, getdstout0no6vwu.MediaSessionCompatToken, getdstout0no6vwu.read, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                getDstOut0nO6VwU getdstout0no6vwu2 = list.get(i3);
                boolean z2 = getdstout0no6vwu2.IconCompatParcelizer;
                if (z2 && !getdstout0no6vwu2.RemoteActionCompatParcelizer) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public static int makeMovementFlags(int i, int i2) {
            int iMakeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | iMakeFlag;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), recyclerView.getLayoutDirection());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof getLighten0nO6VwU)) {
                if (layoutManager.RatingCompat()) {
                    if (RecyclerView.LayoutManager.write(viewHolder2.MediaSessionCompatQueueItem) <= recyclerView.getPaddingLeft()) {
                        recyclerView.scrollToPosition(i2);
                    }
                    if (RecyclerView.LayoutManager.a_(viewHolder2.MediaSessionCompatQueueItem) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.scrollToPosition(i2);
                    }
                }
                if (layoutManager.MediaBrowserCompatMediaItem()) {
                    if (RecyclerView.LayoutManager.IconCompatParcelizer(viewHolder2.MediaSessionCompatQueueItem) <= recyclerView.getPaddingTop()) {
                        recyclerView.scrollToPosition(i2);
                    }
                    if (RecyclerView.LayoutManager.serializer(viewHolder2.MediaSessionCompatQueueItem) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.scrollToPosition(i2);
                        return;
                    }
                    return;
                }
                return;
            }
            View view = viewHolder.MediaSessionCompatQueueItem;
            View view2 = viewHolder2.MediaSessionCompatQueueItem;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((getLighten0nO6VwU) layoutManager);
            linearLayoutManager.read("Cannot drop a view during a scroll or layout calculation");
            linearLayoutManager.MediaSessionCompatQueueItem();
            linearLayoutManager.ComponentActivity();
            int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view);
            int iRemoteActionCompatParcelizer2 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2);
            byte b = iRemoteActionCompatParcelizer < iRemoteActionCompatParcelizer2 ? (byte) 1 : (byte) -1;
            boolean z = linearLayoutManager.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            getSoftlight0nO6VwU getsoftlight0no6vwu = linearLayoutManager.ComponentActivity;
            if (z) {
                if (b == 1) {
                    linearLayoutManager.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer2, getsoftlight0no6vwu.write() - (linearLayoutManager.ComponentActivity.IconCompatParcelizer(view) + linearLayoutManager.ComponentActivity.RemoteActionCompatParcelizer(view2)));
                    return;
                } else {
                    linearLayoutManager.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer2, getsoftlight0no6vwu.write() - linearLayoutManager.ComponentActivity.write(view2));
                    return;
                }
            }
            if (b == -1) {
                linearLayoutManager.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer2, getsoftlight0no6vwu.RemoteActionCompatParcelizer(view2));
            } else {
                linearLayoutManager.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer2, getsoftlight0no6vwu.write(view2) - linearLayoutManager.ComponentActivity.IconCompatParcelizer(view));
            }
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.MediaSessionCompatQueueItem;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                view.setElevation(fFloatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            if (this.serializer == -1) {
                this.serializer = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (IconCompatParcelizer.getInterpolation(j <= ConstantKt.DEFAULT_REQUEST_TIMEOUT ? j / 2000.0f : 1.0f) * ((int) (RemoteActionCompatParcelizer.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.serializer)));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            View view = viewHolder.MediaSessionCompatQueueItem;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                float elevation = view.getElevation();
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                        float elevation2 = childAt.getElevation();
                        if (elevation2 > f3) {
                            f3 = elevation2;
                        }
                    }
                }
                view.setElevation(f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, Float.valueOf(elevation));
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<getDstOut0nO6VwU> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                getDstOut0nO6VwU getdstout0no6vwu = list.get(i2);
                RecyclerView.ViewHolder viewHolder2 = getdstout0no6vwu.PlaybackStateCompat;
                float f3 = getdstout0no6vwu.MediaDescriptionCompat;
                float f4 = getdstout0no6vwu.MediaSessionCompatQueueItem;
                if (f3 == f4) {
                    getdstout0no6vwu.MediaSessionCompatResultReceiverWrapper = viewHolder2.MediaSessionCompatQueueItem.getTranslationX();
                } else {
                    getdstout0no6vwu.MediaSessionCompatResultReceiverWrapper = c8$$ExternalSyntheticOutline0.m(f4, f3, getdstout0no6vwu.serializer, f3);
                }
                float f5 = getdstout0no6vwu.RatingCompat;
                float f6 = getdstout0no6vwu.MediaBrowserCompatMediaItem;
                if (f5 == f6) {
                    getdstout0no6vwu.MediaSessionCompatToken = viewHolder2.MediaSessionCompatQueueItem.getTranslationY();
                } else {
                    getdstout0no6vwu.MediaSessionCompatToken = c8$$ExternalSyntheticOutline0.m(f6, f5, getdstout0no6vwu.serializer, f5);
                }
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, getdstout0no6vwu.PlaybackStateCompat, getdstout0no6vwu.MediaSessionCompatResultReceiverWrapper, getdstout0no6vwu.MediaSessionCompatToken, getdstout0no6vwu.read, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            }
            return i == 8 ? itemAnimator.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY : itemAnimator.ComponentActivity;
        }
    }

    @Override // o.InterfaceC0185m
    public final void RemoteActionCompatParcelizer(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$4, reason: invalid class name */
    public final class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ Object read;
        public final /* synthetic */ int serializer = 1;
        public final /* synthetic */ int write;

        public AnonymousClass4(PendingValue pendingValue, int i, DrawModifierNodeKt drawModifierNodeKt) {
            this.RemoteActionCompatParcelizer = pendingValue;
            this.write = i;
            this.read = drawModifierNodeKt;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            onDrawWithContent ondrawwithcontent;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            int i = this.serializer;
            Object obj = this.read;
            int i2 = this.write;
            Object obj2 = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                getDstOut0nO6VwU getdstout0no6vwu = (getDstOut0nO6VwU) obj;
                RecyclerView.ViewHolder viewHolder = getdstout0no6vwu.PlaybackStateCompat;
                ItemTouchHelper itemTouchHelper = (ItemTouchHelper) obj2;
                RecyclerView recyclerView = itemTouchHelper.ComponentActivity;
                if (recyclerView == null || !recyclerView.accessensureViewModelStore || getdstout0no6vwu.write || viewHolder.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                RecyclerView.ItemAnimator itemAnimator = itemTouchHelper.ComponentActivity.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.IconCompatParcelizer()) {
                    ArrayList arrayList7 = itemTouchHelper.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    int size = arrayList7.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((getDstOut0nO6VwU) arrayList7.get(i3)).IconCompatParcelizer) {
                        }
                    }
                    itemTouchHelper.serializer.onSwiped(viewHolder, i2);
                    return;
                }
                itemTouchHelper.ComponentActivity.post(this);
                return;
            }
            if (i == 1) {
                ((TextView) obj).setTypeface((Typeface) obj2, i2);
                return;
            }
            PendingValue pendingValue = (PendingValue) obj2;
            DrawModifierNodeKt drawModifierNodeKt = (DrawModifierNodeKt) obj;
            boolean z = pendingValue.serializer;
            AtomicInteger atomicInteger = pendingValue.read;
            ArrayList arrayList8 = pendingValue.MediaDescriptionCompat;
            if (pendingValue.isDone() || arrayList8 == null) {
                UtilsKt.RemoteActionCompatParcelizer("Future was done before all dependencies completed", z);
                return;
            }
            try {
                UtilsKt.RemoteActionCompatParcelizer("Tried to set value from future which is not done", drawModifierNodeKt.isDone());
                arrayList8.set(i2, VideoQualityQuirk.IconCompatParcelizer(drawModifierNodeKt));
                int iDecrementAndGet = atomicInteger.decrementAndGet();
                UtilsKt.RemoteActionCompatParcelizer("Less than 0 remaining futures", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    if (arrayList6 != null) {
                        ondrawwithcontent = pendingValue.IconCompatParcelizer;
                        arrayList2 = new ArrayList(arrayList6);
                        ondrawwithcontent.RemoteActionCompatParcelizer(arrayList2);
                    }
                }
            } catch (Error e) {
                pendingValue.IconCompatParcelizer.serializer(e);
                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                UtilsKt.RemoteActionCompatParcelizer("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                if (iDecrementAndGet2 == 0) {
                    if (arrayList5 != null) {
                        ondrawwithcontent = pendingValue.IconCompatParcelizer;
                        arrayList2 = new ArrayList(arrayList5);
                    }
                }
            } catch (RuntimeException e2) {
                if (z) {
                    pendingValue.IconCompatParcelizer.serializer(e2);
                }
                int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                UtilsKt.RemoteActionCompatParcelizer("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                if (iDecrementAndGet3 == 0) {
                    if (arrayList4 != null) {
                        ondrawwithcontent = pendingValue.IconCompatParcelizer;
                        arrayList2 = new ArrayList(arrayList4);
                    }
                }
            } catch (CancellationException unused) {
                if (z) {
                    pendingValue.cancel(false);
                }
                int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                UtilsKt.RemoteActionCompatParcelizer("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                if (iDecrementAndGet4 == 0) {
                    if (arrayList3 != null) {
                        ondrawwithcontent = pendingValue.IconCompatParcelizer;
                        arrayList2 = new ArrayList(arrayList3);
                    }
                }
            } catch (ExecutionException e3) {
                if (z) {
                    pendingValue.IconCompatParcelizer.serializer(e3.getCause());
                }
                int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                UtilsKt.RemoteActionCompatParcelizer("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                if (iDecrementAndGet5 == 0) {
                    if (arrayList != null) {
                        ondrawwithcontent = pendingValue.IconCompatParcelizer;
                        arrayList2 = new ArrayList(arrayList);
                    }
                }
            } finally {
                int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                UtilsKt.RemoteActionCompatParcelizer("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                if (iDecrementAndGet6 == 0) {
                    ArrayList arrayList9 = pendingValue.MediaDescriptionCompat;
                    if (arrayList9 != null) {
                        pendingValue.IconCompatParcelizer.RemoteActionCompatParcelizer(new ArrayList(arrayList9));
                    } else {
                        UtilsKt.RemoteActionCompatParcelizer((String) null, pendingValue.isDone());
                    }
                }
            }
        }

        public AnonymousClass4(TextView textView, Typeface typeface, int i) {
            this.read = textView;
            this.RemoteActionCompatParcelizer = typeface;
            this.write = i;
        }

        public AnonymousClass4(ItemTouchHelper itemTouchHelper, getDstOut0nO6VwU getdstout0no6vwu, int i) {
            this.RemoteActionCompatParcelizer = itemTouchHelper;
            this.read = getdstout0no6vwu;
            this.write = i;
        }
    }

    public final void read(RecyclerView.ViewHolder viewHolder, boolean z) {
        getDstOut0nO6VwU getdstout0no6vwu;
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                getdstout0no6vwu = (getDstOut0nO6VwU) arrayList.get(size);
            }
        } while (getdstout0no6vwu.PlaybackStateCompat != viewHolder);
        getdstout0no6vwu.write |= z;
        if (!getdstout0no6vwu.IconCompatParcelizer) {
            getdstout0no6vwu.MediaMetadataCompat.cancel();
        }
        arrayList.remove(size);
    }

    public static boolean serializer(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final View findChildView(MotionEvent motionEvent) {
        getDstOut0nO6VwU getdstout0no6vwu;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (viewHolder != null) {
            View view2 = viewHolder.MediaSessionCompatQueueItem;
            if (serializer(view2, x, y, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + this.MediaBrowserCompatMediaItem, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + this.MediaSessionCompatQueueItem)) {
                return view2;
            }
        }
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                getdstout0no6vwu = (getDstOut0nO6VwU) arrayList.get(size);
                view = getdstout0no6vwu.PlaybackStateCompat.MediaSessionCompatQueueItem;
            } else {
                RecyclerView recyclerView = this.ComponentActivity;
                int iIconCompatParcelizer = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer();
                while (true) {
                    iIconCompatParcelizer--;
                    if (iIconCompatParcelizer < 0) {
                        return null;
                    }
                    View viewSerializer = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(iIconCompatParcelizer);
                    float translationX = viewSerializer.getTranslationX();
                    float translationY = viewSerializer.getTranslationY();
                    if (x >= viewSerializer.getLeft() + translationX && x <= viewSerializer.getRight() + translationX && y >= viewSerializer.getTop() + translationY && y <= viewSerializer.getBottom() + translationY) {
                        return viewSerializer;
                    }
                }
            }
        } while (!serializer(view, x, y, getdstout0no6vwu.MediaSessionCompatResultReceiverWrapper, getdstout0no6vwu.MediaSessionCompatToken));
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        float f;
        float f2;
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            float[] fArr = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            write(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.serializer.onDraw(canvas, recyclerView, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.write, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        float f;
        float f2;
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            float[] fArr = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            write(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.serializer.onDrawOver(canvas, recyclerView, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.write, f, f2);
    }

    public final int read(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.MediaSessionCompatQueueItem > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.serializer;
        if (velocityTracker != null && this.read > -1) {
            velocityTracker.computeCurrentVelocity(1000, simpleItemTouchHelperCallback.getSwipeVelocityThreshold(this.ParcelableVolumeInfo));
            float xVelocity = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getXVelocity(this.read);
            float yVelocity = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getYVelocity(this.read);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= simpleItemTouchHelperCallback.getSwipeEscapeVelocity(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.ComponentActivity.getHeight();
        float swipeThreshold = simpleItemTouchHelperCallback.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.MediaSessionCompatQueueItem) <= swipeThreshold * height) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void serializer(RecyclerView.ViewHolder viewHolder) {
        int i;
        int i2;
        if (!this.ComponentActivity.isLayoutRequested() && this.write == 2) {
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.serializer;
            float moveThreshold = simpleItemTouchHelperCallback.getMoveThreshold(viewHolder);
            int i3 = (int) (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + this.MediaBrowserCompatMediaItem);
            int i4 = (int) (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + this.MediaSessionCompatQueueItem);
            if (Math.abs(i4 - viewHolder.MediaSessionCompatQueueItem.getTop()) >= viewHolder.MediaSessionCompatQueueItem.getHeight() * moveThreshold || Math.abs(i3 - viewHolder.MediaSessionCompatQueueItem.getLeft()) >= viewHolder.MediaSessionCompatQueueItem.getWidth() * moveThreshold) {
                ArrayList arrayList = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (arrayList == null) {
                    this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new ArrayList();
                    this.IconCompatParcelizer = new ArrayList();
                } else {
                    arrayList.clear();
                    this.IconCompatParcelizer.clear();
                }
                int boundingBoxMargin = simpleItemTouchHelperCallback.getBoundingBoxMargin();
                int iRound = Math.round(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + this.MediaBrowserCompatMediaItem) - boundingBoxMargin;
                int iRound2 = Math.round(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + this.MediaSessionCompatQueueItem) - boundingBoxMargin;
                int i5 = boundingBoxMargin * 2;
                int width = viewHolder.MediaSessionCompatQueueItem.getWidth() + iRound + i5;
                int height = viewHolder.MediaSessionCompatQueueItem.getHeight() + iRound2 + i5;
                int i6 = (iRound + width) / 2;
                int i7 = (iRound2 + height) / 2;
                RecyclerView.LayoutManager layoutManager = this.ComponentActivity.getLayoutManager();
                int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = layoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                int i8 = 0;
                while (i8 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                    View viewMediaSessionCompatResultReceiverWrapper = layoutManager.MediaSessionCompatResultReceiverWrapper(i8);
                    if (viewMediaSessionCompatResultReceiverWrapper != viewHolder.MediaSessionCompatQueueItem && viewMediaSessionCompatResultReceiverWrapper.getBottom() >= iRound2 && viewMediaSessionCompatResultReceiverWrapper.getTop() <= height && viewMediaSessionCompatResultReceiverWrapper.getRight() >= iRound && viewMediaSessionCompatResultReceiverWrapper.getLeft() <= width) {
                        RecyclerView.ViewHolder childViewHolder = this.ComponentActivity.getChildViewHolder(viewMediaSessionCompatResultReceiverWrapper);
                        i = iRound;
                        i2 = iRound2;
                        if (simpleItemTouchHelperCallback.canDropOver(this.ComponentActivity, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, childViewHolder)) {
                            int iAbs = Math.abs(i6 - ((viewMediaSessionCompatResultReceiverWrapper.getRight() + viewMediaSessionCompatResultReceiverWrapper.getLeft()) / 2));
                            int iAbs2 = Math.abs(i7 - ((viewMediaSessionCompatResultReceiverWrapper.getBottom() + viewMediaSessionCompatResultReceiverWrapper.getTop()) / 2));
                            int i9 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                            int size = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i11 < size) {
                                int i12 = size;
                                if (i9 <= ((Integer) this.IconCompatParcelizer.get(i11)).intValue()) {
                                    break;
                                }
                                i10++;
                                i11++;
                                size = i12;
                            }
                            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.add(i10, childViewHolder);
                            this.IconCompatParcelizer.add(i10, Integer.valueOf(i9));
                        }
                    } else {
                        i = iRound;
                        i2 = iRound2;
                    }
                    i8++;
                    iRound = i;
                    iRound2 = i2;
                    i6 = i6;
                }
                ArrayList arrayList2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (arrayList2.size() == 0) {
                    return;
                }
                RecyclerView.ViewHolder viewHolderChooseDropTarget = simpleItemTouchHelperCallback.chooseDropTarget(viewHolder, arrayList2, i3, i4);
                if (viewHolderChooseDropTarget == null) {
                    this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.clear();
                    this.IconCompatParcelizer.clear();
                    return;
                }
                int absoluteAdapterPosition = viewHolderChooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (simpleItemTouchHelperCallback.onMove(this.ComponentActivity, viewHolder, viewHolderChooseDropTarget)) {
                    simpleItemTouchHelperCallback.onMoved(this.ComponentActivity, viewHolder, absoluteAdapterPosition2, viewHolderChooseDropTarget, absoluteAdapterPosition, i3, i4);
                }
            }
        }
    }

    public final int write(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.MediaBrowserCompatMediaItem > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.serializer;
        if (velocityTracker != null && this.read > -1) {
            velocityTracker.computeCurrentVelocity(1000, simpleItemTouchHelperCallback.getSwipeVelocityThreshold(this.ParcelableVolumeInfo));
            float xVelocity = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getXVelocity(this.read);
            float yVelocity = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getYVelocity(this.read);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= simpleItemTouchHelperCallback.getSwipeEscapeVelocity(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.ComponentActivity.getWidth();
        float swipeThreshold = simpleItemTouchHelperCallback.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.MediaBrowserCompatMediaItem) <= swipeThreshold * width) {
            return 0;
        }
        return i2;
    }

    public final void write(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.MediaDescriptionCompat;
        this.MediaBrowserCompatMediaItem = f;
        this.MediaSessionCompatQueueItem = y - this.RatingCompat;
        if ((i & 4) == 0) {
            this.MediaBrowserCompatMediaItem = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.MediaBrowserCompatMediaItem = Math.min(0.0f, this.MediaBrowserCompatMediaItem);
        }
        if ((i & 1) == 0) {
            this.MediaSessionCompatQueueItem = Math.max(0.0f, this.MediaSessionCompatQueueItem);
        }
        if ((i & 2) == 0) {
            this.MediaSessionCompatQueueItem = Math.min(0.0f, this.MediaSessionCompatQueueItem);
        }
    }

    public ItemTouchHelper(SimpleItemTouchHelperCallback simpleItemTouchHelperCallback) {
        this.serializer = simpleItemTouchHelperCallback;
    }

    @Override // o.InterfaceC0185m
    public final void read(View view) {
        if (view == this.PlaybackStateCompatCustomAction) {
            this.PlaybackStateCompatCustomAction = null;
        }
        RecyclerView.ViewHolder childViewHolder = this.ComponentActivity.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (viewHolder != null && childViewHolder == viewHolder) {
            IconCompatParcelizer(null, 0);
            return;
        }
        read(childViewHolder, false);
        if (this.MediaSessionCompatToken.remove(childViewHolder.MediaSessionCompatQueueItem)) {
            this.serializer.clearView(this.ComponentActivity, childViewHolder);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0093 A[PHI: r2
  0x0093: PHI (r2v19 int) = (r2v18 int), (r2v20 int) binds: [B:36:0x0091, B:30:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    public final void IconCompatParcelizer(RecyclerView.ViewHolder viewHolder, int i) {
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback;
        boolean z;
        boolean z2;
        RecyclerView.ViewHolder viewHolder2;
        int i2;
        float fSignum;
        float fSignum2;
        int i3;
        int iWrite;
        int iConvertToRelativeDirection;
        if (viewHolder == this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && i == this.write) {
            return;
        }
        this.RemoteActionCompatParcelizer = Long.MIN_VALUE;
        int i4 = this.write;
        read(viewHolder, true);
        this.write = i;
        if (i == 2) {
            if (viewHolder != null) {
                this.PlaybackStateCompatCustomAction = viewHolder.MediaSessionCompatQueueItem;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must pass a ViewHolder when dragging");
                return;
            }
        }
        RecyclerView.ViewHolder viewHolder3 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback2 = this.serializer;
        if (viewHolder3 != null) {
            if (viewHolder3.MediaSessionCompatQueueItem.getParent() != null) {
                if (i4 == 2 || this.write == 2) {
                    i2 = 0;
                } else {
                    int movementFlags = simpleItemTouchHelperCallback2.getMovementFlags(this.ComponentActivity, viewHolder3);
                    int iConvertToAbsoluteDirection = (simpleItemTouchHelperCallback2.convertToAbsoluteDirection(movementFlags, this.ComponentActivity.getLayoutDirection()) & 65280) >> 8;
                    if (iConvertToAbsoluteDirection == 0) {
                        i2 = 0;
                    } else {
                        int i5 = (movementFlags & 65280) >> 8;
                        if (Math.abs(this.MediaBrowserCompatMediaItem) > Math.abs(this.MediaSessionCompatQueueItem)) {
                            iWrite = write(viewHolder3, iConvertToAbsoluteDirection);
                            if (iWrite <= 0) {
                                iConvertToRelativeDirection = read(viewHolder3, iConvertToAbsoluteDirection);
                                if (iConvertToRelativeDirection <= 0) {
                                    i2 = 0;
                                }
                            } else if ((i5 & iWrite) == 0) {
                                iConvertToRelativeDirection = Callback.convertToRelativeDirection(iWrite, this.ComponentActivity.getLayoutDirection());
                            } else {
                                i2 = iWrite;
                            }
                            i2 = iConvertToRelativeDirection;
                        } else {
                            iWrite = read(viewHolder3, iConvertToAbsoluteDirection);
                            if (iWrite > 0) {
                                i2 = iWrite;
                            } else {
                                int iWrite2 = write(viewHolder3, iConvertToAbsoluteDirection);
                                if (iWrite2 <= 0) {
                                    i2 = 0;
                                } else if ((i5 & iWrite2) == 0) {
                                    iConvertToRelativeDirection = Callback.convertToRelativeDirection(iWrite2, this.ComponentActivity.getLayoutDirection());
                                    i2 = iConvertToRelativeDirection;
                                } else {
                                    i2 = iWrite2;
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                }
                if (i2 == 1 || i2 == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.MediaSessionCompatQueueItem) * this.ComponentActivity.getHeight();
                } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.MediaBrowserCompatMediaItem) * this.ComponentActivity.getWidth();
                } else {
                    fSignum2 = 0.0f;
                    fSignum = 0.0f;
                }
                if (i4 == 2) {
                    i3 = 8;
                } else {
                    i3 = i2 > 0 ? 2 : 4;
                }
                float[] fArr = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                write(fArr);
                float f = fArr[0];
                float f2 = fArr[1];
                simpleItemTouchHelperCallback = simpleItemTouchHelperCallback2;
                getDstOut0nO6VwU getdstout0no6vwu = new getDstOut0nO6VwU(this, viewHolder3, i4, f, f2, fSignum, fSignum2, i2, viewHolder3);
                long animationDuration = simpleItemTouchHelperCallback.getAnimationDuration(this.ComponentActivity, i3, fSignum - f, fSignum2 - f2);
                ValueAnimator valueAnimator = getdstout0no6vwu.MediaMetadataCompat;
                valueAnimator.setDuration(animationDuration);
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.add(getdstout0no6vwu);
                viewHolder3.setIsRecyclable(false);
                valueAnimator.start();
                viewHolder2 = null;
                z = true;
            } else {
                simpleItemTouchHelperCallback = simpleItemTouchHelperCallback2;
                if (viewHolder3.MediaSessionCompatQueueItem == this.PlaybackStateCompatCustomAction) {
                    viewHolder2 = null;
                    this.PlaybackStateCompatCustomAction = null;
                } else {
                    viewHolder2 = null;
                }
                simpleItemTouchHelperCallback.clearView(this.ComponentActivity, viewHolder3);
                z = false;
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = viewHolder2;
        } else {
            simpleItemTouchHelperCallback = simpleItemTouchHelperCallback2;
            z = false;
        }
        if (viewHolder != null) {
            this.ResultReceiver = (simpleItemTouchHelperCallback.getAbsoluteMovementFlags(this.ComponentActivity, viewHolder) & ((1 << ((i * 8) + 8)) - 1)) >> (this.write * 8);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = viewHolder.MediaSessionCompatQueueItem.getLeft();
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = viewHolder.MediaSessionCompatQueueItem.getTop();
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = viewHolder;
            if (i == 2) {
                z2 = false;
                viewHolder.MediaSessionCompatQueueItem.performHapticFeedback(0);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        ViewParent parent = this.ComponentActivity.getParent();
        if (parent != null) {
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
                z2 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z2);
        }
        if (!z) {
            this.ComponentActivity.getLayoutManager().defaultViewModelProviderFactory_delegatelambda0 = true;
        }
        simpleItemTouchHelperCallback.onSelectedChanged(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.write);
        this.ComponentActivity.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    public final void RemoteActionCompatParcelizer(int i, int i2, MotionEvent motionEvent) {
        RecyclerView.ViewHolder childViewHolder;
        int absoluteMovementFlags;
        View viewFindChildView;
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null && i == 2 && this.write != 2) {
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = this.serializer;
            if (simpleItemTouchHelperCallback.isItemViewSwipeEnabled() && this.ComponentActivity.getScrollState() != 1) {
                RecyclerView.LayoutManager layoutManager = this.ComponentActivity.getLayoutManager();
                int i3 = this.read;
                if (i3 == -1) {
                    childViewHolder = null;
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float f = this.MediaDescriptionCompat;
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f2 = this.RatingCompat;
                    float fAbs = Math.abs(x - f);
                    float fAbs2 = Math.abs(y - f2);
                    float f3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    if ((fAbs >= f3 || fAbs2 >= f3) && ((fAbs <= fAbs2 || !layoutManager.RatingCompat()) && ((fAbs2 <= fAbs || !layoutManager.MediaBrowserCompatMediaItem()) && (viewFindChildView = findChildView(motionEvent)) != null))) {
                        childViewHolder = this.ComponentActivity.getChildViewHolder(viewFindChildView);
                    } else {
                        childViewHolder = null;
                    }
                }
                if (childViewHolder == null || (absoluteMovementFlags = (simpleItemTouchHelperCallback.getAbsoluteMovementFlags(this.ComponentActivity, childViewHolder) & 65280) >> 8) == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f4 = x2 - this.MediaDescriptionCompat;
                float f5 = y2 - this.RatingCompat;
                float fAbs3 = Math.abs(f4);
                float fAbs4 = Math.abs(f5);
                float f6 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                if (fAbs3 >= f6 || fAbs4 >= f6) {
                    if (fAbs3 > fAbs4) {
                        if (f4 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f4 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f5 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f5 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.MediaSessionCompatQueueItem = 0.0f;
                    this.MediaBrowserCompatMediaItem = 0.0f;
                    this.read = motionEvent.getPointerId(0);
                    IconCompatParcelizer(childViewHolder, 1);
                }
            }
        }
    }

    public final void write(float[] fArr) {
        if ((this.ResultReceiver & 12) != 0) {
            fArr[0] = (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + this.MediaBrowserCompatMediaItem) - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getLeft();
        } else {
            fArr[0] = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getTranslationX();
        }
        if ((this.ResultReceiver & 3) == 0) {
            fArr[1] = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getTranslationY();
            return;
        }
        fArr[1] = (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + this.MediaSessionCompatQueueItem) - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem.getTop();
    }
}
