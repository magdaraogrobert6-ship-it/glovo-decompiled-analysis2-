package o;

/* JADX INFO: loaded from: classes.dex */
public final class UiMediaScopePointerPrecisionCompanion implements androidx.compose.ui.graphics.ColorProducer {
    public final /* synthetic */ androidx.compose.material3.DelegatingThemeAwareRippleNode RemoteActionCompatParcelizer;

    @Override // androidx.compose.ui.graphics.ColorProducer
    /* JADX INFO: renamed from: invoke-0d7_KjU */
    public final long mo803invoke0d7_KjU() {
        androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.RemoteActionCompatParcelizer;
        long jMo803invoke0d7_KjU = delegatingThemeAwareRippleNode.color.mo803invoke0d7_KjU();
        if (jMo803invoke0d7_KjU != 16) {
            return jMo803invoke0d7_KjU;
        }
        invokelambda0 invokelambda0Var = (invokelambda0) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, onReceive.serializer);
        if (invokelambda0Var != null) {
            long j = invokelambda0Var.RemoteActionCompatParcelizer;
            if (j != 16) {
                return j;
            }
        }
        return ((androidx.compose.ui.graphics.Color) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
    }

    public UiMediaScopePointerPrecisionCompanion(androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.RemoteActionCompatParcelizer = delegatingThemeAwareRippleNode;
    }
}
