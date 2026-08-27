package o;

/* JADX INFO: loaded from: classes.dex */
public final class onMeasured implements PagerMeasurePolicyKtrememberPagerMeasurePolicy11 {
    public static final onMeasured read = new onMeasured();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11
    public final int hashCode() {
        return -1;
    }

    @Override // o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11
    public final androidx.compose.ui.node.DelegatableNode IconCompatParcelizer(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        return new LazyLayoutItemAnimatorDisplayingDisappearingItemsNode(mutableInteractionSourceImpl);
    }
}
