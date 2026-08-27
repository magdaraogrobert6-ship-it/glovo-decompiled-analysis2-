package o;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeRuntimeError extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    public final String IconCompatParcelizer = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    public RadioButtonTokens serializer;

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.IconCompatParcelizer;
    }

    public ComposeRuntimeError(RadioButtonTokens radioButtonTokens) {
        this.serializer = radioButtonTokens;
    }
}
