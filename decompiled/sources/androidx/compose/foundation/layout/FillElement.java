package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.ModalBottomSheetKtModalBottomSheet51;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends ModifierNodeElement<FillNode> {
    public final float IconCompatParcelizer;
    public final String read;
    public final ModalBottomSheetKtModalBottomSheet51 write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        FillNode fillNode = new FillNode();
        fillNode.read = this.write;
        fillNode.write = this.IconCompatParcelizer;
        return fillNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Float.hashCode(this.IconCompatParcelizer) + (this.write.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.read);
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.IconCompatParcelizer));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        FillNode fillNode = (FillNode) node;
        fillNode.read = this.write;
        fillNode.write = this.IconCompatParcelizer;
    }

    public FillElement(ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet51, float f, String str) {
        this.write = modalBottomSheetKtModalBottomSheet51;
        this.IconCompatParcelizer = f;
        this.read = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.write == fillElement.write && this.IconCompatParcelizer == fillElement.IconCompatParcelizer;
    }
}
