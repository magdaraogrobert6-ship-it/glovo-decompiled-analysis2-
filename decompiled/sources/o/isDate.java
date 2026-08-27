package o;

/* JADX INFO: loaded from: classes.dex */
public final class isDate extends androidx.compose.ui.node.ModifierNodeElement<getAutofillTextValue> {
    public final accessisRelatedToAutoCommit serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        getAutofillTextValue getautofilltextvalue = new getAutofillTextValue();
        getautofilltextvalue.serializer = this.serializer;
        return getautofilltextvalue;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("childSemantics");
        inspectorInfo.getProperties().set("properties", this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        getAutofillTextValue getautofilltextvalue = (getAutofillTextValue) node;
        getautofilltextvalue.serializer = this.serializer;
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(getautofilltextvalue);
    }

    public isDate(accessisRelatedToAutoCommit accessisrelatedtoautocommit) {
        this.serializer = accessisrelatedtoautocommit;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isDate) {
            return this.serializer == ((isDate) obj).serializer;
        }
        return false;
    }
}
