package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.ui.graphics.Fields;
import androidx.customview.view.AbsSavedState;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.DrawableTransformation;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.FocusRestorerNode;
import o.clearChildFocusdefault;
import o.fetchCustomEnteraToIllAui;
import o.getMinDimension;
import o.getTopCenterF1C5BW0;
import o.getTopLeftF1C5BW0;
import o.getTopRightF1C5BW0;
import o.getWidth;
import o.intersect;
import o.isEmpty;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final boolean IconCompatParcelizer;
    public static final int[] RemoteActionCompatParcelizer = {R.attr.colorPrimaryDark};
    public static final int[] read = {R.attr.layout_gravity};
    public final intersect ComponentActivity;
    public boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public Matrix MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public WindowInsets ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public float RatingCompat;
    public ArrayList ResultReceiver;
    public Drawable _init_lambda2;
    public final clearChildFocusdefault r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public getTopLeftF1C5BW0 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final ArrayList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final clearChildFocusdefault r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public float r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final Paint r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final intersect r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final MemoryCacheService serializer;
    public Rect write;

    public float getDrawerElevation() {
        return this.RatingCompat;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this._init_lambda2;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    public final boolean serializer(int i, View view) {
        return (MediaSessionCompatQueueItem(view) & i) == i;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new getWidth();
        public int MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public int RemoteActionCompatParcelizer;
        public int read;
        public int write;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.MediaDescriptionCompat);
            parcel.writeInt(this.write);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.MediaMetadataCompat);
            parcel.writeInt(this.read);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.MediaDescriptionCompat = 0;
            this.MediaDescriptionCompat = parcel.readInt();
            this.write = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt();
            this.MediaMetadataCompat = parcel.readInt();
            this.read = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.MediaDescriptionCompat = 0;
        }
    }

    public final void MediaBrowserCompatMediaItem(View view) {
        FocusRestorerNode focusRestorerNode = FocusRestorerNode.MediaBrowserCompatMediaItem;
        FocusPropertiesNode.write(focusRestorerNode.read(), view);
        if (!IconCompatParcelizer(view) || read(view) == 2) {
            return;
        }
        FocusPropertiesNode.read(view, focusRestorerNode, this.serializer);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.ParcelableVolumeInfo != null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                isEmpty isempty = (isEmpty) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(isempty.IconCompatParcelizer, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    WindowInsets windowInsetsReplaceSystemWindowInsets = this.ParcelableVolumeInfo;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) isempty).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) isempty).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) isempty).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) isempty).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (write(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) isempty).leftMargin) - ((ViewGroup.MarginLayoutParams) isempty).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) isempty).topMargin) - ((ViewGroup.MarginLayoutParams) isempty).bottomMargin, 1073741824));
                } else {
                    if (!RemoteActionCompatParcelizer(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float elevation = childAt.getElevation();
                    float f = this.RatingCompat;
                    if (elevation != f) {
                        childAt.setElevation(f);
                    }
                    int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(childAt) & 7;
                    boolean z4 = iMediaSessionCompatQueueItem == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Child drawer has absolute gravity ", write(iMediaSessionCompatQueueItem), " but this DrawerLayout already has a drawer view along that edge");
                        return;
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + ((ViewGroup.MarginLayoutParams) isempty).leftMargin + ((ViewGroup.MarginLayoutParams) isempty).rightMargin, ((ViewGroup.MarginLayoutParams) isempty).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) isempty).topMargin + ((ViewGroup.MarginLayoutParams) isempty).bottomMargin, ((ViewGroup.MarginLayoutParams) isempty).height));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        clearChildFocusdefault clearchildfocusdefault = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        clearchildfocusdefault.serializer(motionEvent);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.MediaSessionCompatResultReceiverWrapper = x;
            this.PlaybackStateCompat = y;
            this.MediaBrowserCompatMediaItem = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            IconCompatParcelizer(true);
            this.MediaBrowserCompatMediaItem = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewWrite = clearchildfocusdefault.write((int) x2, (int) y2);
        if (viewWrite != null && write(viewWrite)) {
            float f = x2 - this.MediaSessionCompatResultReceiverWrapper;
            float f2 = y2 - this.PlaybackStateCompat;
            int i = clearchildfocusdefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if ((f2 * f2) + (f * f) < i * i) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i2);
                    if ((((isEmpty) childAt.getLayoutParams()).RemoteActionCompatParcelizer & 1) == 1) {
                        break;
                    }
                    i2++;
                }
                z = childAt == null || read(childAt) == 2;
            }
        }
        IconCompatParcelizer(z);
        return true;
    }

    public final View read(int i) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((MediaSessionCompatQueueItem(childAt) & 7) == (absoluteGravity & 7)) {
                return childAt;
            }
        }
        return null;
    }

    public final void setDrawerLockMode(int i, int i2) {
        View view;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i;
        } else if (i2 == 5) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i;
        } else if (i2 == 8388611) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
        } else if (i2 == 8388613) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).serializer();
        }
        if (i != 1) {
            if (i == 2 && (view = read(absoluteGravity)) != null) {
                RatingCompat(view);
                return;
            }
            return;
        }
        View view2 = read(absoluteGravity);
        if (view2 != null) {
            serializer(view2);
        }
    }

    public void setScrimColor(int i) {
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this._init_lambda2 = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this._init_lambda2 = new ColorDrawable(i);
        invalidate();
    }

    static {
        IconCompatParcelizer = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.drawerLayoutStyle);
        new fetchCustomEnteraToIllAui(1);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = -1728053248;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new Paint();
        this.MediaSessionCompatToken = true;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 3;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 3;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 3;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 3;
        this.serializer = new MemoryCacheService(this);
        setDescendantFocusability(Fields.ColorFilter);
        float f = getResources().getDisplayMetrics().density;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        intersect intersectVar = new intersect(this, 3);
        this.ComponentActivity = intersectVar;
        intersect intersectVar2 = new intersect(this, 5);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = intersectVar2;
        clearChildFocusdefault clearchildfocusdefault = new clearChildFocusdefault(getContext(), this, intersectVar);
        clearchildfocusdefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (int) (clearchildfocusdefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss * 1.0f);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = clearchildfocusdefault;
        clearchildfocusdefault.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 1;
        clearchildfocusdefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = f2;
        intersectVar.write = clearchildfocusdefault;
        clearChildFocusdefault clearchildfocusdefault2 = new clearChildFocusdefault(getContext(), this, intersectVar2);
        clearchildfocusdefault2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (int) (clearchildfocusdefault2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss * 1.0f);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = clearchildfocusdefault2;
        clearchildfocusdefault2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 2;
        clearchildfocusdefault2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = f2;
        intersectVar2.write = clearchildfocusdefault2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setImportantForAccessibility(1);
        FocusPropertiesNode.write(this, new getTopRightF1C5BW0(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new getMinDimension());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(RemoteActionCompatParcelizer);
            try {
                this._init_lambda2 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, getTopCenterF1C5BW0.DrawerLayout, com.logistics.rider.glovo.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.RatingCompat = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.RatingCompat = getResources().getDimension(com.logistics.rider.glovo.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((isEmpty) childAt.getLayoutParams()).RemoteActionCompatParcelizer & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || RemoteActionCompatParcelizer(view)) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            view.setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        isEmpty isempty = new isEmpty(-1, -1);
        isempty.IconCompatParcelizer = 0;
        return isempty;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.MediaSessionCompatQueueItem || this._init_lambda2 == null) {
            return;
        }
        WindowInsets windowInsets = this.ParcelableVolumeInfo;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this._init_lambda2.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this._init_lambda2.draw(canvas);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && write() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewWrite = write();
            if (viewWrite != null && read(viewWrite) == 0) {
                IconCompatParcelizer(false);
            }
            return viewWrite != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.PlaybackStateCompatCustomAction = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                isEmpty isempty = (isEmpty) childAt.getLayoutParams();
                if (write(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) isempty).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) isempty).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) isempty).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (serializer(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (isempty.read * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (isempty.read * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != isempty.read;
                    int i10 = isempty.IconCompatParcelizer & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) isempty).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i11 - ((ViewGroup.MarginLayoutParams) isempty).bottomMargin;
                            if (i12 + measuredHeight > i14) {
                                i12 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) isempty).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) isempty).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) isempty).bottomMargin);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    int i17 = isempty.read > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
        }
        if (IconCompatParcelizer && (rootWindowInsets = getRootWindowInsets()) != null) {
            setRight systemGestureInsets = FocusRequesterModifierKt.write(null, rootWindowInsets).IconCompatParcelizer.getSystemGestureInsets();
            clearChildFocusdefault clearchildfocusdefault = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            clearchildfocusdefault.RatingCompat = Math.max(clearchildfocusdefault.write, systemGestureInsets.RemoteActionCompatParcelizer);
            clearChildFocusdefault clearchildfocusdefault2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            clearchildfocusdefault2.RatingCompat = Math.max(clearchildfocusdefault2.write, systemGestureInsets.read);
        }
        this.PlaybackStateCompatCustomAction = false;
        this.MediaSessionCompatToken = false;
    }

    public void setDrawerElevation(float f) {
        this.RatingCompat = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (RemoteActionCompatParcelizer(childAt)) {
                float f2 = this.RatingCompat;
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                childAt.setElevation(f2);
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(View view) {
        int i = ((isEmpty) view.getLayoutParams()).IconCompatParcelizer;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean write(View view) {
        return ((isEmpty) view.getLayoutParams()).IconCompatParcelizer == 0;
    }

    public final int MediaSessionCompatQueueItem(View view) {
        int i = ((isEmpty) view.getLayoutParams()).IconCompatParcelizer;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof isEmpty) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zWrite = write(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zWrite) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && RemoteActionCompatParcelizer(childAt) && childAt.getHeight() >= height) {
                    if (serializer(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (f > 0.0f && zWrite) {
            int i4 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            Paint paint = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaSessionCompatToken = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.MediaSessionCompatToken = true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewWrite;
        int actionMasked = motionEvent.getActionMasked();
        clearChildFocusdefault clearchildfocusdefault = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        boolean z2 = clearchildfocusdefault.read(motionEvent);
        boolean z3 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                IconCompatParcelizer(true);
                this.MediaBrowserCompatMediaItem = false;
            } else if (actionMasked == 2) {
                int length = clearchildfocusdefault.ParcelableVolumeInfo.length;
                for (int i = 0; i < length; i++) {
                    if ((clearchildfocusdefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY & (1 << i)) != 0) {
                        float f = clearchildfocusdefault.MediaSessionCompatToken[i] - clearchildfocusdefault.ParcelableVolumeInfo[i];
                        float f2 = clearchildfocusdefault.MediaSessionCompatResultReceiverWrapper[i] - clearchildfocusdefault.PlaybackStateCompatCustomAction[i];
                        int i2 = clearchildfocusdefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                        if ((f2 * f2) + (f * f) > i2 * i2) {
                            intersect intersectVar = this.ComponentActivity;
                            intersectVar.serializer.removeCallbacks(intersectVar.RemoteActionCompatParcelizer);
                            intersect intersectVar2 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                            intersectVar2.serializer.removeCallbacks(intersectVar2.RemoteActionCompatParcelizer);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                IconCompatParcelizer(true);
                this.MediaBrowserCompatMediaItem = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.MediaSessionCompatResultReceiverWrapper = x;
            this.PlaybackStateCompat = y;
            z = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 > 0.0f && (viewWrite = clearchildfocusdefault.write((int) x, (int) y)) != null && write(viewWrite);
            this.MediaBrowserCompatMediaItem = false;
        }
        if (!(z2 | z3) && !z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (!((isEmpty) getChildAt(i3).getLayoutParams()).serializer) {
                }
            }
            if (!this.MediaBrowserCompatMediaItem) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View view;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.write());
        int i = savedState.MediaDescriptionCompat;
        if (i != 0 && (view = read(i)) != null) {
            RatingCompat(view);
        }
        int i2 = savedState.write;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.RemoteActionCompatParcelizer;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.MediaMetadataCompat;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.read;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.PlaybackStateCompatCustomAction) {
            return;
        }
        super.requestLayout();
    }

    @Deprecated
    public void setDrawerListener(getTopLeftF1C5BW0 gettopleftf1c5bw0) {
        ArrayList arrayList;
        getTopLeftF1C5BW0 gettopleftf1c5bw1 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (gettopleftf1c5bw1 != null && (arrayList = this.ResultReceiver) != null) {
            arrayList.remove(gettopleftf1c5bw1);
        }
        if (gettopleftf1c5bw0 != null) {
            if (this.ResultReceiver == null) {
                this.ResultReceiver = new ArrayList();
            }
            this.ResultReceiver.add(gettopleftf1c5bw0);
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = gettopleftf1c5bw0;
    }

    public final void setDrawerViewOffset(View view, float f) {
        isEmpty isempty = (isEmpty) view.getLayoutParams();
        if (f == isempty.read) {
            return;
        }
        isempty.read = f;
        ArrayList arrayList = this.ResultReceiver;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((getTopLeftF1C5BW0) this.ResultReceiver.get(size)).getClass();
            }
        }
    }

    public final void RatingCompat(View view) {
        if (!RemoteActionCompatParcelizer(view)) {
            DrawableTransformation.IconCompatParcelizer("View ", view, " is not a sliding drawer");
            return;
        }
        isEmpty isempty = (isEmpty) view.getLayoutParams();
        if (this.MediaSessionCompatToken) {
            isempty.read = 1.0f;
            isempty.RemoteActionCompatParcelizer = 1;
            read(view, true);
            MediaBrowserCompatMediaItem(view);
        } else {
            isempty.RemoteActionCompatParcelizer |= 2;
            if (serializer(3, view)) {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(0, view.getTop(), view);
            } else {
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read(getWidth() - view.getWidth(), view.getTop(), view);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            isEmpty isempty = (isEmpty) getChildAt(i).getLayoutParams();
            int i2 = isempty.RemoteActionCompatParcelizer;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.MediaDescriptionCompat = isempty.IconCompatParcelizer;
                break;
            }
        }
        savedState.write = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        savedState.RemoteActionCompatParcelizer = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        savedState.MediaMetadataCompat = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        savedState.read = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            IconCompatParcelizer(true);
        }
    }

    public final void serializer(View view) {
        if (!RemoteActionCompatParcelizer(view)) {
            DrawableTransformation.IconCompatParcelizer("View ", view, " is not a sliding drawer");
            return;
        }
        isEmpty isempty = (isEmpty) view.getLayoutParams();
        if (this.MediaSessionCompatToken) {
            isempty.read = 0.0f;
            isempty.RemoteActionCompatParcelizer = 0;
        } else {
            isempty.RemoteActionCompatParcelizer |= 4;
            if (serializer(3, view)) {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(-view.getWidth(), view.getTop(), view);
            } else {
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read(getWidth(), view.getTop(), view);
            }
        }
        invalidate();
    }

    public static boolean IconCompatParcelizer(View view) {
        if (RemoteActionCompatParcelizer(view)) {
            return (((isEmpty) view.getLayoutParams()).RemoteActionCompatParcelizer & 1) == 1;
        }
        DrawableTransformation.IconCompatParcelizer("View ", view, " is not a drawer");
        return false;
    }

    public static String write(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof isEmpty) {
            isEmpty isempty = (isEmpty) layoutParams;
            isEmpty isempty2 = new isEmpty((ViewGroup.MarginLayoutParams) isempty);
            isempty2.IconCompatParcelizer = 0;
            isempty2.IconCompatParcelizer = isempty.IconCompatParcelizer;
            return isempty2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            isEmpty isempty3 = new isEmpty((ViewGroup.MarginLayoutParams) layoutParams);
            isempty3.IconCompatParcelizer = 0;
            return isempty3;
        }
        isEmpty isempty4 = new isEmpty(layoutParams);
        isempty4.IconCompatParcelizer = 0;
        return isempty4;
    }

    public final int read(View view) {
        if (!RemoteActionCompatParcelizer(view)) {
            DrawableTransformation.IconCompatParcelizer("View ", view, " is not a drawer");
            return 0;
        }
        int i = ((isEmpty) view.getLayoutParams()).IconCompatParcelizer;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM : this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 : this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 : this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final void read(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || RemoteActionCompatParcelizer(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((isEmpty) getChildAt(i).getLayoutParams()).read);
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = fMax;
        boolean zWrite = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
        boolean zWrite2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write();
        if (zWrite || zWrite2) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            View childAt = getChildAt(childCount);
            if (this.write == null) {
                this.write = new Rect();
            }
            childAt.getHitRect(this.write);
            if (this.write.contains((int) x, (int) y) && !write(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.MediaMetadataCompat == null) {
                            this.MediaMetadataCompat = new Matrix();
                        }
                        matrix.invert(this.MediaMetadataCompat);
                        motionEventObtain.transform(this.MediaMetadataCompat);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
    }

    public final View write() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (RemoteActionCompatParcelizer(childAt)) {
                if (!RemoteActionCompatParcelizer(childAt)) {
                    DrawableTransformation.IconCompatParcelizer("View ", childAt, " is not a drawer");
                    return null;
                }
                if (((isEmpty) childAt.getLayoutParams()).read > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final void IconCompatParcelizer(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            isEmpty isempty = (isEmpty) childAt.getLayoutParams();
            if (RemoteActionCompatParcelizer(childAt) && (!z || isempty.serializer)) {
                z2 |= serializer(3, childAt) ? this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(-childAt.getWidth(), childAt.getTop(), childAt) : this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read(getWidth(), childAt.getTop(), childAt);
                isempty.serializer = false;
            }
        }
        intersect intersectVar = this.ComponentActivity;
        intersectVar.serializer.removeCallbacks(intersectVar.RemoteActionCompatParcelizer);
        intersect intersectVar2 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        intersectVar2.serializer.removeCallbacks(intersectVar2.RemoteActionCompatParcelizer);
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!RemoteActionCompatParcelizer(childAt)) {
                arrayList2.add(childAt);
            } else if (IconCompatParcelizer(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this._init_lambda2 = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        isEmpty isempty = new isEmpty(context, attributeSet);
        isempty.IconCompatParcelizer = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, read);
        isempty.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return isempty;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }
}
