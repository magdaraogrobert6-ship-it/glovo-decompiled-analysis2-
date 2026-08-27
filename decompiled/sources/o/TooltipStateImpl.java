package o;

/* JADX INFO: loaded from: classes.dex */
public final class TooltipStateImpl extends androidx.compose.ui.node.ModifierNodeElement<intrinsicHeight1> {
    public final androidx.compose.ui.layout.AlignmentLine IconCompatParcelizer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        intrinsicHeight1 intrinsicheight1 = new intrinsicHeight1();
        intrinsicheight1.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        return intrinsicheight1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.IconCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((intrinsicHeight1) node).RemoteActionCompatParcelizer = this.IconCompatParcelizer;
    }

    public TooltipStateImpl(androidx.compose.ui.layout.HorizontalAlignmentLine horizontalAlignmentLine) {
        this.IconCompatParcelizer = horizontalAlignmentLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        TooltipStateImpl tooltipStateImpl = obj instanceof TooltipStateImpl ? (TooltipStateImpl) obj : null;
        if (tooltipStateImpl == null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, tooltipStateImpl.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
