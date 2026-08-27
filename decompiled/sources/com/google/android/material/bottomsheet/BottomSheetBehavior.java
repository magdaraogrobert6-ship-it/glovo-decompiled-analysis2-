package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.graphics.Fields;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Transition$3;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import o.CSSParseException;
import o.FocusPropertiesNode;
import o.FocusRestorerNode;
import o.FocusTargetNodeKt;
import o.PlacementScope;
import o.ScaleFactorKt;
import o.SubcomposeLayoutPausableCompositionException;
import o.SubcomposeSlotReusePolicy;
import o.accessgetDefaultLayerBlockp;
import o.accessgetUnspecifiedcp;
import o.clearChildFocusdefault;
import o.getResumePausedNjRlDlw;
import o.getSlotToReusedFromOnDeactivateNjRlDlw;
import o.getSlotToReusedFromOnReuseNjRlDlw;
import o.handleMotionFrameOfReferencePlacement;
import o.is1dFocusSearch3ESFkO8;
import o.placeRelative;
import o.placeRelative70tqf50;
import o.placeRelativeWithLayer;
import o.placeRelativeWithLayeraW9wM;
import o.placeWithLayer;
import o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import o.restore;
import o.setDropDownVerticalOffset;
import o.setMeasuredSizeozmzZPI;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior implements getSlotToReusedFromOnReuseNjRlDlw {
    public static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
    public static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    private static final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 2132084006;
    public WeakReference<V> ComponentActivity;
    public int IconCompatParcelizer;
    float MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    final SparseIntArray MediaMetadataCompat;
    int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public WeakReference<View> MediaSessionCompatToken;
    int ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    float RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    private int _init_lambda1;
    private boolean _init_lambda2;
    private float _init_lambda3;
    private Map<View, Integer> _init_lambda4;
    private boolean accessensureViewModelStore;
    private boolean addContentView;
    private int addMenuProvider;
    private int addObserverForBackInvoker;
    private ValueAnimator addObserverForBackInvokerlambda0;
    private boolean addOnConfigurationChangedListener;
    private int addOnContextAvailableListener;
    private boolean addOnMultiWindowModeChangedListener;
    private int addOnNewIntentListener;
    private int addOnPictureInPictureModeChangedListener;
    private boolean addOnPictureInPictureUiStateChangedListener;
    private boolean addOnTrimMemoryListener;
    private SubcomposeLayoutPausableCompositionException addOnUserLeaveHintListener;
    private int createFullyDrawnExecutor;
    private int defaultViewModelProviderFactory_delegatelambda0;
    private boolean ensureViewModelStore;
    private int enterPictureInPictureMode;
    private SubcomposeSlotReusePolicy fullyDrawnReporter_delegatelambda0;
    private int fullyDrawnReporter_delegatelambda00;
    private boolean getDefaultViewModelCreationExtras;
    private VelocityTracker getDefaultViewModelProviderFactory;
    private final PlacementScope getFullyDrawnReporter;
    private int getOnBackPressedInput;
    private boolean getSavedStateRegistryControllerannotations;
    private boolean menuHostHelperlambda0;
    private boolean onBackPressedDispatcher_delegatelambda0;
    private float onBackPressedDispatcher_delegatelambda00;
    private boolean onBackPressedDispatcher_delegatelambda010;
    private boolean onBackPressedInput_delegatelambda0;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public clearChildFocusdefault r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final ArrayList<placeRelativeWithLayer> r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private ColorStateList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    private boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    private final FocusTargetNodeKt r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    private boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public int read;
    WeakReference<View> serializer;
    getSlotToReusedFromOnDeactivateNjRlDlw write;

    public void disableShapeAnimations() {
        this.addObserverForBackInvokerlambda0 = null;
    }

    public getSlotToReusedFromOnDeactivateNjRlDlw getBackHelper() {
        return this.write;
    }

    public float getHalfExpandedRatio() {
        return this.MediaBrowserCompatMediaItem;
    }

    public float getHideFriction() {
        return this._init_lambda3;
    }

    public int getLastStableState() {
        return this.ParcelableVolumeInfo;
    }

    public SubcomposeSlotReusePolicy getMaterialShapeDrawable() {
        return this.fullyDrawnReporter_delegatelambda0;
    }

    public int getMaxHeight() {
        return this.fullyDrawnReporter_delegatelambda00;
    }

    public int getMaxWidth() {
        return this.getOnBackPressedInput;
    }

    public int getPeekHeightMin() {
        return this.addOnContextAvailableListener;
    }

    public int getSaveFlags() {
        return this.enterPictureInPictureMode;
    }

    public int getSignificantVelocityThreshold() {
        return this.addOnPictureInPictureModeChangedListener;
    }

    public boolean getSkipCollapsed() {
        return this.addOnPictureInPictureUiStateChangedListener;
    }

    public int getState() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public boolean isDraggable() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public boolean isFitToContents() {
        return this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.accessensureViewModelStore;
    }

    public boolean isHideable() {
        return this.PlaybackStateCompat;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.addOnTrimMemoryListener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        this.ComponentActivity = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.write = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        this.ComponentActivity = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.write = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.addObserverForBackInvoker = 0;
        this.onBackPressedInput_delegatelambda0 = false;
        return (i & 2) != 0;
    }

    public void setDraggable(boolean z) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = z;
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.accessensureViewModelStore = z;
    }

    public void setHideFriction(float f) {
        this._init_lambda3 = f;
    }

    public void setHideableInternal(boolean z) {
        this.PlaybackStateCompat = z;
    }

    public void setMaxHeight(int i) {
        this.fullyDrawnReporter_delegatelambda00 = i;
    }

    public void setMaxWidth(int i) {
        this.getOnBackPressedInput = i;
    }

    public void setSaveFlags(int i) {
        this.enterPictureInPictureMode = i;
    }

    public void setSignificantVelocityThreshold(int i) {
        this.addOnPictureInPictureModeChangedListener = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.addOnPictureInPictureUiStateChangedListener = z;
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.getDefaultViewModelCreationExtras = z;
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
        return false;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new placeRelativeWithLayeraW9wM();
        public final int MediaBrowserCompatMediaItem;
        public final boolean RatingCompat;
        public final boolean RemoteActionCompatParcelizer;
        public final int read;
        public final boolean write;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.MediaBrowserCompatMediaItem = parcel.readInt();
            this.read = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt() == 1;
            this.write = parcel.readInt() == 1;
            this.RatingCompat = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.MediaBrowserCompatMediaItem);
            parcel.writeInt(this.read);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
            parcel.writeInt(this.write ? 1 : 0);
            parcel.writeInt(this.RatingCompat ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(android.view.AbsSavedState.EMPTY_STATE);
            this.MediaBrowserCompatMediaItem = bottomSheetBehavior.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            this.read = bottomSheetBehavior.addOnNewIntentListener;
            this.RemoteActionCompatParcelizer = bottomSheetBehavior.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            this.write = bottomSheetBehavior.PlaybackStateCompat;
            this.RatingCompat = bottomSheetBehavior.addOnPictureInPictureUiStateChangedListener;
        }
    }

    public void addBottomSheetCallback(placeRelativeWithLayer placerelativewithlayer) {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.contains(placerelativewithlayer)) {
            return;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.add(placerelativewithlayer);
    }

    public void dispatchOnSlide(int i) {
        V v = this.ComponentActivity.get();
        if (v == null || this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.isEmpty()) {
            return;
        }
        float fCalculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
        for (int i2 = 0; i2 < this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.size(); i2++) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.get(i2).read(v, fCalculateSlideOffsetWithTop);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.ComponentActivity == null) {
            this.addOnContextAvailableListener = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.addOnMultiWindowModeChangedListener) ? false : true;
            if (this.onBackPressedDispatcher_delegatelambda010 || this.onBackPressedDispatcher_delegatelambda0 || this.addContentView || this.ensureViewModelStore || this.menuHostHelperlambda0 || this.getSavedStateRegistryControllerannotations || z) {
                getResumePausedNjRlDlw.write(v, new setDropDownVerticalOffset((BottomSheetBehavior) this, z));
            }
            FocusPropertiesNode.read(v, new accessgetDefaultLayerBlockp(v));
            this.ComponentActivity = new WeakReference<>(v);
            this.write = new getSlotToReusedFromOnDeactivateNjRlDlw(v);
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.fullyDrawnReporter_delegatelambda0;
            if (subcomposeSlotReusePolicy != null) {
                v.setBackground(subcomposeSlotReusePolicy);
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = this.fullyDrawnReporter_delegatelambda0;
                float elevation = this.RemoteActionCompatParcelizer;
                if (elevation == -1.0f) {
                    elevation = v.getElevation();
                }
                subcomposeSlotReusePolicy2.MediaBrowserCompatMediaItem(elevation);
            } else {
                ColorStateList colorStateList = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (colorStateList != null) {
                    v.setBackgroundTintList(colorStateList);
                }
            }
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new clearChildFocusdefault(coordinatorLayout.getContext(), coordinatorLayout, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        }
        int top = v.getTop();
        coordinatorLayout.RemoteActionCompatParcelizer(i, v);
        this.PlaybackStateCompatCustomAction = coordinatorLayout.getWidth();
        this.MediaSessionCompatResultReceiverWrapper = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = height;
        int iMin = this.MediaSessionCompatResultReceiverWrapper;
        int i2 = this.defaultViewModelProviderFactory_delegatelambda0;
        if (iMin - height < i2) {
            boolean z2 = this.addOnConfigurationChangedListener;
            int i3 = this.fullyDrawnReporter_delegatelambda00;
            if (z2) {
                if (i3 != -1) {
                    iMin = Math.min(iMin, i3);
                }
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = iMin;
            } else {
                int iMin2 = iMin - i2;
                if (i3 != -1) {
                    iMin2 = Math.min(iMin2, i3);
                }
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = iMin2;
            }
        }
        this.RatingCompat = Math.max(0, this.MediaSessionCompatResultReceiverWrapper - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        this.MediaDescriptionCompat = (int) ((1.0f - this.MediaBrowserCompatMediaItem) * this.MediaSessionCompatResultReceiverWrapper);
        calculateCollapsedOffset();
        int i4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i4 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i4 == 6) {
            v.offsetTopAndBottom(this.MediaDescriptionCompat);
        } else if (this.PlaybackStateCompat && i4 == 5) {
            v.offsetTopAndBottom(this.MediaSessionCompatResultReceiverWrapper);
        } else if (i4 == 4) {
            v.offsetTopAndBottom(this.read);
        } else if (i4 == 1 || i4 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        updateDrawableForTargetState(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, false);
        this.MediaSessionCompatToken = new WeakReference<>(findScrollingChild(v));
        for (int i5 = 0; i5 < this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.size(); i5++) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.get(i5).read(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.write();
        int i = this.enterPictureInPictureMode;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.addOnNewIntentListener = savedState.read;
            }
            if (i == -1 || (i & 2) == 2) {
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = savedState.RemoteActionCompatParcelizer;
            }
            if (i == -1 || (i & 4) == 4) {
                this.PlaybackStateCompat = savedState.write;
            }
            if (i == -1 || (i & 8) == 8) {
                this.addOnPictureInPictureUiStateChangedListener = savedState.RatingCompat;
            }
        }
        int i2 = savedState.MediaBrowserCompatMediaItem;
        if (i2 == 1 || i2 == 2) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 4;
            this.ParcelableVolumeInfo = 4;
        } else {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2;
            this.ParcelableVolumeInfo = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    public void removeBottomSheetCallback(placeRelativeWithLayer placerelativewithlayer) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.remove(placerelativewithlayer);
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("offset must be greater than or equal to 0");
        } else {
            this.MediaSessionCompatQueueItem = i;
            updateDrawableForTargetState(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, true);
        }
    }

    public void setAccessibilityDelegateView(View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.serializer) != null) {
            clearAccessibilityAction(1, weakReference.get());
            this.serializer = null;
        } else {
            this.serializer = new WeakReference<>(view);
            updateAccessibilityActions(1, view);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.enterPictureInPictureMode = 0;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = true;
        this.getDefaultViewModelCreationExtras = false;
        this.getOnBackPressedInput = -1;
        this.fullyDrawnReporter_delegatelambda00 = -1;
        this.getFullyDrawnReporter = new PlacementScope(this);
        this.MediaBrowserCompatMediaItem = 0.5f;
        this.RemoteActionCompatParcelizer = -1.0f;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 4;
        this.ParcelableVolumeInfo = 4;
        this._init_lambda3 = 0.1f;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ArrayList<>();
        this._init_lambda1 = -1;
        this.MediaMetadataCompat = new SparseIntArray();
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new placeRelative(this);
        this.addMenuProvider = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.addOnUserLeaveHintListener = SubcomposeLayoutPausableCompositionException.serializer(context, attributeSet, R.attr.bottomSheetStyle, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).IconCompatParcelizer();
        }
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.addOnUserLeaveHintListener;
        if (subcomposeLayoutPausableCompositionException != null) {
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy(subcomposeLayoutPausableCompositionException);
            this.fullyDrawnReporter_delegatelambda0 = subcomposeSlotReusePolicy;
            subcomposeSlotReusePolicy.write(context);
            ColorStateList colorStateList = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (colorStateList != null) {
                this.fullyDrawnReporter_delegatelambda0.MediaBrowserCompatMediaItem(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.fullyDrawnReporter_delegatelambda0.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.addObserverForBackInvokerlambda0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.addObserverForBackInvokerlambda0.addUpdateListener(new placeWithLayer(this));
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(8, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(13, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(6, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(12, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(4, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(10, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            setExpandedOffset(typedValuePeekValue2.data);
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(11, Constant.ERROR_UNKNOWN));
        this.onBackPressedDispatcher_delegatelambda010 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.onBackPressedDispatcher_delegatelambda0 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.addContentView = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.addOnConfigurationChangedListener = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.ensureViewModelStore = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.menuHostHelperlambda0 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.getSavedStateRegistryControllerannotations = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.addOnTrimMemoryListener = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.onBackPressedDispatcher_delegatelambda00 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).MediaDescriptionCompat;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public final void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        boolean z = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int i = this.MediaSessionCompatResultReceiverWrapper;
        if (!z) {
            this.read = i - iCalculatePeekHeight;
        } else {
            this.read = Math.max(i - iCalculatePeekHeight, this.RatingCompat);
        }
    }

    public final int calculatePeekHeight() {
        int iMin;
        int i;
        int i2;
        if (this.addOnMultiWindowModeChangedListener) {
            iMin = Math.min(Math.max(this.addOnContextAvailableListener, this.MediaSessionCompatResultReceiverWrapper - ((this.PlaybackStateCompatCustomAction * 9) / 16)), this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            i = this.createFullyDrawnExecutor;
        } else {
            if (!this.accessensureViewModelStore && !this.onBackPressedDispatcher_delegatelambda010 && (i2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) > 0) {
                return Math.max(this.addOnNewIntentListener, i2 + this.addMenuProvider);
            }
            iMin = this.addOnNewIntentListener;
            i = this.createFullyDrawnExecutor;
        }
        return iMin + i;
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.ComponentActivity;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.ComponentActivity.get().getTop());
    }

    public final float calculateSlideOffsetWithTop(int i) {
        float f;
        float expandedOffset;
        int i2 = this.read;
        if (i > i2 || i2 == getExpandedOffset()) {
            int i3 = this.read;
            f = i3 - i;
            expandedOffset = this.MediaSessionCompatResultReceiverWrapper - i3;
        } else {
            int i4 = this.read;
            f = i4 - i;
            expandedOffset = i4 - getExpandedOffset();
        }
        return f / expandedOffset;
    }

    public int getExpandedOffset() {
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            return this.RatingCompat;
        }
        return Math.max(this.MediaSessionCompatQueueItem, this.addOnConfigurationChangedListener ? 0 : this.defaultViewModelProviderFactory_delegatelambda0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingRight + paddingLeft + i5 + marginLayoutParams.rightMargin + i2, this.getOnBackPressedInput, marginLayoutParams.width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        v.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingBottom + paddingTop + i6 + marginLayoutParams.bottomMargin + i4, this.fullyDrawnReporter_delegatelambda00, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        WeakReference<View> weakReference;
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.MediaSessionCompatToken) != null && view == weakReference.get() && this.onBackPressedInput_delegatelambda0)) {
            if (this.addObserverForBackInvoker > 0) {
                if (!this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 && v.getTop() > this.MediaDescriptionCompat) {
                    i3 = 6;
                }
            } else if (this.PlaybackStateCompat) {
                VelocityTracker velocityTracker = this.getDefaultViewModelProviderFactory;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.onBackPressedDispatcher_delegatelambda00);
                    yVelocity = this.getDefaultViewModelProviderFactory.getYVelocity(this.IconCompatParcelizer);
                }
                if (shouldHide(v, yVelocity)) {
                    i3 = 5;
                } else if (this.addObserverForBackInvoker == 0) {
                    top2 = v.getTop();
                    if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                        i2 = this.MediaDescriptionCompat;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.read)) {
                                if (shouldSkipHalfExpandedStateWhenDragging()) {
                                    i3 = 4;
                                } else {
                                    i3 = 6;
                                }
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.read)) {
                            i3 = 6;
                        } else {
                            i3 = 4;
                        }
                    } else if (Math.abs(top2 - this.RatingCompat) >= Math.abs(top2 - this.read)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                        top = v.getTop();
                        if (Math.abs(top - this.MediaDescriptionCompat) < Math.abs(top - this.read)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.addObserverForBackInvoker == 0) {
                top2 = v.getTop();
                if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                    i2 = this.MediaDescriptionCompat;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.read)) {
                            if (shouldSkipHalfExpandedStateWhenDragging()) {
                                i3 = 4;
                            } else {
                                i3 = 6;
                            }
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.read)) {
                        i3 = 6;
                    } else {
                        i3 = 4;
                    }
                } else if (Math.abs(top2 - this.RatingCompat) >= Math.abs(top2 - this.read)) {
                    i3 = 4;
                }
            } else {
                if (!this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                    top = v.getTop();
                    if (Math.abs(top - this.MediaDescriptionCompat) < Math.abs(top - this.read)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            startSettling(v, i3, false);
            this.onBackPressedInput_delegatelambda0 = false;
        }
    }

    @Deprecated
    public void setBottomSheetCallback(placeRelativeWithLayer placerelativewithlayer) {
        SentryLogcatAdapter.IconCompatParcelizer("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.clear();
        if (placerelativewithlayer != null) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.add(placerelativewithlayer);
        }
    }

    public void setHideable(boolean z) {
        if (this.PlaybackStateCompat != z) {
            this.PlaybackStateCompat = z;
            if (!z && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        if (this.addOnTrimMemoryListener != z) {
            this.addOnTrimMemoryListener = z;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public final void startSettling(View view, int i, boolean z) {
        int topOffsetForState = getTopOffsetForState(i);
        clearChildFocusdefault clearchildfocusdefault = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (clearchildfocusdefault == null || (!z ? clearchildfocusdefault.read(view.getLeft(), topOffsetForState, view) : clearchildfocusdefault.RemoteActionCompatParcelizer(view.getLeft(), topOffsetForState))) {
            setStateInternal(i);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i, true);
        this.getFullyDrawnReporter.RemoteActionCompatParcelizer(i);
    }

    public final void updatePeekHeight(boolean z) {
        V v;
        if (this.ComponentActivity != null) {
            calculateCollapsedOffset();
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 4 || (v = this.ComponentActivity.get()) == null) {
                return;
            }
            if (z) {
                setState(4);
            } else {
                v.requestLayout();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.fullyDrawnReporter_delegatelambda0 != null && (weakReference = this.ComponentActivity) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.ComponentActivity.get();
            if (isAtTopOfScreen() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                float fMediaBrowserCompatMediaItem = this.fullyDrawnReporter_delegatelambda0.MediaBrowserCompatMediaItem();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fMediaBrowserCompatMediaItem <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fMediaBrowserCompatMediaItem;
                    }
                } else {
                    f = 0.0f;
                }
                float fPlaybackStateCompat = this.fullyDrawnReporter_delegatelambda0.PlaybackStateCompat();
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fPlaybackStateCompat > 0.0f) {
                        f2 = radius2 / fPlaybackStateCompat;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public void cancelBackProgress() {
        getSlotToReusedFromOnDeactivateNjRlDlw getslottoreusedfromondeactivatenjrldlw = this.write;
        if (getslottoreusedfromondeactivatenjrldlw == null) {
            return;
        }
        if (getslottoreusedfromondeactivatenjrldlw.serializer == null) {
            SentryLogcatAdapter.IconCompatParcelizer("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = getslottoreusedfromondeactivatenjrldlw.serializer;
        getslottoreusedfromondeactivatenjrldlw.serializer = null;
        if (r8lambda54beh8zsbru0cxi2ccsp2synys == null) {
            return;
        }
        AnimatorSet animatorSetWrite = getslottoreusedfromondeactivatenjrldlw.write();
        animatorSetWrite.setDuration(getslottoreusedfromondeactivatenjrldlw.RemoteActionCompatParcelizer);
        animatorSetWrite.start();
    }

    public final void clearAccessibilityAction(int i, View view) {
        if (view == null) {
            return;
        }
        FocusPropertiesNode.read(Fields.BlendMode, view);
        FocusPropertiesNode.serializer(0, view);
        FocusPropertiesNode.read(Fields.ColorFilter, view);
        FocusPropertiesNode.serializer(0, view);
        FocusPropertiesNode.read(1048576, view);
        FocusPropertiesNode.serializer(0, view);
        int i2 = this.MediaMetadataCompat.get(i, -1);
        if (i2 != -1) {
            FocusPropertiesNode.read(i2, view);
            FocusPropertiesNode.serializer(0, view);
            this.MediaMetadataCompat.delete(i);
        }
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public void handleBackInvoked() {
        getSlotToReusedFromOnDeactivateNjRlDlw getslottoreusedfromondeactivatenjrldlw = this.write;
        if (getslottoreusedfromondeactivatenjrldlw == null) {
            return;
        }
        int i = getslottoreusedfromondeactivatenjrldlw.IconCompatParcelizer;
        int i2 = getslottoreusedfromondeactivatenjrldlw.read;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = getslottoreusedfromondeactivatenjrldlw.serializer;
        getslottoreusedfromondeactivatenjrldlw.serializer = null;
        int i3 = 5;
        if (r8lambda54beh8zsbru0cxi2ccsp2synys == null || Build.VERSION.SDK_INT < 34) {
            setState(this.PlaybackStateCompat ? 5 : 4);
            return;
        }
        if (!this.PlaybackStateCompat) {
            AnimatorSet animatorSetWrite = getslottoreusedfromondeactivatenjrldlw.write();
            animatorSetWrite.setDuration(handleMotionFrameOfReferencePlacement.write(i2, i, r8lambda54beh8zsbru0cxi2ccsp2synys.write()));
            animatorSetWrite.start();
            setState(4);
            return;
        }
        placeRelative70tqf50 placerelative70tqf50 = new placeRelative70tqf50(this);
        View view = getslottoreusedfromondeactivatenjrldlw.MediaBrowserCompatMediaItem;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new restore(0));
        objectAnimatorOfFloat.setDuration(handleMotionFrameOfReferencePlacement.write(i2, i, r8lambda54beh8zsbru0cxi2ccsp2synys.write()));
        objectAnimatorOfFloat.addListener(new Transition$3(i3, getslottoreusedfromondeactivatenjrldlw));
        objectAnimatorOfFloat.addListener(placerelative70tqf50);
        objectAnimatorOfFloat.start();
    }

    public final boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.ComponentActivity;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.ComponentActivity.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.MediaSessionCompatToken;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    int i5 = -expandedOffset;
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    v.offsetTopAndBottom(i5);
                    setStateInternal(3);
                } else {
                    if (!this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                    v.offsetTopAndBottom(-i2);
                    setStateInternal(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i4 > this.read && (!isHideable() || !isHideableWhenDragging())) {
                    int i6 = top - this.read;
                    iArr[1] = i6;
                    int i7 = -i6;
                    WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
                    v.offsetTopAndBottom(i7);
                    setStateInternal(4);
                } else {
                    if (!this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = FocusPropertiesNode.RatingCompat;
                    v.offsetTopAndBottom(-i2);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v.getTop());
            this.addObserverForBackInvoker = i2;
            this.onBackPressedInput_delegatelambda0 = true;
        }
    }

    public void setFitToContents(boolean z) {
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == z) {
            return;
        }
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = z;
        if (this.ComponentActivity != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 6) ? 3 : this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        updateDrawableForTargetState(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, true);
        updateAccessibilityActions();
    }

    public void setStateInternal(int i) {
        V v;
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == i) {
            return;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
        if (i == 4 || i == 3 || i == 6 || (this.PlaybackStateCompat && i == 5)) {
            this.ParcelableVolumeInfo = i;
        }
        WeakReference<V> weakReference = this.ComponentActivity;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i, true);
        for (int i2 = 0; i2 < this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.size(); i2++) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.get(i2).read(i, v);
        }
        updateAccessibilityActions();
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public void startBackProgress(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        getSlotToReusedFromOnDeactivateNjRlDlw getslottoreusedfromondeactivatenjrldlw = this.write;
        if (getslottoreusedfromondeactivatenjrldlw == null) {
            return;
        }
        getslottoreusedfromondeactivatenjrldlw.serializer = r8lambda54beh8zsbru0cxi2ccsp2synys;
    }

    @Override // o.getSlotToReusedFromOnReuseNjRlDlw
    public void updateBackProgress(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        getSlotToReusedFromOnDeactivateNjRlDlw getslottoreusedfromondeactivatenjrldlw = this.write;
        if (getslottoreusedfromondeactivatenjrldlw == null) {
            return;
        }
        if (getslottoreusedfromondeactivatenjrldlw.serializer == null) {
            SentryLogcatAdapter.IconCompatParcelizer("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys2 = getslottoreusedfromondeactivatenjrldlw.serializer;
        getslottoreusedfromondeactivatenjrldlw.serializer = r8lambda54beh8zsbru0cxi2ccsp2synys;
        if (r8lambda54beh8zsbru0cxi2ccsp2synys2 == null) {
            return;
        }
        getslottoreusedfromondeactivatenjrldlw.IconCompatParcelizer(r8lambda54beh8zsbru0cxi2ccsp2synys.write());
    }

    public final void updateDrawableForTargetState(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 3 && (this.addOnTrimMemoryListener || isAtTopOfScreen());
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == z2 || this.fullyDrawnReporter_delegatelambda0 == null) {
            return;
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = z2;
        if (z && (valueAnimator = this.addObserverForBackInvokerlambda0) != null) {
            if (valueAnimator.isRunning()) {
                this.addObserverForBackInvokerlambda0.reverse();
                return;
            } else {
                this.addObserverForBackInvokerlambda0.setFloatValues(this.fullyDrawnReporter_delegatelambda0.MediaSessionCompatQueueItem(), z2 ? calculateInterpolationWithCornersRemoved() : 1.0f);
                this.addObserverForBackInvokerlambda0.start();
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.addObserverForBackInvokerlambda0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.addObserverForBackInvokerlambda0.cancel();
        }
        this.fullyDrawnReporter_delegatelambda0.MediaSessionCompatQueueItem(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw ? calculateInterpolationWithCornersRemoved() : 1.0f);
    }

    public static boolean access$1600(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.isHideable() && bottomSheetBehavior.isHideableWhenDragging();
    }

    public int getPeekHeight() {
        if (this.addOnMultiWindowModeChangedListener) {
            return -1;
        }
        return this.addOnNewIntentListener;
    }

    public boolean shouldHide(View view, float f) {
        if (this.addOnPictureInPictureUiStateChangedListener) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.read) {
            return false;
        }
        return Math.abs(((f * this._init_lambda3) + ((float) view.getTop())) - ((float) this.read)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    public final void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.ComponentActivity;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this._init_lambda4 != null) {
                    return;
                } else {
                    this._init_lambda4 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.ComponentActivity.get()) {
                    if (z) {
                        this._init_lambda4.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.getDefaultViewModelCreationExtras) {
                            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.getDefaultViewModelCreationExtras && (map = this._init_lambda4) != null && map.containsKey(childAt)) {
                        int iIntValue = this._init_lambda4.get(childAt).intValue();
                        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
            if (!z) {
                this._init_lambda4 = null;
            } else if (this.getDefaultViewModelCreationExtras) {
                this.ComponentActivity.get().sendAccessibilityEvent(8);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference;
        return isNestedScrollingCheckEnabled() && (weakReference = this.MediaSessionCompatToken) != null && view == weakReference.get() && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 3;
    }

    public void setState(int i) {
        String str;
        if (i != 1 && i != 2) {
            if (!this.PlaybackStateCompat && i == 5) {
                SentryLogcatAdapter.IconCompatParcelizer("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            int i2 = (i == 6 && this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 && getTopOffsetForState(i) <= this.RatingCompat) ? 3 : i;
            WeakReference<V> weakReference = this.ComponentActivity;
            if (weakReference != null && weakReference.get() != null) {
                V v = this.ComponentActivity.get();
                accessgetUnspecifiedcp accessgetunspecifiedcp = new accessgetUnspecifiedcp(this, v, i2);
                ViewParent parent = v.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    if (v.isAttachedToWindow()) {
                        v.post(accessgetunspecifiedcp);
                        return;
                    }
                }
                accessgetunspecifiedcp.run();
                return;
            }
            setStateInternal(i);
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

    public static int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (viewFindScrollingChild != null) {
                    return viewFindScrollingChild;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        clearChildFocusdefault clearchildfocusdefault;
        if (!view.isShown() || !this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
            this._init_lambda2 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.IconCompatParcelizer = -1;
            this._init_lambda1 = -1;
            VelocityTracker velocityTracker = this.getDefaultViewModelProviderFactory;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.getDefaultViewModelProviderFactory = null;
            }
        }
        if (this.getDefaultViewModelProviderFactory == null) {
            this.getDefaultViewModelProviderFactory = VelocityTracker.obtain();
        }
        this.getDefaultViewModelProviderFactory.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this._init_lambda1 = (int) motionEvent.getY();
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 2) {
                WeakReference<View> weakReference = this.MediaSessionCompatToken;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.write(x, this._init_lambda1, view2)) {
                    this.IconCompatParcelizer = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.ResultReceiver = true;
                }
            }
            this._init_lambda2 = this.IconCompatParcelizer == -1 && !coordinatorLayout.write(x, this._init_lambda1, view);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.ResultReceiver = false;
            this.IconCompatParcelizer = -1;
            if (this._init_lambda2) {
                this._init_lambda2 = false;
                return false;
            }
        }
        if (this._init_lambda2 || (clearchildfocusdefault = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) == null || !clearchildfocusdefault.read(motionEvent)) {
            WeakReference<View> weakReference2 = this.MediaSessionCompatToken;
            View view3 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this._init_lambda2 || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 1 || coordinatorLayout.write((int) motionEvent.getX(), (int) motionEvent.getY(), view3) || this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null || (i = this._init_lambda1) == -1 || Math.abs(i - motionEvent.getY()) <= this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        clearChildFocusdefault clearchildfocusdefault = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (clearchildfocusdefault != null && (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 || i == 1)) {
            clearchildfocusdefault.serializer(motionEvent);
        }
        if (actionMasked == 0) {
            this.IconCompatParcelizer = -1;
            this._init_lambda1 = -1;
            VelocityTracker velocityTracker = this.getDefaultViewModelProviderFactory;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.getDefaultViewModelProviderFactory = null;
            }
        }
        if (this.getDefaultViewModelProviderFactory == null) {
            this.getDefaultViewModelProviderFactory = VelocityTracker.obtain();
        }
        this.getDefaultViewModelProviderFactory.addMovement(motionEvent);
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null && ((this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 1) && actionMasked == 2 && !this._init_lambda2)) {
            float fAbs = Math.abs(this._init_lambda1 - motionEvent.getY());
            clearChildFocusdefault clearchildfocusdefault2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (fAbs > clearchildfocusdefault2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                clearchildfocusdefault2.write(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this._init_lambda2;
    }

    public final void setPeekHeight(int i, boolean z) {
        boolean z2 = this.addOnMultiWindowModeChangedListener;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.addOnMultiWindowModeChangedListener = true;
            }
        } else {
            if (!z2 && this.addOnNewIntentListener == i) {
                return;
            }
            this.addOnMultiWindowModeChangedListener = false;
            this.addOnNewIntentListener = Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    public final void updateAccessibilityActions(int i, View view) {
        int i2;
        AccessibilityDelegateCompat accessibilityDelegateCompat;
        if (view == null) {
            return;
        }
        clearAccessibilityAction(i, view);
        int i3 = 6;
        int i4 = 4;
        if (!this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 6) {
            SparseIntArray sparseIntArray = this.MediaMetadataCompat;
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            CSSParseException cSSParseException = new CSSParseException(this, i3, i4);
            ArrayList arrayListIconCompatParcelizer = FocusPropertiesNode.IconCompatParcelizer(view);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayListIconCompatParcelizer.size()) {
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        int[] iArr = FocusPropertiesNode.serializer;
                        if (i6 >= 32 || i7 != -1) {
                            break;
                        }
                        int i8 = iArr[i6];
                        boolean z = true;
                        for (int i9 = 0; i9 < arrayListIconCompatParcelizer.size(); i9++) {
                            z &= ((FocusRestorerNode) arrayListIconCompatParcelizer.get(i9)).read() != i8;
                        }
                        if (z) {
                            i7 = i8;
                        }
                        i6++;
                    }
                    i2 = i7;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((FocusRestorerNode) arrayListIconCompatParcelizer.get(i5)).r8lambda54BeH8ZsBru0CXI2CCSP2syNys).getLabel())) {
                    i2 = ((FocusRestorerNode) arrayListIconCompatParcelizer.get(i5)).read();
                    break;
                }
                i5++;
            }
            if (i2 != -1) {
                FocusRestorerNode focusRestorerNode = new FocusRestorerNode(null, i2, string, cSSParseException, null);
                View.AccessibilityDelegate accessibilityDelegateSerializer = FocusPropertiesNode.serializer(view);
                if (accessibilityDelegateSerializer == null) {
                    accessibilityDelegateCompat = null;
                } else if (accessibilityDelegateSerializer instanceof is1dFocusSearch3ESFkO8) {
                    accessibilityDelegateCompat = ((is1dFocusSearch3ESFkO8) accessibilityDelegateSerializer).RemoteActionCompatParcelizer;
                } else {
                    accessibilityDelegateCompat = new AccessibilityDelegateCompat(accessibilityDelegateSerializer);
                }
                if (accessibilityDelegateCompat == null) {
                    accessibilityDelegateCompat = new AccessibilityDelegateCompat();
                }
                FocusPropertiesNode.write(view, accessibilityDelegateCompat);
                FocusPropertiesNode.read(focusRestorerNode.read(), view);
                FocusPropertiesNode.IconCompatParcelizer(view).add(focusRestorerNode);
                FocusPropertiesNode.serializer(0, view);
            }
            sparseIntArray.put(i, i2);
        }
        if (this.PlaybackStateCompat && isHideableWhenDragging()) {
            int i10 = 5;
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 5) {
                FocusPropertiesNode.read(view, FocusRestorerNode.MediaBrowserCompatMediaItem, new CSSParseException(this, i10, i4));
            }
        }
        int i11 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i12 = 3;
        if (i11 == 3) {
            FocusPropertiesNode.read(view, FocusRestorerNode.read, new CSSParseException(this, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 ? 4 : 6, i4));
            return;
        }
        if (i11 != 4) {
            if (i11 != 6) {
                return;
            }
            FocusPropertiesNode.read(view, FocusRestorerNode.read, new CSSParseException(this, i4, i4));
            FocusPropertiesNode.read(view, FocusRestorerNode.MediaMetadataCompat, new CSSParseException(this, i12, i4));
        } else {
            FocusPropertiesNode.read(view, FocusRestorerNode.MediaMetadataCompat, new CSSParseException(this, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 ? 3 : 6, i4));
        }
    }

    public void setHalfExpandedRatio(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.MediaBrowserCompatMediaItem = f;
            if (this.ComponentActivity != null) {
                this.MediaDescriptionCompat = (int) ((1.0f - f) * this.MediaSessionCompatResultReceiverWrapper);
                return;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ratio must be a float value between 0 and 1");
    }

    public final int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.read;
        }
        if (i == 5) {
            return this.MediaSessionCompatResultReceiverWrapper;
        }
        if (i == 6) {
            return this.MediaDescriptionCompat;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid state to get top offset: "));
        return 0;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public final void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.ComponentActivity;
        if (weakReference != null) {
            updateAccessibilityActions(0, weakReference.get());
        }
        WeakReference<View> weakReference2 = this.serializer;
        if (weakReference2 != null) {
            updateAccessibilityActions(1, weakReference2.get());
        }
    }

    public BottomSheetBehavior() {
        this.enterPictureInPictureMode = 0;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = true;
        this.getDefaultViewModelCreationExtras = false;
        this.getOnBackPressedInput = -1;
        this.fullyDrawnReporter_delegatelambda00 = -1;
        this.getFullyDrawnReporter = new PlacementScope(this);
        this.MediaBrowserCompatMediaItem = 0.5f;
        this.RemoteActionCompatParcelizer = -1.0f;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 4;
        this.ParcelableVolumeInfo = 4;
        this._init_lambda3 = 0.1f;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ArrayList<>();
        this._init_lambda1 = -1;
        this.MediaMetadataCompat = new SparseIntArray();
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new placeRelative(this);
    }

    public static int IconCompatParcelizer() {
        int i = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i2 = i % 5298172;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i + 1;
        if (i2 != 0) {
            return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3;
        return i3;
    }
}
