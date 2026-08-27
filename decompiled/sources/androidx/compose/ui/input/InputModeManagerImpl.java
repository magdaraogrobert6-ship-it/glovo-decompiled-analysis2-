package androidx.compose.ui.input;

import androidx.compose.runtime.CompositionKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.PopulateViewStructure_androidKtpopulate7;

/* JADX INFO: loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 8;
    private final PopulateViewStructure_androidKtpopulate7 inputMode$delegate;
    private final InputModeChangeRequester onRequestInputModeChange;

    @Override // androidx.compose.ui.input.InputModeManager
    /* JADX INFO: renamed from: getInputMode-aOaMEAU */
    public int mo1545getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m1541unboximpl();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    /* JADX INFO: renamed from: requestInputMode-iuPiT84 */
    public boolean mo1546requestInputModeiuPiT84(int i) {
        return this.onRequestInputModeChange.mo1544requestiuPiT84(i);
    }

    /* JADX INFO: renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m1547setInputModeiuPiT84(int i) {
        this.inputMode$delegate.setValue(InputMode.m1535boximpl(i));
    }

    private InputModeManagerImpl(int i, InputModeChangeRequester inputModeChangeRequester) {
        this.onRequestInputModeChange = inputModeChangeRequester;
        this.inputMode$delegate = CompositionKt.RemoteActionCompatParcelizer(InputMode.m1535boximpl(i));
    }

    public /* synthetic */ InputModeManagerImpl(int i, InputModeChangeRequester inputModeChangeRequester, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, inputModeChangeRequester);
    }
}
