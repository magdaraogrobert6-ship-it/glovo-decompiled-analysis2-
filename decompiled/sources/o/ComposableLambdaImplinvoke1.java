package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
final class ComposableLambdaImplinvoke1 extends androidx.compose.ui.node.ModifierNodeElement<SnapshotStateListExternalSyntheticLambda0> {
    public final boolean IconCompatParcelizer;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final androidx.compose.ui.semantics.Role serializer;
    public final boolean write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        SnapshotStateListExternalSyntheticLambda0 snapshotStateListExternalSyntheticLambda0 = (SnapshotStateListExternalSyntheticLambda0) node;
        boolean z = snapshotStateListExternalSyntheticLambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        boolean z2 = this.IconCompatParcelizer;
        if (z != z2) {
            snapshotStateListExternalSyntheticLambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = z2;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(snapshotStateListExternalSyntheticLambda0);
        }
        snapshotStateListExternalSyntheticLambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = this.read;
        snapshotStateListExternalSyntheticLambda0.read(this.RemoteActionCompatParcelizer, null, false, this.write, null, this.serializer, snapshotStateListExternalSyntheticLambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new SnapshotStateListExternalSyntheticLambda0(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.serializer, this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer);
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.RemoteActionCompatParcelizer;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0)) * 961, 31, false), 31, this.write);
        androidx.compose.ui.semantics.Role role = this.serializer;
        return this.read.hashCode() + ((iM + (role != null ? androidx.compose.ui.semantics.Role.m2811hashCodeimpl(role.m2813unboximpl()) : 0)) * 31);
    }

    public ComposableLambdaImplinvoke1(boolean z, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, androidx.compose.ui.semantics.Role role, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = mutableInteractionSourceImpl;
        this.write = z2;
        this.serializer = role;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("toggleable");
        inspectorInfo.getProperties().set("value", inspectorInfo.getValue());
        inspectorInfo.getProperties().set("interactionSource", this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set("indicationNodeFactory", null);
        af$$ExternalSyntheticOutline1.m(this.write, inspectorInfo.getProperties(), com.braze.models.FeatureFlag.ENABLED, inspectorInfo).set("role", this.serializer);
        inspectorInfo.getProperties().set("onValueChange", this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ComposableLambdaImplinvoke1.class != obj.getClass()) {
            return false;
        }
        ComposableLambdaImplinvoke1 composableLambdaImplinvoke1 = (ComposableLambdaImplinvoke1) obj;
        if (this.IconCompatParcelizer != composableLambdaImplinvoke1.IconCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, composableLambdaImplinvoke1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || this.write != composableLambdaImplinvoke1.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, composableLambdaImplinvoke1.serializer}, getCieXyz.write())).booleanValue() && this.read == composableLambdaImplinvoke1.read;
    }
}
