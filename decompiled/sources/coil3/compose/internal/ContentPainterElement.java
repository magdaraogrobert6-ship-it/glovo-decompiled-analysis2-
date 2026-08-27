package coil3.compose.internal;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import com.huawei.hms.push.constant.RemoteMessageConst;
import o.PathDirection;
import o.PathFillType;
import o.ShaderKt;
import o.SimpleGraphicsLayerModifierlayerBlock1;
import o.getCieXyz;
import o.or;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ContentPainterElement extends ModifierNodeElement<ContentPainterNode> {
    public final Alignment IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final or MediaDescriptionCompat;
    public final ContentScale MediaMetadataCompat;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public final ShaderKt MediaSessionCompatToken;
    public final PathFillType PlaybackStateCompat;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM PlaybackStateCompatCustomAction;
    public final RealImageLoader RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final ColorFilter serializer;
    public final float read = 1.0f;
    public final boolean write = true;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        or orVar = this.MediaDescriptionCompat;
        RealImageLoader realImageLoader = this.RatingCompat;
        ShaderKt shaderKt = this.MediaSessionCompatToken;
        PathDirection pathDirection = new PathDirection(realImageLoader, shaderKt, orVar);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(pathDirection);
        asyncImagePainter.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.PlaybackStateCompatCustomAction;
        asyncImagePainter.ParcelableVolumeInfo = this.MediaSessionCompatQueueItem;
        asyncImagePainter.serializer = this.MediaMetadataCompat;
        asyncImagePainter.MediaMetadataCompat = this.MediaBrowserCompatMediaItem;
        asyncImagePainter.PlaybackStateCompatCustomAction = this.PlaybackStateCompat;
        asyncImagePainter.write(pathDirection);
        SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1 = shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        return new ContentPainterNode(asyncImagePainter, this.IconCompatParcelizer, this.MediaMetadataCompat, this.read, this.serializer, this.write, this.RemoteActionCompatParcelizer, simpleGraphicsLayerModifierlayerBlock1 instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) simpleGraphicsLayerModifierlayerBlock1 : null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.MediaSessionCompatToken.hashCode();
        int iHashCode2 = this.RatingCompat.hashCode();
        int iHashCode3 = this.MediaDescriptionCompat.hashCode();
        int iHashCode4 = this.PlaybackStateCompatCustomAction.hashCode();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.MediaSessionCompatQueueItem;
        int iHashCode5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm == null ? 0 : r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode();
        int iM821hashCodeimpl = FilterQuality.m821hashCodeimpl(this.MediaBrowserCompatMediaItem);
        int iM = af$$ExternalSyntheticOutline1.m(this.read, (this.MediaMetadataCompat.hashCode() + ((this.IconCompatParcelizer.hashCode() + ((iM821hashCodeimpl + ((((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31) + iHashCode5) * 31)) * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.serializer;
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31, 31, this.write);
        PathFillType pathFillType = this.PlaybackStateCompat;
        int iHashCode6 = pathFillType == null ? 0 : pathFillType.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        return ((iM2 + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(RemoteMessageConst.Notification.CONTENT);
        inspectorInfo.getProperties().set("request", this.MediaSessionCompatToken);
        inspectorInfo.getProperties().set("imageLoader", this.RatingCompat);
        inspectorInfo.getProperties().set("modelEqualityDelegate", this.MediaDescriptionCompat);
        inspectorInfo.getProperties().set("transform", this.PlaybackStateCompatCustomAction);
        inspectorInfo.getProperties().set("onState", this.MediaSessionCompatQueueItem);
        inspectorInfo.getProperties().set("filterQuality", FilterQuality.m817boximpl(this.MediaBrowserCompatMediaItem));
        inspectorInfo.getProperties().set("alignment", this.IconCompatParcelizer);
        inspectorInfo.getProperties().set("contentScale", this.MediaMetadataCompat);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.read));
        inspectorInfo.getProperties().set("colorFilter", this.serializer);
        af$$ExternalSyntheticOutline1.m(this.write, inspectorInfo.getProperties(), "clipToBounds", inspectorInfo).set("previewHandler", this.PlaybackStateCompat);
        inspectorInfo.getProperties().set("contentDescription", this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String strM822toStringimpl = FilterQuality.m822toStringimpl(this.MediaBrowserCompatMediaItem);
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", imageLoader=");
        sb.append(this.RatingCompat);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", transform=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", onState=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", filterQuality=");
        sb.append(strM822toStringimpl);
        sb.append(", alignment=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", contentScale=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", alpha=");
        sb.append(this.read);
        sb.append(", colorFilter=");
        sb.append(this.serializer);
        sb.append(", clipToBounds=");
        sb.append(this.write);
        sb.append(", previewHandler=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", contentDescription=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ContentPainterNode contentPainterNode = (ContentPainterNode) node;
        long jMo1424getIntrinsicSizeNHjbRc = contentPainterNode.RatingCompat.mo1424getIntrinsicSizeNHjbRc();
        ConstraintsSizeResolver constraintsSizeResolver = contentPainterNode.write;
        or orVar = this.MediaDescriptionCompat;
        RealImageLoader realImageLoader = this.RatingCompat;
        ShaderKt shaderKt = this.MediaSessionCompatToken;
        PathDirection pathDirection = new PathDirection(realImageLoader, shaderKt, orVar);
        AsyncImagePainter asyncImagePainter = contentPainterNode.RatingCompat;
        asyncImagePainter.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.PlaybackStateCompatCustomAction;
        asyncImagePainter.ParcelableVolumeInfo = this.MediaSessionCompatQueueItem;
        ContentScale contentScale = this.MediaMetadataCompat;
        asyncImagePainter.serializer = contentScale;
        asyncImagePainter.MediaMetadataCompat = this.MediaBrowserCompatMediaItem;
        asyncImagePainter.PlaybackStateCompatCustomAction = this.PlaybackStateCompat;
        asyncImagePainter.write(pathDirection);
        boolean zM542equalsimpl0 = Size.m542equalsimpl0(jMo1424getIntrinsicSizeNHjbRc, asyncImagePainter.mo1424getIntrinsicSizeNHjbRc());
        contentPainterNode.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1 = shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        contentPainterNode.write = simpleGraphicsLayerModifierlayerBlock1 instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) simpleGraphicsLayerModifierlayerBlock1 : null;
        contentPainterNode.MediaMetadataCompat = contentScale;
        contentPainterNode.read = this.read;
        contentPainterNode.serializer = this.serializer;
        contentPainterNode.IconCompatParcelizer = this.write;
        String str = contentPainterNode.MediaBrowserCompatMediaItem;
        String str2 = this.RemoteActionCompatParcelizer;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str2}, getCieXyz.write())).booleanValue()) {
            contentPainterNode.MediaBrowserCompatMediaItem = str2;
            SemanticsModifierNodeKt.invalidateSemantics(contentPainterNode);
        }
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{constraintsSizeResolver, contentPainterNode.write}, getCieXyz.write())).booleanValue();
        if (!zM542equalsimpl0 || !zBooleanValue) {
            LayoutModifierNodeKt.invalidateMeasurement(contentPainterNode);
        }
        DrawModifierNodeKt.invalidateDraw(contentPainterNode);
    }

    public ContentPainterElement(ShaderKt shaderKt, RealImageLoader realImageLoader, or orVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter, PathFillType pathFillType, String str) {
        this.MediaSessionCompatToken = shaderKt;
        this.RatingCompat = realImageLoader;
        this.MediaDescriptionCompat = orVar;
        this.PlaybackStateCompatCustomAction = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaBrowserCompatMediaItem = i;
        this.IconCompatParcelizer = alignment;
        this.MediaMetadataCompat = contentScale;
        this.serializer = colorFilter;
        this.PlaybackStateCompat = pathFillType;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, contentPainterElement.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, contentPainterElement.RatingCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, contentPainterElement.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompatCustomAction, contentPainterElement.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, contentPainterElement.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() || !FilterQuality.m820equalsimpl0(this.MediaBrowserCompatMediaItem, contentPainterElement.MediaBrowserCompatMediaItem)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, contentPainterElement.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, contentPainterElement.MediaMetadataCompat}, getCieXyz.write())).booleanValue() || Float.compare(this.read, contentPainterElement.read) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, contentPainterElement.serializer}, getCieXyz.write())).booleanValue() || this.write != contentPainterElement.write) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompat, contentPainterElement.PlaybackStateCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, contentPainterElement.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
