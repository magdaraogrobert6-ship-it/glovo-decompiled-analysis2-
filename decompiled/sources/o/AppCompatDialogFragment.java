package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends EditText implements InterfaceC0164focusProperties {
    public final onPlaced IconCompatParcelizer;
    public final supportRequestWindowFeature RemoteActionCompatParcelizer;
    public final setSplitBackground read;
    public final setIcon serializer;
    public AppCompatViewInflater write;

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.read.IconCompatParcelizer();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // o.InterfaceC0164focusProperties
    public final FocusOwnerKt serializer(FocusOwnerKt focusOwnerKt) {
        return this.IconCompatParcelizer.read(this, focusOwnerKt);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.serializer.RemoteActionCompatParcelizer(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.serializer.serializer(keyListener));
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        setSplitBackground setsplitbackground = this.read;
        setsplitbackground.write(colorStateList);
        setsplitbackground.read();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        setSplitBackground setsplitbackground = this.read;
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
        setSplitBackground setsplitbackground = this.read;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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
        setSplitBackground setsplitbackground = this.read;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.read;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSplitBackground setsplitbackground = this.read;
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().read();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrWrite;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.read.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            DefaultInAppMessageViewWrapperCompanion.serializer(editorInfo, getText());
        }
        getMenu.RemoteActionCompatParcelizer(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrWrite = FocusPropertiesNode.write(this)) != null) {
            DefaultInAppMessageViewWrapperCompanion.read(editorInfo, strArrWrite);
            inputConnectionOnCreateInputConnection = getFocusedRect.write(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.serializer.write(inputConnectionOnCreateInputConnection, editorInfo);
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
        getSuperCaller().write(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatDialogFragment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.editTextStyle);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        setSupportBackgroundTintList.read(this, getContext());
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.RemoteActionCompatParcelizer = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, com.logistics.rider.glovo.R.attr.editTextStyle);
        setSplitBackground setsplitbackground = new setSplitBackground(this);
        this.read = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.editTextStyle);
        setsplitbackground.read();
        this.IconCompatParcelizer = new onPlaced();
        setIcon seticon = new setIcon(this);
        this.serializer = seticon;
        seticon.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (setIcon.write(keyListener)) {
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
    }

    private AppCompatViewInflater getSuperCaller() {
        if (this.write == null) {
            this.write = new AppCompatViewInflater(this);
        }
        return this.write;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (ensureMenuView.serializer(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (ensureMenuView.RemoteActionCompatParcelizer(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }
}
