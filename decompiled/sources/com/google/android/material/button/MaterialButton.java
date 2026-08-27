package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.I$b;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.FocusListener;
import o.FocusPropertiesNode;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.PlaceableKtDefaultLayerBlock1;
import o.PlatformWindowInsetsAnimation;
import o.RectRulers;
import o.ScaleFactorKt;
import o.SubcomposeLayoutKt;
import o.SubcomposeLayoutKtSubcomposeLayout2;
import o.SubcomposeLayoutPausableCompositionException;
import o.VerticalRulerCompanion;
import o.createPausedPrecomposition;
import o.getDeactivateOutOfFrameNjRlDlw;
import o.getResumePausedNjRlDlw;
import o.outermostOf;
import o.setMeasuredSizeozmzZPI;
import o.supportInvalidateOptionsMenu;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends supportInvalidateOptionsMenu implements Checkable, createPausedPrecomposition {
    public final LinkedHashSet ComponentActivity;
    public String MediaBrowserCompatMediaItem;
    public Drawable MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public PorterDuff.Mode PlaybackStateCompat;
    public ColorStateList PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public final PlatformWindowInsetsAnimation ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public RectRulers r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final int[] write = {R.attr.state_checkable};
    public static final int[] RemoteActionCompatParcelizer = {R.attr.state_checked};

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public Drawable getIcon() {
        return this.MediaDescriptionCompat;
    }

    public int getIconGravity() {
        return this.MediaMetadataCompat;
    }

    public int getIconPadding() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public int getIconSize() {
        return this.ParcelableVolumeInfo;
    }

    public ColorStateList getIconTint() {
        return this.PlaybackStateCompatCustomAction;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.PlaybackStateCompat;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.MediaSessionCompatQueueItem;
    }

    public void setA11yClassName(String str) {
        this.MediaBrowserCompatMediaItem = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(RectRulers rectRulers) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = rectRulers;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new PlaceableKtDefaultLayerBlock1();
        public boolean write;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.write ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.write = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.MediaBrowserCompatMediaItem)) {
            return this.MediaBrowserCompatMediaItem;
        }
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        return ((platformWindowInsetsAnimation == null || !platformWindowInsetsAnimation.RemoteActionCompatParcelizer) ? Button.class : CompoundButton.class).getName();
    }

    public int getInsetBottom() {
        return this.ResultReceiver.MediaDescriptionCompat;
    }

    public int getInsetTop() {
        return this.ResultReceiver.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        if (platformWindowInsetsAnimation != null && platformWindowInsetsAnimation.RemoteActionCompatParcelizer) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, write);
        }
        if (this.MediaSessionCompatQueueItem) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, RemoteActionCompatParcelizer);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.ResultReceiver.ResultReceiver) {
            toggle();
        }
        return super.performClick();
    }

    @Override // o.supportInvalidateOptionsMenu, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? IntPair.write(getContext(), i) : null);
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? IntPair.write(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("iconSize cannot be less than 0");
        } else if (this.ParcelableVolumeInfo != i) {
            this.ParcelableVolumeInfo = i;
            RemoteActionCompatParcelizer(true);
        }
    }

    public void setInsetBottom(int i) {
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        platformWindowInsetsAnimation.IconCompatParcelizer(platformWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper, i);
    }

    public void setInsetTop(int i) {
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        platformWindowInsetsAnimation.IconCompatParcelizer(i, platformWindowInsetsAnimation.MediaDescriptionCompat);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.ResultReceiver.ResultReceiver = z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (RemoteActionCompatParcelizer()) {
            SubcomposeLayoutKtSubcomposeLayout2.serializer(this, this.ResultReceiver.RemoteActionCompatParcelizer(false));
        }
    }

    @Override // o.supportInvalidateOptionsMenu, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.MediaSessionCompatQueueItem);
    }

    @Override // o.supportInvalidateOptionsMenu, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        accessibilityNodeInfo.setCheckable(platformWindowInsetsAnimation != null && platformWindowInsetsAnimation.RemoteActionCompatParcelizer);
        accessibilityNodeInfo.setChecked(this.MediaSessionCompatQueueItem);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // o.supportInvalidateOptionsMenu, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        read(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // o.supportInvalidateOptionsMenu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        read(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.MediaDescriptionCompat != null) {
            if (this.MediaDescriptionCompat.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (RemoteActionCompatParcelizer()) {
            this.ResultReceiver.RemoteActionCompatParcelizer(false).MediaBrowserCompatMediaItem(f);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        read(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean RemoteActionCompatParcelizer() {
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        return (platformWindowInsetsAnimation == null || platformWindowInsetsAnimation.IconCompatParcelizer) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.IconCompatParcelizer);
        setChecked(savedState.write);
    }

    public final void read(int i, int i2) {
        if (this.MediaDescriptionCompat == null || getLayout() == null) {
            return;
        }
        int i3 = this.MediaMetadataCompat;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.MediaSessionCompatToken = 0;
                if (i3 == 16) {
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
                    RemoteActionCompatParcelizer(false);
                    return;
                }
                int intrinsicHeight = this.ParcelableVolumeInfo;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.MediaDescriptionCompat.getIntrinsicHeight();
                }
                int textHeight = getTextHeight();
                int iMax = Math.max(0, (((((i2 - textHeight) - getPaddingTop()) - intrinsicHeight) - this.MediaSessionCompatResultReceiverWrapper) - getPaddingBottom()) / 2);
                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != iMax) {
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = iMax;
                    RemoteActionCompatParcelizer(false);
                    return;
                }
                return;
            }
            return;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.MediaMetadataCompat;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.MediaSessionCompatToken = 0;
            RemoteActionCompatParcelizer(false);
            return;
        }
        int intrinsicWidth = this.ParcelableVolumeInfo;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.MediaDescriptionCompat.getIntrinsicWidth();
        }
        int textLayoutWidth = getTextLayoutWidth();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int paddingEnd = ((((i - textLayoutWidth) - getPaddingEnd()) - intrinsicWidth) - this.MediaSessionCompatResultReceiverWrapper) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.MediaMetadataCompat == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.MediaSessionCompatToken != paddingEnd) {
            this.MediaSessionCompatToken = paddingEnd;
            RemoteActionCompatParcelizer(false);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        if (platformWindowInsetsAnimation == null || !platformWindowInsetsAnimation.RemoteActionCompatParcelizer || !isEnabled() || this.MediaSessionCompatQueueItem == z) {
            return;
        }
        this.MediaSessionCompatQueueItem = z;
        refreshDrawableState();
        if (getParent() instanceof outermostOf) {
            outermostOf outermostof = (outermostOf) getParent();
            boolean z2 = this.MediaSessionCompatQueueItem;
            if (!outermostof.MediaSessionCompatToken) {
                outermostof.IconCompatParcelizer(getId(), z2);
            }
        }
        if (this.RatingCompat) {
            return;
        }
        this.RatingCompat = true;
        Iterator it = this.ComponentActivity.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        this.RatingCompat = false;
    }

    public void setIcon(Drawable drawable) {
        if (this.MediaDescriptionCompat != drawable) {
            this.MediaDescriptionCompat = drawable;
            RemoteActionCompatParcelizer(true);
            read(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            read(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.MediaSessionCompatResultReceiverWrapper != i) {
            this.MediaSessionCompatResultReceiverWrapper = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.PlaybackStateCompatCustomAction != colorStateList) {
            this.PlaybackStateCompatCustomAction = colorStateList;
            RemoteActionCompatParcelizer(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.PlaybackStateCompat != mode) {
            this.PlaybackStateCompat = mode;
            RemoteActionCompatParcelizer(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(FocusListener.write(getContext(), i));
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        RectRulers rectRulers = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (rectRulers != null) {
            ((outermostOf) ((PinnableContainerKtLocalPinnableContainer1) rectRulers).serializer).invalidate();
        }
        super.setPressed(z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.MediaSessionCompatQueueItem);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.MediaDescriptionCompat = drawableMutate;
            drawableMutate.setTintList(this.PlaybackStateCompatCustomAction);
            PorterDuff.Mode mode = this.PlaybackStateCompat;
            if (mode != null) {
                this.MediaDescriptionCompat.setTintMode(mode);
            }
            int intrinsicWidth = this.ParcelableVolumeInfo;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.MediaDescriptionCompat.getIntrinsicWidth();
            }
            int intrinsicHeight = this.ParcelableVolumeInfo;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.MediaDescriptionCompat.getIntrinsicHeight();
            }
            Drawable drawable2 = this.MediaDescriptionCompat;
            int i = this.MediaSessionCompatToken;
            int i2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.MediaDescriptionCompat.setVisible(true, z);
        }
        if (z) {
            IconCompatParcelizer();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.MediaMetadataCompat;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.MediaDescriptionCompat) || (((i3 == 3 || i3 == 4) && drawable5 != this.MediaDescriptionCompat) || ((i3 == 16 || i3 == 32) && drawable4 != this.MediaDescriptionCompat))) {
            IconCompatParcelizer();
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.materialButtonStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Button), attributeSet, com.logistics.rider.glovo.R.attr.materialButtonStyle);
        this.ComponentActivity = new LinkedHashSet();
        this.MediaSessionCompatQueueItem = false;
        this.RatingCompat = false;
        Context context2 = getContext();
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, setMeasuredSizeozmzZPI.MaterialButton, com.logistics.rider.glovo.R.attr.materialButtonStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.MediaSessionCompatResultReceiverWrapper = typedArray.getDimensionPixelSize(12, 0);
        int i = typedArray.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.PlaybackStateCompat = getResumePausedNjRlDlw.read(i, mode);
        this.PlaybackStateCompatCustomAction = ScaleFactorKt.IconCompatParcelizer(getContext(), typedArray, 14);
        this.MediaDescriptionCompat = ScaleFactorKt.write(getContext(), typedArray, 10);
        this.MediaMetadataCompat = typedArray.getInteger(11, 1);
        this.ParcelableVolumeInfo = typedArray.getDimensionPixelSize(13, 0);
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = new PlatformWindowInsetsAnimation(this, SubcomposeLayoutPausableCompositionException.serializer(context2, attributeSet, com.logistics.rider.glovo.R.attr.materialButtonStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Button).IconCompatParcelizer());
        this.ResultReceiver = platformWindowInsetsAnimation;
        platformWindowInsetsAnimation.RatingCompat = typedArray.getDimensionPixelOffset(1, 0);
        platformWindowInsetsAnimation.MediaBrowserCompatMediaItem = typedArray.getDimensionPixelOffset(2, 0);
        platformWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper = typedArray.getDimensionPixelOffset(3, 0);
        platformWindowInsetsAnimation.MediaDescriptionCompat = typedArray.getDimensionPixelOffset(4, 0);
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(8, -1);
            platformWindowInsetsAnimation.write = dimensionPixelSize;
            float f = dimensionPixelSize;
            I$b i$bWrite = platformWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
            i$bWrite.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(f);
            i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(f);
            i$bWrite.RatingCompat = new SubcomposeLayoutKt(f);
            i$bWrite.MediaMetadataCompat = new SubcomposeLayoutKt(f);
            platformWindowInsetsAnimation.serializer(i$bWrite.IconCompatParcelizer());
            platformWindowInsetsAnimation.MediaSessionCompatQueueItem = true;
        }
        platformWindowInsetsAnimation.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArray.getDimensionPixelSize(20, 0);
        platformWindowInsetsAnimation.serializer = getResumePausedNjRlDlw.read(typedArray.getInt(7, -1), mode);
        platformWindowInsetsAnimation.read = ScaleFactorKt.IconCompatParcelizer(getContext(), typedArray, 6);
        platformWindowInsetsAnimation.ComponentActivity = ScaleFactorKt.IconCompatParcelizer(getContext(), typedArray, 19);
        platformWindowInsetsAnimation.PlaybackStateCompatCustomAction = ScaleFactorKt.IconCompatParcelizer(getContext(), typedArray, 16);
        platformWindowInsetsAnimation.RemoteActionCompatParcelizer = typedArray.getBoolean(5, false);
        platformWindowInsetsAnimation.MediaMetadataCompat = typedArray.getDimensionPixelSize(9, 0);
        platformWindowInsetsAnimation.ResultReceiver = typedArray.getBoolean(21, true);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArray.hasValue(0)) {
            platformWindowInsetsAnimation.IconCompatParcelizer = true;
            setSupportBackgroundTintList(platformWindowInsetsAnimation.read);
            setSupportBackgroundTintMode(platformWindowInsetsAnimation.serializer);
        } else {
            platformWindowInsetsAnimation.RemoteActionCompatParcelizer();
        }
        setPaddingRelative(paddingStart + platformWindowInsetsAnimation.RatingCompat, paddingTop + platformWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper, paddingEnd + platformWindowInsetsAnimation.MediaBrowserCompatMediaItem, paddingBottom + platformWindowInsetsAnimation.MediaDescriptionCompat);
        typedArray.recycle();
        setCompoundDrawablePadding(this.MediaSessionCompatResultReceiverWrapper);
        RemoteActionCompatParcelizer(this.MediaDescriptionCompat != null);
    }

    public int getCornerRadius() {
        if (RemoteActionCompatParcelizer()) {
            return this.ResultReceiver.write;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (RemoteActionCompatParcelizer()) {
            return this.ResultReceiver.PlaybackStateCompatCustomAction;
        }
        return null;
    }

    public SubcomposeLayoutPausableCompositionException getShapeAppearanceModel() {
        if (RemoteActionCompatParcelizer()) {
            return this.ResultReceiver.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (RemoteActionCompatParcelizer()) {
            return this.ResultReceiver.ComponentActivity;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (RemoteActionCompatParcelizer()) {
            return this.ResultReceiver.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        return 0;
    }

    @Override // o.supportInvalidateOptionsMenu
    public ColorStateList getSupportBackgroundTintList() {
        return RemoteActionCompatParcelizer() ? this.ResultReceiver.read : super.getSupportBackgroundTintList();
    }

    @Override // o.supportInvalidateOptionsMenu
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return RemoteActionCompatParcelizer() ? this.ResultReceiver.serializer : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.write = this.MediaSessionCompatQueueItem;
        return savedState;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!RemoteActionCompatParcelizer()) {
            super.setBackgroundColor(i);
            return;
        }
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        if (platformWindowInsetsAnimation.RemoteActionCompatParcelizer(false) != null) {
            platformWindowInsetsAnimation.RemoteActionCompatParcelizer(false).setTint(i);
        }
    }

    @Override // o.supportInvalidateOptionsMenu, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!RemoteActionCompatParcelizer()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        SentryLogcatAdapter.IconCompatParcelizer("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        platformWindowInsetsAnimation.IconCompatParcelizer = true;
        MaterialButton materialButton = platformWindowInsetsAnimation.PlaybackStateCompat;
        materialButton.setSupportBackgroundTintList(platformWindowInsetsAnimation.read);
        materialButton.setSupportBackgroundTintMode(platformWindowInsetsAnimation.serializer);
        super.setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        if (RemoteActionCompatParcelizer()) {
            this.ResultReceiver.RemoteActionCompatParcelizer = z;
        }
    }

    public void setCornerRadius(int i) {
        if (RemoteActionCompatParcelizer()) {
            PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
            if (platformWindowInsetsAnimation.MediaSessionCompatQueueItem && platformWindowInsetsAnimation.write == i) {
                return;
            }
            platformWindowInsetsAnimation.write = i;
            platformWindowInsetsAnimation.MediaSessionCompatQueueItem = true;
            float f = i;
            I$b i$bWrite = platformWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
            i$bWrite.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(f);
            i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(f);
            i$bWrite.RatingCompat = new SubcomposeLayoutKt(f);
            i$bWrite.MediaMetadataCompat = new SubcomposeLayoutKt(f);
            platformWindowInsetsAnimation.serializer(i$bWrite.IconCompatParcelizer());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (RemoteActionCompatParcelizer()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (RemoteActionCompatParcelizer()) {
            PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
            MaterialButton materialButton = platformWindowInsetsAnimation.PlaybackStateCompat;
            if (platformWindowInsetsAnimation.PlaybackStateCompatCustomAction != colorStateList) {
                platformWindowInsetsAnimation.PlaybackStateCompatCustomAction = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (RemoteActionCompatParcelizer()) {
            setRippleColor(FocusListener.write(getContext(), i));
        }
    }

    @Override // o.createPausedPrecomposition
    public void setShapeAppearanceModel(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        if (RemoteActionCompatParcelizer()) {
            this.ResultReceiver.serializer(subcomposeLayoutPausableCompositionException);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (RemoteActionCompatParcelizer()) {
            PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
            platformWindowInsetsAnimation.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z;
            platformWindowInsetsAnimation.write();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (RemoteActionCompatParcelizer()) {
            PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
            if (platformWindowInsetsAnimation.ComponentActivity != colorStateList) {
                platformWindowInsetsAnimation.ComponentActivity = colorStateList;
                platformWindowInsetsAnimation.write();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (RemoteActionCompatParcelizer()) {
            setStrokeColor(FocusListener.write(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (RemoteActionCompatParcelizer()) {
            PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
            if (platformWindowInsetsAnimation.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != i) {
                platformWindowInsetsAnimation.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
                platformWindowInsetsAnimation.write();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (RemoteActionCompatParcelizer()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // o.supportInvalidateOptionsMenu
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!RemoteActionCompatParcelizer()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        if (platformWindowInsetsAnimation.read != colorStateList) {
            platformWindowInsetsAnimation.read = colorStateList;
            if (platformWindowInsetsAnimation.RemoteActionCompatParcelizer(false) != null) {
                platformWindowInsetsAnimation.RemoteActionCompatParcelizer(false).setTintList(platformWindowInsetsAnimation.read);
            }
        }
    }

    @Override // o.supportInvalidateOptionsMenu
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!RemoteActionCompatParcelizer()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        PlatformWindowInsetsAnimation platformWindowInsetsAnimation = this.ResultReceiver;
        if (platformWindowInsetsAnimation.serializer != mode) {
            platformWindowInsetsAnimation.serializer = mode;
            if (platformWindowInsetsAnimation.RemoteActionCompatParcelizer(false) == null || platformWindowInsetsAnimation.serializer == null) {
                return;
            }
            platformWindowInsetsAnimation.RemoteActionCompatParcelizer(false).setTintMode(platformWindowInsetsAnimation.serializer);
        }
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public final void IconCompatParcelizer() {
        int i = this.MediaMetadataCompat;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.MediaDescriptionCompat, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.MediaDescriptionCompat, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.MediaDescriptionCompat, null, null);
        }
    }
}
