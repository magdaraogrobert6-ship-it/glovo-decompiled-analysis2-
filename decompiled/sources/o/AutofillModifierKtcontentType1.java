package o;

import androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final class AutofillModifierKtcontentType1 extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode> {
    public final boolean IconCompatParcelizer = true;
    public final getOnFill RemoteActionCompatParcelizer;
    public final boolean read;
    public final float serializer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode(this.read, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.read) * 31, 31, this.IconCompatParcelizer);
        int iHashCode = this.write.hashCode();
        return androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.serializer) + ((this.RemoteActionCompatParcelizer.hashCode() + ((iHashCode + iM) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        af$$ExternalSyntheticOutline1.m(this.read, inspectorInfo.getProperties(), "isRefreshing", inspectorInfo).set("onRefresh", this.write);
        af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, inspectorInfo.getProperties(), com.braze.models.FeatureFlag.ENABLED, inspectorInfo).set("state", this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set("threshold", androidx.compose.ui.unit.Dp.m3671boximpl(this.serializer));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) node;
        pullToRefreshModifierNode.serializer = this.write;
        pullToRefreshModifierNode.IconCompatParcelizer = this.IconCompatParcelizer;
        pullToRefreshModifierNode.RatingCompat = this.RemoteActionCompatParcelizer;
        pullToRefreshModifierNode.MediaBrowserCompatMediaItem = this.serializer;
        boolean z = pullToRefreshModifierNode.read;
        boolean z2 = this.read;
        if (z != z2) {
            pullToRefreshModifierNode.read = z2;
            BuildersKt.RemoteActionCompatParcelizer(pullToRefreshModifierNode.getCoroutineScope(), null, null, new PullToRefreshModifierNode$update$1(pullToRefreshModifierNode, null, 0), 3);
        }
    }

    public AutofillModifierKtcontentType1(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getOnFill getonfill, float f) {
        this.read = z;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = getonfill;
        this.serializer = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillModifierKtcontentType1)) {
            return false;
        }
        AutofillModifierKtcontentType1 autofillModifierKtcontentType1 = (AutofillModifierKtcontentType1) obj;
        if (this.read != autofillModifierKtcontentType1.read || this.IconCompatParcelizer != autofillModifierKtcontentType1.IconCompatParcelizer || this.write != autofillModifierKtcontentType1.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, autofillModifierKtcontentType1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.serializer, autofillModifierKtcontentType1.serializer);
    }
}
