package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.WeakHashMap;
import o.ColorMatrixColorFilter;
import o.ColorMatrixFilterHelper;
import o.ColorMatrixKt;
import o.ColorSpaceVerificationHelper;
import o.FocusPropertiesImplonEnter1;
import o.FocusPropertiesNode;
import o.FocusPropertiesexit1;
import o.FocusPropertiesonExit1;
import o.copyColorMatrixgBh15pI;
import o.dotMe4OoYI;
import o.getColorMatrix8unuwjk;
import o.getScope;
import o.getValues;
import o.r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.timesAssignjHGOpc;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements getScope, FocusPropertiesexit1 {
    public static final int[] read = {R.attr.enabled};
    public boolean ComponentActivity;
    public getColorMatrix8unuwjk IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final dotMe4OoYI MediaMetadataCompat;
    public final timesAssignjHGOpc MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public final DecelerateInterpolator PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM ResultReceiver;
    public dotMe4OoYI _init_lambda1;
    public float _init_lambda2;
    public dotMe4OoYI _init_lambda3;
    public View _init_lambda4;
    public final int accessensureViewModelStore;
    public float addObserverForBackInvoker;
    public final int addObserverForBackInvokerlambda0;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public float r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final FocusPropertiesonExit1 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final FocusPropertiesImplonEnter1 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final int[] r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final ColorMatrixFilterHelper r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final int[] r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final getValues r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final int[] r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public getColorMatrix8unuwjk serializer;
    public final dotMe4OoYI write;

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.MediaBrowserCompatMediaItem;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    public int getProgressCircleDiameter() {
        return this.RatingCompat;
    }

    public int getProgressViewEndOffset() {
        return this.accessensureViewModelStore;
    }

    public int getProgressViewStartOffset() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this._init_lambda2 = i;
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.ParcelableVolumeInfo = z;
    }

    public void setOnChildScrollUpCallback(copyColorMatrixgBh15pI copycolormatrixgbh15pi) {
    }

    public void setOnRefreshListener(r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM r8lambdayyrmr3f_0vhpsnrjrur1nvokatm) {
        this.ResultReceiver = r8lambdayyrmr3f_0vhpsnrjrur1nvokatm;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setSlingshotDistance(int i) {
        this.MediaSessionCompatToken = i;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new ColorSpaceVerificationHelper();
        public final boolean read;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.read = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.read ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.read = z;
        }
    }

    private void setColorViewAlpha(int i) {
        this.MediaSessionCompatQueueItem.getBackground().setAlpha(i);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setAlpha(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        setRefreshingWithoutSwipeGesture(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        return focusPropertiesImplonEnter1.RemoteActionCompatParcelizer | focusPropertiesImplonEnter1.serializer;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
    }

    public final void moveSpinner(float f) {
        getColorMatrix8unuwjk getcolormatrix8unuwjk;
        getColorMatrix8unuwjk getcolormatrix8unuwjk2;
        getValues getvalues = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        ColorMatrixKt colorMatrixKt = getvalues.MediaBrowserCompatMediaItem;
        if (!colorMatrixKt.PlaybackStateCompat) {
            colorMatrixKt.PlaybackStateCompat = true;
        }
        getvalues.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this._init_lambda2));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f);
        float f2 = this._init_lambda2;
        int i = this.MediaSessionCompatToken;
        if (i <= 0) {
            i = this.accessensureViewModelStore;
        }
        float f3 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs - f2, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = (int) ((fMin * f3) + (f3 * fPow * 2.0f));
        int i3 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        timesAssignjHGOpc timesassignjhgopc = this.MediaSessionCompatQueueItem;
        if (timesassignjhgopc.getVisibility() != 0) {
            timesassignjhgopc.setVisibility(0);
        }
        timesassignjhgopc.setScaleX(1.0f);
        timesassignjhgopc.setScaleY(1.0f);
        if (f < this._init_lambda2) {
            if (getvalues.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer > 76 && ((getcolormatrix8unuwjk2 = this.serializer) == null || !getcolormatrix8unuwjk2.hasStarted() || getcolormatrix8unuwjk2.hasEnded())) {
                getColorMatrix8unuwjk getcolormatrix8unuwjk3 = new getColorMatrix8unuwjk(this, getvalues.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer, 76);
                getcolormatrix8unuwjk3.setDuration(300L);
                timesassignjhgopc.RemoteActionCompatParcelizer = null;
                timesassignjhgopc.clearAnimation();
                timesassignjhgopc.startAnimation(getcolormatrix8unuwjk3);
                this.serializer = getcolormatrix8unuwjk3;
            }
        } else if (getvalues.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer < 255 && ((getcolormatrix8unuwjk = this.IconCompatParcelizer) == null || !getcolormatrix8unuwjk.hasStarted() || getcolormatrix8unuwjk.hasEnded())) {
            getColorMatrix8unuwjk getcolormatrix8unuwjk4 = new getColorMatrix8unuwjk(this, getvalues.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer, 255);
            getcolormatrix8unuwjk4.setDuration(300L);
            timesassignjhgopc.RemoteActionCompatParcelizer = null;
            timesassignjhgopc.clearAnimation();
            timesassignjhgopc.startAnimation(getcolormatrix8unuwjk4);
            this.IconCompatParcelizer = getcolormatrix8unuwjk4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        ColorMatrixKt colorMatrixKt2 = getvalues.MediaBrowserCompatMediaItem;
        colorMatrixKt2.ResultReceiver = 0.0f;
        colorMatrixKt2.MediaSessionCompatToken = fMin2;
        getvalues.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        ColorMatrixKt colorMatrixKt3 = getvalues.MediaBrowserCompatMediaItem;
        if (fMin3 != colorMatrixKt3.serializer) {
            colorMatrixKt3.serializer = fMin3;
        }
        getvalues.invalidateSelf();
        getvalues.MediaBrowserCompatMediaItem.ParcelableVolumeInfo = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(fPow, 2.0f, (fMax * 0.4f) - 0.25f, 0.5f);
        getvalues.invalidateSelf();
        setTargetOffsetTopAndBottom((i3 + i2) - this.MediaDescriptionCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer = i;
        startNestedScroll(i & 2);
        this.addObserverForBackInvoker = 0.0f;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.read);
    }

    public final boolean read() {
        View view = this._init_lambda4;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void serializer(float f) {
        int i = this.PlaybackStateCompat;
        setTargetOffsetTopAndBottom((i + ((int) ((this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss - i) * f))) - this.MediaSessionCompatQueueItem.getTop());
    }

    public void setAnimationProgress(float f) {
        this.MediaSessionCompatQueueItem.setScaleX(f);
        this.MediaSessionCompatQueueItem.setScaleY(f);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write(z);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.MediaSessionCompatQueueItem.setBackgroundColor(i);
    }

    public void setTargetOffsetTopAndBottom(int i) {
        timesAssignjHGOpc timesassignjhgopc = this.MediaSessionCompatQueueItem;
        timesassignjhgopc.bringToFront();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        timesassignjhgopc.offsetTopAndBottom(i);
        this.MediaDescriptionCompat = timesassignjhgopc.getTop();
    }

    public final void write() {
        this.MediaSessionCompatQueueItem.clearAnimation();
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.stop();
        this.MediaSessionCompatQueueItem.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss - this.MediaDescriptionCompat);
        this.MediaDescriptionCompat = this.MediaSessionCompatQueueItem.getTop();
    }

    public final void IconCompatParcelizer(float f) {
        float f2 = this.MediaSessionCompatResultReceiverWrapper;
        float f3 = this.addObserverForBackInvokerlambda0;
        if (f - f2 <= f3 || this.ComponentActivity) {
            return;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = f2 + f3;
        this.ComponentActivity = true;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        write();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        serializer();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !read() && !this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw && !this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.ComponentActivity = false;
                    this.RemoteActionCompatParcelizer = -1;
                } else if (actionMasked == 2) {
                    int i = this.RemoteActionCompatParcelizer;
                    if (i == -1) {
                        SentryLogcatAdapter.serializer("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        IconCompatParcelizer(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.ComponentActivity = false;
                    this.RemoteActionCompatParcelizer = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.RemoteActionCompatParcelizer) {
                        this.RemoteActionCompatParcelizer = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.ComponentActivity;
            }
            setTargetOffsetTopAndBottom(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss - this.MediaSessionCompatQueueItem.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.RemoteActionCompatParcelizer = pointerId;
            this.ComponentActivity = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.MediaSessionCompatResultReceiverWrapper = motionEvent.getY(iFindPointerIndex2);
                return this.ComponentActivity;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this._init_lambda4 == null) {
            serializer();
        }
        View view = this._init_lambda4;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.MediaSessionCompatQueueItem.measure(View.MeasureSpec.makeMeasureSpec(this.RatingCompat, 1073741824), View.MeasureSpec.makeMeasureSpec(this.RatingCompat, 1073741824));
        this.MediaBrowserCompatMediaItem = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.MediaSessionCompatQueueItem) {
                this.MediaBrowserCompatMediaItem = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.addObserverForBackInvoker;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.addObserverForBackInvoker = 0.0f;
                } else {
                    this.addObserverForBackInvoker = f - f2;
                    iArr[1] = i2;
                }
                moveSpinner(this.addObserverForBackInvoker);
            }
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int[] iArr2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (dispatchNestedPreScroll(i - i3, i2 - i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer = 0;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
        float f = this.addObserverForBackInvoker;
        if (f > 0.0f) {
            finishSpinner(f);
            this.addObserverForBackInvoker = 0.0f;
        } else {
            post(new RxWorker$1$$ExternalSyntheticLambda0(9, this));
        }
        stopNestedScroll();
    }

    public void setColorSchemeColors(int... iArr) {
        serializer();
        getValues getvalues = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        ColorMatrixKt colorMatrixKt = getvalues.MediaBrowserCompatMediaItem;
        colorMatrixKt.MediaBrowserCompatMediaItem = iArr;
        colorMatrixKt.read(0);
        colorMatrixKt.read(0);
        getvalues.invalidateSelf();
    }

    public final void setRefreshingWithoutSwipeGesture(boolean z, boolean z2) {
        if (z && this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != z) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = z;
            setTargetOffsetTopAndBottom((this.accessensureViewModelStore + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) - this.MediaDescriptionCompat);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = z2;
            timesAssignjHGOpc timesassignjhgopc = this.MediaSessionCompatQueueItem;
            timesassignjhgopc.setVisibility(0);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setAlpha(255);
            dotMe4OoYI dotme4ooyi = new dotMe4OoYI(this, 0);
            this._init_lambda1 = dotme4ooyi;
            dotme4ooyi.setDuration(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            ColorMatrixFilterHelper colorMatrixFilterHelper = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (colorMatrixFilterHelper != null) {
                timesassignjhgopc.RemoteActionCompatParcelizer = colorMatrixFilterHelper;
            }
            timesassignjhgopc.clearAnimation();
            timesassignjhgopc.startAnimation(this._init_lambda1);
            return;
        }
        setRefreshing(z, false);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(0);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
        this._init_lambda2 = -1.0f;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new int[2];
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new int[2];
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new int[2];
        this.RemoteActionCompatParcelizer = -1;
        this.MediaBrowserCompatMediaItem = -1;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new ColorMatrixFilterHelper(this, 0);
        this.write = new dotMe4OoYI(this, 2);
        this.MediaMetadataCompat = new dotMe4OoYI(this, 3);
        this.addObserverForBackInvokerlambda0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.PlaybackStateCompatCustomAction = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.RatingCompat = (int) (displayMetrics.density * 40.0f);
        timesAssignjHGOpc timesassignjhgopc = new timesAssignjHGOpc(getContext());
        float f = timesassignjhgopc.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = timesassignjhgopc.getContext().obtainStyledAttributes(ColorMatrixColorFilter.SwipeRefreshLayout);
        timesassignjhgopc.IconCompatParcelizer = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        timesassignjhgopc.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(timesassignjhgopc.IconCompatParcelizer);
        timesassignjhgopc.setBackground(shapeDrawable);
        this.MediaSessionCompatQueueItem = timesassignjhgopc;
        getValues getvalues = new getValues(getContext());
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = getvalues;
        getvalues.IconCompatParcelizer(1);
        timesassignjhgopc.setImageDrawable(getvalues);
        timesassignjhgopc.setVisibility(8);
        addView(timesassignjhgopc);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.accessensureViewModelStore = i;
        this._init_lambda2 = i;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new FocusPropertiesImplonEnter1();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new FocusPropertiesonExit1(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.RatingCompat;
        this.MediaDescriptionCompat = i2;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i2;
        serializer(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, read);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this._init_lambda4 == null) {
            serializer();
        }
        View view = this._init_lambda4;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft2 = getPaddingLeft();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - paddingLeft2) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.MediaSessionCompatQueueItem.getMeasuredWidth();
        int measuredHeight2 = this.MediaSessionCompatQueueItem.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // o.getScope
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(i, i2, i3, i4, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28[1] + i4 : i7;
        if (i8 >= 0 || read()) {
            return;
        }
        float fAbs = this.addObserverForBackInvoker + Math.abs(i8);
        this.addObserverForBackInvoker = fAbs;
        moveSpinner(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !read() && !this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw && !this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            if (actionMasked == 0) {
                this.RemoteActionCompatParcelizer = motionEvent.getPointerId(0);
                this.ComponentActivity = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.RemoteActionCompatParcelizer);
                if (iFindPointerIndex < 0) {
                    SentryLogcatAdapter.serializer("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.ComponentActivity) {
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    this.ComponentActivity = false;
                    finishSpinner((y - f) * 0.5f);
                }
                this.RemoteActionCompatParcelizer = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.RemoteActionCompatParcelizer);
                if (iFindPointerIndex2 < 0) {
                    SentryLogcatAdapter.serializer("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                IconCompatParcelizer(y2);
                if (this.ComponentActivity) {
                    float f2 = (y2 - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) * 0.5f;
                    if (f2 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        moveSpinner(f2);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.RemoteActionCompatParcelizer) {
                            this.RemoteActionCompatParcelizer = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    SentryLogcatAdapter.serializer("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.RemoteActionCompatParcelizer = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.ParcelableVolumeInfo && (view = this._init_lambda4) != null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public final void setRefreshing(boolean z, boolean z2) {
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != z) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = z2;
            serializer();
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = z;
            timesAssignjHGOpc timesassignjhgopc = this.MediaSessionCompatQueueItem;
            ColorMatrixFilterHelper colorMatrixFilterHelper = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (!z) {
                dotMe4OoYI dotme4ooyi = new dotMe4OoYI(this, 1);
                this._init_lambda3 = dotme4ooyi;
                dotme4ooyi.setDuration(150L);
                timesassignjhgopc.RemoteActionCompatParcelizer = colorMatrixFilterHelper;
                timesassignjhgopc.clearAnimation();
                timesassignjhgopc.startAnimation(this._init_lambda3);
                return;
            }
            this.PlaybackStateCompat = this.MediaDescriptionCompat;
            dotMe4OoYI dotme4ooyi2 = this.write;
            dotme4ooyi2.reset();
            dotme4ooyi2.setDuration(200L);
            dotme4ooyi2.setInterpolator(this.PlaybackStateCompatCustomAction);
            if (colorMatrixFilterHelper != null) {
                timesassignjhgopc.RemoteActionCompatParcelizer = colorMatrixFilterHelper;
            }
            timesassignjhgopc.clearAnimation();
            timesassignjhgopc.startAnimation(dotme4ooyi2);
        }
    }

    public final void serializer() {
        if (this._init_lambda4 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.MediaSessionCompatQueueItem)) {
                    this._init_lambda4 = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        write();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw || (i & 2) == 0) ? false : true;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.RatingCompat = (int) (displayMetrics.density * 56.0f);
            } else {
                this.RatingCompat = (int) (displayMetrics.density * 40.0f);
            }
            this.MediaSessionCompatQueueItem.setImageDrawable(null);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer(i);
            this.MediaSessionCompatQueueItem.setImageDrawable(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(iArr, i, iArr2, i2, 0);
    }

    public final void finishSpinner(float f) {
        if (f > this._init_lambda2) {
            setRefreshing(true, true);
            return;
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
        getValues getvalues = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        ColorMatrixKt colorMatrixKt = getvalues.MediaBrowserCompatMediaItem;
        colorMatrixKt.ResultReceiver = 0.0f;
        colorMatrixKt.MediaSessionCompatToken = 0.0f;
        getvalues.invalidateSelf();
        ColorMatrixFilterHelper colorMatrixFilterHelper = new ColorMatrixFilterHelper(this, 1);
        this.PlaybackStateCompat = this.MediaDescriptionCompat;
        dotMe4OoYI dotme4ooyi = this.MediaMetadataCompat;
        dotme4ooyi.reset();
        dotme4ooyi.setDuration(200L);
        dotme4ooyi.setInterpolator(this.PlaybackStateCompatCustomAction);
        timesAssignjHGOpc timesassignjhgopc = this.MediaSessionCompatQueueItem;
        timesassignjhgopc.RemoteActionCompatParcelizer = colorMatrixFilterHelper;
        timesassignjhgopc.clearAnimation();
        timesassignjhgopc.startAnimation(dotme4ooyi);
        ColorMatrixKt colorMatrixKt2 = getvalues.MediaBrowserCompatMediaItem;
        if (colorMatrixKt2.PlaybackStateCompat) {
            colorMatrixKt2.PlaybackStateCompat = false;
        }
        getvalues.invalidateSelf();
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.FocusPropertiesElement
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // o.FocusPropertiesElement
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
    }

    public void setRefreshing(boolean z) {
        setRefreshingWithoutSwipeGesture(z, false);
    }
}
