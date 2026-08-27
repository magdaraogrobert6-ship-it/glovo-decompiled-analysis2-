package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LazyDslKt implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ androidx.compose.foundation.AbstractClickableNode read;
    public final /* synthetic */ int write;

    public /* synthetic */ LazyDslKt(androidx.compose.foundation.AbstractClickableNode abstractClickableNode, int i) {
        this.write = i;
        this.read = abstractClickableNode;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        androidx.compose.ui.node.DelegatableNode delegatableNode;
        int i = this.write;
        androidx.compose.foundation.AbstractClickableNode abstractClickableNode = this.read;
        if (i != 0) {
            abstractClickableNode.ParcelableVolumeInfo.invoke();
            return Boolean.TRUE;
        }
        PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11 = (PagerMeasurePolicyKtrememberPagerMeasurePolicy11) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractClickableNode, PagerMeasureResult.read());
        if (pagerMeasurePolicyKtrememberPagerMeasurePolicy11 == null) {
            TriStateCheckbox.read("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + pagerMeasurePolicyKtrememberPagerMeasurePolicy11);
        }
        PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy12 = abstractClickableNode.MediaSessionCompatResultReceiverWrapper;
        abstractClickableNode.MediaSessionCompatResultReceiverWrapper = pagerMeasurePolicyKtrememberPagerMeasurePolicy11;
        if (pagerMeasurePolicyKtrememberPagerMeasurePolicy12 != null) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{pagerMeasurePolicyKtrememberPagerMeasurePolicy11, pagerMeasurePolicyKtrememberPagerMeasurePolicy12}, getCieXyz.write())).booleanValue() && ((delegatableNode = abstractClickableNode.MediaMetadataCompat) != null || !abstractClickableNode.PlaybackStateCompat)) {
                if (delegatableNode != null) {
                    abstractClickableNode.undelegate(delegatableNode);
                }
                abstractClickableNode.MediaMetadataCompat = null;
                abstractClickableNode.RemoteActionCompatParcelizer();
            }
        }
        return createFromParcel.INSTANCE;
    }
}
