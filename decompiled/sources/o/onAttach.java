package o;

import com.roadrunner.nafath.NafathModalUiModelImpl$1;

/* JADX INFO: loaded from: classes.dex */
final class onAttach extends androidx.compose.ui.node.ModifierNodeElement<ExperimentalComposeUiApi> {
    public final NafathModalUiModelImpl$1.AnonymousClass2 write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new ExperimentalComposeUiApi(this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("TextContextMenuGestures");
        inspectorInfo.getProperties().set("onPreShowContextMenu", this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((ExperimentalComposeUiApi) node).write = this.write;
    }

    public onAttach(NafathModalUiModelImpl$1.AnonymousClass2 anonymousClass2) {
        this.write = anonymousClass2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onAttach) {
            return this.write == ((onAttach) obj).write;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        NafathModalUiModelImpl$1.AnonymousClass2 anonymousClass2 = this.write;
        if (anonymousClass2 != null) {
            return anonymousClass2.hashCode();
        }
        return 0;
    }
}
