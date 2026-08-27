package o;

/* JADX INFO: loaded from: classes.dex */
public final class emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseObserveNavigationCrowdsourcingobserveGeofenceCrossedinlinedmap12 extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.UnspecifiedConstraintsNode> {
    public final float serializer;
    public final float write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.foundation.layout.UnspecifiedConstraintsNode unspecifiedConstraintsNode = new androidx.compose.foundation.layout.UnspecifiedConstraintsNode();
        unspecifiedConstraintsNode.RemoteActionCompatParcelizer = this.serializer;
        unspecifiedConstraintsNode.read = this.write;
        return unspecifiedConstraintsNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.write) + (androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.serializer) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        MediaSessionCompatQueueItem.serializer(this.serializer, inspectorInfo.getProperties(), "minWidth", inspectorInfo).set("minHeight", androidx.compose.ui.unit.Dp.m3671boximpl(this.write));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.foundation.layout.UnspecifiedConstraintsNode unspecifiedConstraintsNode = (androidx.compose.foundation.layout.UnspecifiedConstraintsNode) node;
        unspecifiedConstraintsNode.RemoteActionCompatParcelizer = this.serializer;
        unspecifiedConstraintsNode.read = this.write;
    }

    public emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseObserveNavigationCrowdsourcingobserveGeofenceCrossedinlinedmap12(float f, float f2) {
        this.serializer = f;
        this.write = f2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (!(obj instanceof emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseObserveNavigationCrowdsourcingobserveGeofenceCrossedinlinedmap12)) {
            return false;
        }
        emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseObserveNavigationCrowdsourcingobserveGeofenceCrossedinlinedmap12 emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseobservenavigationcrowdsourcingobservegeofencecrossedinlinedmap12 = (emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseObserveNavigationCrowdsourcingobserveGeofenceCrossedinlinedmap12) obj;
        return androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.serializer, emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseobservenavigationcrowdsourcingobservegeofencecrossedinlinedmap12.serializer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.write, emitcomroadrunnerdeliveryonthewaycrowdsourcingnavigationusecaseobservenavigationcrowdsourcingobservegeofencecrossedinlinedmap12.write);
    }
}
