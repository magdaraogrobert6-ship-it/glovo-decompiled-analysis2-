package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextRange;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.fFk$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import o.DefaultInAppMessageViewWrapperCompanion;
import o.MutableRectKt;

/* JADX INFO: loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$0(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    public static final Executor asExecutor(Choreographer choreographer) {
        return new fFk$$ExternalSyntheticLambda0(1, choreographer);
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int i;
        String privateImeOptions;
        int iM3277getImeActioneUduSuo = imeOptions.m3277getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3261getDefaulteUduSuo())) {
            i = imeOptions.getSingleLine() ? 6 : 0;
        } else if (ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3265getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3263getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3264getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3266getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3267getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3268getSendeUduSuo())) {
            i = 4;
        } else {
            if (!ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3262getDoneeUduSuo())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM3278getKeyboardTypePjHm6EE = imeOptions.m3278getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3322getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3315getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3318getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3321getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3324getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3317getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3320getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3319getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3316getDecimalPjHm6EE())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Invalid Keyboard Type");
                return;
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= Fields.RenderEffect;
            if (ImeAction.m3248equalsimpl0(imeOptions.m3277getImeActioneUduSuo(), companion.m3261getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM3276getCapitalizationIUNYP9k = imeOptions.m3276getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m3284equalsimpl0(iM3276getCapitalizationIUNYP9k, companion3.m3293getCharactersIUNYP9k())) {
                editorInfo.inputType |= Fields.TransformOrigin;
            } else if (KeyboardCapitalization.m3284equalsimpl0(iM3276getCapitalizationIUNYP9k, companion3.m3297getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m3284equalsimpl0(iM3276getCapitalizationIUNYP9k, companion3.m3295getSentencesIUNYP9k())) {
                editorInfo.inputType |= Fields.Clip;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= Fields.CompositingStrategy;
            }
        }
        editorInfo.initialSelStart = TextRange.m3076getStartimpl(textFieldValue.m3330getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m3071getEndimpl(textFieldValue.m3330getSelectiond9O1mEE());
        DefaultInAppMessageViewWrapperCompanion.serializer(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (MutableRectKt.write()) {
            MutableRectKt.RemoteActionCompatParcelizer().read(editorInfo);
        }
    }
}
