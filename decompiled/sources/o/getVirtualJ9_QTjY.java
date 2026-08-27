package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getVirtualJ9_QTjY implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ androidx.compose.material3.DelegatingThemeAwareRippleNode read;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        getPhoneNumber getphonenumber = onReceive.serializer;
        androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.read;
        invokelambda0 invokelambda0Var = (invokelambda0) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, getphonenumber);
        androidx.compose.ui.node.DelegatableNode delegatableNode = delegatingThemeAwareRippleNode.write;
        if (invokelambda0Var == null) {
            if (delegatableNode != null) {
                delegatingThemeAwareRippleNode.undelegate(delegatableNode);
            }
            delegatingThemeAwareRippleNode.write = null;
        } else if (delegatableNode == null) {
            delegatingThemeAwareRippleNode.write = delegatingThemeAwareRippleNode.delegate(setKindSetui.read(delegatingThemeAwareRippleNode.IconCompatParcelizer, delegatingThemeAwareRippleNode.read, delegatingThemeAwareRippleNode.serializer, new UiMediaScopePointerPrecisionCompanion(delegatingThemeAwareRippleNode), new AndroidAutofillType_androidKt(1, delegatingThemeAwareRippleNode)));
        }
        return createFromParcel.INSTANCE;
    }

    public /* synthetic */ getVirtualJ9_QTjY(androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.read = delegatingThemeAwareRippleNode;
    }
}
