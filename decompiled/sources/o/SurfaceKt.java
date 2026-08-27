package o;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceKt extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public boolean write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public SurfaceKt(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = z;
    }

    public final void RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        if (this.read != r8lambdaunavo3sxub_pc9xroryotnrlvsm || this.write != z) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo7measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new waitForFirstLayout(this, 16, placeableMo2209measureBRTryo0), 4, null);
    }
}
