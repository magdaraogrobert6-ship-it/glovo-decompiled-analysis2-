package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.platform.ValueElementSequence;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableKt$zoomable$1;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint
final class onPreExecute extends androidx.compose.ui.node.ModifierNodeElement<ZoomableNode> {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final ZoomableKt$zoomable$1 RemoteActionCompatParcelizer;
    public final ZoomState read;
    public final boolean serializer;
    public final FutureScheduler write;

    public onPreExecute(ZoomState zoomState, boolean z, FutureScheduler futureScheduler, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ZoomableKt$zoomable$1 zoomableKt$zoomable$1) {
        zoomState.getClass();
        this.read = zoomState;
        this.serializer = z;
        this.write = futureScheduler;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = zoomableKt$zoomable$1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        int i = 2 % 2;
        ZoomableNode zoomableNode = new ZoomableNode(this.read, this.serializer, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
        int i2 = MediaSessionCompatQueueItem + 67;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zoomableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 33;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onPreExecute)) {
            return false;
        }
        onPreExecute onpreexecute = (onPreExecute) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, onpreexecute.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.serializer == onpreexecute.serializer) {
            if (this.write != onpreexecute.write) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, onpreexecute.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, onpreexecute.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i4 = MediaMetadataCompat + 117;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        int i5 = 2 % 4;
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 99;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer), 31, false), 31, false);
        int iHashCode2 = this.write.hashCode();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            int i4 = MediaSessionCompatQueueItem + 19;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                iHashCode = r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode();
                int i5 = 13 / 0;
            } else {
                iHashCode = r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode();
            }
        } else {
            int i6 = MediaMetadataCompat + 103;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode = 0;
        }
        ZoomableKt$zoomable$1 zoomableKt$zoomable$1 = this.RemoteActionCompatParcelizer;
        return Boolean.hashCode(false) + ((((((iHashCode2 + iM) * 31) + iHashCode) * 31) + (zoomableKt$zoomable$1 != null ? zoomableKt$zoomable$1.hashCode() : 0)) * 961);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 55;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ZoomableNode zoomableNode = (ZoomableNode) node;
        zoomableNode.getClass();
        ZoomState zoomState = this.read;
        zoomState.getClass();
        FutureScheduler futureScheduler = this.write;
        futureScheduler.getClass();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{zoomableNode.MediaDescriptionCompat, zoomState}, getCieXyz.write())).booleanValue()) {
            zoomState.m5041setLayoutSizeuvyYCjk(zoomableNode.write);
            zoomableNode.MediaDescriptionCompat = zoomState;
        }
        zoomableNode.MediaSessionCompatQueueItem = this.serializer;
        zoomableNode.MediaBrowserCompatMediaItem = futureScheduler;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        boolean z2 = false;
        boolean z3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm == null;
        boolean z4 = zoomableNode.RemoteActionCompatParcelizer == null;
        ZoomableKt$zoomable$1 zoomableKt$zoomable$1 = this.RemoteActionCompatParcelizer;
        if (z3 != z4) {
            zoomableNode.IconCompatParcelizer.resetPointerInputHandler();
        } else {
            if (zoomableKt$zoomable$1 == null) {
                int i4 = MediaSessionCompatQueueItem + 33;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (zoomableNode.read == null) {
                int i6 = MediaSessionCompatQueueItem + 107;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                MediaMetadataCompat = i7;
                boolean z5 = i6 % 2 != 0;
                int i8 = i7 + 119;
                MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z2 = z5;
            }
            if (z != z2) {
                zoomableNode.IconCompatParcelizer.resetPointerInputHandler();
            }
        }
        zoomableNode.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        zoomableNode.read = zoomableKt$zoomable$1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 65;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        inspectorInfo.getClass();
        inspectorInfo.setName("zoomable");
        inspectorInfo.getProperties().set("zoomState", this.read);
        ValueElementSequence valueElementSequenceM = af$$ExternalSyntheticOutline1.m(this.serializer, inspectorInfo.getProperties(), "zoomEnabled", inspectorInfo);
        Boolean bool = Boolean.FALSE;
        valueElementSequenceM.set("enableOneFingerZoom", bool);
        inspectorInfo.getProperties().set("snapBackEnabled", bool);
        inspectorInfo.getProperties().set("scrollGesturePropagation", this.write);
        inspectorInfo.getProperties().set("onTap", this.IconCompatParcelizer);
        inspectorInfo.getProperties().set("onDoubleTap", this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set("onLongPress", null);
        inspectorInfo.getProperties().set("enableNestedScroll", bool);
        int i4 = MediaMetadataCompat + 121;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
