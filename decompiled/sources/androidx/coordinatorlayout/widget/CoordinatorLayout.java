package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PendingValue;
import androidx.customview.view.AbsSavedState;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o.CancelIndicatingFocusBoundaryScope;
import o.CustomDestinationResult;
import o.DrawableTransformation;
import o.FocusChangedElement;
import o.FocusChangedModifierKt;
import o.FocusChangedNode;
import o.FocusOwnerImplfocusSearch1;
import o.FocusPropertiesImplonEnter1;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.accessgetCancelcp;
import o.cancelFocusChange;
import o.dispatchKeyEventYhN2O0wdefault;
import o.getRequestedFocusDirectiondhqQ8s;
import o.getScope;
import o.processDragGesture;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setRootFocusNodeui;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements getScope {
    public static final Class[] IconCompatParcelizer;
    public static final FocusChangedElement RemoteActionCompatParcelizer;
    public static final FocusOwnerImplfocusSearch1 read;
    public static final ThreadLocal serializer;
    public static final String write;
    public final int[] ComponentActivity;
    public final int[] MediaBrowserCompatMediaItem;
    public final ArrayList MediaDescriptionCompat;
    public View MediaMetadataCompat;
    public PendingValue MediaSessionCompatQueueItem;
    public final int[] MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public FocusRequesterModifierKt PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final ImageLoader$Builder RatingCompat;
    public boolean ResultReceiver;
    public View r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final FocusPropertiesImplonEnter1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public ViewGroup.OnHierarchyChangeListener r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public Paint r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final ArrayList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public Drawable r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final ArrayList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public CustomDestinationResult r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    public abstract class Behavior {
        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            return getScrimOpacity(coordinatorLayout, view) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public FocusRequesterModifierKt onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, FocusRequesterModifierKt focusRequesterModifierKt) {
            return focusRequesterModifierKt;
        }

        public void onAttachedToLayoutParams(LayoutParams layoutParams) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, view, view2, view3, i);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, view, view2);
            }
        }

        public static Object getTag(View view) {
            return ((LayoutParams) view.getLayoutParams()).MediaSessionCompatToken;
        }

        public static void setTag(View view, Object obj) {
            ((LayoutParams) view.getLayoutParams()).MediaSessionCompatToken = obj;
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface RemoteActionCompatParcelizer {
        Class serializer();
    }

    public final FocusRequesterModifierKt getLastWindowInsets() {
        return this.PlaybackStateCompat;
    }

    public Drawable getStatusBarBackground() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior behavior;
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i2 == 1) {
            focusPropertiesImplonEnter1.RemoteActionCompatParcelizer = i;
        } else {
            focusPropertiesImplonEnter1.serializer = i;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.IconCompatParcelizer(i2) && (behavior = layoutParams.MediaDescriptionCompat) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onHierarchyChangeListener;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new FocusChangedNode();
        public SparseArray read;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.read = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.read.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.read;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.read.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.read.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        write = r0 != null ? r0.getName() : null;
        RemoteActionCompatParcelizer = new FocusChangedElement(0);
        IconCompatParcelizer = new Class[]{Context.class, AttributeSet.class};
        serializer = new ThreadLocal();
        read = new FocusOwnerImplfocusSearch1(12);
    }

    public static Rect RemoteActionCompatParcelizer() {
        Rect rect = (Rect) read.write();
        return rect == null ? new Rect() : rect;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void IconCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.IconCompatParcelizer():void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return focusPropertiesImplonEnter1.RemoteActionCompatParcelizer | focusPropertiesImplonEnter1.serializer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.MediaDescriptionCompat;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).MediaDescriptionCompat) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                RemoteActionCompatParcelizer(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int iMax;
        IconCompatParcelizer();
        int childCount = getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i12);
            processDragGesture processdraggesture = (processDragGesture) this.RatingCompat.IconCompatParcelizer;
            int i13 = processdraggesture.MediaMetadataCompat;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) processdraggesture.write(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != this.ResultReceiver) {
            boolean z3 = this.MediaSessionCompatToken;
            if (z) {
                if (z3) {
                    if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new CustomDestinationResult(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                }
                this.ResultReceiver = true;
            } else {
                if (z3 && this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                }
                this.ResultReceiver = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int layoutDirection = getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z5 = this.PlaybackStateCompat != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.MediaDescriptionCompat;
        int size3 = arrayList3.size();
        int i15 = suggestedMinimumWidth;
        int i16 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i17 = 0;
        while (i17 < size3) {
            View view = (View) arrayList3.get(i17);
            int i18 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i10 = size3;
                arrayList = arrayList3;
                i11 = mode2;
                iCombineMeasuredStates = i18;
                z2 = false;
                i7 = i17;
            } else {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                int i19 = layoutParams.write;
                if (i19 < 0 || mode == 0) {
                    i3 = i17;
                    i4 = i16;
                } else {
                    int iIconCompatParcelizer = IconCompatParcelizer(i19);
                    i3 = i17;
                    int i20 = layoutParams.IconCompatParcelizer;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i4 = i16;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iIconCompatParcelizer - paddingLeft);
                        }
                        if (z5 || view.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int i21 = this.PlaybackStateCompat.read();
                            int iSerializer = this.PlaybackStateCompat.serializer();
                            int iRemoteActionCompatParcelizer = this.PlaybackStateCompat.RemoteActionCompatParcelizer();
                            int iWrite = this.PlaybackStateCompat.write();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (iSerializer + i21), mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - (iWrite + iRemoteActionCompatParcelizer), mode2);
                        }
                        behavior = layoutParams.MediaDescriptionCompat;
                        if (behavior != null) {
                            i7 = i3;
                            i8 = i4;
                            z2 = false;
                            i6 = i18;
                            i9 = i15;
                            i10 = size3;
                            arrayList = arrayList3;
                            i11 = mode2;
                            if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0)) {
                            }
                            int iMax2 = Math.max(i9, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                            int iMax3 = Math.max(i8, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            i15 = iMax2;
                            iCombineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                            i16 = iMax3;
                        } else {
                            arrayList = arrayList3;
                            i6 = i18;
                            i7 = i3;
                            i8 = i4;
                            i9 = i15;
                            z2 = false;
                            i10 = size3;
                            i11 = mode2;
                        }
                        measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                        int iMax4 = Math.max(i9, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int iMax5 = Math.max(i8, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        i15 = iMax4;
                        iCombineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                        i16 = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iIconCompatParcelizer);
                    }
                    i5 = iMax;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    behavior = layoutParams.MediaDescriptionCompat;
                    if (behavior != null) {
                        i7 = i3;
                        i8 = i4;
                        z2 = false;
                        i6 = i18;
                        i9 = i15;
                        i10 = size3;
                        arrayList = arrayList3;
                        i11 = mode2;
                        if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0)) {
                        }
                        int iMax6 = Math.max(i9, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int iMax7 = Math.max(i8, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        i15 = iMax6;
                        iCombineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                        i16 = iMax7;
                    } else {
                        arrayList = arrayList3;
                        i6 = i18;
                        i7 = i3;
                        i8 = i4;
                        i9 = i15;
                        z2 = false;
                        i10 = size3;
                        i11 = mode2;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                    int iMax8 = Math.max(i9, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax9 = Math.max(i8, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    i15 = iMax8;
                    iCombineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                    i16 = iMax9;
                }
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                behavior = layoutParams.MediaDescriptionCompat;
                if (behavior != null) {
                    i7 = i3;
                    i8 = i4;
                    z2 = false;
                    i6 = i18;
                    i9 = i15;
                    i10 = size3;
                    arrayList = arrayList3;
                    i11 = mode2;
                    if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0)) {
                    }
                    int iMax10 = Math.max(i9, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax11 = Math.max(i8, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    i15 = iMax10;
                    iCombineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                    i16 = iMax11;
                } else {
                    arrayList = arrayList3;
                    i6 = i18;
                    i7 = i3;
                    i8 = i4;
                    i9 = i15;
                    z2 = false;
                    i10 = size3;
                    i11 = mode2;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                int iMax12 = Math.max(i9, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                int iMax13 = Math.max(i8, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                i15 = iMax12;
                iCombineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                i16 = iMax13;
            }
            i17 = i7 + 1;
            size3 = i10;
            arrayList3 = arrayList;
            mode2 = i11;
        }
        int i22 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i15, i, (-16777216) & i22), View.resolveSizeAndState(i16, i2, i22 << 16));
    }

    @Override // o.getScope
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.IconCompatParcelizer(i5) && (behavior = layoutParams.MediaDescriptionCompat) != null) {
                    int[] iArr2 = this.MediaBrowserCompatMediaItem;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, iArr2[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, iArr2[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            RemoteActionCompatParcelizer(1);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).MediaDescriptionCompat;
            if (id != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.read = sparseArray;
        return savedState;
    }

    public final ArrayList read(View view) {
        processDragGesture processdraggesture = (processDragGesture) this.RatingCompat.IconCompatParcelizer;
        int i = processdraggesture.MediaMetadataCompat;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) processdraggesture.write(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(processdraggesture.IconCompatParcelizer(i2));
            }
        }
        ArrayList arrayList3 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    public final void setupForInsets() {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (!getFitsSystemWindows()) {
            accessgetCancelcp.write(this, null);
            return;
        }
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = new PendingValue(23, this);
        }
        accessgetCancelcp.write(this, this.MediaSessionCompatQueueItem);
        setSystemUiVisibility(1280);
    }

    public final void write(View view, Rect rect) {
        ThreadLocal threadLocal = FocusChangedModifierKt.serializer;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = FocusChangedModifierKt.serializer;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        FocusChangedModifierKt.write(this, view, matrix);
        ThreadLocal threadLocal3 = FocusChangedModifierKt.read;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean write(int i, int i2, View view) {
        FocusOwnerImplfocusSearch1 focusOwnerImplfocusSearch1 = read;
        Rect rectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        write(view, rectRemoteActionCompatParcelizer);
        try {
            return rectRemoteActionCompatParcelizer.contains(i, i2);
        } finally {
            rectRemoteActionCompatParcelizer.setEmpty();
            focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer);
        }
    }

    public final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int ComponentActivity;
        public final int IconCompatParcelizer;
        public View MediaBrowserCompatMediaItem;
        public Behavior MediaDescriptionCompat;
        public final int MediaMetadataCompat;
        public View MediaSessionCompatQueueItem;
        public boolean MediaSessionCompatResultReceiverWrapper;
        public Object MediaSessionCompatToken;
        public boolean ParcelableVolumeInfo;
        public boolean PlaybackStateCompat;
        public boolean PlaybackStateCompatCustomAction;
        public boolean RatingCompat;
        public int RemoteActionCompatParcelizer;
        public int ResultReceiver;
        public final Rect r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        public final int read;
        public int serializer;
        public final int write;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.RatingCompat = false;
            this.IconCompatParcelizer = 0;
            this.read = 0;
            this.write = -1;
            this.MediaMetadataCompat = -1;
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = 0;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CancelIndicatingFocusBoundaryScope.CoordinatorLayout_Layout);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.read = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.write = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.serializer = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.RatingCompat = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.write;
                Behavior behavior = null;
                if (!TextUtils.isEmpty(string)) {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.write;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal threadLocal = CoordinatorLayout.serializer;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.IconCompatParcelizer);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behavior = (Behavior) constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Could not inflate Behavior subclass ".concat(string), e);
                        throw null;
                    }
                }
                this.MediaDescriptionCompat = behavior;
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior2 = this.MediaDescriptionCompat;
            if (behavior2 != null) {
                behavior2.onAttachedToLayoutParams(this);
            }
        }

        public final void read(Behavior behavior) {
            Behavior behavior2 = this.MediaDescriptionCompat;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.MediaDescriptionCompat = behavior;
                this.MediaSessionCompatToken = null;
                this.RatingCompat = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public final boolean IconCompatParcelizer(int i) {
            if (i == 0) {
                return this.ParcelableVolumeInfo;
            }
            if (i != 1) {
                return false;
            }
            return this.PlaybackStateCompatCustomAction;
        }

        public LayoutParams() {
            super(-2, -2);
            this.RatingCompat = false;
            this.IconCompatParcelizer = 0;
            this.read = 0;
            this.write = -1;
            this.MediaMetadataCompat = -1;
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = 0;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new Rect();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.RatingCompat = false;
            this.IconCompatParcelizer = 0;
            this.read = 0;
            this.write = -1;
            this.MediaMetadataCompat = -1;
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = 0;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.RatingCompat = false;
            this.IconCompatParcelizer = 0;
            this.read = 0;
            this.write = -1;
            this.MediaMetadataCompat = -1;
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = 0;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.RatingCompat = false;
            this.IconCompatParcelizer = 0;
            this.read = 0;
            this.write = -1;
            this.MediaMetadataCompat = -1;
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = 0;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new Rect();
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.MediaDescriptionCompat = new ArrayList();
        this.RatingCompat = new ImageLoader$Builder(2);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ArrayList();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new ArrayList();
        this.MediaBrowserCompatMediaItem = new int[2];
        this.ComponentActivity = new int[2];
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new FocusPropertiesImplonEnter1();
        int[] iArr = CancelIndicatingFocusBoundaryScope.CoordinatorLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.MediaSessionCompatResultReceiverWrapper = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.MediaSessionCompatResultReceiverWrapper;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new getRequestedFocusDirectiondhqQ8s(this));
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final int IconCompatParcelizer(int i) {
        int[] iArr = this.MediaSessionCompatResultReceiverWrapper;
        if (iArr == null) {
            SentryLogcatAdapter.serializer("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        SentryLogcatAdapter.serializer("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final List<View> getDependencySortedChildren() {
        IconCompatParcelizer();
        return Collections.unmodifiableList(this.MediaDescriptionCompat);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.ParcelableVolumeInfo || this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
            return;
        }
        FocusRequesterModifierKt focusRequesterModifierKt = this.PlaybackStateCompat;
        int iRemoteActionCompatParcelizer = focusRequesterModifierKt != null ? focusRequesterModifierKt.RemoteActionCompatParcelizer() : 0;
        if (iRemoteActionCompatParcelizer > 0) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setBounds(0, 0, getWidth(), iRemoteActionCompatParcelizer);
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    public static void setInsetOffsetX(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.ResultReceiver;
        if (i2 != i) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.offsetLeftAndRight(i - i2);
            layoutParams.ResultReceiver = i;
        }
    }

    public static void setInsetOffsetY(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.ComponentActivity;
        if (i2 != i) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.offsetTopAndBottom(i - i2);
            layoutParams.ComponentActivity = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LayoutParams write(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.RatingCompat) {
            if (view instanceof cancelFocusChange) {
                Behavior behavior = ((cancelFocusChange) view).getBehavior();
                if (behavior == null) {
                    SentryLogcatAdapter.serializer("CoordinatorLayout", "Attached behavior class is null");
                }
                layoutParams.read(behavior);
                layoutParams.RatingCompat = true;
                return layoutParams;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) superclass.getAnnotation(RemoteActionCompatParcelizer.class);
                if (remoteActionCompatParcelizer != null) {
                    break;
                }
            }
            if (remoteActionCompatParcelizer != null) {
                try {
                    layoutParams.read((Behavior) remoteActionCompatParcelizer.serializer().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    SentryLogcatAdapter.read("CoordinatorLayout", "Default behavior class " + remoteActionCompatParcelizer.serializer().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            layoutParams.RatingCompat = true;
        }
        return layoutParams;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:88:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0228  */
    /* JADX WARN: Code duplicated, block: B:95:0x0243  */
    public final void RemoteActionCompatParcelizer(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zOnDependentViewChanged;
        boolean z;
        boolean z2;
        View view;
        FocusOwnerImplfocusSearch1 focusOwnerImplfocusSearch1;
        Behavior behavior;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.MediaDescriptionCompat;
        int size = arrayList2.size();
        Rect rectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        Rect rectRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        Rect rectRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
        int i4 = 0;
        while (true) {
            FocusOwnerImplfocusSearch1 focusOwnerImplfocusSearch2 = read;
            if (i4 < size) {
                View view2 = (View) arrayList2.get(i4);
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                if (i != 0 || view2.getVisibility() != 8) {
                    int i5 = 0;
                    while (i5 < i4) {
                        if (layoutParams.MediaSessionCompatQueueItem == ((View) arrayList2.get(i5))) {
                            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                            if (layoutParams2.MediaBrowserCompatMediaItem != null) {
                                Rect rectRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer();
                                Rect rectRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer();
                                Rect rectRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer();
                                write(layoutParams2.MediaBrowserCompatMediaItem, rectRemoteActionCompatParcelizer4);
                                IconCompatParcelizer(view2, rectRemoteActionCompatParcelizer5, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                int measuredHeight = view2.getMeasuredHeight();
                                view = view2;
                                focusOwnerImplfocusSearch1 = focusOwnerImplfocusSearch2;
                                IconCompatParcelizer(layoutDirection, rectRemoteActionCompatParcelizer4, rectRemoteActionCompatParcelizer6, layoutParams2, measuredWidth, measuredHeight);
                                boolean z3 = (rectRemoteActionCompatParcelizer6.left == rectRemoteActionCompatParcelizer5.left && rectRemoteActionCompatParcelizer6.top == rectRemoteActionCompatParcelizer5.top) ? false : true;
                                read(r16, rectRemoteActionCompatParcelizer6, measuredWidth, measuredHeight);
                                int i6 = rectRemoteActionCompatParcelizer6.left - rectRemoteActionCompatParcelizer5.left;
                                int i7 = rectRemoteActionCompatParcelizer6.top - rectRemoteActionCompatParcelizer5.top;
                                if (i6 != 0) {
                                    WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                                    view.offsetLeftAndRight(i6);
                                }
                                if (i7 != 0) {
                                    WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
                                    view.offsetTopAndBottom(i7);
                                }
                                if (z3 && (behavior = r16.MediaDescriptionCompat) != null) {
                                    behavior.onDependentViewChanged(this, view, layoutParams2.MediaBrowserCompatMediaItem);
                                }
                                rectRemoteActionCompatParcelizer4.setEmpty();
                                focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer4);
                                rectRemoteActionCompatParcelizer5.setEmpty();
                                focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer5);
                                rectRemoteActionCompatParcelizer6.setEmpty();
                                focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer6);
                            } else {
                                view = view2;
                                focusOwnerImplfocusSearch1 = focusOwnerImplfocusSearch2;
                            }
                        } else {
                            view = view2;
                            focusOwnerImplfocusSearch1 = focusOwnerImplfocusSearch2;
                        }
                        i5++;
                        focusOwnerImplfocusSearch2 = focusOwnerImplfocusSearch1;
                        view2 = view;
                        arrayList2 = arrayList2;
                        size = size;
                        i4 = i4;
                        layoutParams = layoutParams;
                        rectRemoteActionCompatParcelizer3 = rectRemoteActionCompatParcelizer3;
                    }
                    LayoutParams layoutParams3 = layoutParams;
                    ArrayList arrayList3 = arrayList2;
                    int i8 = size;
                    Rect rect2 = rectRemoteActionCompatParcelizer3;
                    i2 = i4;
                    View view3 = view2;
                    setRootFocusNodeui setrootfocusnodeui = focusOwnerImplfocusSearch2;
                    IconCompatParcelizer(view3, rectRemoteActionCompatParcelizer2, true);
                    if (layoutParams3.RemoteActionCompatParcelizer != 0 && !rectRemoteActionCompatParcelizer2.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams3.RemoteActionCompatParcelizer, layoutDirection);
                        int i9 = absoluteGravity & 112;
                        if (i9 == 48) {
                            rectRemoteActionCompatParcelizer.top = Math.max(rectRemoteActionCompatParcelizer.top, rectRemoteActionCompatParcelizer2.bottom);
                        } else if (i9 == 80) {
                            rectRemoteActionCompatParcelizer.bottom = Math.max(rectRemoteActionCompatParcelizer.bottom, getHeight() - rectRemoteActionCompatParcelizer2.top);
                        }
                        int i10 = absoluteGravity & 7;
                        if (i10 == 3) {
                            rectRemoteActionCompatParcelizer.left = Math.max(rectRemoteActionCompatParcelizer.left, rectRemoteActionCompatParcelizer2.right);
                        } else if (i10 == 5) {
                            rectRemoteActionCompatParcelizer.right = Math.max(rectRemoteActionCompatParcelizer.right, getWidth() - rectRemoteActionCompatParcelizer2.left);
                        }
                    }
                    if (layoutParams3.serializer != 0 && view3.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = FocusPropertiesNode.RatingCompat;
                        if (view3.isLaidOut() && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            LayoutParams layoutParams4 = (LayoutParams) view3.getLayoutParams();
                            Behavior behavior2 = layoutParams4.MediaDescriptionCompat;
                            Rect rectRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer();
                            Rect rectRemoteActionCompatParcelizer8 = RemoteActionCompatParcelizer();
                            rectRemoteActionCompatParcelizer8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (behavior2 != null && behavior2.getInsetDodgeRect(this, view3, rectRemoteActionCompatParcelizer7)) {
                                if (!rectRemoteActionCompatParcelizer8.contains(rectRemoteActionCompatParcelizer7)) {
                                    DrawableTransformation.read("Rect should be within the child's bounds. Rect:", rectRemoteActionCompatParcelizer7.toShortString(), " | Bounds:", rectRemoteActionCompatParcelizer8.toShortString());
                                    return;
                                }
                            } else {
                                rectRemoteActionCompatParcelizer7.set(rectRemoteActionCompatParcelizer8);
                            }
                            rectRemoteActionCompatParcelizer8.setEmpty();
                            setrootfocusnodeui.IconCompatParcelizer(rectRemoteActionCompatParcelizer8);
                            if (rectRemoteActionCompatParcelizer7.isEmpty()) {
                                rectRemoteActionCompatParcelizer7.setEmpty();
                                setrootfocusnodeui.IconCompatParcelizer(rectRemoteActionCompatParcelizer7);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(layoutParams4.serializer, layoutDirection);
                                if ((absoluteGravity2 & 48) == 48) {
                                    int i11 = (rectRemoteActionCompatParcelizer7.top - ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin) - layoutParams4.ComponentActivity;
                                    int i12 = rectRemoteActionCompatParcelizer.top;
                                    if (i11 < i12) {
                                        setInsetOffsetY(i12 - i11, view3);
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                if ((absoluteGravity2 & 80) == 80) {
                                    int height = ((getHeight() - rectRemoteActionCompatParcelizer7.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) + layoutParams4.ComponentActivity;
                                    int i13 = rectRemoteActionCompatParcelizer.bottom;
                                    if (height < i13) {
                                        setInsetOffsetY(height - i13, view3);
                                    } else if (!z) {
                                        setInsetOffsetY(0, view3);
                                    }
                                } else if (!z) {
                                    setInsetOffsetY(0, view3);
                                }
                                if ((absoluteGravity2 & 3) == 3) {
                                    int i14 = (rectRemoteActionCompatParcelizer7.left - ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin) - layoutParams4.ResultReceiver;
                                    int i15 = rectRemoteActionCompatParcelizer.left;
                                    if (i14 < i15) {
                                        setInsetOffsetX(i15 - i14, view3);
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5) {
                                    int width = ((getWidth() - rectRemoteActionCompatParcelizer7.right) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin) + layoutParams4.ResultReceiver;
                                    int i16 = rectRemoteActionCompatParcelizer.right;
                                    if (width < i16) {
                                        setInsetOffsetX(width - i16, view3);
                                    } else if (!z2) {
                                        setInsetOffsetX(0, view3);
                                    }
                                } else if (!z2) {
                                    setInsetOffsetX(0, view3);
                                }
                                rectRemoteActionCompatParcelizer7.setEmpty();
                                setrootfocusnodeui.IconCompatParcelizer(rectRemoteActionCompatParcelizer7);
                            }
                        }
                    }
                    if (i != 2) {
                        rect = rect2;
                        rect.set(((LayoutParams) view3.getLayoutParams()).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                        if (rect.equals(rectRemoteActionCompatParcelizer2)) {
                            arrayList = arrayList3;
                            i3 = i8;
                        } else {
                            ((LayoutParams) view3.getLayoutParams()).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.set(rectRemoteActionCompatParcelizer2);
                        }
                    } else {
                        rect = rect2;
                    }
                    int i17 = i2 + 1;
                    i3 = i8;
                    while (true) {
                        arrayList = arrayList3;
                        if (i17 >= i3) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i17);
                        LayoutParams layoutParams5 = (LayoutParams) view4.getLayoutParams();
                        Behavior behavior3 = layoutParams5.MediaDescriptionCompat;
                        if (behavior3 != null && behavior3.layoutDependsOn(this, view4, view3)) {
                            if (i == 0 && layoutParams5.PlaybackStateCompat) {
                                layoutParams5.PlaybackStateCompat = false;
                            } else {
                                if (i != 2) {
                                    zOnDependentViewChanged = behavior3.onDependentViewChanged(this, view4, view3);
                                } else {
                                    behavior3.onDependentViewRemoved(this, view4, view3);
                                    zOnDependentViewChanged = true;
                                }
                                if (i == 1) {
                                    layoutParams5.PlaybackStateCompat = zOnDependentViewChanged;
                                }
                            }
                        }
                        i17++;
                        arrayList3 = arrayList;
                    }
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    rect = rectRemoteActionCompatParcelizer3;
                    i2 = i4;
                }
                i4 = i2 + 1;
                rectRemoteActionCompatParcelizer3 = rect;
                size = i3;
                arrayList2 = arrayList;
            } else {
                Rect rect3 = rectRemoteActionCompatParcelizer3;
                rectRemoteActionCompatParcelizer.setEmpty();
                focusOwnerImplfocusSearch2.IconCompatParcelizer(rectRemoteActionCompatParcelizer);
                rectRemoteActionCompatParcelizer2.setEmpty();
                focusOwnerImplfocusSearch2.IconCompatParcelizer(rectRemoteActionCompatParcelizer2);
                rect3.setEmpty();
                focusOwnerImplfocusSearch2.IconCompatParcelizer(rect3);
                return;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, View view) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        View view2 = layoutParams.MediaBrowserCompatMediaItem;
        if (view2 == null && layoutParams.MediaMetadataCompat != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        FocusOwnerImplfocusSearch1 focusOwnerImplfocusSearch1 = read;
        if (view2 != null) {
            Rect rectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            Rect rectRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            try {
                write(view2, rectRemoteActionCompatParcelizer);
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                IconCompatParcelizer(i, rectRemoteActionCompatParcelizer, rectRemoteActionCompatParcelizer2, layoutParams2, measuredWidth, measuredHeight);
                read(layoutParams2, rectRemoteActionCompatParcelizer2, measuredWidth, measuredHeight);
                view.layout(rectRemoteActionCompatParcelizer2.left, rectRemoteActionCompatParcelizer2.top, rectRemoteActionCompatParcelizer2.right, rectRemoteActionCompatParcelizer2.bottom);
                return;
            } finally {
                rectRemoteActionCompatParcelizer.setEmpty();
                focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer);
                rectRemoteActionCompatParcelizer2.setEmpty();
                focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer2);
            }
        }
        int i3 = layoutParams.write;
        if (i3 < 0) {
            LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
            Rect rectRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
            rectRemoteActionCompatParcelizer3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            if (this.PlaybackStateCompat != null) {
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectRemoteActionCompatParcelizer3.left = this.PlaybackStateCompat.read() + rectRemoteActionCompatParcelizer3.left;
                    rectRemoteActionCompatParcelizer3.top = this.PlaybackStateCompat.RemoteActionCompatParcelizer() + rectRemoteActionCompatParcelizer3.top;
                    rectRemoteActionCompatParcelizer3.right -= this.PlaybackStateCompat.serializer();
                    rectRemoteActionCompatParcelizer3.bottom -= this.PlaybackStateCompat.write();
                }
            }
            Rect rectRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer();
            int i4 = layoutParams3.IconCompatParcelizer;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectRemoteActionCompatParcelizer3, rectRemoteActionCompatParcelizer4, i);
            view.layout(rectRemoteActionCompatParcelizer4.left, rectRemoteActionCompatParcelizer4.top, rectRemoteActionCompatParcelizer4.right, rectRemoteActionCompatParcelizer4.bottom);
            rectRemoteActionCompatParcelizer3.setEmpty();
            focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer3);
            rectRemoteActionCompatParcelizer4.setEmpty();
            focusOwnerImplfocusSearch1.IconCompatParcelizer(rectRemoteActionCompatParcelizer4);
            return;
        }
        LayoutParams layoutParams4 = (LayoutParams) view.getLayoutParams();
        int i5 = layoutParams4.IconCompatParcelizer;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iIconCompatParcelizer = IconCompatParcelizer(i3) - measuredWidth2;
        if (i6 == 1) {
            iIconCompatParcelizer += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iIconCompatParcelizer += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, Math.min(iIconCompatParcelizer, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Behavior behavior = layoutParams.MediaDescriptionCompat;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new Paint();
                }
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setColor(layoutParams.MediaDescriptionCompat.getScrimColor(this, view));
                Paint paint = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                int iRound = Math.round(scrimOpacity * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        write(false);
        if (this.ResultReceiver) {
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new CustomDestinationResult(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
        if (this.PlaybackStateCompat == null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.MediaSessionCompatToken = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        write(false);
        if (this.ResultReceiver && this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
        View view = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (view != null) {
            onStopNestedScroll(view, 0);
        }
        this.MediaSessionCompatToken = false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.write());
        SparseArray sparseArray = savedState.read;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = write(childAt).MediaDescriptionCompat;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
  0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zSerializer;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.MediaMetadataCompat == null) {
            zSerializer = serializer(motionEvent, 1);
            if (!zSerializer) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.MediaMetadataCompat == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zSerializer) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            write(false);
            return zOnTouchEvent;
        }
        zSerializer = false;
        Behavior behavior = ((LayoutParams) this.MediaMetadataCompat.getLayoutParams()).MediaDescriptionCompat;
        if (behavior != null) {
            zOnTouchEvent = behavior.onTouchEvent(this, this.MediaMetadataCompat, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.MediaMetadataCompat == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zSerializer) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        write(false);
        return zOnTouchEvent;
    }

    public final void read(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i4 = paddingLeft + i3;
        int iMax = Math.max(i4, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int paddingTop = getPaddingTop();
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i6 = paddingTop + i5;
        int iMax2 = Math.max(i6, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).MediaDescriptionCompat;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.PlaybackStateCompatCustomAction) {
            return;
        }
        write(false);
        this.PlaybackStateCompatCustomAction = true;
    }

    public static void IconCompatParcelizer(int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = layoutParams.IconCompatParcelizer;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = layoutParams.read;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public final void IconCompatParcelizer(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            write(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // o.FocusPropertiesElement
    public final void onStopNestedScroll(View view, int i) {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i == 1) {
            focusPropertiesImplonEnter1.RemoteActionCompatParcelizer = 0;
        } else {
            focusPropertiesImplonEnter1.serializer = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.IconCompatParcelizer(i)) {
                Behavior behavior = layoutParams.MediaDescriptionCompat;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    layoutParams.ParcelableVolumeInfo = false;
                } else if (i == 1) {
                    layoutParams.PlaybackStateCompatCustomAction = false;
                }
                layoutParams.PlaybackStateCompat = false;
            }
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    }

    public final boolean serializer(MotionEvent motionEvent, int i) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        FocusChangedElement focusChangedElement = RemoteActionCompatParcelizer;
        if (focusChangedElement != null) {
            Collections.sort(arrayList, focusChangedElement);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.MediaDescriptionCompat;
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behavior != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.MediaMetadataCompat = view;
                    }
                }
                Behavior behavior2 = layoutParams.MediaDescriptionCompat;
                if (behavior2 == null) {
                    layoutParams.MediaSessionCompatResultReceiverWrapper = false;
                }
                boolean z2 = layoutParams.MediaSessionCompatResultReceiverWrapper;
                if (z2) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = (behavior2 != null ? behavior2.blocksInteractionBelow(this, view) : false) | z2;
                    layoutParams.MediaSessionCompatResultReceiverWrapper = zBlocksInteractionBelow;
                }
                boolean z3 = zBlocksInteractionBelow && !z2;
                if (zBlocksInteractionBelow && !z3) {
                    break;
                }
                z = z3;
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    behavior.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zOnInterceptTouchEvent;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    public final void write(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            write(true);
        }
        boolean zSerializer = serializer(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zSerializer;
        }
        write(true);
        return zSerializer;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setState(getDrawableState());
                }
                Drawable drawable3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                dispatchKeyEventYhN2O0wdefault.RemoteActionCompatParcelizer(drawable3, getLayoutDirection());
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setVisible(getVisibility() == 0, false);
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setCallback(this);
            }
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            postInvalidateOnAnimation();
        }
    }

    public final void write(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).MediaDescriptionCompat;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behavior.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((LayoutParams) getChildAt(i2).getLayoutParams()).MediaSessionCompatResultReceiverWrapper = false;
        }
        this.MediaMetadataCompat = null;
        this.PlaybackStateCompatCustomAction = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.IconCompatParcelizer(0) && (behavior = layoutParams.MediaDescriptionCompat) != null) {
                    zOnNestedFling |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zOnNestedFling) {
            RemoteActionCompatParcelizer(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.IconCompatParcelizer(0) && (behavior = layoutParams.MediaDescriptionCompat) != null) {
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // o.FocusPropertiesElement
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.MediaDescriptionCompat;
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                    if (i2 == 0) {
                        layoutParams.ParcelableVolumeInfo = zOnStartNestedScroll;
                    } else if (i2 == 1) {
                        layoutParams.PlaybackStateCompatCustomAction = zOnStartNestedScroll;
                    }
                } else if (i2 == 0) {
                    layoutParams.ParcelableVolumeInfo = false;
                } else if (i2 == 1) {
                    layoutParams.PlaybackStateCompatCustomAction = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setVisible(z, false);
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.IconCompatParcelizer(i3) && (behavior = layoutParams.MediaDescriptionCompat) != null) {
                    int[] iArr2 = this.MediaBrowserCompatMediaItem;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            RemoteActionCompatParcelizer(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.ComponentActivity);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }
}
