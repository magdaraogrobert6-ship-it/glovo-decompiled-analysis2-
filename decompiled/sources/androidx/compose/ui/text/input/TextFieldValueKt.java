package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m2881subSequence5zctL8(textFieldValue.m3330getSelectiond9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int iM3073getMaximpl = TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE());
        int iM3073getMaximpl2 = TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE());
        int length = iM3073getMaximpl2 + i;
        if (((i ^ length) & (iM3073getMaximpl2 ^ length)) < 0) {
            length = textFieldValue.getText().length();
        }
        return annotatedString.subSequence(iM3073getMaximpl, Math.min(length, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int iM3074getMinimpl = TextRange.m3074getMinimpl(textFieldValue.m3330getSelectiond9O1mEE());
        int i2 = iM3074getMinimpl - i;
        if (((i ^ iM3074getMinimpl) & (iM3074getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return annotatedString.subSequence(Math.max(0, i2), TextRange.m3074getMinimpl(textFieldValue.m3330getSelectiond9O1mEE()));
    }
}
