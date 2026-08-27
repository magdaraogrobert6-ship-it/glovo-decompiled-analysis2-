package o;

import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;

/* JADX INFO: loaded from: classes.dex */
public final class setAutofillValue extends androidx.compose.ui.node.ModifierNodeElement<setAutofillId> {
    public final UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new setAutofillId(this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        setAutofillId setautofillid = (setAutofillId) node;
        setautofillid.serializer = this.serializer;
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(setautofillid);
    }

    public setAutofillValue(UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 userJavascriptInterfaceBase$$ExternalSyntheticLambda12) {
        this.serializer = userJavascriptInterfaceBase$$ExternalSyntheticLambda12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setAutofillValue) {
            return this.serializer == ((setAutofillValue) obj).serializer;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("parentSemantics");
        inspectorInfo.getProperties().set("properties", this.serializer);
    }
}
