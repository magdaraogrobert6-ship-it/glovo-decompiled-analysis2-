package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
final class AnnotatedStringResolveInlineContentKt extends androidx.compose.ui.node.ModifierNodeElement<AndroidCursorHandle_androidKt> {
    public final boolean IconCompatParcelizer;
    public final boolean MediaMetadataCompat;
    public final isNotGestureActionfoundation MediaSessionCompatQueueItem;
    public final getAdjustedCoordinatesk4lQ0M RatingCompat;
    public final getStringId9Hzcbyc RemoteActionCompatParcelizer;
    public final SelectionHandleIcon read;
    public final constructorimpl serializer;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.write;
        ((AndroidCursorHandle_androidKt) node).IconCompatParcelizer(this.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer, this.serializer, this.read, this.RatingCompat, mutableInteractionSourceImpl, this.MediaMetadataCompat, this.IconCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        AndroidCursorHandle_androidKt androidCursorHandle_androidKt = new AndroidCursorHandle_androidKt();
        androidCursorHandle_androidKt.PlaybackStateCompatCustomAction = this.RatingCompat;
        androidCursorHandle_androidKt.MediaMetadataCompat = this.read;
        androidCursorHandle_androidKt.read = this.IconCompatParcelizer;
        androidCursorHandle_androidKt.RemoteActionCompatParcelizer = this.serializer;
        androidCursorHandle_androidKt.write = this.write;
        androidCursorHandle_androidKt.serializer = this.RemoteActionCompatParcelizer;
        androidCursorHandle_androidKt.MediaSessionCompatResultReceiverWrapper = this.MediaMetadataCompat;
        androidCursorHandle_androidKt.MediaSessionCompatToken = this.MediaSessionCompatQueueItem;
        return androidCursorHandle_androidKt;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.read.hashCode() + (this.RatingCompat.hashCode() * 31)) * 31, 31, this.IconCompatParcelizer), 31, false);
        constructorimpl constructorimplVar = this.serializer;
        int iHashCode = constructorimplVar != null ? constructorimplVar.hashCode() : 0;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.write;
        int iHashCode2 = mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0;
        getStringId9Hzcbyc getstringid9hzcbyc = this.RemoteActionCompatParcelizer;
        int iM2 = d$$ExternalSyntheticOutline0.m((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (getstringid9hzcbyc != null ? getstringid9hzcbyc.hashCode() : 0)) * 31, 31, this.MediaMetadataCompat);
        isNotGestureActionfoundation isnotgestureactionfoundation = this.MediaSessionCompatQueueItem;
        return iM2 + (isnotgestureactionfoundation != null ? isnotgestureactionfoundation.hashCode() : 0);
    }

    public AnnotatedStringResolveInlineContentKt(isNotGestureActionfoundation isnotgestureactionfoundation, getStringId9Hzcbyc getstringid9hzcbyc, constructorimpl constructorimplVar, SelectionHandleIcon selectionHandleIcon, getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, boolean z2) {
        this.RatingCompat = getadjustedcoordinatesk4lq0m;
        this.read = selectionHandleIcon;
        this.IconCompatParcelizer = z;
        this.serializer = constructorimplVar;
        this.write = mutableInteractionSourceImpl;
        this.RemoteActionCompatParcelizer = getstringid9hzcbyc;
        this.MediaMetadataCompat = z2;
        this.MediaSessionCompatQueueItem = isnotgestureactionfoundation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollableArea");
        inspectorInfo.getProperties().set("state", this.RatingCompat);
        inspectorInfo.getProperties().set(com.braze.models.inappmessage.InAppMessageBase.ORIENTATION, this.read);
        if (!this.MediaMetadataCompat) {
            inspectorInfo.getProperties().set("overscrollEffect", this.MediaSessionCompatQueueItem);
        }
        af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, inspectorInfo.getProperties(), com.braze.models.FeatureFlag.ENABLED, inspectorInfo).set("reverseScrolling", Boolean.FALSE);
        inspectorInfo.getProperties().set("flingBehavior", this.serializer);
        inspectorInfo.getProperties().set("interactionSource", this.write);
        inspectorInfo.getProperties().set("bringIntoViewSpec", this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnnotatedStringResolveInlineContentKt.class != obj.getClass()) {
            return false;
        }
        AnnotatedStringResolveInlineContentKt annotatedStringResolveInlineContentKt = (AnnotatedStringResolveInlineContentKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, annotatedStringResolveInlineContentKt.RatingCompat}, getCieXyz.write())).booleanValue() || this.read != annotatedStringResolveInlineContentKt.read || this.IconCompatParcelizer != annotatedStringResolveInlineContentKt.IconCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, annotatedStringResolveInlineContentKt.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, annotatedStringResolveInlineContentKt.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, annotatedStringResolveInlineContentKt.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || this.MediaMetadataCompat != annotatedStringResolveInlineContentKt.MediaMetadataCompat) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, annotatedStringResolveInlineContentKt.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
    }
}
