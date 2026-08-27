package o;

/* JADX INFO: loaded from: classes.dex */
public final class DragHandleWithTooltip extends androidx.compose.ui.node.ModifierNodeElement<SheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1> {
    public final TooltipDefaults read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new SheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1(this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.serializer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        SheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1 sheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1 = (SheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1) node;
        TooltipDefaults tooltipDefaults = sheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1.IconCompatParcelizer;
        TooltipDefaults tooltipDefaults2 = this.read;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{tooltipDefaults2, tooltipDefaults}, iWrite3)).booleanValue()) {
            return;
        }
        sheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1.IconCompatParcelizer = tooltipDefaults2;
        sheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1.IconCompatParcelizer();
    }

    public DragHandleWithTooltip(TooltipDefaults tooltipDefaults, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = tooltipDefaults;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragHandleWithTooltip)) {
            return false;
        }
        Object[] objArr = {((DragHandleWithTooltip) obj).read, this.read};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
