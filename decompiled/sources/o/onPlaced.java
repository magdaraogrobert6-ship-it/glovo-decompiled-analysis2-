package o;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class onPlaced {
    public final FocusOwnerKt read(View view, FocusOwnerKt focusOwnerKt) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(focusOwnerKt);
        }
        getEnter getenter = focusOwnerKt.IconCompatParcelizer;
        if (getenter.read() == 2) {
            return focusOwnerKt;
        }
        ClipData clipDataIconCompatParcelizer = getenter.IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = getenter.RemoteActionCompatParcelizer();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataIconCompatParcelizer.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataIconCompatParcelizer.getItemAt(i);
            if ((iRemoteActionCompatParcelizer & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                }
            }
        }
        return null;
    }
}
