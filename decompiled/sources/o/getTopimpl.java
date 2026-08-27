package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public class getTopimpl extends AppCompatDialogFragment {
    public boolean MediaBrowserCompatMediaItem;
    public final android.graphics.Rect MediaDescriptionCompat;

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.MediaBrowserCompatMediaItem = z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.MediaBrowserCompatMediaItem || rect == null) {
            return;
        }
        android.graphics.Rect rect2 = this.MediaDescriptionCompat;
        textInputLayout.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.addOnConfigurationChangedListener && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(java.util.Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public getTopimpl(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.editTextStyle, 0), attributeSet);
        this.MediaDescriptionCompat = new android.graphics.Rect();
        getDeactivateOutOfFrameNjRlDlw.read(context, attributeSet, com.logistics.rider.glovo.R.attr.editTextStyle, com.logistics.rider.glovo.R.style.Widget_Design_TextInputEditText);
        int[] iArr = setMeasuredSizeozmzZPI.TextInputEditText;
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context, attributeSet, iArr, com.logistics.rider.glovo.R.attr.editTextStyle, com.logistics.rider.glovo.R.style.Widget_Design_TextInputEditText, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.glovo.R.attr.editTextStyle, com.logistics.rider.glovo.R.style.Widget_Design_TextInputEditText);
        setTextInputLayoutFocusedRectEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(android.graphics.Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.MediaBrowserCompatMediaItem) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.addOnConfigurationChangedListener) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // o.AppCompatDialogFragment, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(android.graphics.Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.MediaBrowserCompatMediaItem || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayout.getHeight();
        int height2 = getHeight();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        android.graphics.Rect rect2 = this.MediaDescriptionCompat;
        rect2.set(i, i2, i3, i4 + (height - height2));
        return super.requestRectangleOnScreen(rect2);
    }
}
