package o;

/* JADX INFO: loaded from: classes.dex */
public final class PullToRefreshModifierNode implements androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber read;
    public final /* synthetic */ IndicatorBox1CPYgEU write;

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
    public final boolean getHasMoreContent() {
        return this.write.write((TextFieldImplKtCommonDecorationBox3decoratedSuffix1) this.read.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    public PullToRefreshModifierNode(IndicatorBox1CPYgEU indicatorBox1CPYgEU, createInAppMessageEventSubscriber createinappmessageeventsubscriber, int i) {
        this.write = indicatorBox1CPYgEU;
        this.read = createinappmessageeventsubscriber;
        this.RemoteActionCompatParcelizer = i;
    }
}
