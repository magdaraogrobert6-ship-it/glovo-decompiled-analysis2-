package o;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getTopStartannotations implements getBottomCenter {
    public getBottomEnd IconCompatParcelizer;
    public androidx.compose.ui.focus.FocusManager RemoteActionCompatParcelizer;
    public final SoftwareKeyboardController write;

    public final boolean IconCompatParcelizer(int i) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        SoftwareKeyboardController softwareKeyboardController;
        androidx.compose.ui.text.input.ImeAction.Companion companion = androidx.compose.ui.text.input.ImeAction.Companion;
        if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3262getDoneeUduSuo())) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = RemoteActionCompatParcelizer().serializer;
        } else {
            if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3263getGoeUduSuo()) || androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3264getNexteUduSuo()) || androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3266getPreviouseUduSuo()) || androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3267getSearcheUduSuo()) || androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3268getSendeUduSuo())) {
                RemoteActionCompatParcelizer();
            } else if (!androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3261getDefaulteUduSuo()) && !androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3265getNoneeUduSuo())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("invalid ImeAction");
                return false;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
        }
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
            return true;
        }
        if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3264getNexteUduSuo())) {
            androidx.compose.ui.focus.FocusManager focusManager = this.RemoteActionCompatParcelizer;
            if (focusManager != null) {
                focusManager.mo364moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.Companion.m357getNextdhqQ8s());
                return true;
            }
            removeNodeAtDepth.serializer("focusManager");
            throw null;
        }
        if (!androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3266getPreviouseUduSuo())) {
            if (!androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(i, companion.m3262getDoneeUduSuo()) || (softwareKeyboardController = this.write) == null) {
                return false;
            }
            softwareKeyboardController.hide();
            return true;
        }
        androidx.compose.ui.focus.FocusManager focusManager2 = this.RemoteActionCompatParcelizer;
        if (focusManager2 != null) {
            focusManager2.mo364moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.Companion.m358getPreviousdhqQ8s());
            return true;
        }
        removeNodeAtDepth.serializer("focusManager");
        throw null;
    }

    public getTopStartannotations(SoftwareKeyboardController softwareKeyboardController) {
        this.write = softwareKeyboardController;
    }

    public final getBottomEnd RemoteActionCompatParcelizer() {
        getBottomEnd getbottomend = this.IconCompatParcelizer;
        if (getbottomend != null) {
            return getbottomend;
        }
        removeNodeAtDepth.serializer("keyboardActions");
        throw null;
    }
}
