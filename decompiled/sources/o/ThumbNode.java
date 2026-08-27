package o;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbNode extends androidx.compose.ui.node.ModifierNodeElement<TextZ58ophY> {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        TextZ58ophY textZ58ophY = new TextZ58ophY(androidx.compose.foundation.layout.OffsetKt.read);
        textZ58ophY.read = this.read;
        return textZ58ophY;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.IconCompatParcelizer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        TextZ58ophY textZ58ophY = (TextZ58ophY) node;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = textZ58ophY.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.read;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            textZ58ophY.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
            TooltipKt tooltipKt = textZ58ophY.RemoteActionCompatParcelizer;
            if (tooltipKt != null) {
                TooltipDefaults tooltipDefaults = (TooltipDefaults) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(tooltipKt);
                Object[] objArr = {tooltipDefaults, textZ58ophY.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return;
                }
                textZ58ophY.IconCompatParcelizer = tooltipDefaults;
                textZ58ophY.IconCompatParcelizer();
            }
        }
    }

    public ThumbNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThumbNode) {
            return this.read == ((ThumbNode) obj).read;
        }
        return false;
    }
}
