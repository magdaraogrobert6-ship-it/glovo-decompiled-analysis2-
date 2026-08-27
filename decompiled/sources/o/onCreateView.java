package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class onCreateView extends CheckedTextView {
    public final setSplitBackground IconCompatParcelizer;
    public getAccessibilityClassName RemoteActionCompatParcelizer;
    public final setBackgroundResource read;
    public final supportRequestWindowFeature serializer;

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        setSplitBackground setsplitbackground = this.IconCompatParcelizer;
        setsplitbackground.write(colorStateList);
        setsplitbackground.read();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        setSplitBackground setsplitbackground = this.IconCompatParcelizer;
        setsplitbackground.IconCompatParcelizer(mode);
        setsplitbackground.read();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        setSplitBackground setsplitbackground = this.IconCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
        setBackgroundResource setbackgroundresource = this.read;
        if (setbackgroundresource != null) {
            setbackgroundresource.IconCompatParcelizer();
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
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.serializer(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        setBackgroundResource setbackgroundresource = this.read;
        if (setbackgroundresource != null) {
            if (setbackgroundresource.write) {
                setbackgroundresource.write = false;
            } else {
                setbackgroundresource.write = true;
                setbackgroundresource.IconCompatParcelizer();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.IconCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.IconCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSplitBackground setsplitbackground = this.IconCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.serializer(context, i);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.read();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.serializer();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        setBackgroundResource setbackgroundresource = this.read;
        if (setbackgroundresource != null) {
            return setbackgroundresource.read;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        setBackgroundResource setbackgroundresource = this.read;
        if (setbackgroundresource != null) {
            return setbackgroundresource.IconCompatParcelizer;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        getMenu.RemoteActionCompatParcelizer(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().serializer(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.read(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        setBackgroundResource setbackgroundresource = this.read;
        if (setbackgroundresource != null) {
            setbackgroundresource.read = colorStateList;
            setbackgroundresource.serializer = true;
            setbackgroundresource.IconCompatParcelizer();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        setBackgroundResource setbackgroundresource = this.read;
        if (setbackgroundresource != null) {
            setbackgroundresource.IconCompatParcelizer = mode;
            setbackgroundresource.RemoteActionCompatParcelizer = true;
            setbackgroundresource.IconCompatParcelizer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onCreateView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.checkedTextViewStyle);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        setSupportBackgroundTintList.read(this, getContext());
        setSplitBackground setsplitbackground = new setSplitBackground(this);
        this.IconCompatParcelizer = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.checkedTextViewStyle);
        setsplitbackground.read();
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.serializer = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, com.logistics.rider.glovo.R.attr.checkedTextViewStyle);
        this.read = new setBackgroundResource(this);
        Context context2 = getContext();
        int[] iArr = onUserLeaveHint.CheckedTextView;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context2, attributeSet, iArr, com.logistics.rider.glovo.R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        FocusPropertiesNode.IconCompatParcelizer(this, getContext(), iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, com.logistics.rider.glovo.R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(coil3.util.IntPair.write(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(coil3.util.IntPair.write(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(coil3.util.IntPair.write(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(emojiProcessorRemoteActionCompatParcelizer.serializer(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(getNestedScrollAxes.IconCompatParcelizer(typedArray.getInt(3, -1), null));
            }
            emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
            getEmojiTextViewHelper().write(attributeSet, com.logistics.rider.glovo.R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
            throw th;
        }
    }

    private getAccessibilityClassName getEmojiTextViewHelper() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new getAccessibilityClassName(this);
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(coil3.util.IntPair.write(getContext(), i));
    }
}
