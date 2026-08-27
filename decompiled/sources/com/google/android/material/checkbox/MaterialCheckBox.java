package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.transition.Transition$3;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.logistics.rider.glovo.R;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.coroutines.BuildersKt;
import o.Float16;
import o.ScaleFactorKt;
import o.VerticalRulerCompanion;
import o.drawLineNGM6Ib0default;
import o.getDeactivateOutOfFrameNjRlDlw;
import o.getLowfv9h1I;
import o.getMediumfv9h1I;
import o.getResumePausedNjRlDlw;
import o.mergeRulerValues;
import o.onRemeasurementAvailable;
import o.setLeft;
import o.setMeasuredSizeozmzZPI;
import o.supportShouldUpRecreateTask;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCheckBox extends supportShouldUpRecreateTask {
    public static final int[][] IconCompatParcelizer;
    public static final int[] MediaBrowserCompatMediaItem;
    public static final int[] MediaMetadataCompat;
    public static final int RatingCompat;
    private static int _init_lambda1 = 1;
    private static byte r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    private static int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public CharSequence ComponentActivity;
    public Drawable MediaDescriptionCompat;
    public boolean MediaSessionCompatQueueItem;
    public ColorStateList MediaSessionCompatResultReceiverWrapper;
    public ColorStateList MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public PorterDuff.Mode PlaybackStateCompat;
    public Drawable PlaybackStateCompatCustomAction;
    public boolean ResultReceiver;
    public int[] r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public CharSequence r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public ColorStateList r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final LinkedHashSet r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public CompoundButton.OnCheckedChangeListener r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final LinkedHashSet r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final getMediumfv9h1I r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final onRemeasurementAvailable r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.MediaDescriptionCompat;
    }

    public Drawable getButtonIconDrawable() {
        return this.PlaybackStateCompatCustomAction;
    }

    public ColorStateList getButtonIconTintList() {
        return this.MediaSessionCompatToken;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.PlaybackStateCompat;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public int getCheckedState() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.ComponentActivity;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == 1;
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.ParcelableVolumeInfo = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.ComponentActivity = charSequence;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = onCheckedChangeListener;
    }

    /* JADX INFO: loaded from: classes4.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.write = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }
        };
        public int write;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.write));
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.write;
            if (i == 1) {
                str = "checked";
            } else if (i != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
            return ff$$ExternalSyntheticOutline0.m(sb, str, "}");
        }

        public SavedState(Parcel parcel) {
            super(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, MediaBrowserCompatMediaItem);
        }
        if (this.ResultReceiver) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, MediaMetadataCompat);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    public final void refreshButtonDrawable() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Transition$3 transition$3;
        Drawable drawableMutate = this.MediaDescriptionCompat;
        ColorStateList colorStateList3 = this.MediaSessionCompatResultReceiverWrapper;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.MediaDescriptionCompat = drawableMutate;
        Drawable drawableMutate2 = this.PlaybackStateCompatCustomAction;
        ColorStateList colorStateList4 = this.MediaSessionCompatToken;
        PorterDuff.Mode mode = this.PlaybackStateCompat;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.PlaybackStateCompatCustomAction = drawableMutate2;
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            getMediumfv9h1I getmediumfv9h1i = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (getmediumfv9h1i != null) {
                Float16 float16 = getmediumfv9h1i.read;
                Drawable drawable = getmediumfv9h1i.MediaDescriptionCompat;
                onRemeasurementAvailable onremeasurementavailable = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (onremeasurementavailable.read == null) {
                        onremeasurementavailable.read = new getLowfv9h1I(onremeasurementavailable);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(onremeasurementavailable.read);
                }
                ArrayList arrayList = getmediumfv9h1i.RemoteActionCompatParcelizer;
                if (arrayList != null && onremeasurementavailable != null) {
                    arrayList.remove(onremeasurementavailable);
                    if (getmediumfv9h1i.RemoteActionCompatParcelizer.size() == 0 && (transition$3 = getmediumfv9h1i.IconCompatParcelizer) != null) {
                        float16.serializer.removeListener(transition$3);
                        getmediumfv9h1i.IconCompatParcelizer = null;
                    }
                }
                Drawable drawable2 = getmediumfv9h1i.MediaDescriptionCompat;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (onremeasurementavailable.read == null) {
                        onremeasurementavailable.read = new getLowfv9h1I(onremeasurementavailable);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(onremeasurementavailable.read);
                } else if (onremeasurementavailable != null) {
                    if (getmediumfv9h1i.RemoteActionCompatParcelizer == null) {
                        getmediumfv9h1i.RemoteActionCompatParcelizer = new ArrayList();
                    }
                    if (!getmediumfv9h1i.RemoteActionCompatParcelizer.contains(onremeasurementavailable)) {
                        getmediumfv9h1i.RemoteActionCompatParcelizer.add(onremeasurementavailable);
                        if (getmediumfv9h1i.IconCompatParcelizer == null) {
                            getmediumfv9h1i.IconCompatParcelizer = new Transition$3(3, getmediumfv9h1i);
                        }
                        float16.serializer.addListener(getmediumfv9h1i.IconCompatParcelizer);
                    }
                }
            }
            Drawable drawable3 = this.MediaDescriptionCompat;
            if ((drawable3 instanceof AnimatedStateListDrawable) && getmediumfv9h1i != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, getmediumfv9h1i, false);
                ((AnimatedStateListDrawable) this.MediaDescriptionCompat).addTransition(R.id.indeterminate, R.id.unchecked, getmediumfv9h1i, false);
            }
        }
        Drawable drawable4 = this.MediaDescriptionCompat;
        if (drawable4 != null && (colorStateList2 = this.MediaSessionCompatResultReceiverWrapper) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.PlaybackStateCompatCustomAction;
        if (drawable5 != null && (colorStateList = this.MediaSessionCompatToken) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.MediaDescriptionCompat;
        Drawable drawable7 = this.PlaybackStateCompatCustomAction;
        Drawable drawable8 = drawable7;
        Drawable drawable9 = drawable6;
        if (drawable6 == null) {
            drawable9 = drawable8;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
            drawable9 = drawable8;
        }
        super.setButtonDrawable(drawable9);
        refreshDrawableState();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.PlaybackStateCompatCustomAction = drawable;
        refreshButtonDrawable();
    }

    static {
        serializer();
        MediaBrowserCompatMediaItem = new int[]{R.attr.state_indeterminate};
        MediaMetadataCompat = new int[]{R.attr.state_error};
        IconCompatParcelizer = new int[][]{new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        RatingCompat = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", FWFHelper.fwfDeviceOS);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 && this.MediaSessionCompatResultReceiverWrapper == null && this.MediaSessionCompatToken == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.ParcelableVolumeInfo || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getResumePausedNjRlDlw.write(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.write);
    }

    @Override // o.supportShouldUpRecreateTask, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(IntPair.write(getContext(), i));
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(IntPair.write(getContext(), i));
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != i) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.MediaSessionCompatQueueItem) {
                return;
            }
            this.MediaSessionCompatQueueItem = true;
            LinkedHashSet linkedHashSet = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw ff$$ExternalSyntheticOutline0.m(it);
                }
            }
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != 2 && (onCheckedChangeListener = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.MediaSessionCompatQueueItem = false;
        }
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    private String getButtonStateDescription() {
        int i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.MediaSessionCompatResultReceiverWrapper;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.MediaSessionCompatToken == colorStateList) {
            return;
        }
        this.MediaSessionCompatToken = colorStateList;
        refreshButtonDrawable();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.PlaybackStateCompat == mode) {
            return;
        }
        this.PlaybackStateCompat = mode;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.MediaSessionCompatResultReceiverWrapper == colorStateList) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = colorStateList;
        refreshButtonDrawable();
    }

    public void setErrorShown(boolean z) {
        if (this.ResultReceiver == z) {
            return;
        }
        this.ResultReceiver = z;
        refreshDrawableState();
        Iterator it = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new LinkedHashSet();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new LinkedHashSet();
        Context context2 = getContext();
        getMediumfv9h1I getmediumfv9h1i = new getMediumfv9h1I(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = setLeft.read;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        getmediumfv9h1i.MediaDescriptionCompat = drawable;
        drawable.setCallback(getmediumfv9h1i.serializer);
        new drawLineNGM6Ib0default(1, getmediumfv9h1i.MediaDescriptionCompat.getConstantState());
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getmediumfv9h1i;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new onRemeasurementAvailable(0, this);
        Context context3 = getContext();
        this.MediaDescriptionCompat = getButtonDrawable();
        this.MediaSessionCompatResultReceiverWrapper = getSuperButtonTintList();
        setSupportButtonTintList(null);
        getDeactivateOutOfFrameNjRlDlw.read(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = setMeasuredSizeozmzZPI.MaterialCheckBox;
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        EmojiProcessor emojiProcessor = new EmojiProcessor(context3, typedArrayObtainStyledAttributes);
        this.PlaybackStateCompatCustomAction = emojiProcessor.RemoteActionCompatParcelizer(2);
        if (this.MediaDescriptionCompat != null && BuildersKt.IconCompatParcelizer(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == RatingCompat && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.MediaDescriptionCompat = IntPair.write(context3, R.drawable.mtrl_checkbox_button);
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = true;
                if (this.PlaybackStateCompatCustomAction == null) {
                    this.PlaybackStateCompatCustomAction = IntPair.write(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.MediaSessionCompatToken = ScaleFactorKt.IconCompatParcelizer(context3, emojiProcessor, 3);
        this.PlaybackStateCompat = getResumePausedNjRlDlw.read(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.ResultReceiver = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.ComponentActivity = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        emojiProcessor.IconCompatParcelizer();
        refreshButtonDrawable();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.ResultReceiver) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.ComponentActivity));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.write = getCheckedState();
        return savedState;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
            int iRemoteActionCompatParcelizer = mergeRulerValues.RemoteActionCompatParcelizer(R.attr.colorControlActivated, this);
            int iRemoteActionCompatParcelizer2 = mergeRulerValues.RemoteActionCompatParcelizer(R.attr.colorError, this);
            int iRemoteActionCompatParcelizer3 = mergeRulerValues.RemoteActionCompatParcelizer(R.attr.colorSurface, this);
            int iRemoteActionCompatParcelizer4 = mergeRulerValues.RemoteActionCompatParcelizer(R.attr.colorOnSurface, this);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ColorStateList(IconCompatParcelizer, new int[]{mergeRulerValues.write(1.0f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2), mergeRulerValues.write(1.0f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer), mergeRulerValues.write(0.54f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4), mergeRulerValues.write(0.38f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4), mergeRulerValues.write(0.38f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4)});
        }
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    @Override // o.supportShouldUpRecreateTask, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.MediaDescriptionCompat = drawable;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = false;
        refreshButtonDrawable();
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        String string;
        int i2 = 2 % 2;
        int i3 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 107;
        int i4 = i3 % Fields.SpotShadowColor;
        _init_lambda1 = i4;
        int i5 = i3 % 2;
        if (i != 0) {
            int i6 = i4 + 29;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Resources resources = getResources();
            string = resources.getString(i);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                String strIntern = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(i);
                if (text instanceof Spanned) {
                    charSequence = string;
                    SpannableString spannableString = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                    int i8 = _init_lambda1 + 81;
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    charSequence = spannableString;
                } else {
                    charSequence = string;
                    int i10 = _init_lambda1 + 61;
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    charSequence = strIntern;
                }
            }
        } else {
            charSequence = null;
        }
        charSequence = string;
        setErrorAccessibilityLabel(charSequence);
        int i12 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 113;
        _init_lambda1 = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    static void serializer() {
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = (byte) -112;
    }
}
