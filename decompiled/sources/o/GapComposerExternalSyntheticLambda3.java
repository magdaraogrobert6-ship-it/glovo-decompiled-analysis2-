package o;

/* JADX INFO: loaded from: classes.dex */
final class GapComposerExternalSyntheticLambda3 extends androidx.compose.ui.node.ModifierNodeElement<ComposeRuntimeError> {
    public final RadioButtonTokens serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new ComposeRuntimeError(this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((ComposeRuntimeError) node).serializer = this.serializer;
    }

    public GapComposerExternalSyntheticLambda3(RadioButtonTokens radioButtonTokens) {
        this.serializer = radioButtonTokens;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("traversablePrefetchState");
        inspectorInfo.setValue(this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GapComposerExternalSyntheticLambda3)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((GapComposerExternalSyntheticLambda3) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.serializer + ')';
    }
}
