package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class OnLayoutRectChangedNode extends Modifier.Node {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM callback;
    private long debounceMillis;
    private DelegatableNode.RegistrationHandle handle;
    private long throttleMillis;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        disposeAndRegister();
    }

    public final void setCallback(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setDebounceMillis(long j) {
        this.debounceMillis = j;
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setThrottleMillis(long j) {
        this.throttleMillis = j;
    }

    public OnLayoutRectChangedNode(long j, long j2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.throttleMillis = j;
        this.debounceMillis = j2;
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void disposeAndRegister() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = null;
    }
}
