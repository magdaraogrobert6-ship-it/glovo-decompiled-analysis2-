package o;

import androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class MinLinesConstrainer extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.gestures.DraggableNode> {
    public static final getViewportSizeYbymL2g serializer = new getViewportSizeYbymL2g(12);
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY IconCompatParcelizer;
    public final accessgetGreencp MediaBrowserCompatMediaItem;
    public final SelectionHandleIcon MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl read;
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        boolean z;
        boolean z2;
        androidx.compose.foundation.gestures.DraggableNode draggableNode = (androidx.compose.foundation.gestures.DraggableNode) node;
        accessgetGreencp accessgetgreencp = draggableNode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        accessgetGreencp accessgetgreencp2 = this.MediaBrowserCompatMediaItem;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessgetgreencp, accessgetgreencp2}, getCieXyz.write())).booleanValue()) {
            z = false;
        } else {
            draggableNode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = accessgetgreencp2;
            z = true;
        }
        SelectionHandleIcon selectionHandleIcon = draggableNode.write;
        SelectionHandleIcon selectionHandleIcon2 = this.MediaMetadataCompat;
        if (selectionHandleIcon != selectionHandleIcon2) {
            draggableNode.write = selectionHandleIcon2;
            z = true;
        }
        boolean z3 = draggableNode.RemoteActionCompatParcelizer;
        boolean z4 = this.MediaSessionCompatQueueItem;
        if (z3 != z4) {
            draggableNode.RemoteActionCompatParcelizer = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        draggableNode.IconCompatParcelizer = this.write;
        draggableNode.read = this.IconCompatParcelizer;
        draggableNode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = this.RatingCompat;
        draggableNode.serializer(serializer, this.RemoteActionCompatParcelizer, this.read, selectionHandleIcon2, z2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        getViewportSizeYbymL2g getviewportsizeybyml2g = serializer;
        boolean z = this.RemoteActionCompatParcelizer;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.read;
        SelectionHandleIcon selectionHandleIcon = this.MediaMetadataCompat;
        androidx.compose.foundation.gestures.DraggableNode draggableNode = new androidx.compose.foundation.gestures.DraggableNode(getviewportsizeybyml2g, z, mutableInteractionSourceImpl, selectionHandleIcon);
        draggableNode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = this.MediaBrowserCompatMediaItem;
        draggableNode.write = selectionHandleIcon;
        draggableNode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = this.RatingCompat;
        draggableNode.IconCompatParcelizer = this.write;
        draggableNode.read = this.IconCompatParcelizer;
        draggableNode.RemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem;
        return draggableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m((this.MediaMetadataCompat.hashCode() + (this.MediaBrowserCompatMediaItem.hashCode() * 31)) * 31, 31, this.RemoteActionCompatParcelizer);
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.read;
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0)) * 31, 31, this.RatingCompat);
        return Boolean.hashCode(this.MediaSessionCompatQueueItem) + ((this.IconCompatParcelizer.hashCode() + ((this.write.hashCode() + iM2) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set(com.braze.models.inappmessage.InAppMessageBase.ORIENTATION, this.MediaMetadataCompat);
        af$$ExternalSyntheticOutline1.m(this.MediaSessionCompatQueueItem, af$$ExternalSyntheticOutline1.m(this.RemoteActionCompatParcelizer, inspectorInfo.getProperties(), com.braze.models.FeatureFlag.ENABLED, inspectorInfo), "reverseDirection", inspectorInfo).set("interactionSource", this.read);
        af$$ExternalSyntheticOutline1.m(this.RatingCompat, inspectorInfo.getProperties(), "startDragImmediately", inspectorInfo).set("onDragStarted", this.write);
        inspectorInfo.getProperties().set("onDragStopped", this.IconCompatParcelizer);
        inspectorInfo.getProperties().set("state", this.MediaBrowserCompatMediaItem);
    }

    public MinLinesConstrainer(accessgetGreencp accessgetgreencp, SelectionHandleIcon selectionHandleIcon, boolean z, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, DraggableKt$NoOpOnDragStarted$1 draggableKt$NoOpOnDragStarted$1, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, boolean z3) {
        this.MediaBrowserCompatMediaItem = accessgetgreencp;
        this.MediaMetadataCompat = selectionHandleIcon;
        this.RemoteActionCompatParcelizer = z;
        this.read = mutableInteractionSourceImpl;
        this.RatingCompat = z2;
        this.write = draggableKt$NoOpOnDragStarted$1;
        this.IconCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.MediaSessionCompatQueueItem = z3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MinLinesConstrainer.class != obj.getClass()) {
            return false;
        }
        MinLinesConstrainer minLinesConstrainer = (MinLinesConstrainer) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, minLinesConstrainer.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue() || this.MediaMetadataCompat != minLinesConstrainer.MediaMetadataCompat || this.RemoteActionCompatParcelizer != minLinesConstrainer.RemoteActionCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, minLinesConstrainer.read}, getCieXyz.write())).booleanValue() || this.RatingCompat != minLinesConstrainer.RatingCompat) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, minLinesConstrainer.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, minLinesConstrainer.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.MediaSessionCompatQueueItem == minLinesConstrainer.MediaSessionCompatQueueItem;
    }
}
