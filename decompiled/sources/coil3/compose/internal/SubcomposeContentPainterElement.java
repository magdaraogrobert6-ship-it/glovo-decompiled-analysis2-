package coil3.compose.internal;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SubcomposeContentPainterElement extends ModifierNodeElement<SubcomposeContentPainterNode> {
    public final String IconCompatParcelizer;
    public final ContentScale MediaDescriptionCompat;
    public final boolean RemoteActionCompatParcelizer;
    private final Painter painter;
    public final float read;
    public final ColorFilter serializer;
    public final Alignment write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new SubcomposeContentPainterNode(this.painter, this.write, this.MediaDescriptionCompat, this.read, this.serializer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.painter.hashCode();
        int iM = af$$ExternalSyntheticOutline1.m(this.read, (this.MediaDescriptionCompat.hashCode() + ((this.write.hashCode() + (iHashCode * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.serializer;
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31, 31, this.RemoteActionCompatParcelizer);
        String str = this.IconCompatParcelizer;
        return iM2 + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(RemoteMessageConst.Notification.CONTENT);
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("alignment", this.write);
        inspectorInfo.getProperties().set("contentScale", this.MediaDescriptionCompat);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.read));
        inspectorInfo.getProperties().set("colorFilter", this.serializer);
        af$$ExternalSyntheticOutline1.m(this.RemoteActionCompatParcelizer, inspectorInfo.getProperties(), "clipToBounds", inspectorInfo).set("contentDescription", this.IconCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        SubcomposeContentPainterNode subcomposeContentPainterNode = (SubcomposeContentPainterNode) node;
        boolean zM542equalsimpl0 = Size.m542equalsimpl0(subcomposeContentPainterNode.write().mo1424getIntrinsicSizeNHjbRc(), this.painter.mo1424getIntrinsicSizeNHjbRc());
        subcomposeContentPainterNode.IconCompatParcelizer(this.painter);
        subcomposeContentPainterNode.RemoteActionCompatParcelizer = this.write;
        subcomposeContentPainterNode.MediaMetadataCompat = this.MediaDescriptionCompat;
        subcomposeContentPainterNode.read = this.read;
        subcomposeContentPainterNode.serializer = this.serializer;
        subcomposeContentPainterNode.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
        String str = subcomposeContentPainterNode.MediaBrowserCompatMediaItem;
        String str2 = this.IconCompatParcelizer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue()) {
            subcomposeContentPainterNode.MediaBrowserCompatMediaItem = str2;
            SemanticsModifierNodeKt.invalidateSemantics(subcomposeContentPainterNode);
        }
        if (!zM542equalsimpl0) {
            LayoutModifierNodeKt.invalidateMeasurement(subcomposeContentPainterNode);
        }
        DrawModifierNodeKt.invalidateDraw(subcomposeContentPainterNode);
    }

    public SubcomposeContentPainterElement(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, String str) {
        this.painter = painter;
        this.write = alignment;
        this.MediaDescriptionCompat = contentScale;
        this.read = f;
        this.serializer = colorFilter;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcomposeContentPainterElement)) {
            return false;
        }
        SubcomposeContentPainterElement subcomposeContentPainterElement = (SubcomposeContentPainterElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.painter, subcomposeContentPainterElement.painter}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, subcomposeContentPainterElement.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, subcomposeContentPainterElement.MediaDescriptionCompat}, getCieXyz.write())).booleanValue() || Float.compare(this.read, subcomposeContentPainterElement.read) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, subcomposeContentPainterElement.serializer}, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != subcomposeContentPainterElement.RemoteActionCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, subcomposeContentPainterElement.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        Painter painter = this.painter;
        StringBuilder sb = new StringBuilder("SubcomposeContentPainterElement(painter=");
        sb.append(painter);
        sb.append(", alignment=");
        sb.append(this.write);
        sb.append(", contentScale=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", alpha=");
        sb.append(this.read);
        sb.append(", colorFilter=");
        sb.append(this.serializer);
        sb.append(", clipToBounds=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", contentDescription=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
    }
}
