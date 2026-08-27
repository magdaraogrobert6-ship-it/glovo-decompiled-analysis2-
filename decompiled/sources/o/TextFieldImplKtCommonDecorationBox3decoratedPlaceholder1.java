package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
final class TextFieldImplKtCommonDecorationBox3decoratedPlaceholder1 extends androidx.compose.ui.node.ModifierNodeElement<IndicatorBox1CPYgEU> {
    public final SelectionHandleIcon IconCompatParcelizer;
    public final accessanimateToThreshold serializer;
    public final CommonDecorationBox write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        IndicatorBox1CPYgEU indicatorBox1CPYgEU = new IndicatorBox1CPYgEU();
        indicatorBox1CPYgEU.write = this.serializer;
        indicatorBox1CPYgEU.IconCompatParcelizer = this.write;
        indicatorBox1CPYgEU.read = this.IconCompatParcelizer;
        return indicatorBox1CPYgEU;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m((this.write.hashCode() + (this.serializer.hashCode() * 31)) * 31, 31, false);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        IndicatorBox1CPYgEU indicatorBox1CPYgEU = (IndicatorBox1CPYgEU) node;
        indicatorBox1CPYgEU.write = this.serializer;
        indicatorBox1CPYgEU.IconCompatParcelizer = this.write;
        indicatorBox1CPYgEU.read = this.IconCompatParcelizer;
    }

    public TextFieldImplKtCommonDecorationBox3decoratedPlaceholder1(accessanimateToThreshold accessanimatetothreshold, CommonDecorationBox commonDecorationBox, SelectionHandleIcon selectionHandleIcon) {
        this.serializer = accessanimatetothreshold;
        this.write = commonDecorationBox;
        this.IconCompatParcelizer = selectionHandleIcon;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldImplKtCommonDecorationBox3decoratedPlaceholder1)) {
            return false;
        }
        TextFieldImplKtCommonDecorationBox3decoratedPlaceholder1 textFieldImplKtCommonDecorationBox3decoratedPlaceholder1 = (TextFieldImplKtCommonDecorationBox3decoratedPlaceholder1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, textFieldImplKtCommonDecorationBox3decoratedPlaceholder1.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, textFieldImplKtCommonDecorationBox3decoratedPlaceholder1.write}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == textFieldImplKtCommonDecorationBox3decoratedPlaceholder1.IconCompatParcelizer;
    }
}
