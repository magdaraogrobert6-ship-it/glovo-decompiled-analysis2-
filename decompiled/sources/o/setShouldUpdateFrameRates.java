package o;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class setShouldUpdateFrameRates implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ setShouldUpdateFrameRates(int i, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            ((r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) obj).write((CancellationException) null);
            return;
        }
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj;
        if (textFieldSelectionManager != null) {
            androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState != null) {
                long jM3081getZerod9O1mEE = androidx.compose.ui.text.TextRange.Companion.m3081getZerod9O1mEE();
                ((onShowTranslationui) legacyTextFieldState.serializer).setValue(androidx.compose.ui.text.TextRange.m3064boximpl(jM3081getZerod9O1mEE));
            }
            androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState2 != null) {
                long jM3081getZerod9O1mEE2 = androidx.compose.ui.text.TextRange.Companion.m3081getZerod9O1mEE();
                ((onShowTranslationui) legacyTextFieldState2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).setValue(androidx.compose.ui.text.TextRange.m3064boximpl(jM3081getZerod9O1mEE2));
            }
        }
    }
}
