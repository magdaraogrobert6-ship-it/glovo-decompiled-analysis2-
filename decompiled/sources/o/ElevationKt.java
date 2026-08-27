package o;

/* JADX INFO: loaded from: classes.dex */
public final class ElevationKt extends androidx.compose.ui.Modifier.Node {
    public androidx.compose.ui.node.DelegatableNode.RegistrationHandle IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier write;

    public ElevationKt(androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier) {
        this.write = awaitFirstLayoutModifier;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.write;
        awaitFirstLayoutModifier.write = this;
        if (awaitFirstLayoutModifier.read != null) {
            this.IconCompatParcelizer = androidx.compose.ui.layout.OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, new waitForFirstLayout(this, 17, awaitFirstLayoutModifier));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.write;
        if (awaitFirstLayoutModifier.write == this) {
            awaitFirstLayoutModifier.write = null;
        }
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.IconCompatParcelizer;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.IconCompatParcelizer = null;
    }
}
