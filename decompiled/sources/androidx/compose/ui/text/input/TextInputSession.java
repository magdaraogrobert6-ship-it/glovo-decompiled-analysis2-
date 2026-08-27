package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public final class TextInputSession {
    public static final int $stable = 8;
    private final PlatformTextInputService platformTextInputService;
    private final TextInputService textInputService;

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean isOpen() {
        Object[] objArr = {this.textInputService.getCurrentInputSession$ui_text(), this};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    private final boolean ensureOpenSession(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return zIsOpen;
    }

    public final boolean hideSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean notifyFocusedRect(Rect rect) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.platformTextInputService.notifyFocusedRect(rect);
        }
        return zIsOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.platformTextInputService.updateState(textFieldValue, textFieldValue2);
        }
        return zIsOpen;
    }

    public final boolean updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Rect rect, Rect rect2) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.platformTextInputService.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, r8lambdaunavo3sxub_pc9xroryotnrlvsm, rect, rect2);
        }
        return zIsOpen;
    }
}
