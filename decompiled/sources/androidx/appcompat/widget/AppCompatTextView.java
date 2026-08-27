package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.cardview.widget.CardView$1;
import coil3.UriKt;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.ranges.RangesKt;
import o.DefaultInAppMessageViewWrapperCompanion;
import o.FocusOrderModifierKtfocusOrder1;
import o.getAccessibilityClassName;
import o.getActionView;
import o.getMenu;
import o.invalidateFocusui;
import o.isInteropViewHost;
import o.lastLocalKeyInputNode;
import o.setSplitBackground;
import o.setSupportBackgroundTintList;
import o.setSupportBackgroundTintMode;
import o.setTabContainer;
import o.setVisibility;
import o.supportRequestWindowFeature;
import o.validateKeyEventZmokQxo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private Future<validateKeyEventZmokQxo> IconCompatParcelizer;
    private final getActionView MediaSessionCompatQueueItem;
    private final setSplitBackground RatingCompat;
    private final supportRequestWindowFeature RemoteActionCompatParcelizer;
    private setVisibility read;
    private getAccessibilityClassName serializer;
    private boolean write;

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.RatingCompat.IconCompatParcelizer();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.RatingCompat.RemoteActionCompatParcelizer();
    }

    public lastLocalKeyInputNode getTextMetricsParamsCompat() {
        return new lastLocalKeyInputNode(isInteropViewHost.RemoteActionCompatParcelizer(this));
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.RatingCompat.write(colorStateList);
        this.RatingCompat.read();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.RatingCompat.IconCompatParcelizer(mode);
        this.RatingCompat.read();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        this.write = false;
        this.read = null;
        setSupportBackgroundTintList.read(this, getContext());
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.RemoteActionCompatParcelizer = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, i);
        setSplitBackground setsplitbackground = new setSplitBackground(this);
        this.RatingCompat = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer(attributeSet, i);
        setsplitbackground.read();
        this.MediaSessionCompatQueueItem = new getActionView();
        getEmojiTextViewHelper().write(attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.getClass();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().RemoteActionCompatParcelizer(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.serializer(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.serializer(context, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public setVisibility getSuperCaller() {
        if (this.read == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.read = new setTabContainer(this);
            } else {
                this.read = new CardView$1(this);
            }
        }
        return this.read;
    }

    public ColorStateList getSupportBackgroundTintList() {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.read();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.serializer();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public boolean isEmojiCompatEnabled() {
        return ((UriKt) getEmojiTextViewHelper().RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).read();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.RatingCompat.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            DefaultInAppMessageViewWrapperCompanion.serializer(editorInfo, getText());
        }
        getMenu.RemoteActionCompatParcelizer(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().serializer(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().serializer(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.read(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<validateKeyEventZmokQxo> future) {
        this.IconCompatParcelizer = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002e  */
    public void setTextMetricsParamsCompat(lastLocalKeyInputNode lastlocalkeyinputnode) {
        int i;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicSerializer = lastlocalkeyinputnode.serializer();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristicSerializer == textDirectionHeuristic2 || textDirectionHeuristicSerializer == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            i = 1;
        } else if (textDirectionHeuristicSerializer == TextDirectionHeuristics.ANYRTL_LTR) {
            i = 2;
        } else if (textDirectionHeuristicSerializer == TextDirectionHeuristics.LTR) {
            i = 3;
        } else if (textDirectionHeuristicSerializer == TextDirectionHeuristics.RTL) {
            i = 4;
        } else if (textDirectionHeuristicSerializer == TextDirectionHeuristics.LOCALE) {
            i = 5;
        } else if (textDirectionHeuristicSerializer == textDirectionHeuristic) {
            i = 6;
        } else if (textDirectionHeuristicSerializer == textDirectionHeuristic2) {
            i = 7;
        } else {
            i = 1;
        }
        setTextDirection(i);
        getPaint().set(lastlocalkeyinputnode.write());
        setBreakStrategy(lastlocalkeyinputnode.RemoteActionCompatParcelizer());
        setHyphenationFrequency(lastlocalkeyinputnode.read());
    }

    private getAccessibilityClassName getEmojiTextViewHelper() {
        if (this.serializer == null) {
            this.serializer = new getAccessibilityClassName(this);
        }
        return this.serializer;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<validateKeyEventZmokQxo> future = this.IconCompatParcelizer;
        if (future != null) {
            try {
                this.IconCompatParcelizer = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PrecomputedText.Params paramsRemoteActionCompatParcelizer = isInteropViewHost.RemoteActionCompatParcelizer(this);
                paramsRemoteActionCompatParcelizer.getTextPaint();
                paramsRemoteActionCompatParcelizer.getTextDirection();
                paramsRemoteActionCompatParcelizer.getBreakStrategy();
                paramsRemoteActionCompatParcelizer.getHyphenationFrequency();
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<validateKeyEventZmokQxo> future = this.IconCompatParcelizer;
        if (future != null) {
            try {
                this.IconCompatParcelizer = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PrecomputedText.Params paramsRemoteActionCompatParcelizer = isInteropViewHost.RemoteActionCompatParcelizer(this);
                paramsRemoteActionCompatParcelizer.getTextPaint();
                paramsRemoteActionCompatParcelizer.getTextDirection();
                paramsRemoteActionCompatParcelizer.getBreakStrategy();
                paramsRemoteActionCompatParcelizer.getHyphenationFrequency();
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().RemoteActionCompatParcelizer(i, f);
        } else if (i2 >= 34) {
            invalidateFocusui.IconCompatParcelizer(this, i, f);
        } else {
            LoadBalancer$Helper.IconCompatParcelizer(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? IntPair.write(context, i) : null, i2 != 0 ? IntPair.write(context, i2) : null, i3 != 0 ? IntPair.write(context, i3) : null, i4 != 0 ? IntPair.write(context, i4) : null);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? IntPair.write(context, i) : null, i2 != 0 ? IntPair.write(context, i2) : null, i3 != 0 ? IntPair.write(context, i3) : null, i4 != 0 ? IntPair.write(context, i4) : null);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    public void setPrecomputedText(validateKeyEventZmokQxo validatekeyeventzmokqxo) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        PrecomputedText.Params paramsRemoteActionCompatParcelizer = isInteropViewHost.RemoteActionCompatParcelizer(this);
        paramsRemoteActionCompatParcelizer.getTextPaint();
        paramsRemoteActionCompatParcelizer.getTextDirection();
        paramsRemoteActionCompatParcelizer.getBreakStrategy();
        paramsRemoteActionCompatParcelizer.getHyphenationFrequency();
        throw null;
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.write) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            RangesKt rangesKt = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer;
            if (context == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.write = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.write = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        LoadBalancer$Helper.IconCompatParcelizer(this, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RatingCompat;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
