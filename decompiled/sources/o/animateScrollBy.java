package o;

/* JADX INFO: loaded from: classes.dex */
final class animateScrollBy extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.EnterExitTransitionModifierNode> {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final androidx.compose.animation.core.Transition MediaBrowserCompatMediaItem;
    public final PaddingValuesModifier MediaDescriptionCompat;
    public final PaddingValuesModifier RatingCompat;
    public final ScrollingLogicdoFlingAnimation2reverseScope1 RemoteActionCompatParcelizer;
    public final PaddingValuesModifier read;
    public final TapGestureDetectorKt serializer;
    public final onPostFlingRZ2iAVY write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new androidx.compose.animation.EnterExitTransitionModifierNode(this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.read, this.RatingCompat, this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        PaddingValuesModifier paddingValuesModifier = this.MediaDescriptionCompat;
        int iHashCode2 = paddingValuesModifier != null ? paddingValuesModifier.hashCode() : 0;
        PaddingValuesModifier paddingValuesModifier2 = this.read;
        int iHashCode3 = paddingValuesModifier2 != null ? paddingValuesModifier2.hashCode() : 0;
        PaddingValuesModifier paddingValuesModifier3 = this.RatingCompat;
        int iHashCode4 = paddingValuesModifier3 != null ? paddingValuesModifier3.hashCode() : 0;
        int iHashCode5 = this.RemoteActionCompatParcelizer.hashCode();
        return this.write.hashCode() + ((this.IconCompatParcelizer.hashCode() + ((this.serializer.hashCode() + ((iHashCode5 + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.MediaBrowserCompatMediaItem);
        inspectorInfo.getProperties().set("sizeAnimation", this.MediaDescriptionCompat);
        inspectorInfo.getProperties().set("offsetAnimation", this.read);
        inspectorInfo.getProperties().set("slideAnimation", this.RatingCompat);
        inspectorInfo.getProperties().set("enter", this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set("exit", this.serializer);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode = (androidx.compose.animation.EnterExitTransitionModifierNode) node;
        enterExitTransitionModifierNode.MediaSessionCompatToken = this.MediaBrowserCompatMediaItem;
        enterExitTransitionModifierNode.MediaSessionCompatQueueItem = this.MediaDescriptionCompat;
        enterExitTransitionModifierNode.MediaDescriptionCompat = this.read;
        enterExitTransitionModifierNode.MediaMetadataCompat = this.RatingCompat;
        enterExitTransitionModifierNode.write = this.RemoteActionCompatParcelizer;
        enterExitTransitionModifierNode.IconCompatParcelizer = this.serializer;
        enterExitTransitionModifierNode.read = this.IconCompatParcelizer;
        enterExitTransitionModifierNode.RemoteActionCompatParcelizer = this.write;
    }

    public animateScrollBy(androidx.compose.animation.core.Transition transition, PaddingValuesModifier paddingValuesModifier, PaddingValuesModifier paddingValuesModifier2, PaddingValuesModifier paddingValuesModifier3, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onPostFlingRZ2iAVY onpostflingrz2iavy) {
        this.MediaBrowserCompatMediaItem = transition;
        this.MediaDescriptionCompat = paddingValuesModifier;
        this.read = paddingValuesModifier2;
        this.RatingCompat = paddingValuesModifier3;
        this.RemoteActionCompatParcelizer = scrollingLogicdoFlingAnimation2reverseScope1;
        this.serializer = tapGestureDetectorKt;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = onpostflingrz2iavy;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (!(obj instanceof animateScrollBy)) {
            return false;
        }
        animateScrollBy animatescrollby = (animateScrollBy) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animatescrollby.MediaBrowserCompatMediaItem, this.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animatescrollby.MediaDescriptionCompat, this.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animatescrollby.read, this.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animatescrollby.RatingCompat, this.RatingCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animatescrollby.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animatescrollby.serializer, this.serializer}, getCieXyz.write())).booleanValue() || animatescrollby.IconCompatParcelizer != this.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animatescrollby.write, this.write}, getCieXyz.write())).booleanValue();
    }
}
