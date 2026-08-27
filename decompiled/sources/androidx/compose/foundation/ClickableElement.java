package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.models.FeatureFlag;
import o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    public final PagerMeasurePolicyKtrememberPagerMeasurePolicy11 IconCompatParcelizer;
    public final Role MediaBrowserCompatMediaItem;
    public final boolean MediaMetadataCompat;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final MutableInteractionSourceImpl read;
    public final boolean serializer;
    public final String write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.read;
        int iHashCode = mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0;
        PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11 = this.IconCompatParcelizer;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (pagerMeasurePolicyKtrememberPagerMeasurePolicy11 != null ? pagerMeasurePolicyKtrememberPagerMeasurePolicy11.hashCode() : 0)) * 31, 31, this.MediaMetadataCompat), 31, this.serializer);
        String str = this.write;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Role role = this.MediaBrowserCompatMediaItem;
        return this.RemoteActionCompatParcelizer.hashCode() + ((((iM + iHashCode2) * 31) + (role != null ? Role.m2811hashCodeimpl(role.m2813unboximpl()) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((ClickableNode) node).read(this.read, this.IconCompatParcelizer, this.MediaMetadataCompat, this.serializer, this.write, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new ClickableNode(this.read, this.IconCompatParcelizer, this.MediaMetadataCompat, this.serializer, this.write, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clickable");
        af$$ExternalSyntheticOutline1.m(this.serializer, inspectorInfo.getProperties(), FeatureFlag.ENABLED, inspectorInfo).set("onClick", this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set("onClickLabel", this.write);
        inspectorInfo.getProperties().set("role", this.MediaBrowserCompatMediaItem);
        inspectorInfo.getProperties().set("interactionSource", this.read);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.IconCompatParcelizer);
    }

    public ClickableElement(MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, boolean z, boolean z2, String str, Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.read = mutableInteractionSourceImpl;
        this.IconCompatParcelizer = pagerMeasurePolicyKtrememberPagerMeasurePolicy11;
        this.MediaMetadataCompat = z;
        this.serializer = z2;
        this.write = str;
        this.MediaBrowserCompatMediaItem = role;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, clickableElement.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, clickableElement.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || this.MediaMetadataCompat != clickableElement.MediaMetadataCompat || this.serializer != clickableElement.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, clickableElement.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, clickableElement.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == clickableElement.RemoteActionCompatParcelizer;
    }
}
