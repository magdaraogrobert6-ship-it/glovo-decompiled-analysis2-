package o;

import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public final class getOffsetBjo55l4 extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.SemanticsModifierNode {
    public measure0kLqBqw IconCompatParcelizer;
    public final androidx.compose.ui.draw.CacheDrawModifierNode RemoteActionCompatParcelizer = (androidx.compose.ui.draw.CacheDrawModifierNode) delegate(androidx.compose.ui.draw.DrawModifierKt.CacheDrawModifierNode(new RoomDatabase$$ExternalSyntheticLambda2(2, this)));
    public androidx.compose.ui.graphics.Shape read;
    public float serializer;
    public androidx.compose.ui.graphics.Brush write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean isImportantForBounds() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.read);
    }

    public getOffsetBjo55l4(float f, androidx.compose.ui.graphics.SolidColor solidColor, androidx.compose.ui.graphics.Shape shape) {
        this.serializer = f;
        this.write = solidColor;
        this.read = shape;
    }
}
