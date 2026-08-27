package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.compose.ui.graphics.Fields;
import androidx.core.view.ScrollingView;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.serializer;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt;
import o.FocusPropertiesImplonEnter1;
import o.FocusPropertiesKt;
import o.FocusPropertiesNode;
import o.FocusPropertiesexit1;
import o.FocusPropertiesonExit1;
import o.dispatchFocusCallbacksui;
import o.fetchCustomEnterOrExitULY8qGw;
import o.fetchCustomEnteraToIllAui;
import o.fetchFocusPropertiesui;
import o.getEnterannotations;
import o.getScope;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements getScope, FocusPropertiesexit1, ScrollingView {
    public final int ComponentActivity;
    public final EdgeEffect MediaBrowserCompatMediaItem;
    public View MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final EdgeEffect MediaSessionCompatQueueItem;
    public long MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final getEnterannotations RatingCompat;
    public final FocusPropertiesonExit1 RemoteActionCompatParcelizer;
    public final FocusPropertiesImplonEnter1 ResultReceiver;
    public float _init_lambda2;
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public FocusPropertiesKt r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public SavedState r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final int[] r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final float r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final int[] r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final Rect r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final OverScroller r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public VelocityTracker r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public int read;
    public static final float serializer = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final fetchCustomEnteraToIllAui IconCompatParcelizer = new fetchCustomEnteraToIllAui(0);
    public static final int[] write = {R.attr.fillViewport};

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.RemoteActionCompatParcelizer.serializer(iArr, i, iArr2, i2, 0);
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.RemoteActionCompatParcelizer.read(0);
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.ResultReceiver;
        if (i2 == 1) {
            focusPropertiesImplonEnter1.RemoteActionCompatParcelizer = i;
        } else {
            focusPropertiesImplonEnter1.serializer = i;
        }
        IconCompatParcelizer(2, i2);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // o.FocusPropertiesElement
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // o.FocusPropertiesElement
    public final void onStopNestedScroll(View view, int i) {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.ResultReceiver;
        if (i == 1) {
            focusPropertiesImplonEnter1.RemoteActionCompatParcelizer = 0;
        } else {
            focusPropertiesImplonEnter1.serializer = 0;
        }
        RemoteActionCompatParcelizer(i);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.PlaybackStateCompatCustomAction = true;
        super.requestLayout();
    }

    public void setOnScrollChangeListener(dispatchFocusCallbacksui dispatchfocuscallbacksui) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.RemoteActionCompatParcelizer.serializer(i, 0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() { // from class: androidx.core.widget.NestedScrollView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.IconCompatParcelizer = parcel.readInt();
                return savedState;
            }
        };
        public int IconCompatParcelizer;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.IconCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "}", sb);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean IconCompatParcelizer(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? IconCompatParcelizer(33) : write(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? IconCompatParcelizer(130) : write(130);
                    }
                    if (keyCode == 62) {
                        serializer(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return IconCompatParcelizer(33);
                    }
                    if (keyCode == 93) {
                        return IconCompatParcelizer(130);
                    }
                    if (keyCode == 122) {
                        serializer(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        serializer(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer.serializer(i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        OverScroller overScroller = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int height = getHeight();
        EdgeEffect edgeEffect = this.MediaSessionCompatQueueItem;
        EdgeEffect edgeEffect2 = this.MediaBrowserCompatMediaItem;
        if (i2 <= 0 || BuildersKt.write(edgeEffect) == 0.0f) {
            if (i2 < 0 && BuildersKt.write(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(BuildersKt.write(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = currY;
            iArr = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            iArr[1] = 0;
            RemoteActionCompatParcelizer(iArr, 0, null, i2, 1);
            i = i2 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                fetchFocusPropertiesui.read(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                RemoteActionCompatParcelizer(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.RemoteActionCompatParcelizer.serializer(0, scrollY2, 0, i3, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                RemoteActionCompatParcelizer(1);
            }
            if (overScroller.isFinished()) {
                RemoteActionCompatParcelizer(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(BuildersKt.write(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = currY;
        iArr = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        iArr[1] = 0;
        RemoteActionCompatParcelizer(iArr, 0, null, i2, 1);
        i = i2 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            fetchFocusPropertiesui.read(this, Math.abs(overScroller.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            RemoteActionCompatParcelizer(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i4 = i - scrollY4;
            iArr[1] = 0;
            this.RemoteActionCompatParcelizer.serializer(0, scrollY4, 0, i4, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 1, iArr);
            i = i4 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            RemoteActionCompatParcelizer(1);
        }
        if (overScroller.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            RemoteActionCompatParcelizer(1);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.RemoteActionCompatParcelizer.serializer(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.RemoteActionCompatParcelizer.serializer(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.RemoteActionCompatParcelizer.serializer(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.ResultReceiver;
        return focusPropertiesImplonEnter1.RemoteActionCompatParcelizer | focusPropertiesImplonEnter1.serializer;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.RemoteActionCompatParcelizer.serializer;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.RemoteActionCompatParcelizer.serializer(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        read(null, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
            velocityTracker.recycle();
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.RemoteActionCompatParcelizer.write(z);
    }

    public final boolean write(int i, int i2, View view) {
        Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i >= getScrollY()) {
            return rect.top - i <= getScrollY() + i2;
        }
        return false;
    }

    public final boolean write(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.MediaSessionCompatQueueItem;
        if (BuildersKt.write(edgeEffect) != 0.0f) {
            BuildersKt.write(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.MediaBrowserCompatMediaItem;
        if (BuildersKt.write(edgeEffect2) == 0.0f) {
            return z;
        }
        BuildersKt.write(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.nestedScrollViewStyle);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new Rect();
        this.PlaybackStateCompatCustomAction = true;
        this.PlaybackStateCompat = false;
        this.MediaDescriptionCompat = null;
        this.ParcelableVolumeInfo = false;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = true;
        this.read = -1;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new int[2];
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new int[2];
        this.RatingCompat = new getEnterannotations(getContext(), new Extras$Key(7, this));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            edgeEffect = fetchCustomEnterOrExitULY8qGw.RemoteActionCompatParcelizer(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.MediaSessionCompatQueueItem = edgeEffect;
        if (i >= 31) {
            edgeEffect2 = fetchCustomEnterOrExitULY8qGw.RemoteActionCompatParcelizer(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.MediaBrowserCompatMediaItem = edgeEffect2;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(Fields.ColorFilter);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = viewConfiguration.getScaledTouchSlop();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ComponentActivity = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, write, com.logistics.rider.glovo.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.ResultReceiver = new FocusPropertiesImplonEnter1();
        this.RemoteActionCompatParcelizer = new FocusPropertiesonExit1(this);
        setNestedScrollingEnabled(true);
        FocusPropertiesNode.write(this, IconCompatParcelizer);
    }

    public static boolean read(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && read((View) parent, nestedScrollView);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.MediaSessionCompatQueueItem;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.MediaBrowserCompatMediaItem;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.MediaMetadataCompat && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i3 = (((measuredHeight2 - paddingTop) - paddingBottom) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < i3) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i4 = layoutParams.leftMargin;
                childAt.measure(ViewGroup.getChildMeasureSpec(i, paddingRight + paddingLeft + i4 + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !write(0, i4, viewFindFocus)) {
            return;
        }
        Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iWrite = write(rect);
        if (iWrite != 0) {
            if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                serializer(0, iWrite, false);
            } else {
                scrollBy(0, iWrite);
            }
        }
    }

    private FocusPropertiesKt getScrollFeedbackProvider() {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = FocusPropertiesKt.IconCompatParcelizer(this);
        }
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            z = true;
            i2 = 0;
        }
        if (i5 > i4) {
            i5 = i4;
            z2 = true;
        } else if (i5 < 0) {
            i4 = 0;
            i5 = i4;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.RemoteActionCompatParcelizer.read(1)) {
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.springBack(i2, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i5);
        return z || z2;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + paddingLeft, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        view.measure(ViewGroup.getChildMeasureSpec(i, paddingRight + paddingLeft + i5 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.PlaybackStateCompat = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.PlaybackStateCompatCustomAction = false;
        View view = this.MediaDescriptionCompat;
        if (view != null && read(view, this)) {
            View view2 = this.MediaDescriptionCompat;
            Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iWrite = write(rect);
            if (iWrite != 0) {
                scrollBy(0, iWrite);
            }
        }
        this.MediaDescriptionCompat = null;
        if (!this.PlaybackStateCompat) {
            if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null) {
                scrollTo(getScrollX(), this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.IconCompatParcelizer);
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.PlaybackStateCompat = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        read((int) f2);
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = savedState;
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fWrite;
        int iRound;
        int i;
        int iAbs;
        int i2;
        ViewParent parent2;
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.MediaSessionCompatQueueItem;
            EdgeEffect edgeEffect2 = this.MediaBrowserCompatMediaItem;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                velocityTracker.computeCurrentVelocity(1000, this.ComponentActivity);
                int yVelocity = (int) velocityTracker.getYVelocity(this.read);
                if (Math.abs(yVelocity) >= this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    if (BuildersKt.write(edgeEffect) != 0.0f) {
                        if (write(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            read(-yVelocity);
                        }
                    } else if (BuildersKt.write(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (write(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            read(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f2 = i4;
                        if (!this.RemoteActionCompatParcelizer.serializer(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            read(i4);
                        }
                    }
                } else if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.read = -1;
                this.ParcelableVolumeInfo = false;
                VelocityTracker velocityTracker2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                }
                RemoteActionCompatParcelizer(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.read);
                if (iFindPointerIndex == -1) {
                    SentryLogcatAdapter.serializer("NestedScrollView", "Invalid pointerId=" + this.read + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.MediaSessionCompatToken - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (BuildersKt.write(edgeEffect) != 0.0f) {
                        fWrite = -BuildersKt.write(edgeEffect, -height, x);
                        if (BuildersKt.write(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (BuildersKt.write(edgeEffect2) != 0.0f) {
                        fWrite = BuildersKt.write(edgeEffect2, height, 1.0f - x);
                        if (BuildersKt.write(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.ParcelableVolumeInfo) {
                            iAbs = Math.abs(i);
                            i2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                            if (iAbs > i2) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.ParcelableVolumeInfo = true;
                                if (i > 0) {
                                    i -= i2;
                                } else {
                                    i += i2;
                                }
                            }
                        }
                        if (this.ParcelableVolumeInfo) {
                            int iIconCompatParcelizer = IconCompatParcelizer(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.MediaSessionCompatToken = y - iIconCompatParcelizer;
                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus += iIconCompatParcelizer;
                        }
                    }
                    f = fWrite;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.ParcelableVolumeInfo) {
                        iAbs = Math.abs(i);
                        i2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                        if (iAbs > i2) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.ParcelableVolumeInfo = true;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                    }
                    if (this.ParcelableVolumeInfo) {
                        int iIconCompatParcelizer2 = IconCompatParcelizer(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.MediaSessionCompatToken = y - iIconCompatParcelizer2;
                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus += iIconCompatParcelizer2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.ParcelableVolumeInfo && getChildCount() > 0) {
                    if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.read = -1;
                this.ParcelableVolumeInfo = false;
                VelocityTracker velocityTracker3 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                }
                RemoteActionCompatParcelizer(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.MediaSessionCompatToken = (int) motionEvent.getY(actionIndex);
                this.read = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                read(motionEvent);
                this.MediaSessionCompatToken = (int) motionEvent.getY(motionEvent.findPointerIndex(this.read));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.ParcelableVolumeInfo && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                RemoteActionCompatParcelizer(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.MediaSessionCompatToken = y2;
            this.read = pointerId;
            IconCompatParcelizer(2, 0);
        }
        VelocityTracker velocityTracker4 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void read(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.read) {
            int i = actionIndex == 0 ? 1 : 0;
            this.MediaSessionCompatToken = (int) motionEvent.getY(i);
            this.read = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.PlaybackStateCompatCustomAction) {
            this.MediaDescriptionCompat = view2;
        } else {
            Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iWrite = write(rect);
            if (iWrite != 0) {
                scrollBy(0, iWrite);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iWrite = write(rect);
        boolean z2 = iWrite != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iWrite);
                return z2;
            }
            serializer(0, iWrite, false);
        }
        return z2;
    }

    public void setFillViewport(boolean z) {
        if (z != this.MediaMetadataCompat) {
            this.MediaMetadataCompat = z;
            requestLayout();
        }
    }

    public final boolean write(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fWrite = BuildersKt.write(edgeEffect);
        float height = getHeight();
        float fAbs = Math.abs(-i);
        float f = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d = serializer;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fWrite * height;
    }

    public final void read(int[] iArr, int i, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.RemoteActionCompatParcelizer.serializer(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean RemoteActionCompatParcelizer(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            IconCompatParcelizer(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || IconCompatParcelizer(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        RemoteActionCompatParcelizer(iArr, i, null, i2, 0);
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        read(null, i4, i5);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.IconCompatParcelizer = getScrollY();
        return savedState;
    }

    public final void read(int i) {
        if (getChildCount() > 0) {
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            IconCompatParcelizer(2, 1);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                fetchFocusPropertiesui.read(this, Math.abs(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        RemoteActionCompatParcelizer(0);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int height = childAt.getHeight();
        int i = layoutParams.topMargin;
        return Math.max(0, ((height + i) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // o.getScope
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        read(iArr, i4, i5);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public final void serializer(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.MediaSessionCompatResultReceiverWrapper > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i3 = layoutParams.topMargin;
            int i4 = layoutParams.bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i3) + i4) - ((height2 - paddingTop) - paddingBottom))));
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.startScroll(getScrollX(), scrollY, 0, iMax - scrollY, 250);
            if (z) {
                IconCompatParcelizer(2, 1);
            } else {
                RemoteActionCompatParcelizer(1);
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                RemoteActionCompatParcelizer(1);
            }
            scrollBy(i, i2);
        }
        this.MediaSessionCompatResultReceiverWrapper = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void IconCompatParcelizer(int i, int i2) {
        this.RemoteActionCompatParcelizer.serializer(2, i2);
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.ParcelableVolumeInfo) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!write(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.ParcelableVolumeInfo = z;
                    velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                    }
                } else {
                    this.MediaSessionCompatToken = y;
                    this.read = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    if (velocityTracker3 == null) {
                        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!write(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.ParcelableVolumeInfo = z;
                    IconCompatParcelizer(2, 0);
                }
            } else {
                if (!write(motionEvent)) {
                    z = false;
                }
                this.ParcelableVolumeInfo = z;
                velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
                }
            }
        } else if (i == 1) {
            this.ParcelableVolumeInfo = false;
            this.read = -1;
            velocityTracker2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
            }
            if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            RemoteActionCompatParcelizer(0);
        } else if (i == 2) {
            int i2 = this.read;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    SentryLogcatAdapter.serializer("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.MediaSessionCompatToken) > this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs && (2 & getNestedScrollAxes()) == 0) {
                        this.ParcelableVolumeInfo = true;
                        this.MediaSessionCompatToken = y2;
                        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
                            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = VelocityTracker.obtain();
                        }
                        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.addMovement(motionEvent);
                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.ParcelableVolumeInfo = false;
            this.read = -1;
            velocityTracker2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
            }
            if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            RemoteActionCompatParcelizer(0);
        } else if (i == 6) {
            read(motionEvent);
        }
        return this.ParcelableVolumeInfo;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public final int write(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean write(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !write(maxScrollAmount, getHeight(), viewFindNextFocus)) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int bottom = childAt.getBottom();
                int i2 = layoutParams.bottomMargin;
                int scrollY = getScrollY();
                maxScrollAmount = Math.min((bottom + i2) - ((getHeight() + scrollY) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            IconCompatParcelizer(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            IconCompatParcelizer(write(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || write(0, getHeight(), viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(Fields.RenderEffect);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean IconCompatParcelizer(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return RemoteActionCompatParcelizer(i, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this._init_lambda2 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this._init_lambda2 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this._init_lambda2;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.ParcelableVolumeInfo) {
            if (serializer.write(motionEvent, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (serializer.write(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                IconCompatParcelizer(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, serializer.write(motionEvent, 8194));
                if (i == 0) {
                    return true;
                }
                this.RatingCompat.serializer(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    public final void serializer(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        RemoteActionCompatParcelizer(i, i2, i3);
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        RemoteActionCompatParcelizer(iArr, i, null, i2, i3);
    }

    public final int IconCompatParcelizer(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            IconCompatParcelizer(2, i4);
        }
        boolean zSerializer = this.RemoteActionCompatParcelizer.serializer(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, 0, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, i, i4);
        int[] iArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int[] iArr2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (zSerializer) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z3 = RemoteActionCompatParcelizer(i5, 0, scrollY, scrollRange) && !this.RemoteActionCompatParcelizer.read(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().serializer(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.RemoteActionCompatParcelizer.serializer(0, scrollY2, 0, i5 - scrollY2, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, i4, iArr2);
        int i7 = iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.MediaBrowserCompatMediaItem;
        EdgeEffect edgeEffect2 = this.MediaSessionCompatQueueItem;
        if (i9 < 0) {
            if (z2) {
                BuildersKt.write(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().read(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z2) {
            BuildersKt.write(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().read(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z3 && i4 == 0 && (velocityTracker = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            RemoteActionCompatParcelizer(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6 + i7;
    }

    public final boolean RemoteActionCompatParcelizer(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        return this.RemoteActionCompatParcelizer.serializer(iArr, i, null, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (viewFindNextFocusFromRect != null && write(0, getHeight(), viewFindNextFocusFromRect)) {
            return viewFindNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ScrollView can host only one direct child");
        }
    }
}
