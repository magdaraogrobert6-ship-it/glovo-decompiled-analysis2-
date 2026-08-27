package o;

import android.view.InputDevice;
import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes.dex */
public final class getTopEnd implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.foundation.text.LegacyTextFieldState read;
    public final /* synthetic */ androidx.compose.ui.focus.FocusManager serializer;

    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean zMo364moveFocus3ESFkO8;
        android.view.KeyEvent keyEventM1890unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m1890unboximpl();
        InputDevice device = keyEventM1890unboximpl.getDevice();
        if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEventM1890unboximpl.getSource() == 33554433) && androidx.compose.ui.input.key.KeyEventType.m1894equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m1902getTypeZmokQxo(keyEventM1890unboximpl), androidx.compose.ui.input.key.KeyEventType.Companion.m1898getKeyDownCS__XNY()) && keyEventM1890unboximpl.getSource() != 257)) {
            boolean zIconCompatParcelizer = getCenterStartannotations.IconCompatParcelizer(19, keyEventM1890unboximpl);
            androidx.compose.ui.focus.FocusManager focusManager = this.serializer;
            if (zIconCompatParcelizer) {
                zMo364moveFocus3ESFkO8 = focusManager.mo364moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.Companion.m360getUpdhqQ8s());
            } else if (getCenterStartannotations.IconCompatParcelizer(20, keyEventM1890unboximpl)) {
                zMo364moveFocus3ESFkO8 = focusManager.mo364moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.Companion.m353getDowndhqQ8s());
            } else if (getCenterStartannotations.IconCompatParcelizer(21, keyEventM1890unboximpl)) {
                zMo364moveFocus3ESFkO8 = focusManager.mo364moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.Companion.m356getLeftdhqQ8s());
            } else if (getCenterStartannotations.IconCompatParcelizer(22, keyEventM1890unboximpl)) {
                zMo364moveFocus3ESFkO8 = focusManager.mo364moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.Companion.m359getRightdhqQ8s());
            } else if (getCenterStartannotations.IconCompatParcelizer(23, keyEventM1890unboximpl)) {
                SoftwareKeyboardController softwareKeyboardController = this.read.PlaybackStateCompat;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.show();
                }
                zMo364moveFocus3ESFkO8 = true;
            } else {
                zMo364moveFocus3ESFkO8 = false;
            }
        } else {
            zMo364moveFocus3ESFkO8 = false;
        }
        return Boolean.valueOf(zMo364moveFocus3ESFkO8);
    }

    public getTopEnd(androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState) {
        this.serializer = focusManager;
        this.read = legacyTextFieldState;
    }
}
