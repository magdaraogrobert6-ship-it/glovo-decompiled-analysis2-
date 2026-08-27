package o;

import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public final class getAutofillTextValue extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.SemanticsModifierNode {
    public accessisRelatedToAutoCommit serializer;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(this, setClassName.read, new RoomDatabase$$ExternalSyntheticLambda2(5, semanticsPropertyReceiver));
        this.serializer.getClass();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        super.onDetach();
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(this, setClassName.read, new accessisRelatedToAutoCommit(27));
    }
}
