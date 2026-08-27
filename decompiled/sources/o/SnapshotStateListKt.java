package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
final class SnapshotStateListKt extends androidx.compose.ui.node.ModifierNodeElement<DiagnosticComposeException> {
    public final boolean IconCompatParcelizer = true;
    public final androidx.compose.ui.state.ToggleableState MediaBrowserCompatMediaItem;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final androidx.compose.ui.semantics.Role read;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl serializer;
    public final PagerMeasurePolicyKtrememberPagerMeasurePolicy11 write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        DiagnosticComposeException diagnosticComposeException = (DiagnosticComposeException) node;
        androidx.compose.ui.state.ToggleableState toggleableState = diagnosticComposeException.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        androidx.compose.ui.state.ToggleableState toggleableState2 = this.MediaBrowserCompatMediaItem;
        if (toggleableState != toggleableState2) {
            diagnosticComposeException.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = toggleableState2;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(diagnosticComposeException);
        }
        diagnosticComposeException.read(this.serializer, this.write, false, this.IconCompatParcelizer, null, this.read, this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        DiagnosticComposeException diagnosticComposeException = new DiagnosticComposeException(this.serializer, this.write, false, this.IconCompatParcelizer, null, this.read, this.RemoteActionCompatParcelizer);
        diagnosticComposeException.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = this.MediaBrowserCompatMediaItem;
        return diagnosticComposeException;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.serializer;
        int iHashCode2 = mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0;
        PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11 = this.write;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((((iHashCode * 31) + iHashCode2) * 31) + (pagerMeasurePolicyKtrememberPagerMeasurePolicy11 != null ? pagerMeasurePolicyKtrememberPagerMeasurePolicy11.hashCode() : 0)) * 31, 31, false), 31, this.IconCompatParcelizer);
        androidx.compose.ui.semantics.Role role = this.read;
        return this.RemoteActionCompatParcelizer.hashCode() + ((iM + (role != null ? androidx.compose.ui.semantics.Role.m2811hashCodeimpl(role.m2813unboximpl()) : 0)) * 31);
    }

    public SnapshotStateListKt(androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, androidx.compose.ui.semantics.Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.MediaBrowserCompatMediaItem = toggleableState;
        this.serializer = mutableInteractionSourceImpl;
        this.write = pagerMeasurePolicyKtrememberPagerMeasurePolicy11;
        this.read = role;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("triStateToggleable");
        inspectorInfo.getProperties().set("state", this.MediaBrowserCompatMediaItem);
        inspectorInfo.getProperties().set("interactionSource", this.serializer);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.write);
        af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, inspectorInfo.getProperties(), com.braze.models.FeatureFlag.ENABLED, inspectorInfo).set("role", this.read);
        inspectorInfo.getProperties().set("onClick", this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SnapshotStateListKt.class != obj.getClass()) {
            return false;
        }
        SnapshotStateListKt snapshotStateListKt = (SnapshotStateListKt) obj;
        if (this.MediaBrowserCompatMediaItem != snapshotStateListKt.MediaBrowserCompatMediaItem) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, snapshotStateListKt.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, snapshotStateListKt.write}, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != snapshotStateListKt.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, snapshotStateListKt.read}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == snapshotStateListKt.RemoteActionCompatParcelizer;
    }
}
