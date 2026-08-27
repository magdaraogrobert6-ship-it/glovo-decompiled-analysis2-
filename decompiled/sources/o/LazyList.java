package o;

import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes.dex */
public final class LazyList extends androidx.compose.ui.node.ModifierNodeElement<LazyListKtrememberLazyListMeasurePolicy11> {
    public final long IconCompatParcelizer;
    public final androidx.compose.ui.graphics.Shape RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final androidx.compose.ui.graphics.Brush serializer;
    public final float write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        LazyListKtrememberLazyListMeasurePolicy11 lazyListKtrememberLazyListMeasurePolicy11 = new LazyListKtrememberLazyListMeasurePolicy11();
        lazyListKtrememberLazyListMeasurePolicy11.write = this.IconCompatParcelizer;
        lazyListKtrememberLazyListMeasurePolicy11.RemoteActionCompatParcelizer = this.serializer;
        lazyListKtrememberLazyListMeasurePolicy11.IconCompatParcelizer = this.write;
        lazyListKtrememberLazyListMeasurePolicy11.RatingCompat = this.RemoteActionCompatParcelizer;
        lazyListKtrememberLazyListMeasurePolicy11.MediaMetadataCompat = androidx.compose.ui.geometry.Size.Companion.m554getUnspecifiedNHjbRc();
        return lazyListKtrememberLazyListMeasurePolicy11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.IconCompatParcelizer);
        androidx.compose.ui.graphics.Brush brush = this.serializer;
        return this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline1.m(this.write, ((iM729hashCodeimpl * 31) + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.read.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        LazyListKtrememberLazyListMeasurePolicy11 lazyListKtrememberLazyListMeasurePolicy11 = (LazyListKtrememberLazyListMeasurePolicy11) node;
        lazyListKtrememberLazyListMeasurePolicy11.write = this.IconCompatParcelizer;
        lazyListKtrememberLazyListMeasurePolicy11.RemoteActionCompatParcelizer = this.serializer;
        lazyListKtrememberLazyListMeasurePolicy11.IconCompatParcelizer = this.write;
        androidx.compose.ui.graphics.Shape shape = lazyListKtrememberLazyListMeasurePolicy11.RatingCompat;
        androidx.compose.ui.graphics.Shape shape2 = this.RemoteActionCompatParcelizer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{shape, shape2}, iWrite3)).booleanValue()) {
            lazyListKtrememberLazyListMeasurePolicy11.RatingCompat = shape2;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(lazyListKtrememberLazyListMeasurePolicy11);
        }
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(lazyListKtrememberLazyListMeasurePolicy11);
    }

    public LazyList(long j, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.Shape shape, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        j = (i & 1) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : j;
        brush = (i & 2) != 0 ? null : brush;
        this.IconCompatParcelizer = j;
        this.serializer = brush;
        this.write = f;
        this.RemoteActionCompatParcelizer = shape;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        LazyList lazyList = obj instanceof LazyList ? (LazyList) obj : null;
        if (lazyList != null && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.IconCompatParcelizer, lazyList.IconCompatParcelizer)) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, lazyList.serializer}, getCieXyz.write())).booleanValue() && this.write == lazyList.write) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, lazyList.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
