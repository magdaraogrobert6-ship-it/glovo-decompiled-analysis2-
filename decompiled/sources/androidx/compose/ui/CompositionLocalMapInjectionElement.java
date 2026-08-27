package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.getEmailAddress;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {
    public static final int $stable = 0;
    private final getEmailAddress map;

    public final getEmailAddress getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CompositionLocalMapInjectionNode create() {
        return new CompositionLocalMapInjectionNode(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("<Injected CompositionLocalMap>");
    }

    public CompositionLocalMapInjectionElement(getEmailAddress getemailaddress) {
        this.map = getemailaddress;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof CompositionLocalMapInjectionElement)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((CompositionLocalMapInjectionElement) obj).map, this.map}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CompositionLocalMapInjectionNode compositionLocalMapInjectionNode) {
        compositionLocalMapInjectionNode.setMap(this.map);
    }
}
