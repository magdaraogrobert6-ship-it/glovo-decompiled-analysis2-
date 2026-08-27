package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.models.FeatureFlag;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final boolean MediaSessionCompatQueueItem;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final MutableInteractionSourceImpl write;
    public final boolean RemoteActionCompatParcelizer = true;
    public final boolean serializer = true;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.write;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0) * 961, 31, this.MediaSessionCompatQueueItem), 29791, this.RemoteActionCompatParcelizer);
        int iHashCode = this.read.hashCode();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        return Boolean.hashCode(this.serializer) + ((((iHashCode + iM) * 961) + (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null ? r8lambdardpfsr94j4iebcwx_kpqzpm8k0.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        boolean z;
        CombinedClickableNode combinedClickableNode = (CombinedClickableNode) node;
        combinedClickableNode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = this.serializer;
        boolean z2 = combinedClickableNode.addObserverForBackInvokerlambda0 == null;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        if (z2 != (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null)) {
            combinedClickableNode.read();
            SemanticsModifierNodeKt.invalidateSemantics(combinedClickableNode);
            z = true;
        } else {
            z = false;
        }
        combinedClickableNode.addObserverForBackInvokerlambda0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        boolean z3 = combinedClickableNode.IconCompatParcelizer;
        boolean z4 = this.RemoteActionCompatParcelizer;
        boolean z5 = z3 != z4 ? true : z;
        combinedClickableNode.read(this.write, null, this.MediaSessionCompatQueueItem, z4, null, null, this.read);
        if (z5) {
            combinedClickableNode.serializer(false);
            combinedClickableNode.serializer(true);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new CombinedClickableNode(this.read, this.IconCompatParcelizer, this.serializer, this.write, this.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set("indicationNodeFactory", null);
        inspectorInfo.getProperties().set("interactionSource", this.write);
        af$$ExternalSyntheticOutline1.m(this.RemoteActionCompatParcelizer, inspectorInfo.getProperties(), FeatureFlag.ENABLED, inspectorInfo).set("onClickLabel", null);
        inspectorInfo.getProperties().set("role", null);
        inspectorInfo.getProperties().set("onClick", this.read);
        inspectorInfo.getProperties().set("onDoubleClick", null);
        inspectorInfo.getProperties().set("onLongClick", this.IconCompatParcelizer);
        inspectorInfo.getProperties().set("onLongClickLabel", null);
        inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(this.serializer));
    }

    public CombinedClickableElement(MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.write = mutableInteractionSourceImpl;
        this.MediaSessionCompatQueueItem = z;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, combinedClickableElement.write}, getCieXyz.write())).booleanValue() && this.MediaSessionCompatQueueItem == combinedClickableElement.MediaSessionCompatQueueItem && this.RemoteActionCompatParcelizer == combinedClickableElement.RemoteActionCompatParcelizer && this.read == combinedClickableElement.read && this.IconCompatParcelizer == combinedClickableElement.IconCompatParcelizer && this.serializer == combinedClickableElement.serializer;
    }
}
