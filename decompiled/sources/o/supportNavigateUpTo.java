package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class supportNavigateUpTo extends AutoCompleteTextView {
    public static final int[] IconCompatParcelizer = {android.R.attr.popupBackground};
    public final supportRequestWindowFeature RemoteActionCompatParcelizer;
    public final setSplitBackground serializer;
    public final setIcon write;

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.serializer.IconCompatParcelizer();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.serializer.RemoteActionCompatParcelizer();
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.write.RemoteActionCompatParcelizer(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.write.serializer(keyListener));
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        setSplitBackground setsplitbackground = this.serializer;
        setsplitbackground.write(colorStateList);
        setsplitbackground.read();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        setSplitBackground setsplitbackground = this.serializer;
        setsplitbackground.IconCompatParcelizer(mode);
        setsplitbackground.read();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
        setSplitBackground setsplitbackground = this.serializer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.serializer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.serializer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSplitBackground setsplitbackground = this.serializer;
        if (setsplitbackground != null) {
            setsplitbackground.serializer(context, i);
        }
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        getMenu.RemoteActionCompatParcelizer(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.write.write(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(coil3.util.IntPair.write(getContext(), i));
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public supportNavigateUpTo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        setSupportBackgroundTintList.read(this, getContext());
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(getContext(), attributeSet, IconCompatParcelizer, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) emojiProcessorRemoteActionCompatParcelizer.read).hasValue(0)) {
            setDropDownBackgroundDrawable(emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0));
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.RemoteActionCompatParcelizer = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        setSplitBackground setsplitbackground = new setSplitBackground(this);
        this.serializer = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        setsplitbackground.read();
        setIcon seticon = new setIcon(this);
        this.write = seticon;
        seticon.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerSerializer = seticon.serializer(keyListener);
        if (keyListenerSerializer == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerSerializer);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    public supportNavigateUpTo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
