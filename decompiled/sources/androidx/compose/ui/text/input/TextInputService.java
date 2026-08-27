package androidx.compose.ui.text.input;

import androidx.compose.ui.text.InternalTextApi;
import java.util.concurrent.atomic.AtomicReference;
import o.MediaSessionCompatQueueItem;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public class TextInputService {
    public static final int $stable = 8;
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);
    private final PlatformTextInputService platformTextInputService;

    public final TextInputSession getCurrentInputSession$ui_text() {
        return this._currentInputSession.get();
    }

    @onItemDismisslambda0
    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    public TextInputSession startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(TextInputSession textInputSession) {
        if (MediaSessionCompatQueueItem.IconCompatParcelizer(this._currentInputSession, textInputSession)) {
            this.platformTextInputService.stopInput();
        }
    }

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    @onItemDismisslambda0
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    @InternalTextApi
    public final void stopInput() {
        this._currentInputSession.set(null);
        this.platformTextInputService.stopInput();
    }

    @InternalTextApi
    public final void startInput() {
        this.platformTextInputService.startInput();
        this._currentInputSession.set(new TextInputSession(this, this.platformTextInputService));
    }
}
