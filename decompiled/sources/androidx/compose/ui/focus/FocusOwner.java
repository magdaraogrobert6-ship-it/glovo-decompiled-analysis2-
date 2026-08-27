package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.ContentInViewNode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    /* JADX INFO: renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo366clearFocusI7lrPNg(boolean z, boolean z2, boolean z3, int i);

    void clearOwnerFocus();

    void dispatchIndirectPointerCancel();

    boolean dispatchIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent);

    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo367dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo368dispatchKeyEventYhN2O0w(KeyEvent keyEvent, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0);

    /* JADX INFO: renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo369focusSearchULY8qGw(int i, Rect rect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    void focusTargetAvailable();

    FocusTargetNode getActiveFocusTargetNode();

    Rect getFocusRect();

    ContentInViewNode getListeners();

    Modifier getModifier();

    FocusState getRootState();

    boolean hasFocusableContent();

    boolean hasNonInteropFocusableContent();

    boolean isFocusCaptured();

    /* JADX INFO: renamed from: moveFocus-aToIllA, reason: not valid java name */
    boolean mo370moveFocusaToIllA(int i, boolean z);

    void releaseFocus();

    /* JADX INFO: renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo371requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect);

    /* JADX INFO: renamed from: resetFocus-3ESFkO8, reason: not valid java name */
    boolean mo372resetFocus3ESFkO8(int i);

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z);

    /* JADX INFO: renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo373takeFocusaToIllA(int i, Rect rect);

    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m365dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Boolean invoke() {
                        return Boolean.FALSE;
                    }
                };
            }
            return focusOwner.mo368dispatchKeyEventYhN2O0w(keyEvent, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        return false;
    }

    static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner focusOwner, RotaryScrollEvent rotaryScrollEvent, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.focus.FocusOwner.dispatchRotaryEvent.1
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Boolean invoke() {
                        return Boolean.FALSE;
                    }
                };
            }
            return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
        return false;
    }
}
