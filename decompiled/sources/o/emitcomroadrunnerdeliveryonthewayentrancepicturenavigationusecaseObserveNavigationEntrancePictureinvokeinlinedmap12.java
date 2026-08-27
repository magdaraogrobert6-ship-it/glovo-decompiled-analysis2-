package o;

/* JADX INFO: loaded from: classes.dex */
public final class emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12 extends androidx.compose.ui.node.ModifierNodeElement<TooltipKtPlainTooltip4> {
    public final androidx.compose.ui.Alignment.Vertical serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        TooltipKtPlainTooltip4 tooltipKtPlainTooltip4 = new TooltipKtPlainTooltip4();
        tooltipKtPlainTooltip4.read = this.serializer;
        return tooltipKtPlainTooltip4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((TooltipKtPlainTooltip4) node).read = this.serializer;
    }

    public emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(androidx.compose.ui.Alignment.Vertical vertical) {
        this.serializer = vertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12 emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseobservenavigationentrancepictureinvokeinlinedmap12 = obj instanceof emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12 ? (emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12) obj : null;
        if (emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseobservenavigationentrancepictureinvokeinlinedmap12 == null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseobservenavigationentrancepictureinvokeinlinedmap12.serializer}, getCieXyz.write())).booleanValue();
    }
}
