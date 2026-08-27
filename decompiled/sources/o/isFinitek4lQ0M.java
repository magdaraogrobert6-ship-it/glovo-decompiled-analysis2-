package o;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes4.dex */
public final class isFinitek4lQ0M extends InputConnectionWrapper {
    public final TextView IconCompatParcelizer;
    public final Timestamp.Companion read;

    public isFinitek4lQ0M(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        Timestamp.Companion companion = new Timestamp.Companion(0);
        super(inputConnection, false);
        this.IconCompatParcelizer = textView;
        this.read = companion;
        if (MutableRectKt.write()) {
            MutableRectKt.RemoteActionCompatParcelizer().read(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.IconCompatParcelizer.getEditableText();
        this.read.getClass();
        return Timestamp.Companion.read(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.IconCompatParcelizer.getEditableText();
        this.read.getClass();
        return Timestamp.Companion.read(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
