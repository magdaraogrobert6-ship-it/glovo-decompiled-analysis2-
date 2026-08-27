package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class placeSpaceEvenlyfoundation_layout implements TrackpadScrollingLogic {
    public final accessanimateDecay RemoteActionCompatParcelizer;
    public final BoxMeasurePolicy serializer;
    public final long write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return Long.hashCode(this.write) + ((this.serializer.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // o.TrackpadScrollingLogic
    public final size3ABfNKs serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        SizeNode sizeNodeRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.serializer(requiredsizeinqdbjur0default);
        getContentCardsSwipeLayout getcontentcardsswipelayout = new getContentCardsSwipeLayout();
        getcontentcardsswipelayout.write = sizeNodeRemoteActionCompatParcelizer;
        getcontentcardsswipelayout.serializer = this.serializer;
        getcontentcardsswipelayout.read = ((long) (sizeNodeRemoteActionCompatParcelizer.serializer() + sizeNodeRemoteActionCompatParcelizer.IconCompatParcelizer())) * 1000000;
        getcontentcardsswipelayout.RemoteActionCompatParcelizer = this.write * 1000000;
        return getcontentcardsswipelayout;
    }

    public placeSpaceEvenlyfoundation_layout(accessanimateDecay accessanimatedecay, BoxMeasurePolicy boxMeasurePolicy, long j) {
        this.RemoteActionCompatParcelizer = accessanimatedecay;
        this.serializer = boxMeasurePolicy;
        this.write = j;
        if (accessanimatedecay instanceof requiredWidthInVpY3zN4default) {
            requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) accessanimatedecay;
            if (requiredwidthinvpy3zn4default.IconCompatParcelizer != 0 || requiredwidthinvpy3zn4default.write != 0) {
                return;
            }
        } else if (accessanimatedecay instanceof FlowLayoutBuildingBlocksWrapInfo) {
            if (((FlowLayoutBuildingBlocksWrapInfo) accessanimatedecay).read != 0) {
                return;
            }
        } else if (accessanimatedecay instanceof aspectRatiodefault) {
            if (((aspectRatiodefault) accessanimatedecay).IconCompatParcelizer.write != 0) {
                return;
            }
        } else if (!(accessanimatedecay instanceof ArrangementVertical) || ((ArrangementVertical) accessanimatedecay).serializer.write != 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof placeSpaceEvenlyfoundation_layout)) {
            return false;
        }
        placeSpaceEvenlyfoundation_layout placespaceevenlyfoundation_layout = (placeSpaceEvenlyfoundation_layout) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{placespaceevenlyfoundation_layout.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && placespaceevenlyfoundation_layout.serializer == this.serializer && placespaceevenlyfoundation_layout.write == this.write;
    }
}
