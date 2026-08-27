package o;

import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode {
    public LazyLayoutSemanticStateKtLazyLayoutSemanticState1 IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public androidx.compose.ui.node.DelegatableNode MediaDescriptionCompat;
    public SelectionHandleIcon MediaMetadataCompat;
    public androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public isNotGestureActionfoundation MediaSessionCompatToken;
    public getAdjustedCoordinatesk4lQ0M PlaybackStateCompatCustomAction;
    public androidx.compose.foundation.gestures.ScrollableNode RatingCompat;
    public constructorimpl RemoteActionCompatParcelizer;
    public boolean read;
    public getStringId9Hzcbyc serializer;
    public androidx.compose.foundation.interaction.MutableInteractionSourceImpl write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void IconCompatParcelizer(isNotGestureActionfoundation isnotgestureactionfoundation, getStringId9Hzcbyc getstringid9hzcbyc, constructorimpl constructorimplVar, SelectionHandleIcon selectionHandleIcon, getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, boolean z2) {
        boolean z3;
        this.PlaybackStateCompatCustomAction = getadjustedcoordinatesk4lq0m;
        this.MediaMetadataCompat = selectionHandleIcon;
        boolean z4 = false;
        if (this.MediaSessionCompatResultReceiverWrapper != z) {
            this.MediaSessionCompatResultReceiverWrapper = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, isnotgestureactionfoundation}, getCieXyz.write())).booleanValue()) {
            this.MediaSessionCompatToken = isnotgestureactionfoundation;
            z4 = true;
        }
        if (z3 || (z4 && !z)) {
            androidx.compose.ui.node.DelegatableNode delegatableNode = this.MediaDescriptionCompat;
            if (delegatableNode != null) {
                undelegate(delegatableNode);
            }
            this.MediaDescriptionCompat = null;
            read();
        }
        this.read = z2;
        this.RemoteActionCompatParcelizer = constructorimplVar;
        this.write = mutableInteractionSourceImpl;
        this.serializer = getstringid9hzcbyc;
        boolean zIconCompatParcelizer = IconCompatParcelizer();
        this.MediaBrowserCompatMediaItem = zIconCompatParcelizer;
        androidx.compose.foundation.gestures.ScrollableNode scrollableNode = this.RatingCompat;
        if (scrollableNode != null) {
            scrollableNode.read(this.MediaSessionCompatResultReceiverWrapper ? this.MediaSessionCompatQueueItem : this.MediaSessionCompatToken, getstringid9hzcbyc, constructorimplVar, selectionHandleIcon, getadjustedcoordinatesk4lq0m, mutableInteractionSourceImpl, z2, zIconCompatParcelizer);
        }
    }

    public final boolean IconCompatParcelizer() {
        androidx.compose.ui.unit.LayoutDirection layoutDirectionRequireLayoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        if (isAttached()) {
            layoutDirectionRequireLayoutDirection = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutDirection(this);
        }
        return layoutDirectionRequireLayoutDirection != androidx.compose.ui.unit.LayoutDirection.Rtl || this.MediaMetadataCompat == SelectionHandleIcon.Vertical;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        LazyLayoutSemanticStateKtLazyLayoutSemanticState1 lazyLayoutSemanticStateKtLazyLayoutSemanticState1 = (LazyLayoutSemanticStateKtLazyLayoutSemanticState1) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, PagerStaterequestScrollToPage1.serializer);
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lazyLayoutSemanticStateKtLazyLayoutSemanticState1, this.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.IconCompatParcelizer = lazyLayoutSemanticStateKtLazyLayoutSemanticState1;
        this.MediaSessionCompatQueueItem = null;
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.MediaDescriptionCompat;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.MediaDescriptionCompat = null;
        read();
        androidx.compose.foundation.gestures.ScrollableNode scrollableNode = this.RatingCompat;
        if (scrollableNode != null) {
            getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = this.PlaybackStateCompatCustomAction;
            SelectionHandleIcon selectionHandleIcon = this.MediaMetadataCompat;
            isNotGestureActionfoundation isnotgestureactionfoundation = this.MediaSessionCompatResultReceiverWrapper ? this.MediaSessionCompatQueueItem : this.MediaSessionCompatToken;
            scrollableNode.read(isnotgestureactionfoundation, this.serializer, this.RemoteActionCompatParcelizer, selectionHandleIcon, getadjustedcoordinatesk4lq0m, this.write, this.read, this.MediaBrowserCompatMediaItem);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.MediaBrowserCompatMediaItem = IconCompatParcelizer();
        read();
        if (this.RatingCompat == null) {
            getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = this.PlaybackStateCompatCustomAction;
            isNotGestureActionfoundation isnotgestureactionfoundation = this.MediaSessionCompatResultReceiverWrapper ? this.MediaSessionCompatQueueItem : this.MediaSessionCompatToken;
            this.RatingCompat = (androidx.compose.foundation.gestures.ScrollableNode) delegate(new androidx.compose.foundation.gestures.ScrollableNode(isnotgestureactionfoundation, this.serializer, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, getadjustedcoordinatesk4lq0m, this.write, this.read, this.MediaBrowserCompatMediaItem));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.MediaDescriptionCompat;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        boolean zIconCompatParcelizer = IconCompatParcelizer();
        if (this.MediaBrowserCompatMediaItem != zIconCompatParcelizer) {
            this.MediaBrowserCompatMediaItem = zIconCompatParcelizer;
            getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = this.PlaybackStateCompatCustomAction;
            SelectionHandleIcon selectionHandleIcon = this.MediaMetadataCompat;
            boolean z = this.MediaSessionCompatResultReceiverWrapper;
            isNotGestureActionfoundation isnotgestureactionfoundation = z ? this.MediaSessionCompatQueueItem : this.MediaSessionCompatToken;
            IconCompatParcelizer(isnotgestureactionfoundation, this.serializer, this.RemoteActionCompatParcelizer, selectionHandleIcon, getadjustedcoordinatesk4lq0m, this.write, z, this.read);
        }
    }

    public final void read() {
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.MediaDescriptionCompat;
        if (delegatableNode != null) {
            if (delegatableNode.getNode().isAttached()) {
                return;
            }
            delegate(delegatableNode);
            return;
        }
        if (this.MediaSessionCompatResultReceiverWrapper) {
            androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new CoroutineLiveData$$ExternalSyntheticLambda0(6, this));
        }
        Object obj = this.MediaSessionCompatResultReceiverWrapper ? this.MediaSessionCompatQueueItem : this.MediaSessionCompatToken;
        if (obj != null) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = ((androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) obj).write;
            if (delegatingNode.getNode().isAttached()) {
                return;
            }
            this.MediaDescriptionCompat = delegate(delegatingNode);
        }
    }
}
