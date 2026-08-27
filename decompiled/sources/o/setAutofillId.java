package o;

import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;

/* JADX INFO: loaded from: classes.dex */
public final class setAutofillId extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.SemanticsModifierNode {
    public boolean IconCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final setClassName write = setClassName.read;

    public final void RemoteActionCompatParcelizer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.IconCompatParcelizer = true;
        this.serializer.invoke(semanticsPropertyReceiver);
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.write;
    }

    public final void write() {
        this.IconCompatParcelizer = false;
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    public setAutofillId(UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 userJavascriptInterfaceBase$$ExternalSyntheticLambda12) {
        this.serializer = userJavascriptInterfaceBase$$ExternalSyntheticLambda12;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.serializer.invoke(semanticsPropertyReceiver);
    }
}
