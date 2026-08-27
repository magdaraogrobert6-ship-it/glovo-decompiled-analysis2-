package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class TooltipPositionProviderImpl extends androidx.compose.ui.node.ModifierNodeElement<TooltipKtTooltipBox3> {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public final boolean MediaBrowserCompatMediaItem;
    public final String RemoteActionCompatParcelizer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 read;
    public final Object serializer;
    public final ModalBottomSheetKtModalBottomSheet51 write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        TooltipKtTooltipBox3 tooltipKtTooltipBox3 = new TooltipKtTooltipBox3();
        tooltipKtTooltipBox3.serializer = this.write;
        tooltipKtTooltipBox3.RemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem;
        tooltipKtTooltipBox3.read = this.read;
        return tooltipKtTooltipBox3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.MediaBrowserCompatMediaItem);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set("align", this.serializer);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.MediaBrowserCompatMediaItem));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        TooltipKtTooltipBox3 tooltipKtTooltipBox3 = (TooltipKtTooltipBox3) node;
        tooltipKtTooltipBox3.serializer = this.write;
        tooltipKtTooltipBox3.RemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem;
        tooltipKtTooltipBox3.read = this.read;
    }

    public TooltipPositionProviderImpl(ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet51, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj, String str) {
        this.write = modalBottomSheetKtModalBottomSheet51;
        this.MediaBrowserCompatMediaItem = z;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TooltipPositionProviderImpl.class != obj.getClass()) {
            return false;
        }
        TooltipPositionProviderImpl tooltipPositionProviderImpl = (TooltipPositionProviderImpl) obj;
        if (this.write != tooltipPositionProviderImpl.write || this.MediaBrowserCompatMediaItem != tooltipPositionProviderImpl.MediaBrowserCompatMediaItem) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, tooltipPositionProviderImpl.serializer}, getCieXyz.write())).booleanValue();
    }
}
