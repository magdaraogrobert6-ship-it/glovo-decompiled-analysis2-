package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.internal.CheckableImageButton;
import com.logistics.rider.glovo.R;
import com.roadrunner.domain.util.RetryWithDelay;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.ScaleFactorKt;
import o.TestModifierUpdaterKt;
import o.TestModifierUpdaterLayout;
import o.ValueInsets;
import o.containsAll;
import o.getFeatureKeys;
import o.getLeftimpl;
import o.getResumePausedNjRlDlw;
import o.onMenuOpened;
import o.removeIf;
import o.setFallback;
import o.updateModifier;

/* JADX INFO: loaded from: classes2.dex */
public final class EndCompoundLayout extends LinearLayout {
    private static byte r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = -112;
    private static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public final CheckableImageButton ComponentActivity;
    public EditText IconCompatParcelizer;
    public ImageView.ScaleType MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public View.OnLongClickListener MediaSessionCompatQueueItem;
    public View.OnLongClickListener MediaSessionCompatResultReceiverWrapper;
    public ColorStateList MediaSessionCompatToken;
    public final CheckableImageButton ParcelableVolumeInfo;
    public ColorStateList PlaybackStateCompat;
    public PorterDuff.Mode PlaybackStateCompatCustomAction;
    public final FrameLayout RatingCompat;
    public final RetryWithDelay RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public PorterDuff.Mode r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public CharSequence r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final AppCompatTextView r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final TextInputLayout r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final AccessibilityManager read;
    public final TestModifierUpdaterLayout serializer;
    public final LinkedHashSet write;

    public final boolean IconCompatParcelizer() {
        return this.RatingCompat.getVisibility() == 0 && this.ParcelableVolumeInfo.getVisibility() == 0;
    }

