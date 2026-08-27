package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.emoji2.text.EmojiProcessor;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.internal.CheckableImageButton;
import com.logistics.rider.glovo.R;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.ScaleFactorKt;
import o.getFeatureKeys;
import o.getResumePausedNjRlDlw;

/* JADX INFO: loaded from: classes2.dex */
public final class StartCompoundLayout extends LinearLayout {
    public boolean IconCompatParcelizer;
    public ColorStateList MediaBrowserCompatMediaItem;
    public ImageView.ScaleType MediaDescriptionCompat;
    public final TextInputLayout MediaMetadataCompat;
    public final CheckableImageButton MediaSessionCompatQueueItem;
    public PorterDuff.Mode RatingCompat;
    public CharSequence RemoteActionCompatParcelizer;
    public View.OnLongClickListener read;
    public final AppCompatTextView serializer;
    public int write;

    public final void RemoteActionCompatParcelizer() {
        int paddingStart;
        EditText editText = this.MediaMetadataCompat._init_lambda4;
        if (editText == null) {
            return;
        }
        if (this.MediaSessionCompatQueueItem.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
        this.serializer.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final int getPrefixTextStartOffset() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.MediaSessionCompatQueueItem;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        return this.serializer.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.MediaSessionCompatQueueItem;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.MediaBrowserCompatMediaItem;
            PorterDuff.Mode mode = this.RatingCompat;
            TextInputLayout textInputLayout = this.MediaMetadataCompat;
            getFeatureKeys.write(textInputLayout, checkableImageButton, colorStateList, mode);
            setStartIconVisible(true);
            getFeatureKeys.read(textInputLayout, checkableImageButton, this.MediaBrowserCompatMediaItem);
            return;
        }
        setStartIconVisible(false);
        View.OnLongClickListener onLongClickListener = this.read;
        checkableImageButton.setOnClickListener(null);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
        this.read = null;
        checkableImageButton.setOnLongClickListener(null);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.MediaSessionCompatQueueItem;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            RemoteActionCompatParcelizer();
            write();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RemoteActionCompatParcelizer();
    }

    public StartCompoundLayout(TextInputLayout textInputLayout, EmojiProcessor emojiProcessor) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.MediaMetadataCompat = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.MediaSessionCompatQueueItem = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.serializer = appCompatTextView;
        if (ScaleFactorKt.write(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.read;
        checkableImageButton.setOnClickListener(null);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
        this.read = null;
        checkableImageButton.setOnLongClickListener(null);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) emojiProcessor.read;
        if (typedArray.hasValue(69)) {
            this.MediaBrowserCompatMediaItem = ScaleFactorKt.IconCompatParcelizer(getContext(), emojiProcessor, 69);
        }
        if (typedArray.hasValue(70)) {
            this.RatingCompat = getResumePausedNjRlDlw.read(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            setStartIconDrawable(emojiProcessor.RemoteActionCompatParcelizer(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.write) {
            this.write = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeRemoteActionCompatParcelizer = getFeatureKeys.RemoteActionCompatParcelizer(typedArray.getInt(68, -1));
            this.MediaDescriptionCompat = scaleTypeRemoteActionCompatParcelizer;
            checkableImageButton.setScaleType(scaleTypeRemoteActionCompatParcelizer);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(emojiProcessor.serializer(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.RemoteActionCompatParcelizer = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        write();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void write() {
        int i = 0;
        int i2 = (this.RemoteActionCompatParcelizer == null || this.IconCompatParcelizer) ? 8 : 0;
        if (this.MediaSessionCompatQueueItem.getVisibility() != 0 && i2 != 0) {
            i = 8;
        }
        setVisibility(i);
        this.serializer.setVisibility(i2);
        this.MediaMetadataCompat.updateDummyDrawables();
    }
}
