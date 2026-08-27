package o;

/* JADX INFO: loaded from: classes.dex */
final class PagerDefaultsExternalSyntheticLambda0 extends androidx.compose.ui.node.ModifierNodeElement<HorizontalPager8jOkeI> {
    public final PagerMeasurePolicyKtrememberPagerMeasurePolicy11 RemoteActionCompatParcelizer;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.ui.node.DelegatableNode delegatableNodeIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.read);
        HorizontalPager8jOkeI horizontalPager8jOkeI = new HorizontalPager8jOkeI();
        horizontalPager8jOkeI.write = delegatableNodeIconCompatParcelizer;
        horizontalPager8jOkeI.delegate(delegatableNodeIconCompatParcelizer);
        return horizontalPager8jOkeI;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indication");
        inspectorInfo.getProperties().set("interactionSource", this.read);
        inspectorInfo.getProperties().set("indication", this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        HorizontalPager8jOkeI horizontalPager8jOkeI = (HorizontalPager8jOkeI) node;
        androidx.compose.ui.node.DelegatableNode delegatableNodeIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.read);
        horizontalPager8jOkeI.undelegate(horizontalPager8jOkeI.write);
        horizontalPager8jOkeI.write = delegatableNodeIconCompatParcelizer;
        horizontalPager8jOkeI.delegate(delegatableNodeIconCompatParcelizer);
    }

    public PagerDefaultsExternalSyntheticLambda0(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11) {
        this.read = mutableInteractionSourceImpl;
        this.RemoteActionCompatParcelizer = pagerMeasurePolicyKtrememberPagerMeasurePolicy11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerDefaultsExternalSyntheticLambda0)) {
            return false;
        }
        PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0 = (PagerDefaultsExternalSyntheticLambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, pagerDefaultsExternalSyntheticLambda0.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, pagerDefaultsExternalSyntheticLambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
