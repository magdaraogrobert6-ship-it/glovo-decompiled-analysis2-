package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m3074getMinimpl(textFieldValue.m3330getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE());
        extractedText.flags = !hideCurrentlyDisplayingInAppMessage.read((CharSequence) textFieldValue.getText(), '\n') ? 1 : 0;
        return extractedText;
    }
}
