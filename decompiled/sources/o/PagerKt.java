package o;

import android.view.View;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class PagerKt extends androidx.compose.ui.node.ModifierNodeElement<PagerState> {
    public final resetui IconCompatParcelizer;
    public final AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl MediaMetadataCompat;
    public final long RatingCompat;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final PagerStateKt write;
    public final float MediaSessionCompatQueueItem = Float.NaN;
    public final boolean MediaDescriptionCompat = true;
    public final boolean serializer = true;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new PagerState(this.MediaMetadataCompat, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, this.MediaDescriptionCompat, this.RatingCompat, this.read, this.RemoteActionCompatParcelizer, this.serializer, this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.serializer(this.RemoteActionCompatParcelizer, getBitmapFromCache.serializer(this.read, (androidx.compose.ui.unit.DpSize.m3773hashCodeimpl(this.RatingCompat) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline1.m(this.MediaSessionCompatQueueItem, this.MediaMetadataCompat.hashCode() * 961, 31), 31, this.MediaDescriptionCompat)) * 31, 31), 31), 31, this.serializer);
        resetui resetuiVar = this.IconCompatParcelizer;
        return this.write.hashCode() + ((iM + (resetuiVar != null ? resetuiVar.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.MediaMetadataCompat);
        inspectorInfo.getProperties().set("magnifierCenter", null);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.MediaSessionCompatQueueItem));
        inspectorInfo.getProperties().set("size", androidx.compose.ui.unit.DpSize.m3759boximpl(this.RatingCompat));
        MediaSessionCompatQueueItem.serializer(this.RemoteActionCompatParcelizer, MediaSessionCompatQueueItem.serializer(this.read, inspectorInfo.getProperties(), "cornerRadius", inspectorInfo), "elevation", inspectorInfo).set("clippingEnabled", Boolean.valueOf(this.serializer));
    }

    public PagerKt(AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl androidTextContextMenuToolbarProviderTextActionModeCallbackImpl, resetui resetuiVar, long j, float f, float f2, PagerStateKt pagerStateKt) {
        this.MediaMetadataCompat = androidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
        this.IconCompatParcelizer = resetuiVar;
        this.RatingCompat = j;
        this.read = f;
        this.RemoteActionCompatParcelizer = f2;
        this.write = pagerStateKt;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerKt)) {
            return false;
        }
        PagerKt pagerKt = (PagerKt) obj;
        if (this.MediaMetadataCompat != pagerKt.MediaMetadataCompat || this.MediaSessionCompatQueueItem != pagerKt.MediaSessionCompatQueueItem || this.MediaDescriptionCompat != pagerKt.MediaDescriptionCompat || !androidx.compose.ui.unit.DpSize.m3768equalsimpl0(this.RatingCompat, pagerKt.RatingCompat) || !androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, pagerKt.read) || !androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, pagerKt.RemoteActionCompatParcelizer) || this.serializer != pagerKt.serializer || this.IconCompatParcelizer != pagerKt.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, pagerKt.write}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        PagerState pagerState = (PagerState) node;
        float f = pagerState.ResultReceiver;
        long j = pagerState.MediaSessionCompatToken;
        float f2 = pagerState.IconCompatParcelizer;
        boolean z = pagerState.MediaSessionCompatResultReceiverWrapper;
        float f3 = pagerState.MediaBrowserCompatMediaItem;
        boolean z2 = pagerState.read;
        PagerStateKt pagerStateKt = pagerState.MediaSessionCompatQueueItem;
        View view = pagerState.ComponentActivity;
        androidx.compose.ui.unit.Density density = pagerState.RemoteActionCompatParcelizer;
        pagerState.PlaybackStateCompat = this.MediaMetadataCompat;
        float f4 = this.MediaSessionCompatQueueItem;
        pagerState.ResultReceiver = f4;
        boolean z3 = this.MediaDescriptionCompat;
        pagerState.MediaSessionCompatResultReceiverWrapper = z3;
        long j2 = this.RatingCompat;
        pagerState.MediaSessionCompatToken = j2;
        float f5 = this.read;
        pagerState.IconCompatParcelizer = f5;
        float f6 = this.RemoteActionCompatParcelizer;
        pagerState.MediaBrowserCompatMediaItem = f6;
        boolean z4 = this.serializer;
        pagerState.read = z4;
        pagerState.MediaMetadataCompat = this.IconCompatParcelizer;
        PagerStateKt pagerStateKt2 = this.write;
        pagerState.MediaSessionCompatQueueItem = pagerStateKt2;
        View viewRequireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(pagerState);
        androidx.compose.ui.unit.Density densityRequireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pagerState);
        if (pagerState.MediaDescriptionCompat != null) {
            androidx.compose.ui.semantics.SemanticsPropertyKey semanticsPropertyKey = animateScrollToPage.read;
            if (((Float.isNaN(f4) && Float.isNaN(f)) || f4 == f || pagerStateKt2.write()) && androidx.compose.ui.unit.DpSize.m3768equalsimpl0(j2, j) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(f5, f2) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(f6, f3) && z3 == z && z4 == z2) {
                Object[] objArr = {pagerStateKt2, pagerStateKt};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    int iWrite = getCieXyz.write();
                    int iWrite2 = getCieXyz.write();
                    int iWrite3 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{viewRequireView, view}, iWrite3)).booleanValue()) {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{densityRequireDensity, density}, iWrite6)).booleanValue()) {
                            pagerState.serializer();
                        }
                    } else {
                        pagerState.serializer();
                    }
                } else {
                    pagerState.serializer();
                }
            } else {
                pagerState.serializer();
            }
        }
        pagerState.read();
    }
}
