package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Fields;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Transition$3;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.sentiance.core.model.events.I$b;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.FocusRestorerNode;
import o.ScaleFactorKt;
import o.SubcomposeLayoutKt;
import o.SubcomposeLayoutPausableCompositionException;
import o.SubcomposeSlotReusePolicy;
import o.brazelogdefault;
import o.captureFocus;
import o.clearChildFocusdefault;
import o.getLayer;
import o.getSetCompositionContextui;
import o.getSetMeasurePolicyui;
import o.getSlotToReusedFromOnReuseNjRlDlw;
import o.getState;
import o.getSubcomposeNewNjRlDlw;
import o.getSubcomposePausableNjRlDlw;
import o.handleMotionFrameOfReferencePlacement;
import o.isAppSetIdReadingEnabled;
import o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.restore;
import o.setMeasuredSizeozmzZPI;
import o.visitScrollCaptureCandidates;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior implements getSlotToReusedFromOnReuseNjRlDlw {
    public getSetCompositionContextui ComponentActivity;
    public WeakReference IconCompatParcelizer;
    public final getSetMeasurePolicyui MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final SubcomposeSlotReusePolicy MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public final SubcomposeLayoutPausableCompositionException r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final visitScrollCaptureCandidates r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public getSubcomposePausableNjRlDlw r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public clearChildFocusdefault r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public WeakReference r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public VelocityTracker r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final ColorStateList read;
    public int serializer;
    public final LinkedHashSet write;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new getState();
        public final int write;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.write = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.write);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(android.view.AbsSavedState.EMPTY_STATE);
            this.write = sideSheetBehavior.ResultReceiver;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        int iWrite;
        int i3;
        View viewFindViewById;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.MediaSessionCompatToken;
        if (weakReference == null) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new WeakReference(view);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new getSubcomposePausableNjRlDlw(view);
            if (subcomposeSlotReusePolicy != null) {
                view.setBackground(subcomposeSlotReusePolicy);
                float elevation = this.MediaMetadataCompat;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(elevation);
            } else {
                ColorStateList colorStateList = this.read;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i4 = this.ResultReceiver == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            read();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (captureFocus.IconCompatParcelizer(view) == null) {
                FocusPropertiesNode.read(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).IconCompatParcelizer, i) == 3 ? 1 : 0;
        getSetCompositionContextui getsetcompositioncontextui = this.ComponentActivity;
        if (getsetcompositioncontextui == null || getsetcompositioncontextui.RemoteActionCompatParcelizer() != i5) {
            SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            CoordinatorLayout.LayoutParams layoutParams = null;
            if (i5 == 0) {
                this.ComponentActivity = new getSetCompositionContextui(this, 1);
                if (subcomposeLayoutPausableCompositionException != null) {
                    WeakReference weakReference2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        I$b i$bWrite = subcomposeLayoutPausableCompositionException.write();
                        i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(0.0f);
                        i$bWrite.RatingCompat = new SubcomposeLayoutKt(0.0f);
                        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer = i$bWrite.IconCompatParcelizer();
                        if (subcomposeSlotReusePolicy != null) {
                            subcomposeSlotReusePolicy.setShapeAppearanceModel(subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.ComponentActivity = new getSetCompositionContextui(this, 0);
                if (subcomposeLayoutPausableCompositionException != null) {
                    WeakReference weakReference3 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        I$b i$bWrite2 = subcomposeLayoutPausableCompositionException.write();
                        i$bWrite2.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(0.0f);
                        i$bWrite2.MediaMetadataCompat = new SubcomposeLayoutKt(0.0f);
                        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer2 = i$bWrite2.IconCompatParcelizer();
                        if (subcomposeSlotReusePolicy != null) {
                            subcomposeSlotReusePolicy.setShapeAppearanceModel(subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer2);
                        }
                    }
                }
            }
        }
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new clearChildFocusdefault(coordinatorLayout.getContext(), coordinatorLayout, this.MediaBrowserCompatMediaItem);
        }
        int iWrite2 = this.ComponentActivity.write(view);
        coordinatorLayout.RemoteActionCompatParcelizer(i, view);
        this.PlaybackStateCompatCustomAction = coordinatorLayout.getWidth();
        this.MediaSessionCompatResultReceiverWrapper = this.ComponentActivity.read != 0 ? coordinatorLayout.getRight() : coordinatorLayout.getLeft();
        this.serializer = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i2 = this.ComponentActivity.read != 0 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
        } else {
            i2 = 0;
        }
        this.PlaybackStateCompat = i2;
        int i6 = this.ResultReceiver;
        if (i6 == 1 || i6 == 2) {
            iWrite = iWrite2 - this.ComponentActivity.write(view);
        } else if (i6 == 3) {
            iWrite = 0;
        } else {
            if (i6 != 5) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i6, "Unexpected value: ");
                return false;
            }
            iWrite = this.ComponentActivity.write();
        }
        view.offsetLeftAndRight(iWrite);
        if (this.IconCompatParcelizer == null && (i3 = this.RemoteActionCompatParcelizer) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.IconCompatParcelizer = new WeakReference(viewFindViewById);
        }
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).write;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.ResultReceiver = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight + paddingLeft + i5 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        view.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i3, paddingBottom + paddingTop + i6 + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final boolean write() {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
            return this.RatingCompat || this.ResultReceiver == 1;
        }
        return false;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new visitScrollCaptureCandidates(this);
        this.RatingCompat = true;
        this.ResultReceiver = 5;
        this.MediaDescriptionCompat = 0.1f;
        this.RemoteActionCompatParcelizer = -1;
        this.write = new LinkedHashSet();
        this.MediaBrowserCompatMediaItem = new getSetMeasurePolicyui(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.read = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = SubcomposeLayoutPausableCompositionException.serializer(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).IconCompatParcelizer();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.RemoteActionCompatParcelizer = resourceId;
            WeakReference weakReference = this.IconCompatParcelizer;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.IconCompatParcelizer = null;
            WeakReference weakReference2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (subcomposeLayoutPausableCompositionException != null) {
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy(subcomposeLayoutPausableCompositionException);
            this.MediaSessionCompatToken = subcomposeSlotReusePolicy;
            subcomposeSlotReusePolicy.write(context);
            ColorStateList colorStateList = this.read;
            if (colorStateList != null) {
                subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                subcomposeSlotReusePolicy.setTint(typedValue.data);
            }
        }
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.RatingCompat = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public final void cancelBackProgress() {
        getSubcomposePausableNjRlDlw getsubcomposepausablenjrldlw = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (getsubcomposepausablenjrldlw == null) {
            return;
        }
        View view = getsubcomposepausablenjrldlw.MediaBrowserCompatMediaItem;
        if (getsubcomposepausablenjrldlw.serializer == null) {
            SentryLogcatAdapter.IconCompatParcelizer("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = getsubcomposepausablenjrldlw.serializer;
        getsubcomposepausablenjrldlw.serializer = null;
        if (r8lambda54beh8zsbru0cxi2ccsp2synys == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(getsubcomposepausablenjrldlw.RemoteActionCompatParcelizer);
        animatorSet.start();
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public final void handleBackInvoked() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        getSubcomposePausableNjRlDlw getsubcomposepausablenjrldlw = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (getsubcomposepausablenjrldlw == null) {
            return;
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = getsubcomposepausablenjrldlw.serializer;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        getsubcomposepausablenjrldlw.serializer = null;
        int i2 = 5;
        if (r8lambda54beh8zsbru0cxi2ccsp2synys == null || Build.VERSION.SDK_INT < 34) {
            RemoteActionCompatParcelizer(5);
            return;
        }
        getSetCompositionContextui getsetcompositioncontextui = this.ComponentActivity;
        if (getsetcompositioncontextui != null && getsetcompositioncontextui.RemoteActionCompatParcelizer() != 0) {
            i2 = 3;
        }
        Transition$3 transition$3 = new Transition$3(7, this);
        WeakReference weakReference = this.IconCompatParcelizer;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int i3 = this.ComponentActivity.read != 0 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.forceRecomposeChildrenui
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.write.ComponentActivity.IconCompatParcelizer(marginLayoutParams, handleMotionFrameOfReferencePlacement.write(i3, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        View view2 = getsubcomposepausablenjrldlw.MediaBrowserCompatMediaItem;
        boolean z = r8lambda54beh8zsbru0cxi2ccsp2synys.serializer == 0;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float width = view2.getWidth();
        float scaleX = view2.getScaleX();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = (scaleX * width) + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new restore(0));
        objectAnimatorOfFloat.setDuration(handleMotionFrameOfReferencePlacement.write(getsubcomposepausablenjrldlw.read, getsubcomposepausablenjrldlw.IconCompatParcelizer, r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer));
        objectAnimatorOfFloat.addListener(new getSubcomposeNewNjRlDlw(getsubcomposepausablenjrldlw, z, i2));
        objectAnimatorOfFloat.addListener(transition$3);
        objectAnimatorOfFloat.start();
    }

    public final void read() {
        View view;
        WeakReference weakReference = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        FocusPropertiesNode.read(Fields.ColorFilter, view);
        FocusPropertiesNode.serializer(0, view);
        FocusPropertiesNode.read(1048576, view);
        FocusPropertiesNode.serializer(0, view);
        int i = 5;
        if (this.ResultReceiver != 5) {
            FocusPropertiesNode.read(view, FocusRestorerNode.MediaBrowserCompatMediaItem, new getLayer(i, this));
        }
        int i2 = 3;
        if (this.ResultReceiver != 3) {
            FocusPropertiesNode.read(view, FocusRestorerNode.MediaMetadataCompat, new getLayer(i2, this));
        }
    }

    public final void serializer(int i) {
        View view;
        if (this.ResultReceiver == i) {
            return;
        }
        this.ResultReceiver = i;
        WeakReference weakReference = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.ResultReceiver == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.write.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        read();
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public final void startBackProgress(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        getSubcomposePausableNjRlDlw getsubcomposepausablenjrldlw = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (getsubcomposepausablenjrldlw == null) {
            return;
        }
        getsubcomposepausablenjrldlw.serializer = r8lambda54beh8zsbru0cxi2ccsp2synys;
    }

    public final void IconCompatParcelizer(View view, int i, boolean z) {
        int iWrite;
        if (i == 3) {
            iWrite = this.ComponentActivity.read();
        } else if (i == 5) {
            iWrite = this.ComponentActivity.write();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid state to get outer edge offset: "));
            return;
        }
        clearChildFocusdefault clearchildfocusdefault = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (clearchildfocusdefault != null && (!z ? clearchildfocusdefault.read(iWrite, view.getTop(), view) : clearchildfocusdefault.RemoteActionCompatParcelizer(iWrite, view.getTop()))) {
            serializer(2);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(i);
        } else {
            serializer(i);
        }
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public final void updateBackProgress(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        getSubcomposePausableNjRlDlw getsubcomposepausablenjrldlw = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (getsubcomposepausablenjrldlw == null) {
            return;
        }
        getSetCompositionContextui getsetcompositioncontextui = this.ComponentActivity;
        int i = (getsetcompositioncontextui == null || getsetcompositioncontextui.RemoteActionCompatParcelizer() == 0) ? 5 : 3;
        if (getsubcomposepausablenjrldlw.serializer == null) {
            SentryLogcatAdapter.IconCompatParcelizer("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys2 = getsubcomposepausablenjrldlw.serializer;
        getsubcomposepausablenjrldlw.serializer = r8lambda54beh8zsbru0cxi2ccsp2synys;
        if (r8lambda54beh8zsbru0cxi2ccsp2synys2 != null) {
            getsubcomposepausablenjrldlw.serializer(r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer, i, r8lambda54beh8zsbru0cxi2ccsp2synys.serializer == 0);
        }
        WeakReference weakReference = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get();
        WeakReference weakReference2 = this.IconCompatParcelizer;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.ComponentActivity.IconCompatParcelizer(marginLayoutParams, (int) ((view.getScaleX() * this.serializer) + this.PlaybackStateCompat));
        view2.requestLayout();
    }

    public final void RemoteActionCompatParcelizer(int i) {
        String str;
        if (i != 1 && i != 2) {
            WeakReference weakReference = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get();
                brazelogdefault brazelogdefaultVar = new brazelogdefault(this, i, 8);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    if (view.isAttachedToWindow()) {
                        view.post(brazelogdefaultVar);
                        return;
                    }
                }
                brazelogdefaultVar.run();
                return;
            }
            serializer(i);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(ff$$ExternalSyntheticOutline0.m(sb, str, " should not be set externally."));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked;
        clearChildFocusdefault clearchildfocusdefault;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (captureFocus.IconCompatParcelizer(view) != null) {
                if (this.RatingCompat) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 && (velocityTracker = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null) {
                        velocityTracker.recycle();
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                    }
                    if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = VelocityTracker.obtain();
                    }
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.addMovement(motionEvent);
                    if (actionMasked == 0) {
                        this.ParcelableVolumeInfo = (int) motionEvent.getX();
                    } else if ((actionMasked != 1 || actionMasked == 3) && this.MediaSessionCompatQueueItem) {
                        this.MediaSessionCompatQueueItem = false;
                        return false;
                    }
                    return this.MediaSessionCompatQueueItem && (clearchildfocusdefault = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) != null && clearchildfocusdefault.read(motionEvent);
                }
            }
        } else if (this.RatingCompat) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                velocityTracker.recycle();
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
            }
            if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = VelocityTracker.obtain();
            }
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.addMovement(motionEvent);
            if (actionMasked == 0) {
                if (actionMasked != 1) {
                    this.MediaSessionCompatQueueItem = false;
                    return false;
                }
                this.MediaSessionCompatQueueItem = false;
                return false;
            }
            this.ParcelableVolumeInfo = (int) motionEvent.getX();
            if (this.MediaSessionCompatQueueItem) {
            }
        }
        this.MediaSessionCompatQueueItem = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.ResultReceiver == 1 && actionMasked == 0) {
            return true;
        }
        if (write()) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null) {
            velocityTracker.recycle();
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = VelocityTracker.obtain();
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.addMovement(motionEvent);
        if (write() && actionMasked == 2 && !this.MediaSessionCompatQueueItem && write()) {
            float fAbs = Math.abs(this.ParcelableVolumeInfo - motionEvent.getX());
            clearChildFocusdefault clearchildfocusdefault = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (fAbs > clearchildfocusdefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                clearchildfocusdefault.write(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.MediaSessionCompatQueueItem;
    }

    public SideSheetBehavior() {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new visitScrollCaptureCandidates(this);
        this.RatingCompat = true;
        this.ResultReceiver = 5;
        this.MediaDescriptionCompat = 0.1f;
        this.RemoteActionCompatParcelizer = -1;
        this.write = new LinkedHashSet();
        this.MediaBrowserCompatMediaItem = new getSetMeasurePolicyui(this);
    }
}
