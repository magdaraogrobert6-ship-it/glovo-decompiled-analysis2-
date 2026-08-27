package androidx.compose.ui;

import androidx.compose.ui.node.DelegatableNodeKt;
import o.getEmailAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositionLocalMapInjectionNode extends Modifier.Node {
    public static final int $stable = 8;
    private getEmailAddress map;

    public final getEmailAddress getMap() {
        return this.map;
    }

    public final void setMap(getEmailAddress getemailaddress) {
        this.map = getemailaddress;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(getemailaddress);
    }

    public CompositionLocalMapInjectionNode(getEmailAddress getemailaddress) {
        this.map = getemailaddress;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.map);
    }
}
