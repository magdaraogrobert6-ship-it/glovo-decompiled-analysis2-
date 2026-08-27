package androidx.compose.foundation.text;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import bo.app.af$$ExternalSyntheticOutline1;
import o.component2;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSizeElement extends ModifierNodeElement<TextFieldSizeNode> {
    public final TextStyle read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new TextFieldSizeNode(this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        TextFieldSizeNode textFieldSizeNode = (TextFieldSizeNode) node;
        textFieldSizeNode.getClass();
        TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.read, DelegatableNodeKt.requireLayoutDirection(textFieldSizeNode));
        textFieldSizeNode.RemoteActionCompatParcelizer(textStyleResolveDefaults, (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldSizeNode, CompositionLocalsKt.getLocalFontFamilyResolver()));
        component2 component2Var = textFieldSizeNode.RemoteActionCompatParcelizer;
        if (component2Var == null) {
            throw af$$ExternalSyntheticOutline1.m("Min size state is not set.");
        }
        component2.IconCompatParcelizer(component2Var, null, null, textStyleResolveDefaults, 23);
        LayoutModifierNodeKt.invalidateMeasurement(textFieldSizeNode);
    }

    public TextFieldSizeElement(TextStyle textStyle) {
        this.read = textStyle;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("textFieldMinSize");
        inspectorInfo.getProperties().set("style", this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldSizeElement)) {
            return false;
        }
        Object[] objArr = {this.read, ((TextFieldSizeElement) obj).read};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
