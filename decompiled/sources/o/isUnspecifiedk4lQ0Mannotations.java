package o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.viewsintegration.EmojiTextWatcher$InitCallbackImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class isUnspecifiedk4lQ0Mannotations implements TextWatcher {
    public EmojiTextWatcher$InitCallbackImpl RemoteActionCompatParcelizer;
    public boolean read = true;
    public final EditText write;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.write;
        if (!editText.isInEditMode() && this.read && MutableRectKt.write() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iIconCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer().IconCompatParcelizer();
            if (iIconCompatParcelizer != 0) {
                if (iIconCompatParcelizer == 1) {
                    MutableRectKt.RemoteActionCompatParcelizer().write(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iIconCompatParcelizer != 3) {
                    return;
                }
            }
            MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new EmojiTextWatcher$InitCallbackImpl(editText);
            }
            mutableRectKtRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    public isUnspecifiedk4lQ0Mannotations(EditText editText) {
        this.write = editText;
    }

    public static void RemoteActionCompatParcelizer(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
            if (editableText == null) {
                length = 0;
            } else {
                mutableRectKtRemoteActionCompatParcelizer.getClass();
                length = editableText.length();
            }
            mutableRectKtRemoteActionCompatParcelizer.write(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }
}
