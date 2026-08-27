package o;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode;

/* JADX INFO: loaded from: classes.dex */
public final class accessdispatchMouseWheelScroll<S> extends androidx.compose.ui.node.ModifierNodeElement<AnimatedContentTransitionScopeImpl$SizeModifierNode> {
    public final PaddingValuesModifier IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 read;
    public final positionChangeInternalwfG_k4k serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        AnimatedContentTransitionScopeImpl$SizeModifierNode animatedContentTransitionScopeImpl$SizeModifierNode = new AnimatedContentTransitionScopeImpl$SizeModifierNode();
        animatedContentTransitionScopeImpl$SizeModifierNode.serializer = this.IconCompatParcelizer;
        animatedContentTransitionScopeImpl$SizeModifierNode.IconCompatParcelizer = this.read;
        animatedContentTransitionScopeImpl$SizeModifierNode.read = this.serializer;
        animatedContentTransitionScopeImpl$SizeModifierNode.RemoteActionCompatParcelizer = androidx.compose.animation.AnimatedContentKt.IconCompatParcelizer;
        return animatedContentTransitionScopeImpl$SizeModifierNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        PaddingValuesModifier paddingValuesModifier = this.IconCompatParcelizer;
        return this.read.hashCode() + (((iHashCode * 31) + (paddingValuesModifier != null ? paddingValuesModifier.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        AnimatedContentTransitionScopeImpl$SizeModifierNode animatedContentTransitionScopeImpl$SizeModifierNode = (AnimatedContentTransitionScopeImpl$SizeModifierNode) node;
        animatedContentTransitionScopeImpl$SizeModifierNode.serializer = this.IconCompatParcelizer;
        animatedContentTransitionScopeImpl$SizeModifierNode.IconCompatParcelizer = this.read;
        animatedContentTransitionScopeImpl$SizeModifierNode.read = this.serializer;
    }

    public accessdispatchMouseWheelScroll(PaddingValuesModifier paddingValuesModifier, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, positionChangeInternalwfG_k4k positionchangeinternalwfg_k4k) {
        this.IconCompatParcelizer = paddingValuesModifier;
        this.read = populateViewStructure_androidKtpopulate7;
        this.serializer = positionchangeinternalwfg_k4k;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sizeTransform");
        inspectorInfo.getProperties().set("sizeAnimation", this.IconCompatParcelizer);
        inspectorInfo.getProperties().set("sizeTransform", this.read);
        inspectorInfo.getProperties().set("scope", this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (!(obj instanceof accessdispatchMouseWheelScroll)) {
            return false;
        }
        accessdispatchMouseWheelScroll accessdispatchmousewheelscroll = (accessdispatchMouseWheelScroll) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessdispatchmousewheelscroll.IconCompatParcelizer, this.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessdispatchmousewheelscroll.read, this.read}, getCieXyz.write())).booleanValue();
    }
}
