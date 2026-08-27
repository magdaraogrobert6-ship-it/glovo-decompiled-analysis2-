package o;

import android.view.inputmethod.ExtractedText;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class retryInAppMessagelambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final CountDownTimerUiModel RemoteActionCompatParcelizer(RectListDebuggerModifierNodeonAttach1 rectListDebuggerModifierNodeonAttach1, RectListDebugger rectListDebugger) {
        int i = 2 % 2;
        rectListDebuggerModifierNodeonAttach1.getClass();
        rectListDebugger.getClass();
        CountDownTimerUiModel countDownTimerUiModel = new CountDownTimerUiModel(rectListDebuggerModifierNodeonAttach1, rectListDebugger);
        int i2 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return countDownTimerUiModel;
    }

    public static final ExtractedText write(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        int i = 2 % 2;
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.TextRange.m3074getMinimpl(textFieldValue.m3330getSelectiond9O1mEE());
        extractedText.selectionEnd = androidx.compose.ui.text.TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE());
        extractedText.flags = !hideCurrentlyDisplayingInAppMessage.read((CharSequence) textFieldValue.getText(), '\n') ? 1 : 0;
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return extractedText;
        }
        throw null;
    }
}
