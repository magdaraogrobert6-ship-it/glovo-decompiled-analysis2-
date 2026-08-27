package o;

import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
final class setMap extends androidx.compose.ui.node.ModifierNodeElement<update> {
    public final GapComposerKt$$ExternalSyntheticLambda0 read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        update updateVar = new update();
        updateVar.IconCompatParcelizer = this.read;
        InlineChildren inlineChildren = new InlineChildren(16, updateVar);
        CompositionLocalMapInjectionNode compositionLocalMapInjectionNode = new CompositionLocalMapInjectionNode();
        compositionLocalMapInjectionNode.RemoteActionCompatParcelizer = inlineChildren;
        updateVar.delegate(compositionLocalMapInjectionNode);
        return updateVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("addTextContextMenuDataComponentsWithResources");
        inspectorInfo.getProperties().set("builder", this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((update) node).IconCompatParcelizer = this.read;
    }

    public setMap(GapComposerKt$$ExternalSyntheticLambda0 gapComposerKt$$ExternalSyntheticLambda0) {
        this.read = gapComposerKt$$ExternalSyntheticLambda0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setMap) {
            return this.read == ((setMap) obj).read;
        }
        return false;
    }
}
