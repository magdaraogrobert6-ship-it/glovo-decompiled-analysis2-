package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.graphics.Fields;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.EmojiProcessor;
import androidx.transition.Transition$1;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.internal.CheckableImageButton;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.sentiance.core.model.events.I$b;
import io.sentry.SentryUUID;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt;
import o.AndroidVectorResources;
import o.FocusListener;
import o.FocusOwnerImpl;
import o.FocusPropertiesNode;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.ScaleFactorKt;
import o.SimplePlacementScope;
import o.SubcomposeLayoutKt;
import o.SubcomposeLayoutKtSubcomposeLayout2;
import o.SubcomposeLayoutPausableCompositionException;
import o.SubcomposeSlotReusePolicy;
import o.TestModifierUpdater;
import o.TestModifierUpdaterKt;
import o.TestModifierUpdaterKtTestModifierUpdaterLayout11;
import o.TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy11;
import o.TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111;
import o.ValueInsets_androidKt;
import o.VerticalRulerCompanion;
import o.VerticalRulerCompanionmaxOf1;
import o.accessgetModulateAlphacp;
import o.accessgetReuseForceSyncDeactivationcp;
import o.accessgetReusedSlotIdp;
import o.accessgetSubcomposePausablecp;
import o.accessgetUnspecifiedSlotIdp;
import o.androidColorSpace;
import o.ensureSubDecor;
import o.freeFocus;
import o.getDeactivateOutOfFrameNjRlDlw;
import o.getFeatureKeys;
import o.getNestedScrollAxes;
import o.getResumePausedNjRlDlw;
import o.getRightimpl;
import o.getUnsetValueInsets;
import o.getUnspecified_hLwfpc;
import o.getZeroValueInsets;
import o.handleMotionFrameOfReferencePlacement;
import o.isSpecifiedFK8aYYsannotations;
import o.mergeRulerValues;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeAll;
import o.removeIf;
import o.setDropDownVerticalOffset;
import o.setMeasuredSizeozmzZPI;
import o.setPrevious;
import o.timesUQTWf7w;
import o.traverseAncestorsIncludingSelfQFhIj7k;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    private static int onCreatePanelMenu = 0;
    private static byte onMenuItemSelected = 0;
    private static int onNewIntent = 1;
    public static final int[][] read;
    public int ComponentActivity;
    public SubcomposeSlotReusePolicy IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public SubcomposeSlotReusePolicy MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public SubcomposeSlotReusePolicy PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public int _init_lambda1;
    public ColorDrawable _init_lambda2;
    public int _init_lambda3;
    public EditText _init_lambda4;
    public final LinkedHashSet accessensureViewModelStore;
    public final TestModifierUpdaterKtTestModifierUpdaterLayout11 addContentView;
    public int addMenuProvider;
    public boolean addObserverForBackInvoker;
    public int addObserverForBackInvokerlambda0;
    public boolean addOnConfigurationChangedListener;
    public int addOnContextAvailableListener;
    public getRightimpl addOnMultiWindowModeChangedListener;
    public int addOnNewIntentListener;
    public SubcomposeSlotReusePolicy addOnPictureInPictureModeChangedListener;
    public CharSequence addOnPictureInPictureUiStateChangedListener;
    public int addOnTrimMemoryListener;
    public boolean addOnUserLeaveHintListener;
    public StateListDrawable createFullyDrawnExecutor;
    public int defaultViewModelProviderFactory_delegatelambda0;
    public final EndCompoundLayout ensureViewModelStore;
    public Drawable enterPictureInPictureMode;
    public boolean fullyDrawnReporter_delegatelambda0;
    public boolean fullyDrawnReporter_delegatelambda00;
    public androidColorSpace getActivityResultRegistry;
    public int getDefaultViewModelCreationExtras;
    public androidColorSpace getDefaultViewModelProviderFactory;
    public CharSequence getFullyDrawnReporter;
    public ColorStateList getLastCustomNonConfigurationInstance;
    public boolean getLifecycle;
    public SubcomposeLayoutPausableCompositionException getNavigationEventDispatcher;
    public ColorDrawable getOnBackPressedDispatcher;
    public ColorStateList getOnBackPressedInput;
    public int getSavedStateRegistry;
    public boolean getSavedStateRegistryControllerannotations;
    public AppCompatTextView getViewModelStore;
    public final StartCompoundLayout initializeViewTreeOwners;
    public final Rect invalidateMenu;
    public CharSequence menuHostHelperlambda0;
    public final Rect onActivityResult;
    public final RectF onBackPressed;
    public int onBackPressedDispatcher_delegatelambda0;
    public int onBackPressedDispatcher_delegatelambda00;
    public boolean onBackPressedDispatcher_delegatelambda010;
    public final FrameLayout onBackPressedInput_delegatelambda0;
    public ColorStateList onConfigurationChanged;
    public Typeface onMultiWindowModeChanged;
    public ColorStateList r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final accessgetReuseForceSyncDeactivationcp r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public ColorStateList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public ColorStateList r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public AppCompatTextView r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public ColorStateList r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public ColorStateList r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public boolean serializer;
    public ValueAnimator write;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.getLifecycle = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.getLifecycle = false;
    }

    public int getBoxBackgroundColor() {
        return this.MediaDescriptionCompat;
    }

    public int getBoxBackgroundMode() {
        return this.RatingCompat;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.MediaSessionCompatQueueItem;
    }

    public int getBoxStrokeColor() {
        return this.addObserverForBackInvokerlambda0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.onConfigurationChanged;
    }

    public int getBoxStrokeWidth() {
        return this.ParcelableVolumeInfo;
    }

    public int getBoxStrokeWidthFocused() {
        return this.PlaybackStateCompat;
    }

    public int getCounterMaxLength() {
        return this.ComponentActivity;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public ColorStateList getCounterTextColor() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public ColorStateList getCursorColor() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    public ColorStateList getCursorErrorColor() {
        return this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    }

    public EditText getEditText() {
        return this._init_lambda4;
    }

    public ColorStateList getHintTextColor() {
        return this.getOnBackPressedInput;
    }

    public getRightimpl getLengthCounter() {
        return this.addOnMultiWindowModeChangedListener;
    }

    public int getMaxEms() {
        return this.addOnNewIntentListener;
    }

    public int getMaxWidth() {
        return this.addMenuProvider;
    }

    public int getMinEms() {
        return this.addOnContextAvailableListener;
    }

    public int getMinWidth() {
        return this.addOnTrimMemoryListener;
    }

    public int getPlaceholderTextAppearance() {
        return this.getDefaultViewModelCreationExtras;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.getLastCustomNonConfigurationInstance;
    }

    public SubcomposeLayoutPausableCompositionException getShapeAppearanceModel() {
        return this.getNavigationEventDispatcher;
    }

    public Typeface getTypeface() {
        return this.onMultiWindowModeChanged;
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.MediaSessionCompatQueueItem = i;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.fullyDrawnReporter_delegatelambda0 = z;
    }

    public void setLengthCounter(getRightimpl getrightimpl) {
        this.addOnMultiWindowModeChangedListener = getrightimpl;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new VerticalRulerCompanionmaxOf1();
        public CharSequence RemoteActionCompatParcelizer;
        public boolean write;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.RemoteActionCompatParcelizer = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.write = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.RemoteActionCompatParcelizer, parcel, i);
            parcel.writeInt(this.write ? 1 : 0);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.RemoteActionCompatParcelizer) + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this._init_lambda4;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.IconCompatParcelizer;
        }
        int iRemoteActionCompatParcelizer = mergeRulerValues.RemoteActionCompatParcelizer(R.attr.colorControlHighlight, this._init_lambda4);
        int i = this.RatingCompat;
        int[][] iArr = read;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.IconCompatParcelizer;
            int i2 = this.MediaDescriptionCompat;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{mergeRulerValues.write(0.1f, iRemoteActionCompatParcelizer, i2), i2}), subcomposeSlotReusePolicy, subcomposeSlotReusePolicy);
        }
        Context context = getContext();
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = this.IconCompatParcelizer;
        TypedValue typedValue = (TypedValue) BuildersKt.IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, new Object[]{context, Integer.valueOf(R.attr.colorSurface), "TextInputLayout"}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i3 = typedValue.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValue.data;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy3 = new SubcomposeSlotReusePolicy(subcomposeSlotReusePolicy2.getLifecycle.PlaybackStateCompat);
        int iWrite = mergeRulerValues.write(0.1f, iRemoteActionCompatParcelizer, color);
        subcomposeSlotReusePolicy3.MediaBrowserCompatMediaItem(new ColorStateList(iArr, new int[]{iWrite, 0}));
        subcomposeSlotReusePolicy3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iWrite, color});
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy4 = new SubcomposeSlotReusePolicy(subcomposeSlotReusePolicy2.getLifecycle.PlaybackStateCompat);
        subcomposeSlotReusePolicy4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, subcomposeSlotReusePolicy3, subcomposeSlotReusePolicy4), subcomposeSlotReusePolicy2});
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.menuHostHelperlambda0)) {
            return;
        }
        this.menuHostHelperlambda0 = charSequence;
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (charSequence == null || !TextUtils.equals(accessgetreuseforcesyncdeactivationcp.addContentView, charSequence)) {
            accessgetreuseforcesyncdeactivationcp.addContentView = charSequence;
            accessgetreuseforcesyncdeactivationcp.addOnConfigurationChangedListener = null;
            Bitmap bitmap = accessgetreuseforcesyncdeactivationcp.addObserverForBackInvokerlambda0;
            if (bitmap != null) {
                bitmap.recycle();
                accessgetreuseforcesyncdeactivationcp.addObserverForBackInvokerlambda0 = null;
            }
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
        if (this.getSavedStateRegistryControllerannotations) {
            return;
        }
        serializer();
    }

    public final int IconCompatParcelizer(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this._init_lambda4.getCompoundPaddingRight() : this.initializeViewTreeOwners.getPrefixTextStartOffset();
        } else {
            compoundPaddingRight = this.ensureViewModelStore.getSuffixTextEndOffset();
        }
        return i - compoundPaddingRight;
    }

    public final boolean MediaMetadataCompat() {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        return (testModifierUpdaterKtTestModifierUpdaterLayout11.MediaBrowserCompatMediaItem != 1 || testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null || TextUtils.isEmpty(testModifierUpdaterKtTestModifierUpdaterLayout11.PlaybackStateCompat)) ? false : true;
    }

    public final void RemoteActionCompatParcelizer(Editable editable) {
        ((GooglePlayLocationUtils$$ExternalSyntheticLambda18) this.addOnMultiWindowModeChangedListener).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.onBackPressedInput_delegatelambda0;
        if (length != 0 || this.getSavedStateRegistryControllerannotations) {
            AppCompatTextView appCompatTextView = this.getViewModelStore;
            if (appCompatTextView == null || !this.addOnUserLeaveHintListener) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            accessgetModulateAlphacp.serializer(frameLayout, this.getActivityResultRegistry);
            this.getViewModelStore.setVisibility(4);
            return;
        }
        if (this.getViewModelStore == null || !this.addOnUserLeaveHintListener || TextUtils.isEmpty(this.getFullyDrawnReporter)) {
            return;
        }
        this.getViewModelStore.setText(this.getFullyDrawnReporter);
        accessgetModulateAlphacp.serializer(frameLayout, this.getDefaultViewModelProviderFactory);
        this.getViewModelStore.setVisibility(0);
        this.getViewModelStore.bringToFront();
        announceForAccessibility(this.getFullyDrawnReporter);
    }

    public CharSequence getEndIconContentDescription() {
        return this.ensureViewModelStore.ParcelableVolumeInfo.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.ensureViewModelStore.ParcelableVolumeInfo.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.ensureViewModelStore.MediaMetadataCompat;
    }

    public int getEndIconMode() {
        return this.ensureViewModelStore.MediaDescriptionCompat;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.ensureViewModelStore.MediaBrowserCompatMediaItem;
    }

    public CheckableImageButton getEndIconView() {
        return this.ensureViewModelStore.ParcelableVolumeInfo;
    }

    public CharSequence getError() {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        if (testModifierUpdaterKtTestModifierUpdaterLayout11.PlaybackStateCompatCustomAction) {
            return testModifierUpdaterKtTestModifierUpdaterLayout11.PlaybackStateCompat;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.addContentView.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public CharSequence getErrorContentDescription() {
        return this.addContentView.ResultReceiver;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.addContentView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.ensureViewModelStore.ComponentActivity.getDrawable();
    }

    public CharSequence getHelperText() {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        if (testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
            return testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.addContentView.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public final float getHintCollapsedTextHeight() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
    }

    public final int getHintCurrentCollapsedTextColor() {
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return accessgetreuseforcesyncdeactivationcp.write(accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper);
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.ensureViewModelStore.ParcelableVolumeInfo.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.ensureViewModelStore.ParcelableVolumeInfo.getDrawable();
    }

    public CharSequence getPrefixText() {
        return this.initializeViewTreeOwners.RemoteActionCompatParcelizer;
    }

    public ColorStateList getPrefixTextColor() {
        return this.initializeViewTreeOwners.serializer.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.initializeViewTreeOwners.serializer;
    }

    public CharSequence getStartIconContentDescription() {
        return this.initializeViewTreeOwners.MediaSessionCompatQueueItem.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.initializeViewTreeOwners.MediaSessionCompatQueueItem.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.initializeViewTreeOwners.write;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.initializeViewTreeOwners.MediaDescriptionCompat;
    }

    public CharSequence getSuffixText() {
        return this.ensureViewModelStore.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    public ColorStateList getSuffixTextColor() {
        return this.ensureViewModelStore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.ensureViewModelStore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public final void read(boolean z, boolean z2) {
        int defaultColor = this.onConfigurationChanged.getDefaultColor();
        int colorForState = this.onConfigurationChanged.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.onConfigurationChanged.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.MediaBrowserCompatMediaItem = colorForState2;
        } else if (z2) {
            this.MediaBrowserCompatMediaItem = colorForState;
        } else {
            this.MediaBrowserCompatMediaItem = defaultColor;
        }
    }

    public final void serializer(float f) {
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (accessgetreuseforcesyncdeactivationcp.accessensureViewModelStore == f) {
            return;
        }
        int i = 1;
        if (this.write == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.write = valueAnimator;
            valueAnimator.setInterpolator(SentryUUID.IconCompatParcelizer(getContext(), R.attr.motionEasingEmphasizedInterpolator, handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer));
            this.write.setDuration(SentryUUID.write(getContext(), R.attr.motionDurationMedium4, 167));
            this.write.addUpdateListener(new AndroidVectorResources(i, this));
        }
        this.write.setFloatValues(accessgetreuseforcesyncdeactivationcp.accessensureViewModelStore, f);
        this.write.start();
    }

    public void setBoxCornerFamily(int i) {
        I$b i$bWrite = this.getNavigationEventDispatcher.write();
        SimplePlacementScope simplePlacementScope = this.getNavigationEventDispatcher.MediaDescriptionCompat;
        i$bWrite.IconCompatParcelizer = SubcomposeLayoutKtSubcomposeLayout2.read(i);
        i$bWrite.RemoteActionCompatParcelizer = simplePlacementScope;
        SimplePlacementScope simplePlacementScope2 = this.getNavigationEventDispatcher.PlaybackStateCompat;
        i$bWrite.read = SubcomposeLayoutKtSubcomposeLayout2.read(i);
        i$bWrite.MediaDescriptionCompat = simplePlacementScope2;
        SimplePlacementScope simplePlacementScope3 = this.getNavigationEventDispatcher.write;
        i$bWrite.write = SubcomposeLayoutKtSubcomposeLayout2.read(i);
        i$bWrite.MediaMetadataCompat = simplePlacementScope3;
        SimplePlacementScope simplePlacementScope4 = this.getNavigationEventDispatcher.read;
        i$bWrite.serializer = SubcomposeLayoutKtSubcomposeLayout2.read(i);
        i$bWrite.RatingCompat = simplePlacementScope4;
        this.getNavigationEventDispatcher = i$bWrite.IconCompatParcelizer();
        RemoteActionCompatParcelizer();
    }

    public void setBoxStrokeWidth(int i) {
        this.ParcelableVolumeInfo = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.PlaybackStateCompat = i;
        updateTextInputBoxState();
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = colorStateList;
        this.getOnBackPressedInput = colorStateList;
        if (this._init_lambda4 != null) {
            write(false, false);
        }
    }

    public void setEndIconActivated(boolean z) {
        this.ensureViewModelStore.ParcelableVolumeInfo.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.ensureViewModelStore.ParcelableVolumeInfo.setCheckable(z);
    }

    public void setEndIconMode(int i) {
        this.ensureViewModelStore.setEndIconMode(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.MediaSessionCompatQueueItem;
        checkableImageButton.setOnClickListener(onClickListener);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.MediaSessionCompatQueueItem = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.MediaBrowserCompatMediaItem = scaleType;
        endCompoundLayout.ParcelableVolumeInfo.setScaleType(scaleType);
        endCompoundLayout.ComponentActivity.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if (endCompoundLayout.PlaybackStateCompat != colorStateList) {
            endCompoundLayout.PlaybackStateCompat = colorStateList;
            getFeatureKeys.write(endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, endCompoundLayout.ParcelableVolumeInfo, colorStateList, endCompoundLayout.PlaybackStateCompatCustomAction);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if (endCompoundLayout.PlaybackStateCompatCustomAction != mode) {
            endCompoundLayout.PlaybackStateCompatCustomAction = mode;
            getFeatureKeys.write(endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, endCompoundLayout.ParcelableVolumeInfo, endCompoundLayout.PlaybackStateCompat, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.ensureViewModelStore.setEndIconVisible(z);
    }

    public void setError(CharSequence charSequence) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        if (!testModifierUpdaterKtTestModifierUpdaterLayout11.PlaybackStateCompatCustomAction) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            testModifierUpdaterKtTestModifierUpdaterLayout11.write();
            return;
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.serializer();
        testModifierUpdaterKtTestModifierUpdaterLayout11.PlaybackStateCompat = charSequence;
        testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.setText(charSequence);
        int i = testModifierUpdaterKtTestModifierUpdaterLayout11.RemoteActionCompatParcelizer;
        if (i != 1) {
            testModifierUpdaterKtTestModifierUpdaterLayout11.MediaBrowserCompatMediaItem = 1;
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.read(i, testModifierUpdaterKtTestModifierUpdaterLayout11.MediaBrowserCompatMediaItem, testModifierUpdaterKtTestModifierUpdaterLayout11.read(testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
        AppCompatTextView appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        testModifierUpdaterKtTestModifierUpdaterLayout11.ResultReceiver = charSequence;
        AppCompatTextView appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        TextInputLayout textInputLayout = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (testModifierUpdaterKtTestModifierUpdaterLayout11.PlaybackStateCompatCustomAction == z) {
            return;
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.serializer();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(testModifierUpdaterKtTestModifierUpdaterLayout11.MediaSessionCompatResultReceiverWrapper, null);
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.setTextAlignment(5);
            Typeface typeface = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (typeface != null) {
                testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.setTypeface(typeface);
            }
            int i = testModifierUpdaterKtTestModifierUpdaterLayout11.MediaSessionCompatToken;
            testModifierUpdaterKtTestModifierUpdaterLayout11.MediaSessionCompatToken = i;
            AppCompatTextView appCompatTextView2 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (appCompatTextView2 != null) {
                testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.setTextAppearanceCompatWithErrorFallback(appCompatTextView2, i);
            }
            ColorStateList colorStateList = testModifierUpdaterKtTestModifierUpdaterLayout11.ComponentActivity;
            testModifierUpdaterKtTestModifierUpdaterLayout11.ComponentActivity = colorStateList;
            AppCompatTextView appCompatTextView3 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = testModifierUpdaterKtTestModifierUpdaterLayout11.ResultReceiver;
            testModifierUpdaterKtTestModifierUpdaterLayout11.ResultReceiver = charSequence;
            AppCompatTextView appCompatTextView4 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2;
            AppCompatTextView appCompatTextView5 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.setVisibility(4);
            testModifierUpdaterKtTestModifierUpdaterLayout11.IconCompatParcelizer(testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, 0);
        } else {
            testModifierUpdaterKtTestModifierUpdaterLayout11.write();
            testModifierUpdaterKtTestModifierUpdaterLayout11.serializer(testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, 0);
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            textInputLayout.MediaSessionCompatQueueItem();
            textInputLayout.updateTextInputBoxState();
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.PlaybackStateCompatCustomAction = z;
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        CheckableImageButton checkableImageButton = endCompoundLayout.ComponentActivity;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.MediaSessionCompatResultReceiverWrapper;
        checkableImageButton.setOnClickListener(onClickListener);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.MediaSessionCompatResultReceiverWrapper = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.ComponentActivity;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if (endCompoundLayout.MediaSessionCompatToken != colorStateList) {
            endCompoundLayout.MediaSessionCompatToken = colorStateList;
            getFeatureKeys.write(endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, endCompoundLayout.ComponentActivity, colorStateList, endCompoundLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if (endCompoundLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != mode) {
            endCompoundLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = mode;
            getFeatureKeys.write(endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, endCompoundLayout.ComponentActivity, endCompoundLayout.MediaSessionCompatToken, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        testModifierUpdaterKtTestModifierUpdaterLayout11.MediaSessionCompatToken = i;
        AppCompatTextView appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (appCompatTextView != null) {
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.setTextAppearanceCompatWithErrorFallback(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        testModifierUpdaterKtTestModifierUpdaterLayout11.ComponentActivity = colorStateList;
        AppCompatTextView appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = colorStateList;
        AppCompatTextView appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        TextInputLayout textInputLayout = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == z) {
            return;
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.serializer();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(testModifierUpdaterKtTestModifierUpdaterLayout11.MediaSessionCompatResultReceiverWrapper, null);
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.setTextAlignment(5);
            Typeface typeface = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (typeface != null) {
                testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.setTypeface(typeface);
            }
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.setVisibility(4);
            AppCompatTextView appCompatTextView2 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
            AppCompatTextView appCompatTextView3 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = colorStateList;
            AppCompatTextView appCompatTextView4 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            testModifierUpdaterKtTestModifierUpdaterLayout11.IconCompatParcelizer(testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 1);
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.setAccessibilityDelegate(new TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy11(testModifierUpdaterKtTestModifierUpdaterLayout11));
        } else {
            testModifierUpdaterKtTestModifierUpdaterLayout11.serializer();
            int i2 = testModifierUpdaterKtTestModifierUpdaterLayout11.RemoteActionCompatParcelizer;
            if (i2 == 2) {
                testModifierUpdaterKtTestModifierUpdaterLayout11.MediaBrowserCompatMediaItem = 0;
            }
            testModifierUpdaterKtTestModifierUpdaterLayout11.read(i2, testModifierUpdaterKtTestModifierUpdaterLayout11.MediaBrowserCompatMediaItem, testModifierUpdaterKtTestModifierUpdaterLayout11.read(testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, ""));
            testModifierUpdaterKtTestModifierUpdaterLayout11.serializer(testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 1);
            testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
            textInputLayout.MediaSessionCompatQueueItem();
            textInputLayout.updateTextInputBoxState();
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
        AppCompatTextView appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHintTextAppearance(int i) {
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        TextInputLayout textInputLayout = accessgetreuseforcesyncdeactivationcp.addOnPictureInPictureModeChangedListener;
        isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations = new isSpecifiedFK8aYYsannotations(textInputLayout.getContext(), i);
        ColorStateList colorStateList = isspecifiedfk8ayysannotations.PlaybackStateCompat;
        if (colorStateList != null) {
            accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper = colorStateList;
        }
        float f = isspecifiedfk8ayysannotations.MediaSessionCompatResultReceiverWrapper;
        if (f != 0.0f) {
            accessgetreuseforcesyncdeactivationcp.PlaybackStateCompatCustomAction = f;
        }
        ColorStateList colorStateList2 = isspecifiedfk8ayysannotations.MediaMetadataCompat;
        if (colorStateList2 != null) {
            accessgetreuseforcesyncdeactivationcp.RatingCompat = colorStateList2;
        }
        accessgetreuseforcesyncdeactivationcp.MediaDescriptionCompat = isspecifiedfk8ayysannotations.MediaBrowserCompatMediaItem;
        accessgetreuseforcesyncdeactivationcp.MediaBrowserCompatMediaItem = isspecifiedfk8ayysannotations.MediaSessionCompatQueueItem;
        accessgetreuseforcesyncdeactivationcp.MediaMetadataCompat = isspecifiedfk8ayysannotations.MediaDescriptionCompat;
        accessgetreuseforcesyncdeactivationcp.MediaSessionCompatQueueItem = isspecifiedfk8ayysannotations.RatingCompat;
        getUnspecified_hLwfpc getunspecified_hlwfpc = accessgetreuseforcesyncdeactivationcp.IconCompatParcelizer;
        if (getunspecified_hlwfpc != null) {
            getunspecified_hlwfpc.read = true;
        }
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(17, accessgetreuseforcesyncdeactivationcp);
        isspecifiedfk8ayysannotations.RemoteActionCompatParcelizer();
        accessgetreuseforcesyncdeactivationcp.IconCompatParcelizer = new getUnspecified_hLwfpc(pinnableContainerKtLocalPinnableContainer1, isspecifiedfk8ayysannotations.serializer);
        isspecifiedfk8ayysannotations.write(textInputLayout.getContext(), accessgetreuseforcesyncdeactivationcp.IconCompatParcelizer);
        accessgetreuseforcesyncdeactivationcp.write(false);
        this.getOnBackPressedInput = accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper;
        if (this._init_lambda4 != null) {
            write(false, false);
            MediaSessionCompatToken();
        }
    }

    public void setMaxEms(int i) {
        this.addOnNewIntentListener = i;
        EditText editText = this._init_lambda4;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.addMenuProvider = i;
        EditText editText = this._init_lambda4;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMinEms(int i) {
        this.addOnContextAvailableListener = i;
        EditText editText = this._init_lambda4;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.addOnTrimMemoryListener = i;
        EditText editText = this._init_lambda4;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.PlaybackStateCompat = colorStateList;
        getFeatureKeys.write(endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, endCompoundLayout.ParcelableVolumeInfo, colorStateList, endCompoundLayout.PlaybackStateCompatCustomAction);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.PlaybackStateCompatCustomAction = mode;
        getFeatureKeys.write(endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, endCompoundLayout.ParcelableVolumeInfo, endCompoundLayout.PlaybackStateCompat, mode);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.getDefaultViewModelCreationExtras = i;
        AppCompatTextView appCompatTextView = this.getViewModelStore;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        startCompoundLayout.getClass();
        startCompoundLayout.RemoteActionCompatParcelizer = TextUtils.isEmpty(charSequence) ? null : charSequence;
        startCompoundLayout.serializer.setText(charSequence);
        startCompoundLayout.write();
    }

    public void setPrefixTextAppearance(int i) {
        this.initializeViewTreeOwners.serializer.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.initializeViewTreeOwners.serializer.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.initializeViewTreeOwners.MediaSessionCompatQueueItem.setCheckable(z);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? IntPair.write(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        CheckableImageButton checkableImageButton = startCompoundLayout.MediaSessionCompatQueueItem;
        View.OnLongClickListener onLongClickListener = startCompoundLayout.read;
        checkableImageButton.setOnClickListener(onClickListener);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        startCompoundLayout.read = onLongClickListener;
        CheckableImageButton checkableImageButton = startCompoundLayout.MediaSessionCompatQueueItem;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        startCompoundLayout.MediaDescriptionCompat = scaleType;
        startCompoundLayout.MediaSessionCompatQueueItem.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        if (startCompoundLayout.MediaBrowserCompatMediaItem != colorStateList) {
            startCompoundLayout.MediaBrowserCompatMediaItem = colorStateList;
            getFeatureKeys.write(startCompoundLayout.MediaMetadataCompat, startCompoundLayout.MediaSessionCompatQueueItem, colorStateList, startCompoundLayout.RatingCompat);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        if (startCompoundLayout.RatingCompat != mode) {
            startCompoundLayout.RatingCompat = mode;
            getFeatureKeys.write(startCompoundLayout.MediaMetadataCompat, startCompoundLayout.MediaSessionCompatQueueItem, startCompoundLayout.MediaBrowserCompatMediaItem, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.initializeViewTreeOwners.setStartIconVisible(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.getClass();
        endCompoundLayout.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = TextUtils.isEmpty(charSequence) ? null : charSequence;
        endCompoundLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setText(charSequence);
        endCompoundLayout.RemoteActionCompatParcelizer();
    }

    public void setSuffixTextAppearance(int i) {
        this.ensureViewModelStore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.ensureViewModelStore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setTextColor(colorStateList);
    }

    public final int write(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this._init_lambda4.getCompoundPaddingLeft() : this.ensureViewModelStore.getSuffixTextEndOffset();
        } else {
            compoundPaddingLeft = this.initializeViewTreeOwners.getPrefixTextStartOffset();
        }
        return compoundPaddingLeft + i;
    }

    public final androidColorSpace write() {
        androidColorSpace androidcolorspace = new androidColorSpace();
        androidcolorspace.MediaSessionCompatResultReceiverWrapper = SentryUUID.write(getContext(), R.attr.motionDurationShort2, 87);
        androidcolorspace.ResultReceiver = SentryUUID.IconCompatParcelizer(getContext(), R.attr.motionEasingLinearInterpolator, handleMotionFrameOfReferencePlacement.write);
        return androidcolorspace;
    }

    static {
        PlaybackStateCompatCustomAction();
        read = new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]};
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy;
        super.draw(canvas);
        boolean z = this.fullyDrawnReporter_delegatelambda00;
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (z) {
            TextPaint textPaint = accessgetreuseforcesyncdeactivationcp.addOnMultiWindowModeChangedListener;
            RectF rectF = accessgetreuseforcesyncdeactivationcp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int iSave = canvas.save();
            if (accessgetreuseforcesyncdeactivationcp.addOnConfigurationChangedListener != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(accessgetreuseforcesyncdeactivationcp.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                float f = accessgetreuseforcesyncdeactivationcp.ComponentActivity;
                float f2 = accessgetreuseforcesyncdeactivationcp.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                float f3 = accessgetreuseforcesyncdeactivationcp.onBackPressedDispatcher_delegatelambda0;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (accessgetreuseforcesyncdeactivationcp.onBackPressedDispatcher_delegatelambda010 <= 1 || accessgetreuseforcesyncdeactivationcp.fullyDrawnReporter_delegatelambda0) {
                    canvas.translate(f, f2);
                    accessgetreuseforcesyncdeactivationcp.addOnNewIntentListener.draw(canvas);
                } else {
                    float f4 = accessgetreuseforcesyncdeactivationcp.ComponentActivity;
                    float lineStart = accessgetreuseforcesyncdeactivationcp.addOnNewIntentListener.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(f4 - lineStart, f2);
                    float f5 = alpha;
                    textPaint.setAlpha((int) (accessgetreuseforcesyncdeactivationcp._init_lambda1 * f5));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(accessgetreuseforcesyncdeactivationcp.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, accessgetreuseforcesyncdeactivationcp.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, accessgetreuseforcesyncdeactivationcp.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, mergeRulerValues.read(accessgetreuseforcesyncdeactivationcp.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, textPaint.getAlpha()));
                    }
                    accessgetreuseforcesyncdeactivationcp.addOnNewIntentListener.draw(canvas);
                    textPaint.setAlpha((int) (accessgetreuseforcesyncdeactivationcp.MediaSessionCompatToken * f5));
                    if (i >= 31) {
                        textPaint.setShadowLayer(accessgetreuseforcesyncdeactivationcp.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, accessgetreuseforcesyncdeactivationcp.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, accessgetreuseforcesyncdeactivationcp.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, mergeRulerValues.read(accessgetreuseforcesyncdeactivationcp.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, textPaint.getAlpha()));
                    }
                    int lineBaseline = accessgetreuseforcesyncdeactivationcp.addOnNewIntentListener.getLineBaseline(0);
                    CharSequence charSequence = accessgetreuseforcesyncdeactivationcp.addOnContextAvailableListener;
                    float f6 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(accessgetreuseforcesyncdeactivationcp.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, accessgetreuseforcesyncdeactivationcp.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, accessgetreuseforcesyncdeactivationcp.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, accessgetreuseforcesyncdeactivationcp.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    }
                    String strTrim = accessgetreuseforcesyncdeactivationcp.addOnContextAvailableListener.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(accessgetreuseforcesyncdeactivationcp.addOnNewIntentListener.getLineEnd(0), str.length()), 0.0f, f6, (Paint) textPaint);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.MediaSessionCompatResultReceiverWrapper == null || (subcomposeSlotReusePolicy = this.PlaybackStateCompatCustomAction) == null) {
            return;
        }
        subcomposeSlotReusePolicy.draw(canvas);
        if (this._init_lambda4.isFocused()) {
            Rect bounds = this.MediaSessionCompatResultReceiverWrapper.getBounds();
            Rect bounds2 = this.PlaybackStateCompatCustomAction.getBounds();
            float f7 = accessgetreuseforcesyncdeactivationcp.accessensureViewModelStore;
            int iCenterX = bounds2.centerX();
            bounds.left = handleMotionFrameOfReferencePlacement.write(iCenterX, bounds2.left, f7);
            bounds.right = handleMotionFrameOfReferencePlacement.write(iCenterX, bounds2.right, f7);
            this.MediaSessionCompatResultReceiverWrapper.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this._init_lambda4;
        if (editText != null) {
            ThreadLocal threadLocal = accessgetSubcomposePausablecp.RemoteActionCompatParcelizer;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.invalidateMenu;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = accessgetSubcomposePausablecp.RemoteActionCompatParcelizer;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            accessgetSubcomposePausablecp.read(this, editText, matrix);
            ThreadLocal threadLocal3 = accessgetSubcomposePausablecp.write;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.PlaybackStateCompatCustomAction;
            if (subcomposeSlotReusePolicy != null) {
                int i5 = rect.bottom;
                subcomposeSlotReusePolicy.setBounds(rect.left, i5 - this.ParcelableVolumeInfo, rect.right, i5);
            }
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = this.MediaSessionCompatResultReceiverWrapper;
            if (subcomposeSlotReusePolicy2 != null) {
                int i6 = rect.bottom;
                subcomposeSlotReusePolicy2.setBounds(rect.left, i6 - this.PlaybackStateCompat, rect.right, i6);
            }
            if (this.fullyDrawnReporter_delegatelambda00) {
                float textSize = this._init_lambda4.getTextSize();
                accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (accessgetreuseforcesyncdeactivationcp.defaultViewModelProviderFactory_delegatelambda0 != textSize) {
                    accessgetreuseforcesyncdeactivationcp.defaultViewModelProviderFactory_delegatelambda0 = textSize;
                    accessgetreuseforcesyncdeactivationcp.write(false);
                }
                int gravity = this._init_lambda4.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (accessgetreuseforcesyncdeactivationcp.PlaybackStateCompat != i7) {
                    accessgetreuseforcesyncdeactivationcp.PlaybackStateCompat = i7;
                    accessgetreuseforcesyncdeactivationcp.write(false);
                }
                if (accessgetreuseforcesyncdeactivationcp.createFullyDrawnExecutor != gravity) {
                    accessgetreuseforcesyncdeactivationcp.createFullyDrawnExecutor = gravity;
                    accessgetreuseforcesyncdeactivationcp.write(false);
                }
                if (this._init_lambda4 == null) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                    return;
                }
                boolean zWrite = getResumePausedNjRlDlw.write(this);
                int i8 = rect.bottom;
                Rect rect2 = this.onActivityResult;
                rect2.bottom = i8;
                int i9 = this.RatingCompat;
                int i10 = rect.left;
                if (i9 == 1) {
                    rect2.left = write(i10, zWrite);
                    rect2.top = rect.top + this.MediaSessionCompatQueueItem;
                    rect2.right = IconCompatParcelizer(rect.right, zWrite);
                } else if (i9 != 2) {
                    rect2.left = write(i10, zWrite);
                    rect2.top = getPaddingTop();
                    rect2.right = IconCompatParcelizer(rect.right, zWrite);
                } else {
                    rect2.left = this._init_lambda4.getPaddingLeft() + i10;
                    rect2.top = rect.top - read();
                    rect2.right = rect.right - this._init_lambda4.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    accessgetreuseforcesyncdeactivationcp.write = true;
                }
                if (this._init_lambda4 == null) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                    return;
                }
                TextPaint textPaint = accessgetreuseforcesyncdeactivationcp.enterPictureInPictureMode;
                textPaint.setTextSize(accessgetreuseforcesyncdeactivationcp.defaultViewModelProviderFactory_delegatelambda0);
                textPaint.setTypeface(accessgetreuseforcesyncdeactivationcp.ensureViewModelStore);
                textPaint.setLetterSpacing(accessgetreuseforcesyncdeactivationcp._init_lambda2);
                float f = -textPaint.ascent();
                rect2.left = this._init_lambda4.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.RatingCompat != 1 || this._init_lambda4.getMinLines() > 1) ? rect.top + this._init_lambda4.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this._init_lambda4.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.RatingCompat != 1 || this._init_lambda4.getMinLines() > 1) ? rect.bottom - this._init_lambda4.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = accessgetreuseforcesyncdeactivationcp.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    accessgetreuseforcesyncdeactivationcp.write = true;
                }
                accessgetreuseforcesyncdeactivationcp.write(false);
                if (!IconCompatParcelizer() || this.getSavedStateRegistryControllerannotations) {
                    return;
                }
                serializer();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        EditText editText2 = this._init_lambda4;
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        int i3 = 1;
        if (editText2 != null && this._init_lambda4.getMeasuredHeight() < (iMax = Math.max(endCompoundLayout.getMeasuredHeight(), this.initializeViewTreeOwners.getMeasuredHeight()))) {
            this._init_lambda4.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zUpdateDummyDrawables = updateDummyDrawables();
        if (z || zUpdateDummyDrawables) {
            this._init_lambda4.post(new getUnsetValueInsets(this, i3));
        }
        if (this.getViewModelStore != null && (editText = this._init_lambda4) != null) {
            this.getViewModelStore.setGravity(editText.getGravity());
            this.getViewModelStore.setPadding(this._init_lambda4.getCompoundPaddingLeft(), this._init_lambda4.getCompoundPaddingTop(), this._init_lambda4.getCompoundPaddingRight(), this._init_lambda4.getCompoundPaddingBottom());
        }
        endCompoundLayout.write();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        IconCompatParcelizer(this, z);
        super.setEnabled(z);
    }

    public final void setTextAppearanceCompatWithErrorFallback(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(R.color.design_error));
    }

    private void setEditText(EditText editText) {
        if (this._init_lambda4 != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("We already have an EditText, can only have one");
            return;
        }
        getEndIconMode();
        this._init_lambda4 = editText;
        int i = this.addOnContextAvailableListener;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.addOnTrimMemoryListener);
        }
        int i2 = this.addOnNewIntentListener;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.addMenuProvider);
        }
        this.serializer = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new getZeroValueInsets(this));
        Typeface typeface = this._init_lambda4.getTypeface();
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetreuseforcesyncdeactivationcp.serializer(typeface);
        float textSize = this._init_lambda4.getTextSize();
        if (accessgetreuseforcesyncdeactivationcp.defaultViewModelProviderFactory_delegatelambda0 != textSize) {
            accessgetreuseforcesyncdeactivationcp.defaultViewModelProviderFactory_delegatelambda0 = textSize;
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
        float letterSpacing = this._init_lambda4.getLetterSpacing();
        if (accessgetreuseforcesyncdeactivationcp._init_lambda2 != letterSpacing) {
            accessgetreuseforcesyncdeactivationcp._init_lambda2 = letterSpacing;
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
        int gravity = this._init_lambda4.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (accessgetreuseforcesyncdeactivationcp.PlaybackStateCompat != i3) {
            accessgetreuseforcesyncdeactivationcp.PlaybackStateCompat = i3;
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
        if (accessgetreuseforcesyncdeactivationcp.createFullyDrawnExecutor != gravity) {
            accessgetreuseforcesyncdeactivationcp.createFullyDrawnExecutor = gravity;
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
        this._init_lambda4.addTextChangedListener(new ValueInsets_androidKt(0, this));
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == null) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = this._init_lambda4.getHintTextColors();
        }
        if (this.fullyDrawnReporter_delegatelambda00) {
            if (TextUtils.isEmpty(this.menuHostHelperlambda0)) {
                CharSequence hint = this._init_lambda4.getHint();
                this.addOnPictureInPictureUiStateChangedListener = hint;
                setHint(hint);
                this._init_lambda4.setHint((CharSequence) null);
            }
            this.addOnConfigurationChangedListener = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RatingCompat();
        }
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            write(this._init_lambda4.getText());
        }
        MediaSessionCompatQueueItem();
        this.addContentView.RemoteActionCompatParcelizer();
        this.initializeViewTreeOwners.bringToFront();
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.bringToFront();
        Iterator it = this.accessensureViewModelStore.iterator();
        while (it.hasNext()) {
            ((TestModifierUpdaterKt) it.next()).serializer(this);
        }
        endCompoundLayout.write();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        write(false, true);
    }

    public final boolean IconCompatParcelizer() {
        return this.fullyDrawnReporter_delegatelambda00 && !TextUtils.isEmpty(this.menuHostHelperlambda0) && (this.IconCompatParcelizer instanceof removeAll);
    }

    public final void MediaBrowserCompatMediaItem() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (appCompatTextView != null) {
            setTextAppearanceCompatWithErrorFallback(appCompatTextView, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            if (!this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && (colorStateList2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setTextColor(colorStateList2);
            }
            if (!this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 || (colorStateList = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) == null) {
                return;
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setTextColor(colorStateList);
        }
    }

    public final void MediaDescriptionCompat() {
        EditText editText = this._init_lambda4;
        if (editText == null || this.IconCompatParcelizer == null) {
            return;
        }
        if ((this.serializer || editText.getBackground() == null) && this.RatingCompat != 0) {
            EditText editText2 = this._init_lambda4;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            editText2.setBackground(editTextBoxBackground);
            this.serializer = true;
        }
    }

    public final void MediaSessionCompatQueueItem() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this._init_lambda4;
        if (editText == null || this.RatingCompat != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = getNestedScrollAxes.read;
        Drawable drawableMutate = background.mutate();
        if (MediaMetadataCompat()) {
            drawableMutate.setColorFilter(ensureSubDecor.RemoteActionCompatParcelizer(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && (appCompatTextView = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
            drawableMutate.setColorFilter(ensureSubDecor.RemoteActionCompatParcelizer(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this._init_lambda4.refreshDrawableState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this._init_lambda4;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.addOnPictureInPictureUiStateChangedListener != null) {
            boolean z = this.addOnConfigurationChangedListener;
            this.addOnConfigurationChangedListener = false;
            CharSequence hint = editText.getHint();
            this._init_lambda4.setHint(this.addOnPictureInPictureUiStateChangedListener);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this._init_lambda4.setHint(hint);
                this.addOnConfigurationChangedListener = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.onBackPressedInput_delegatelambda0;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this._init_lambda4) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this._init_lambda4;
        if (editText == null) {
            return super.getBaseline();
        }
        int baseline = editText.getBaseline();
        return read() + getPaddingTop() + baseline;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zWrite = getResumePausedNjRlDlw.write(this);
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.getNavigationEventDispatcher;
        RectF rectF = this.onBackPressed;
        return zWrite ? subcomposeLayoutPausableCompositionException.write.write(rectF) : subcomposeLayoutPausableCompositionException.read.write(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zWrite = getResumePausedNjRlDlw.write(this);
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.getNavigationEventDispatcher;
        RectF rectF = this.onBackPressed;
        return zWrite ? subcomposeLayoutPausableCompositionException.read.write(rectF) : subcomposeLayoutPausableCompositionException.write.write(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zWrite = getResumePausedNjRlDlw.write(this);
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.getNavigationEventDispatcher;
        RectF rectF = this.onBackPressed;
        return zWrite ? subcomposeLayoutPausableCompositionException.MediaDescriptionCompat.write(rectF) : subcomposeLayoutPausableCompositionException.PlaybackStateCompat.write(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zWrite = getResumePausedNjRlDlw.write(this);
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.getNavigationEventDispatcher;
        RectF rectF = this.onBackPressed;
        return zWrite ? subcomposeLayoutPausableCompositionException.PlaybackStateCompat.write(rectF) : subcomposeLayoutPausableCompositionException.MediaDescriptionCompat.write(rectF);
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.ResultReceiver && this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && (appCompatTextView = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public CharSequence getHint() {
        if (this.fullyDrawnReporter_delegatelambda00) {
            return this.menuHostHelperlambda0;
        }
        return null;
    }

    public CharSequence getPlaceholderText() {
        if (this.addOnUserLeaveHintListener) {
            return this.getFullyDrawnReporter;
        }
        return null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.IconCompatParcelizer);
        setError(savedState.RemoteActionCompatParcelizer);
        if (savedState.write) {
            post(new getUnsetValueInsets(this, 0));
        }
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.MediaDescriptionCompat != i) {
            this.MediaDescriptionCompat = i;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i;
            this.defaultViewModelProviderFactory_delegatelambda0 = i;
            this.onBackPressedDispatcher_delegatelambda0 = i;
            RemoteActionCompatParcelizer();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = defaultColor;
        this.MediaDescriptionCompat = defaultColor;
        this._init_lambda3 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.defaultViewModelProviderFactory_delegatelambda0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.onBackPressedDispatcher_delegatelambda0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        RemoteActionCompatParcelizer();
    }

    public void setBoxStrokeColor(int i) {
        if (this.addObserverForBackInvokerlambda0 != i) {
            this.addObserverForBackInvokerlambda0 = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.onConfigurationChanged != colorStateList) {
            this.onConfigurationChanged = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != i) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
            MediaBrowserCompatMediaItem();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != colorStateList) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = colorStateList;
            MediaBrowserCompatMediaItem();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != i) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
            MediaBrowserCompatMediaItem();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != colorStateList) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = colorStateList;
            MediaBrowserCompatMediaItem();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != colorStateList) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = colorStateList;
            RatingCompat();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != colorStateList) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = colorStateList;
            if (MediaMetadataCompat() || (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null && this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) {
                RatingCompat();
            }
        }
    }

    public void setEndIconDrawable(int i) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        Drawable drawableWrite = i != 0 ? IntPair.write(endCompoundLayout.getContext(), i) : null;
        TextInputLayout textInputLayout = endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
        checkableImageButton.setImageDrawable(drawableWrite);
        if (drawableWrite != null) {
            getFeatureKeys.write(textInputLayout, checkableImageButton, endCompoundLayout.PlaybackStateCompat, endCompoundLayout.PlaybackStateCompatCustomAction);
            getFeatureKeys.read(textInputLayout, checkableImageButton, endCompoundLayout.PlaybackStateCompat);
        }
    }

    public void setEndIconMinSize(int i) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if (i < 0) {
            endCompoundLayout.getClass();
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("endIconSize cannot be less than 0");
        } else if (i != endCompoundLayout.MediaMetadataCompat) {
            endCompoundLayout.MediaMetadataCompat = i;
            CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = endCompoundLayout.ComponentActivity;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setErrorIconDrawable(int i) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.setErrorIconDrawable(i != 0 ? IntPair.write(endCompoundLayout.getContext(), i) : null);
        getFeatureKeys.read(endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, endCompoundLayout.ComponentActivity, endCompoundLayout.MediaSessionCompatToken);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.addObserverForBackInvoker != z) {
            this.addObserverForBackInvoker = z;
            write(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
        if (zIsEmpty) {
            if (testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
            setHelperTextEnabled(true);
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.serializer();
        testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = charSequence;
        testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.setText(charSequence);
        int i = testModifierUpdaterKtTestModifierUpdaterLayout11.RemoteActionCompatParcelizer;
        if (i != 2) {
            testModifierUpdaterKtTestModifierUpdaterLayout11.MediaBrowserCompatMediaItem = 2;
        }
        testModifierUpdaterKtTestModifierUpdaterLayout11.read(i, testModifierUpdaterKtTestModifierUpdaterLayout11.MediaBrowserCompatMediaItem, testModifierUpdaterKtTestModifierUpdaterLayout11.read(testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, charSequence));
    }

    public void setHintEnabled(boolean z) {
        if (z != this.fullyDrawnReporter_delegatelambda00) {
            this.fullyDrawnReporter_delegatelambda00 = z;
            if (z) {
                CharSequence hint = this._init_lambda4.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.menuHostHelperlambda0)) {
                        setHint(hint);
                    }
                    this._init_lambda4.setHint((CharSequence) null);
                }
                this.addOnConfigurationChangedListener = true;
            } else {
                this.addOnConfigurationChangedListener = false;
                if (!TextUtils.isEmpty(this.menuHostHelperlambda0) && TextUtils.isEmpty(this._init_lambda4.getHint())) {
                    this._init_lambda4.setHint(this.menuHostHelperlambda0);
                }
                setHintInternal(null);
            }
            if (this._init_lambda4 != null) {
                MediaSessionCompatToken();
            }
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.getOnBackPressedInput != colorStateList) {
            if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == null) {
                accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper != colorStateList) {
                    accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper = colorStateList;
                    accessgetreuseforcesyncdeactivationcp.write(false);
                }
            }
            this.getOnBackPressedInput = colorStateList;
            if (this._init_lambda4 != null) {
                write(false, false);
            }
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        endCompoundLayout.ParcelableVolumeInfo.setImageDrawable(i != 0 ? IntPair.write(endCompoundLayout.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if (z && endCompoundLayout.MediaDescriptionCompat != 1) {
            endCompoundLayout.setEndIconMode(1);
        } else if (z) {
            endCompoundLayout.getClass();
        } else {
            endCompoundLayout.setEndIconMode(0);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.getLastCustomNonConfigurationInstance != colorStateList) {
            this.getLastCustomNonConfigurationInstance = colorStateList;
            AppCompatTextView appCompatTextView = this.getViewModelStore;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setShapeAppearanceModel(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.IconCompatParcelizer;
        if (subcomposeSlotReusePolicy == null || subcomposeSlotReusePolicy.getLifecycle.PlaybackStateCompat == subcomposeLayoutPausableCompositionException) {
            return;
        }
        this.getNavigationEventDispatcher = subcomposeLayoutPausableCompositionException;
        RemoteActionCompatParcelizer();
    }

    public void setStartIconMinSize(int i) {
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        if (i < 0) {
            startCompoundLayout.getClass();
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("startIconSize cannot be less than 0");
        } else if (i != startCompoundLayout.write) {
            startCompoundLayout.write = i;
            CheckableImageButton checkableImageButton = startCompoundLayout.MediaSessionCompatQueueItem;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setTextInputAccessibilityDelegate(getZeroValueInsets getzerovalueinsets) {
        EditText editText = this._init_lambda4;
        if (editText != null) {
            FocusPropertiesNode.write(editText, getzerovalueinsets);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.onMultiWindowModeChanged) {
            this.onMultiWindowModeChanged = typeface;
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(typeface);
            TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
            if (typeface != testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
                testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = typeface;
                AppCompatTextView appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void updateTextInputBoxState() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.IconCompatParcelizer == null || this.RatingCompat == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this._init_lambda4) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this._init_lambda4) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.MediaBrowserCompatMediaItem = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        } else if (MediaMetadataCompat()) {
            if (this.onConfigurationChanged != null) {
                read(z2, z);
            } else {
                this.MediaBrowserCompatMediaItem = getErrorCurrentTextColors();
            }
        } else if (!this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 || (appCompatTextView = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) == null) {
            if (z2) {
                this.MediaBrowserCompatMediaItem = this.addObserverForBackInvokerlambda0;
            } else if (z) {
                this.MediaBrowserCompatMediaItem = this.onBackPressedDispatcher_delegatelambda00;
            } else {
                this.MediaBrowserCompatMediaItem = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            }
        } else if (this.onConfigurationChanged != null) {
            read(z2, z);
        } else {
            this.MediaBrowserCompatMediaItem = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RatingCompat();
        }
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        TextInputLayout textInputLayout = endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
        TextInputLayout textInputLayout2 = endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        endCompoundLayout.updateErrorIconVisibility();
        getFeatureKeys.read(textInputLayout2, endCompoundLayout.ComponentActivity, endCompoundLayout.MediaSessionCompatToken);
        getFeatureKeys.read(textInputLayout2, checkableImageButton, endCompoundLayout.PlaybackStateCompat);
        if (endCompoundLayout.getEndIconDelegate() instanceof removeIf) {
            if (!textInputLayout.MediaMetadataCompat() || checkableImageButton.getDrawable() == null) {
                getFeatureKeys.write(textInputLayout, checkableImageButton, endCompoundLayout.PlaybackStateCompat, endCompoundLayout.PlaybackStateCompatCustomAction);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        getFeatureKeys.read(startCompoundLayout.MediaMetadataCompat, startCompoundLayout.MediaSessionCompatQueueItem, startCompoundLayout.MediaBrowserCompatMediaItem);
        if (this.RatingCompat == 2) {
            int i = this.MediaSessionCompatToken;
            if (z2 && isEnabled()) {
                this.MediaSessionCompatToken = this.PlaybackStateCompat;
            } else {
                this.MediaSessionCompatToken = this.ParcelableVolumeInfo;
            }
            if (this.MediaSessionCompatToken != i && IconCompatParcelizer() && !this.getSavedStateRegistryControllerannotations) {
                if (IconCompatParcelizer()) {
                    ((removeAll) this.IconCompatParcelizer).serializer(0.0f, 0.0f, 0.0f, 0.0f);
                }
                serializer();
            }
        }
        if (this.RatingCompat == 1) {
            if (!isEnabled()) {
                this.MediaDescriptionCompat = this._init_lambda3;
            } else if (z && !z2) {
                this.MediaDescriptionCompat = this.onBackPressedDispatcher_delegatelambda0;
            } else if (z2) {
                this.MediaDescriptionCompat = this.defaultViewModelProviderFactory_delegatelambda0;
            } else {
                this.MediaDescriptionCompat = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            }
        }
        RemoteActionCompatParcelizer();
    }

    public final void write(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this._init_lambda4;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this._init_lambda4;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (colorStateList2 != null) {
            accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            int colorForState = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer(ColorStateList.valueOf(colorForState));
        } else if (MediaMetadataCompat()) {
            AppCompatTextView appCompatTextView2 = this.addContentView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && (appCompatTextView = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
            accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.getOnBackPressedInput) != null && accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper != colorStateList) {
            accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper = colorStateList;
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
        if (z3 || !this.addObserverForBackInvoker || (isEnabled() && z4)) {
            if (z2 || this.getSavedStateRegistryControllerannotations) {
                ValueAnimator valueAnimator = this.write;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.write.cancel();
                }
                if (z && this.fullyDrawnReporter_delegatelambda0) {
                    serializer(1.0f);
                } else {
                    accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer(1.0f);
                }
                this.getSavedStateRegistryControllerannotations = false;
                if (IconCompatParcelizer()) {
                    serializer();
                }
                EditText editText3 = this._init_lambda4;
                RemoteActionCompatParcelizer(editText3 != null ? editText3.getText() : null);
                startCompoundLayout.IconCompatParcelizer = false;
                startCompoundLayout.write();
                endCompoundLayout.ResultReceiver = false;
                endCompoundLayout.RemoteActionCompatParcelizer();
                return;
            }
            return;
        }
        if (z2 || !this.getSavedStateRegistryControllerannotations) {
            ValueAnimator valueAnimator2 = this.write;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.write.cancel();
            }
            if (z && this.fullyDrawnReporter_delegatelambda0) {
                serializer(0.0f);
            } else {
                accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer(0.0f);
            }
            if (IconCompatParcelizer() && !((removeAll) this.IconCompatParcelizer).read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.isEmpty() && IconCompatParcelizer()) {
                ((removeAll) this.IconCompatParcelizer).serializer(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.getSavedStateRegistryControllerannotations = true;
            AppCompatTextView appCompatTextView3 = this.getViewModelStore;
            if (appCompatTextView3 != null && this.addOnUserLeaveHintListener) {
                appCompatTextView3.setText((CharSequence) null);
                accessgetModulateAlphacp.serializer(this.onBackPressedInput_delegatelambda0, this.getActivityResultRegistry);
                this.getViewModelStore.setVisibility(4);
            }
            startCompoundLayout.IconCompatParcelizer = true;
            startCompoundLayout.write();
            endCompoundLayout.ResultReceiver = true;
            endCompoundLayout.RemoteActionCompatParcelizer();
        }
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.addOnPictureInPictureModeChangedListener == null) {
            this.addOnPictureInPictureModeChangedListener = write(true);
        }
        return this.addOnPictureInPictureModeChangedListener;
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.addOnUserLeaveHintListener == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.getViewModelStore;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.getViewModelStore = null;
        } else if (appCompatTextView != null) {
            this.onBackPressedInput_delegatelambda0.addView(appCompatTextView);
            this.getViewModelStore.setVisibility(0);
        }
        this.addOnUserLeaveHintListener = z;
    }

    public final void MediaSessionCompatToken() {
        if (this.RatingCompat != 1) {
            FrameLayout frameLayout = this.onBackPressedInput_delegatelambda0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int i = read();
            if (i != layoutParams.topMargin) {
                layoutParams.topMargin = i;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    public final void RatingCompat() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueSerializer = BuildersKt.serializer(context, R.attr.colorControlActivated);
            if (typedValueSerializer != null) {
                int i = typedValueSerializer.resourceId;
                if (i != 0) {
                    colorStateListValueOf = FocusListener.write(context, i);
                } else {
                    int i2 = typedValueSerializer.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this._init_lambda4;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable textCursorDrawable = this._init_lambda4.getTextCursorDrawable();
        if ((MediaMetadataCompat() || (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null && this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) && (colorStateList = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) != null) {
            colorStateListValueOf = colorStateList;
        }
        textCursorDrawable.setTintList(colorStateListValueOf);
    }

    public final void RemoteActionCompatParcelizer() {
        int i;
        int i2;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.IconCompatParcelizer;
        if (subcomposeSlotReusePolicy == null) {
            return;
        }
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = subcomposeSlotReusePolicy.getLifecycle.PlaybackStateCompat;
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException2 = this.getNavigationEventDispatcher;
        if (subcomposeLayoutPausableCompositionException != subcomposeLayoutPausableCompositionException2) {
            subcomposeSlotReusePolicy.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException2);
        }
        if (this.RatingCompat == 2 && (i = this.MediaSessionCompatToken) > -1 && (i2 = this.MediaBrowserCompatMediaItem) != 0) {
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = this.IconCompatParcelizer;
            subcomposeSlotReusePolicy2.getLifecycle.ParcelableVolumeInfo = i;
            subcomposeSlotReusePolicy2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy2.getLifecycle;
            if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateListValueOf) {
                accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateListValueOf;
                subcomposeSlotReusePolicy2.onStateChange(subcomposeSlotReusePolicy2.getState());
            }
        }
        int iRemoteActionCompatParcelizer = this.MediaDescriptionCompat;
        if (this.RatingCompat == 1) {
            iRemoteActionCompatParcelizer = setPrevious.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, mergeRulerValues.write(getContext(), R.attr.colorSurface, 0));
        }
        this.MediaDescriptionCompat = iRemoteActionCompatParcelizer;
        this.IconCompatParcelizer.MediaBrowserCompatMediaItem(ColorStateList.valueOf(iRemoteActionCompatParcelizer));
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy3 = this.PlaybackStateCompatCustomAction;
        if (subcomposeSlotReusePolicy3 != null && this.MediaSessionCompatResultReceiverWrapper != null) {
            if (this.MediaSessionCompatToken > -1 && this.MediaBrowserCompatMediaItem != 0) {
                subcomposeSlotReusePolicy3.MediaBrowserCompatMediaItem(this._init_lambda4.isFocused() ? ColorStateList.valueOf(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) : ColorStateList.valueOf(this.MediaBrowserCompatMediaItem));
                this.MediaSessionCompatResultReceiverWrapper.MediaBrowserCompatMediaItem(ColorStateList.valueOf(this.MediaBrowserCompatMediaItem));
            }
            invalidate();
        }
        MediaDescriptionCompat();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.RatingCompat) {
            return;
        }
        this.RatingCompat = i;
        if (this._init_lambda4 != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.ResultReceiver != z) {
            TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.addContentView;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.onMultiWindowModeChanged;
                if (typeface != null) {
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setTypeface(typeface);
                }
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setMaxLines(1);
                testModifierUpdaterKtTestModifierUpdaterLayout11.IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 2);
                ((ViewGroup.MarginLayoutParams) this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                MediaBrowserCompatMediaItem();
                if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                    EditText editText = this._init_lambda4;
                    write(editText != null ? editText.getText() : null);
                }
            } else {
                testModifierUpdaterKtTestModifierUpdaterLayout11.serializer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 2);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            }
            this.ResultReceiver = z;
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.createFullyDrawnExecutor == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.createFullyDrawnExecutor = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.createFullyDrawnExecutor.addState(new int[0], write(false));
        }
        return this.createFullyDrawnExecutor;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.onBackPressedInput_delegatelambda0;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        MediaSessionCompatToken();
        setEditText((EditText) view);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.onBackPressedDispatcher_delegatelambda010) {
            return;
        }
        this.onBackPressedDispatcher_delegatelambda010 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (accessgetreuseforcesyncdeactivationcp != null) {
            accessgetreuseforcesyncdeactivationcp.onBackPressedInput_delegatelambda0 = drawableState;
            ColorStateList colorStateList2 = accessgetreuseforcesyncdeactivationcp.MediaSessionCompatResultReceiverWrapper;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = accessgetreuseforcesyncdeactivationcp._init_lambda4) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                accessgetreuseforcesyncdeactivationcp.write(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this._init_lambda4 != null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            write(isLaidOut() && isEnabled(), false);
        }
        MediaSessionCompatQueueItem();
        updateTextInputBoxState();
        if (z) {
            invalidate();
        }
        this.onBackPressedDispatcher_delegatelambda010 = false;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (MediaMetadataCompat()) {
            savedState.RemoteActionCompatParcelizer = getError();
        }
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        savedState.write = endCompoundLayout.MediaDescriptionCompat != 0 && endCompoundLayout.ParcelableVolumeInfo.MediaMetadataCompat;
        return savedState;
    }

    public final int read() {
        float fWrite;
        if (!this.fullyDrawnReporter_delegatelambda00) {
            return 0;
        }
        int i = this.RatingCompat;
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i == 0) {
            fWrite = accessgetreuseforcesyncdeactivationcp.write();
        } else {
            if (i != 2) {
                return 0;
            }
            fWrite = accessgetreuseforcesyncdeactivationcp.write() / 2.0f;
        }
        return (int) fWrite;
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = colorStateList.getDefaultColor();
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.onBackPressedDispatcher_delegatelambda00 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.addObserverForBackInvokerlambda0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.addObserverForBackInvokerlambda0 != colorStateList.getDefaultColor()) {
            this.addObserverForBackInvokerlambda0 = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setCounterMaxLength(int i) {
        if (this.ComponentActivity != i) {
            if (i > 0) {
                this.ComponentActivity = i;
            } else {
                this.ComponentActivity = -1;
            }
            if (!this.ResultReceiver || this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                return;
            }
            EditText editText = this._init_lambda4;
            write(editText == null ? null : editText.getText());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean updateDummyDrawables() {
        boolean z;
        if (this._init_lambda4 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            StartCompoundLayout startCompoundLayout = this.initializeViewTreeOwners;
            if (startCompoundLayout.getMeasuredWidth() > 0) {
                int measuredWidth = startCompoundLayout.getMeasuredWidth() - this._init_lambda4.getPaddingLeft();
                if (this.getOnBackPressedDispatcher == null || this.getSavedStateRegistry != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.getOnBackPressedDispatcher = colorDrawable;
                    this.getSavedStateRegistry = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this._init_lambda4.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.getOnBackPressedDispatcher;
                if (drawable != colorDrawable2) {
                    this._init_lambda4.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.getOnBackPressedDispatcher != null) {
                Drawable[] compoundDrawablesRelative2 = this._init_lambda4.getCompoundDrawablesRelative();
                this._init_lambda4.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.getOnBackPressedDispatcher = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.getOnBackPressedDispatcher != null) {
            Drawable[] compoundDrawablesRelative3 = this._init_lambda4.getCompoundDrawablesRelative();
            this._init_lambda4.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.getOnBackPressedDispatcher = null;
            z = true;
        } else {
            z = false;
        }
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if ((endCompoundLayout.serializer() || ((endCompoundLayout.MediaDescriptionCompat != 0 && endCompoundLayout.IconCompatParcelizer()) || endCompoundLayout.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null)) && endCompoundLayout.getMeasuredWidth() > 0) {
            int measuredWidth2 = endCompoundLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getMeasuredWidth() - this._init_lambda4.getPaddingRight();
            if (endCompoundLayout.serializer()) {
                checkableImageButton = endCompoundLayout.ComponentActivity;
            } else if (endCompoundLayout.MediaDescriptionCompat != 0 && endCompoundLayout.IconCompatParcelizer()) {
                checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this._init_lambda4.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this._init_lambda2;
            if (colorDrawable3 != null && this._init_lambda1 != measuredWidth2) {
                this._init_lambda1 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this._init_lambda4.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this._init_lambda2, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this._init_lambda2 = colorDrawable4;
                this._init_lambda1 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this._init_lambda2;
            if (drawable2 != colorDrawable5) {
                this.enterPictureInPictureMode = drawable2;
                this._init_lambda4.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this._init_lambda2 != null) {
            Drawable[] compoundDrawablesRelative5 = this._init_lambda4.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this._init_lambda2) {
                this._init_lambda4.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.enterPictureInPictureMode, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this._init_lambda2 = null;
            return z2;
        }
        return z;
    }

    public static void IconCompatParcelizer(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                IconCompatParcelizer((ViewGroup) childAt, z);
            }
        }
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.getViewModelStore == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.getViewModelStore = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.getViewModelStore;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            appCompatTextView2.setImportantForAccessibility(2);
            androidColorSpace androidcolorspaceWrite = write();
            this.getDefaultViewModelProviderFactory = androidcolorspaceWrite;
            androidcolorspaceWrite._init_lambda4 = 67L;
            this.getActivityResultRegistry = write();
            setPlaceholderTextAppearance(this.getDefaultViewModelCreationExtras);
            setPlaceholderTextColor(this.getLastCustomNonConfigurationInstance);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.addOnUserLeaveHintListener) {
                setPlaceholderTextEnabled(true);
            }
            this.getFullyDrawnReporter = charSequence;
        }
        EditText editText = this._init_lambda4;
        RemoteActionCompatParcelizer(editText != null ? editText.getText() : null);
    }

    public final SubcomposeSlotReusePolicy write(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this._init_lambda4;
        float popupElevation = editText instanceof TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 ? ((TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        accessgetUnspecifiedSlotIdp accessgetunspecifiedslotidp = new accessgetUnspecifiedSlotIdp();
        accessgetUnspecifiedSlotIdp accessgetunspecifiedslotidp2 = new accessgetUnspecifiedSlotIdp();
        accessgetUnspecifiedSlotIdp accessgetunspecifiedslotidp3 = new accessgetUnspecifiedSlotIdp();
        accessgetUnspecifiedSlotIdp accessgetunspecifiedslotidp4 = new accessgetUnspecifiedSlotIdp();
        int i = 1;
        Transition$1 transition$1 = new Transition$1(i);
        Transition$1 transition$2 = new Transition$1(i);
        Transition$1 transition$3 = new Transition$1(i);
        Transition$1 transition$4 = new Transition$1(i);
        SubcomposeLayoutKt subcomposeLayoutKt = new SubcomposeLayoutKt(f);
        SubcomposeLayoutKt subcomposeLayoutKt2 = new SubcomposeLayoutKt(f);
        SubcomposeLayoutKt subcomposeLayoutKt3 = new SubcomposeLayoutKt(dimensionPixelOffset);
        SubcomposeLayoutKt subcomposeLayoutKt4 = new SubcomposeLayoutKt(dimensionPixelOffset);
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = new SubcomposeLayoutPausableCompositionException(0);
        subcomposeLayoutPausableCompositionException.MediaMetadataCompat = accessgetunspecifiedslotidp;
        subcomposeLayoutPausableCompositionException.PlaybackStateCompatCustomAction = accessgetunspecifiedslotidp2;
        subcomposeLayoutPausableCompositionException.IconCompatParcelizer = accessgetunspecifiedslotidp3;
        subcomposeLayoutPausableCompositionException.RemoteActionCompatParcelizer = accessgetunspecifiedslotidp4;
        subcomposeLayoutPausableCompositionException.MediaDescriptionCompat = subcomposeLayoutKt;
        subcomposeLayoutPausableCompositionException.PlaybackStateCompat = subcomposeLayoutKt2;
        subcomposeLayoutPausableCompositionException.read = subcomposeLayoutKt4;
        subcomposeLayoutPausableCompositionException.write = subcomposeLayoutKt3;
        subcomposeLayoutPausableCompositionException.MediaBrowserCompatMediaItem = transition$1;
        subcomposeLayoutPausableCompositionException.RatingCompat = transition$2;
        subcomposeLayoutPausableCompositionException.serializer = transition$3;
        subcomposeLayoutPausableCompositionException.MediaSessionCompatQueueItem = transition$4;
        EditText editText2 = this._init_lambda4;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 ? ((TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = SubcomposeSlotReusePolicy.getFullyDrawnReporter;
            TypedValue typedValue = (TypedValue) BuildersKt.IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, new Object[]{context, Integer.valueOf(R.attr.colorSurface), "MaterialShapeDrawable"}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
            int i2 = typedValue.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValue.data);
        }
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy();
        subcomposeSlotReusePolicy.write(context);
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(dropDownBackgroundTintList);
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(popupElevation);
        subcomposeSlotReusePolicy.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy.getLifecycle;
        if (accessgetreusedslotidp.MediaDescriptionCompat == null) {
            accessgetreusedslotidp.MediaDescriptionCompat = new Rect();
        }
        subcomposeSlotReusePolicy.getLifecycle.MediaDescriptionCompat.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        subcomposeSlotReusePolicy.invalidateSelf();
        return subcomposeSlotReusePolicy;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 1;
        boolean z = i == 1;
        if (z != this.RemoteActionCompatParcelizer) {
            SimplePlacementScope simplePlacementScope = this.getNavigationEventDispatcher.MediaDescriptionCompat;
            RectF rectF = this.onBackPressed;
            float fWrite = simplePlacementScope.write(rectF);
            float fWrite2 = this.getNavigationEventDispatcher.PlaybackStateCompat.write(rectF);
            float fWrite3 = this.getNavigationEventDispatcher.write.write(rectF);
            float fWrite4 = this.getNavigationEventDispatcher.read.write(rectF);
            SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.getNavigationEventDispatcher;
            timesUQTWf7w timesuqtwf7w = subcomposeLayoutPausableCompositionException.MediaMetadataCompat;
            timesUQTWf7w timesuqtwf7w2 = subcomposeLayoutPausableCompositionException.PlaybackStateCompatCustomAction;
            timesUQTWf7w timesuqtwf7w3 = subcomposeLayoutPausableCompositionException.RemoteActionCompatParcelizer;
            timesUQTWf7w timesuqtwf7w4 = subcomposeLayoutPausableCompositionException.IconCompatParcelizer;
            Transition$1 transition$1 = new Transition$1(i2);
            Transition$1 transition$2 = new Transition$1(i2);
            Transition$1 transition$3 = new Transition$1(i2);
            Transition$1 transition$4 = new Transition$1(i2);
            SubcomposeLayoutKt subcomposeLayoutKt = new SubcomposeLayoutKt(fWrite2);
            SubcomposeLayoutKt subcomposeLayoutKt2 = new SubcomposeLayoutKt(fWrite);
            SubcomposeLayoutKt subcomposeLayoutKt3 = new SubcomposeLayoutKt(fWrite4);
            SubcomposeLayoutKt subcomposeLayoutKt4 = new SubcomposeLayoutKt(fWrite3);
            SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException2 = new SubcomposeLayoutPausableCompositionException(0);
            subcomposeLayoutPausableCompositionException2.MediaMetadataCompat = timesuqtwf7w2;
            subcomposeLayoutPausableCompositionException2.PlaybackStateCompatCustomAction = timesuqtwf7w;
            subcomposeLayoutPausableCompositionException2.IconCompatParcelizer = timesuqtwf7w3;
            subcomposeLayoutPausableCompositionException2.RemoteActionCompatParcelizer = timesuqtwf7w4;
            subcomposeLayoutPausableCompositionException2.MediaDescriptionCompat = subcomposeLayoutKt;
            subcomposeLayoutPausableCompositionException2.PlaybackStateCompat = subcomposeLayoutKt2;
            subcomposeLayoutPausableCompositionException2.read = subcomposeLayoutKt4;
            subcomposeLayoutPausableCompositionException2.write = subcomposeLayoutKt3;
            subcomposeLayoutPausableCompositionException2.MediaBrowserCompatMediaItem = transition$1;
            subcomposeLayoutPausableCompositionException2.RatingCompat = transition$2;
            subcomposeLayoutPausableCompositionException2.serializer = transition$3;
            subcomposeLayoutPausableCompositionException2.MediaSessionCompatQueueItem = transition$4;
            this.RemoteActionCompatParcelizer = z;
            setShapeAppearanceModel(subcomposeLayoutPausableCompositionException2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    public final void serializer() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (IconCompatParcelizer()) {
            int width = this._init_lambda4.getWidth();
            int gravity = this._init_lambda4.getGravity();
            accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            boolean zWrite = accessgetreuseforcesyncdeactivationcp.write(accessgetreuseforcesyncdeactivationcp.addContentView);
            accessgetreuseforcesyncdeactivationcp.fullyDrawnReporter_delegatelambda0 = zWrite;
            Rect rect = accessgetreuseforcesyncdeactivationcp.RemoteActionCompatParcelizer;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zWrite) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo;
                    }
                } else if (zWrite) {
                    f = rect.right;
                    f2 = accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.onBackPressed;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (accessgetreuseforcesyncdeactivationcp.fullyDrawnReporter_delegatelambda0) {
                        f5 = accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (accessgetreuseforcesyncdeactivationcp.fullyDrawnReporter_delegatelambda0) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = accessgetreuseforcesyncdeactivationcp.write() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.MediaMetadataCompat;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.MediaSessionCompatToken);
                removeAll removeall = (removeAll) this.IconCompatParcelizer;
                removeall.getClass();
                removeall.serializer(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.onBackPressed;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo / 2.0f);
            } else {
                f4 = (width / 2.0f) + (accessgetreuseforcesyncdeactivationcp.ParcelableVolumeInfo / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = accessgetreuseforcesyncdeactivationcp.write() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public SubcomposeSlotReusePolicy getBoxBackground() {
        int i = this.RatingCompat;
        if (i == 1 || i == 2) {
            return this.IconCompatParcelizer;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public final void onApplyBoxBackgroundMode() {
        int i = this.RatingCompat;
        if (i == 0) {
            this.IconCompatParcelizer = null;
            this.PlaybackStateCompatCustomAction = null;
            this.MediaSessionCompatResultReceiverWrapper = null;
        } else if (i == 1) {
            this.IconCompatParcelizer = new SubcomposeSlotReusePolicy(this.getNavigationEventDispatcher);
            this.PlaybackStateCompatCustomAction = new SubcomposeSlotReusePolicy();
            this.MediaSessionCompatResultReceiverWrapper = new SubcomposeSlotReusePolicy();
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.RatingCompat, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.fullyDrawnReporter_delegatelambda00 || (this.IconCompatParcelizer instanceof removeAll)) {
                this.IconCompatParcelizer = new SubcomposeSlotReusePolicy(this.getNavigationEventDispatcher);
            } else {
                SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.getNavigationEventDispatcher;
                int i2 = removeAll.serializer;
                if (subcomposeLayoutPausableCompositionException == null) {
                    subcomposeLayoutPausableCompositionException = new SubcomposeLayoutPausableCompositionException();
                }
                TestModifierUpdater testModifierUpdater = new TestModifierUpdater(subcomposeLayoutPausableCompositionException, new RectF());
                removeAll removeall = new removeAll(testModifierUpdater);
                removeall.read = testModifierUpdater;
                this.IconCompatParcelizer = removeall;
            }
            this.PlaybackStateCompatCustomAction = null;
            this.MediaSessionCompatResultReceiverWrapper = null;
        }
        MediaDescriptionCompat();
        updateTextInputBoxState();
        if (this.RatingCompat == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.MediaSessionCompatQueueItem = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ScaleFactorKt.write(getContext())) {
                this.MediaSessionCompatQueueItem = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this._init_lambda4 != null && this.RatingCompat == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this._init_lambda4;
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this._init_lambda4.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ScaleFactorKt.write(getContext())) {
                EditText editText2 = this._init_lambda4;
                WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this._init_lambda4.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.RatingCompat != 0) {
            MediaSessionCompatToken();
        }
        EditText editText3 = this._init_lambda4;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.RatingCompat;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout), attributeSet, R.attr.textInputStyle);
        this.addOnContextAvailableListener = -1;
        this.addOnNewIntentListener = -1;
        this.addOnTrimMemoryListener = -1;
        this.addMenuProvider = -1;
        this.addContentView = new TestModifierUpdaterKtTestModifierUpdaterLayout11(this);
        this.addOnMultiWindowModeChangedListener = new GooglePlayLocationUtils$$ExternalSyntheticLambda18(22);
        this.invalidateMenu = new Rect();
        this.onActivityResult = new Rect();
        this.onBackPressed = new RectF();
        this.accessensureViewModelStore = new LinkedHashSet();
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = new accessgetReuseForceSyncDeactivationcp(this);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = accessgetreuseforcesyncdeactivationcp;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.onBackPressedInput_delegatelambda0 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = handleMotionFrameOfReferencePlacement.write;
        accessgetreuseforcesyncdeactivationcp.addMenuProvider = linearInterpolator;
        accessgetreuseforcesyncdeactivationcp.write(false);
        accessgetreuseforcesyncdeactivationcp.onBackPressedDispatcher_delegatelambda00 = linearInterpolator;
        accessgetreuseforcesyncdeactivationcp.write(false);
        if (accessgetreuseforcesyncdeactivationcp.PlaybackStateCompat != 8388659) {
            accessgetreuseforcesyncdeactivationcp.PlaybackStateCompat = 8388659;
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
        getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout);
        int[] iArr = setMeasuredSizeozmzZPI.TextInputLayout;
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context2, attributeSet, iArr, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout);
        EmojiProcessor emojiProcessor = new EmojiProcessor(context2, typedArrayObtainStyledAttributes);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, emojiProcessor);
        this.initializeViewTreeOwners = startCompoundLayout;
        this.fullyDrawnReporter_delegatelambda00 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.fullyDrawnReporter_delegatelambda0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.addObserverForBackInvoker = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.getNavigationEventDispatcher = SubcomposeLayoutPausableCompositionException.serializer(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout).IconCompatParcelizer();
        this.MediaMetadataCompat = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.PlaybackStateCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.MediaSessionCompatToken = this.ParcelableVolumeInfo;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        I$b i$bWrite = this.getNavigationEventDispatcher.write();
        if (dimension >= 0.0f) {
            i$bWrite.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(dimension);
        }
        if (dimension2 >= 0.0f) {
            i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(dimension2);
        }
        if (dimension3 >= 0.0f) {
            i$bWrite.RatingCompat = new SubcomposeLayoutKt(dimension3);
        }
        if (dimension4 >= 0.0f) {
            i$bWrite.MediaMetadataCompat = new SubcomposeLayoutKt(dimension4);
        }
        this.getNavigationEventDispatcher = i$bWrite.IconCompatParcelizer();
        ColorStateList colorStateListIconCompatParcelizer = ScaleFactorKt.IconCompatParcelizer(context2, emojiProcessor, 7);
        if (colorStateListIconCompatParcelizer != null) {
            int defaultColor = colorStateListIconCompatParcelizer.getDefaultColor();
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = defaultColor;
            this.MediaDescriptionCompat = defaultColor;
            if (colorStateListIconCompatParcelizer.isStateful()) {
                this._init_lambda3 = colorStateListIconCompatParcelizer.getColorForState(new int[]{-16842910}, -1);
                this.defaultViewModelProviderFactory_delegatelambda0 = colorStateListIconCompatParcelizer.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.onBackPressedDispatcher_delegatelambda0 = colorStateListIconCompatParcelizer.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.defaultViewModelProviderFactory_delegatelambda0 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                ColorStateList colorStateListWrite = FocusListener.write(context2, R.color.mtrl_filled_background_color);
                this._init_lambda3 = colorStateListWrite.getColorForState(new int[]{-16842910}, -1);
                this.onBackPressedDispatcher_delegatelambda0 = colorStateListWrite.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.MediaDescriptionCompat = 0;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 0;
            this._init_lambda3 = 0;
            this.defaultViewModelProviderFactory_delegatelambda0 = 0;
            this.onBackPressedDispatcher_delegatelambda0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListSerializer = emojiProcessor.serializer(1);
            this.getOnBackPressedInput = colorStateListSerializer;
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = colorStateListSerializer;
        }
        ColorStateList colorStateListIconCompatParcelizer2 = ScaleFactorKt.IconCompatParcelizer(context2, emojiProcessor, 14);
        this.addObserverForBackInvokerlambda0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = context2.getColor(R.color.mtrl_textinput_disabled_color);
        this.onBackPressedDispatcher_delegatelambda00 = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListIconCompatParcelizer2 != null) {
            setBoxStrokeColorStateList(colorStateListIconCompatParcelizer2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(ScaleFactorKt.IconCompatParcelizer(context2, emojiProcessor, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = emojiProcessor.serializer(24);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = emojiProcessor.serializer(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(emojiProcessor.serializer(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(emojiProcessor.serializer(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(emojiProcessor.serializer(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(emojiProcessor.serializer(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(emojiProcessor.serializer(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(emojiProcessor.serializer(58));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, emojiProcessor);
        this.ensureViewModelStore = endCompoundLayout;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        emojiProcessor.IconCompatParcelizer();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setImportantForAccessibility(2);
        freeFocus.serializer(this, 1);
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public void setHint(int i) {
        String strIntern;
        CharSequence charSequence;
        int i2 = 2 % 2;
        int i3 = onCreatePanelMenu + 33;
        int i4 = i3 % Fields.SpotShadowColor;
        onNewIntent = i4;
        int i5 = i3 % 2;
        CharSequence charSequence2 = null;
        if (i != 0) {
            int i6 = i4 + 123;
            onCreatePanelMenu = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Resources resources = getResources();
            String string = resources.getString(i);
            if (!string.startsWith("%('")) {
                charSequence = string;
            } else {
                int i8 = onNewIntent + 13;
                onCreatePanelMenu = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    String strSubstring = string.substring(3);
                    Object[] objArr = new Object[1];
                    a(strSubstring, objArr);
                    ((String) objArr[0]).intern();
                    boolean z = resources.getText(i) instanceof Spanned;
                    throw null;
                }
                String strSubstring2 = string.substring(3);
                Object[] objArr2 = new Object[1];
                a(strSubstring2, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                CharSequence text = resources.getText(i);
                if (text instanceof Spanned) {
                    charSequence = strIntern;
                    SpannableString spannableString = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                    int i9 = onCreatePanelMenu + 29;
                    onNewIntent = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    charSequence = spannableString;
                }
            }
            charSequence = strIntern;
            int i11 = onCreatePanelMenu + 13;
            onNewIntent = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            charSequence2 = charSequence;
        }
        setHint(charSequence2);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        String string;
        String strIntern;
        int i2 = 2 % 2;
        int i3 = onNewIntent;
        int i4 = i3 + 73;
        int i5 = i4 % Fields.SpotShadowColor;
        onCreatePanelMenu = i5;
        int i6 = i4 % 2;
        if (i != 0) {
            int i7 = i3 + 117;
            onCreatePanelMenu = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Resources resources = getResources();
            string = resources.getString(i);
            if (!(!string.startsWith("%('"))) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                strIntern = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(i);
                if (text instanceof Spanned) {
                    charSequence = string;
                    charSequence = strIntern;
                    SpannableString spannableString = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                    charSequence = spannableString;
                }
            }
        } else {
            int i9 = i5 + 13;
            onNewIntent = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 3 / 4;
            }
            charSequence = null;
        }
        charSequence = string;
        charSequence = strIntern;
        charSequence = string;
        setStartIconContentDescription(charSequence);
    }

    public void setHint(CharSequence charSequence) {
        if (this.fullyDrawnReporter_delegatelambda00) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(Fields.CameraDistance);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.initializeViewTreeOwners.MediaSessionCompatQueueItem;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.initializeViewTreeOwners.setStartIconDrawable(drawable);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0069 A[PHI: r3
  0x0069: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v9 java.lang.String) binds: [B:7:0x0021, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        int i2 = 2 % 2;
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        CharSequence charSequence = null;
        if (i != 0) {
            int i3 = onCreatePanelMenu + 41;
            onNewIntent = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                endCompoundLayout.getResources().getString(i).startsWith("%('");
                throw null;
            }
            Resources resources = endCompoundLayout.getResources();
            String string = resources.getString(i);
            if (string.startsWith("%('")) {
                int i4 = onCreatePanelMenu + 17;
                onNewIntent = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    int i6 = onCreatePanelMenu + 109;
                    onNewIntent = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    charSequence = spannableString;
                } else {
                    charSequence = string;
                }
            } else {
                charSequence = string;
            }
        }
        endCompoundLayout.ParcelableVolumeInfo.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.ensureViewModelStore.ParcelableVolumeInfo.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.ensureViewModelStore.ParcelableVolumeInfo.setImageDrawable(drawable);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setEndIconContentDescription(int i) {
        String string;
        int i2 = 2 % 2;
        int i3 = onNewIntent;
        int i4 = i3 + 71;
        onCreatePanelMenu = i4 % Fields.SpotShadowColor;
        Object obj = null;
        CharSequence charSequence = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        if (i != 0) {
            int i5 = i3 + 115;
            onCreatePanelMenu = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Resources resources = endCompoundLayout.getResources();
            string = resources.getString(i);
            if (!(!string.startsWith("%('"))) {
                int i7 = onNewIntent + 75;
                onCreatePanelMenu = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                String strSubstring = string.substring(3);
                Object[] objArr = new Object[1];
                a(strSubstring, objArr);
                String strIntern = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(i);
                if (text instanceof Spanned) {
                    charSequence = string;
                    SpannableString spannableString = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                    charSequence = spannableString;
                } else {
                    charSequence = string;
                    charSequence = strIntern;
                }
            }
        }
        charSequence = string;
        CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.ensureViewModelStore.ParcelableVolumeInfo;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.ensureViewModelStore.setErrorIconDrawable(drawable);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ onMenuItemSelected);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public void setEndIconDrawable(Drawable drawable) {
        EndCompoundLayout endCompoundLayout = this.ensureViewModelStore;
        TextInputLayout textInputLayout = endCompoundLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            getFeatureKeys.write(textInputLayout, checkableImageButton, endCompoundLayout.PlaybackStateCompat, endCompoundLayout.PlaybackStateCompatCustomAction);
            getFeatureKeys.read(textInputLayout, checkableImageButton, endCompoundLayout.PlaybackStateCompat);
        }
    }

    public final void write(Editable editable) {
        int length;
        boolean z;
        Locale locale;
        FocusOwnerImpl focusOwnerImpl;
        int i = 2 % 2;
        ((GooglePlayLocationUtils$$ExternalSyntheticLambda18) this.addOnMultiWindowModeChangedListener).getClass();
        if (editable != null) {
            int i2 = onCreatePanelMenu + 37;
            onNewIntent = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            length = editable.length();
        } else {
            length = 0;
        }
        boolean z2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i4 = this.ComponentActivity;
        if (i4 == -1) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setText(String.valueOf(length));
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setContentDescription(null);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = false;
        } else {
            if (length > i4) {
                int i5 = onNewIntent + 11;
                onCreatePanelMenu = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = z;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            int i7 = this.ComponentActivity;
            int i8 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description;
            Object[] objArr = {Integer.valueOf(length), Integer.valueOf(i7)};
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                int i9 = onCreatePanelMenu + 25;
                onNewIntent = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                locale = configuration.getLocales().get(0);
            } else {
                locale = configuration.locale;
            }
            String string = resources.getString(i8);
            if (string.startsWith("%('")) {
                Object[] objArr2 = new Object[1];
                a(string.substring(3), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            appCompatTextView.setContentDescription(String.format(locale, string, objArr));
            if (z2 != this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                int i11 = onNewIntent + 91;
                onCreatePanelMenu = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    MediaBrowserCompatMediaItem();
                    int i12 = 30 / 0;
                } else {
                    MediaBrowserCompatMediaItem();
                }
            }
            String str = FocusOwnerImpl.IconCompatParcelizer;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                int i13 = onNewIntent + 77;
                onCreatePanelMenu = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                focusOwnerImpl = FocusOwnerImpl.RemoteActionCompatParcelizer;
            } else {
                focusOwnerImpl = FocusOwnerImpl.write;
            }
            AppCompatTextView appCompatTextView2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            String string2 = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.ComponentActivity));
            focusOwnerImpl.getClass();
            setDropDownVerticalOffset setdropdownverticaloffset = traverseAncestorsIncludingSelfQFhIj7k.serializer;
            appCompatTextView2.setText(string2 != null ? focusOwnerImpl.write(string2).toString() : null);
        }
        if (this._init_lambda4 != null) {
            int i15 = onNewIntent + 49;
            int i16 = i15 % Fields.SpotShadowColor;
            onCreatePanelMenu = i16;
            int i17 = i15 % 2;
            if (z2 != this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                int i18 = i16 + 111;
                onNewIntent = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                write(false, false);
                updateTextInputBoxState();
                MediaSessionCompatQueueItem();
            }
        }
    }

    static void PlaybackStateCompatCustomAction() {
        onMenuItemSelected = (byte) -112;
    }
}
