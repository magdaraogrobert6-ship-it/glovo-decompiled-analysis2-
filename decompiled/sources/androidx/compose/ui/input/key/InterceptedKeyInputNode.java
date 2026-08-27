package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onEvent;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onPreEvent;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnEvent() {
        return this.onEvent;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnPreEvent() {
        return this.onPreEvent;
    }

    public final void setOnEvent(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setOnPreEvent(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onPreEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public InterceptedKeyInputNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.onEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.onPreEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* JADX INFO: renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo1576onInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(KeyEvent.m1884boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* JADX INFO: renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo1577onPreInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onPreEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(KeyEvent.m1884boximpl(keyEvent))).booleanValue();
        }
        return false;
    }
}