    public final void RemoteActionCompatParcelizer() {
        AppCompatTextView appCompatTextView = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null || this.ResultReceiver) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().onSuffixVisibilityChanged(i == 0);
        }
        read();
        appCompatTextView.setVisibility(i);
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.updateDummyDrawables();
    }

    public final updateModifier getEndIconDelegate() {
        updateModifier getleftimpl;
        int i = this.MediaDescriptionCompat;
        RetryWithDelay retryWithDelay = this.RemoteActionCompatParcelizer;
        SparseArray sparseArray = (SparseArray) retryWithDelay.IconCompatParcelizer;
        updateModifier updatemodifier = (updateModifier) sparseArray.get(i);
        if (updatemodifier != null) {
            return updatemodifier;
        }
        EndCompoundLayout endCompoundLayout = (EndCompoundLayout) retryWithDelay.read;
        int i2 = 1;
        if (i == -1) {
            getleftimpl = new getLeftimpl(endCompoundLayout, i2);
        } else if (i == 0) {
            getleftimpl = new getLeftimpl(endCompoundLayout, 0);
        } else if (i == 1) {
            getleftimpl = new ValueInsets(endCompoundLayout, retryWithDelay.RemoteActionCompatParcelizer);
        } else if (i == 2) {
            getleftimpl = new containsAll(endCompoundLayout);
        } else {
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid end icon mode: "));
                return null;
            }
            getleftimpl = new removeIf(endCompoundLayout);
        }
        sparseArray.append(i, getleftimpl);
        return getleftimpl;
    }

    public final void read() {
        int i = 0;
        this.RatingCompat.setVisibility((this.ParcelableVolumeInfo.getVisibility() != 0 || serializer()) ? 8 : 0);
        char c = (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null || this.ResultReceiver) ? '\b' : (char) 0;
        if (!IconCompatParcelizer() && !serializer() && c != 0) {
            i = 8;
        }
        setVisibility(i);
    }

    public final boolean serializer() {
        return this.ComponentActivity.getVisibility() == 0;
    }

    public final void setErrorIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.ComponentActivity;
        checkableImageButton.setImageDrawable(drawable);
        updateErrorIconVisibility();
        getFeatureKeys.write(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, checkableImageButton, this.MediaSessionCompatToken, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
    }

    public final void updateErrorIconVisibility() {
        CheckableImageButton checkableImageButton = this.ComponentActivity;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.addContentView.PlaybackStateCompatCustomAction && textInputLayout.MediaMetadataCompat()) ? 0 : 8);
        read();
        write();
        if (this.MediaDescriptionCompat != 0) {
            return;
        }
        textInputLayout.updateDummyDrawables();
    }

    public final void write() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (textInputLayout._init_lambda4 == null) {
            return;
        }
        if (IconCompatParcelizer() || serializer()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout._init_lambda4;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout._init_lambda4.getPaddingTop();
        int paddingBottom = textInputLayout._init_lambda4.getPaddingBottom();
        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final CheckableImageButton read(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ScaleFactorKt.write(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final void refreshIconState(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        updateModifier endIconDelegate = getEndIconDelegate();
        boolean zPlaybackStateCompat = endIconDelegate.PlaybackStateCompat();
        CheckableImageButton checkableImageButton = this.ParcelableVolumeInfo;
        boolean z4 = true;
        if (!zPlaybackStateCompat || (z3 = checkableImageButton.MediaMetadataCompat) == endIconDelegate.MediaMetadataCompat()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(endIconDelegate instanceof removeIf) || (zIsActivated = checkableImageButton.isActivated()) == ((removeIf) endIconDelegate).MediaBrowserCompatMediaItem) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            getFeatureKeys.read(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, checkableImageButton, this.PlaybackStateCompat);
        }
    }

    public final void setOnFocusChangeListenersIfNeeded(updateModifier updatemodifier) {
        if (this.IconCompatParcelizer == null) {
            return;
        }
        if (updatemodifier.read() != null) {
            this.IconCompatParcelizer.setOnFocusChangeListener(updatemodifier.read());
        }
        if (updatemodifier.IconCompatParcelizer() != null) {
            this.ParcelableVolumeInfo.setOnFocusChangeListener(updatemodifier.IconCompatParcelizer());
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, EmojiProcessor emojiProcessor) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.MediaDescriptionCompat = 0;
        this.write = new LinkedHashSet();
        this.serializer = new TestModifierUpdaterLayout(this);
        TestModifierUpdaterKt testModifierUpdaterKt = new TestModifierUpdaterKt(this);
        this.read = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.RatingCompat = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = read(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.ComponentActivity = checkableImageButton;
        CheckableImageButton checkableImageButton2 = read(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.ParcelableVolumeInfo = checkableImageButton2;
        this.RemoteActionCompatParcelizer = new RetryWithDelay(this, emojiProcessor);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = appCompatTextView;
        TypedArray typedArray = (TypedArray) emojiProcessor.read;
        if (typedArray.hasValue(38)) {
            this.MediaSessionCompatToken = ScaleFactorKt.IconCompatParcelizer(getContext(), emojiProcessor, 38);
        }
        if (typedArray.hasValue(39)) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getResumePausedNjRlDlw.read(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            setErrorIconDrawable(emojiProcessor.RemoteActionCompatParcelizer(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.PlaybackStateCompat = ScaleFactorKt.IconCompatParcelizer(getContext(), emojiProcessor, 32);
            }
            if (typedArray.hasValue(33)) {
                this.PlaybackStateCompatCustomAction = getResumePausedNjRlDlw.read(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            setEndIconMode(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButton2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButton2.setContentDescription(text);
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.PlaybackStateCompat = ScaleFactorKt.IconCompatParcelizer(getContext(), emojiProcessor, 54);
            }
            if (typedArray.hasValue(55)) {
                this.PlaybackStateCompatCustomAction = getResumePausedNjRlDlw.read(typedArray.getInt(55, -1), null);
            }
            setEndIconMode(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButton2.getContentDescription() != text2) {
                checkableImageButton2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.MediaMetadataCompat) {
                this.MediaMetadataCompat = dimensionPixelSize;
                checkableImageButton2.setMinimumWidth(dimensionPixelSize);
                checkableImageButton2.setMinimumHeight(dimensionPixelSize);
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType scaleTypeRemoteActionCompatParcelizer = getFeatureKeys.RemoteActionCompatParcelizer(typedArray.getInt(31, -1));
                this.MediaBrowserCompatMediaItem = scaleTypeRemoteActionCompatParcelizer;
                checkableImageButton2.setScaleType(scaleTypeRemoteActionCompatParcelizer);
                checkableImageButton.setScaleType(scaleTypeRemoteActionCompatParcelizer);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
            if (typedArray.hasValue(73)) {
                appCompatTextView.setTextColor(emojiProcessor.serializer(73));
            }
            CharSequence text3 = typedArray.getText(71);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            RemoteActionCompatParcelizer();
            frameLayout.addView(checkableImageButton2);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(checkableImageButton);
            textInputLayout.accessensureViewModelStore.add(testModifierUpdaterKt);
            if (textInputLayout._init_lambda4 != null) {
                testModifierUpdaterKt.serializer(textInputLayout);
            }
            addOnAttachStateChangeListener(new onMenuOpened(2, this));
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("endIconSize cannot be less than 0");
        throw null;
    }

    public final int getSuffixTextEndOffset() {
        int marginStart;
        if (IconCompatParcelizer() || serializer()) {
            CheckableImageButton checkableImageButton = this.ParcelableVolumeInfo;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final void setEndIconVisible(boolean z) {
        if (IconCompatParcelizer() != z) {
            this.ParcelableVolumeInfo.setVisibility(z ? 0 : 8);
            read();
            write();
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.updateDummyDrawables();
        }
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x013b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0143  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setEndIconMode(int i) {
        Drawable drawableWrite;
        int i2 = 2 % 2;
        int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 53;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this.MediaDescriptionCompat == i) {
            return;
        }
        updateModifier endIconDelegate = getEndIconDelegate();
        DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        AccessibilityManager accessibilityManager = this.read;
        if (dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new setFallback(dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5));
        }
        CharSequence charSequence = null;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        endIconDelegate.RatingCompat();
        this.MediaDescriptionCompat = i;
        Iterator it = this.write.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        setEndIconVisible(!(i == 0));
        updateModifier endIconDelegate2 = getEndIconDelegate();
        int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write;
        if (iRemoteActionCompatParcelizer == 0) {
            int i5 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 117;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iRemoteActionCompatParcelizer = endIconDelegate2.RemoteActionCompatParcelizer();
        }
        if (iRemoteActionCompatParcelizer != 0) {
            int i7 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 77;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                IntPair.write(getContext(), iRemoteActionCompatParcelizer);
                throw null;
            }
            drawableWrite = IntPair.write(getContext(), iRemoteActionCompatParcelizer);
        } else {
            drawableWrite = null;
        }
        CheckableImageButton checkableImageButton = this.ParcelableVolumeInfo;
        checkableImageButton.setImageDrawable(drawableWrite);
        TextInputLayout textInputLayout = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (drawableWrite != null) {
            int i8 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 77;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            getFeatureKeys.write(textInputLayout, checkableImageButton, this.PlaybackStateCompat, this.PlaybackStateCompatCustomAction);
            getFeatureKeys.read(textInputLayout, checkableImageButton, this.PlaybackStateCompat);
        }
        int iWrite = endIconDelegate2.write();
        if (iWrite != 0) {
            int i10 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 113;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Resources resources = getResources();
            String string = resources.getString(iWrite);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(iWrite);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    charSequence = spannableString;
                } else {
                    int i12 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 55;
                    r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    charSequence = string;
                }
            } else {
                charSequence = string;
            }
        }
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
        checkableImageButton.setCheckable(endIconDelegate2.PlaybackStateCompat());
        if (!endIconDelegate2.write(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        int i14 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 69;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i14 % Fields.SpotShadowColor;
        if (i14 % 2 != 0) {
            endIconDelegate2.setUp();
            DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5MediaBrowserCompatMediaItem = endIconDelegate2.MediaBrowserCompatMediaItem();
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5MediaBrowserCompatMediaItem;
            int i15 = 86 / 0;
            if (dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5MediaBrowserCompatMediaItem != null) {
                if (accessibilityManager != null) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    if (isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new setFallback(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                        int i16 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 3;
                        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                    }
                }
            }
        } else {
            endIconDelegate2.setUp();
            DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5MediaBrowserCompatMediaItem2 = endIconDelegate2.MediaBrowserCompatMediaItem();
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5MediaBrowserCompatMediaItem2;
            if (dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5MediaBrowserCompatMediaItem2 != null) {
                if (accessibilityManager != null) {
                    WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                    if (isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new setFallback(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                        int i18 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 3;
                        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                    }
                }
            }
        }
        View.OnClickListener onClickListenerSerializer = endIconDelegate2.serializer();
        View.OnLongClickListener onLongClickListener = this.MediaSessionCompatQueueItem;
        checkableImageButton.setOnClickListener(onClickListenerSerializer);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, onLongClickListener);
        EditText editText = this.IconCompatParcelizer;
        if (editText != null) {
            int i20 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 81;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            endIconDelegate2.write(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate2);
        }
        getFeatureKeys.write(textInputLayout, checkableImageButton, this.PlaybackStateCompat, this.PlaybackStateCompatCustomAction);
        refreshIconState(true);
    }
}
