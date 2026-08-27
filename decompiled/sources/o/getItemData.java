package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class getItemData extends MultiAutoCompleteTextView {
    public static final int[] write = {android.R.attr.popupBackground};
    public final supportRequestWindowFeature IconCompatParcelizer;
    public final setSplitBackground RemoteActionCompatParcelizer;
    public final setIcon serializer;

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.serializer.RemoteActionCompatParcelizer(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.serializer.serializer(keyListener));
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        setsplitbackground.write(colorStateList);
        setsplitbackground.read();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        setsplitbackground.IconCompatParcelizer(mode);
        setsplitbackground.read();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        supportRequestWindowFeature supportrequestwindowfeature = this.IconCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        supportRequestWindowFeature supportrequestwindowfeature = this.IconCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        supportRequestWindowFeature supportrequestwindowfeature = this.IconCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.serializer(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.serializer(context, i);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        supportRequestWindowFeature supportrequestwindowfeature = this.IconCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.read();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        supportRequestWindowFeature supportrequestwindowfeature = this.IconCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.serializer();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        getMenu.RemoteActionCompatParcelizer(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.serializer.write(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(coil3.util.IntPair.write(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        supportRequestWindowFeature supportrequestwindowfeature = this.IconCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.read(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        supportRequestWindowFeature supportrequestwindowfeature = this.IconCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write(mode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getItemData(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        setSupportBackgroundTintList.read(this, getContext());
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(getContext(), attributeSet, write, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) emojiProcessorRemoteActionCompatParcelizer.read).hasValue(0)) {
            setDropDownBackgroundDrawable(emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0));
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.IconCompatParcelizer = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        setSplitBackground setsplitbackground = new setSplitBackground(this);
        this.RemoteActionCompatParcelizer = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        setsplitbackground.read();
        setIcon seticon = new setIcon(this);
        this.serializer = seticon;
        seticon.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerSerializer = seticon.serializer(keyListener);
        if (keyListenerSerializer == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerSerializer);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }
}
