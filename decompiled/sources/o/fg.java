package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import io.grpc.LoadBalancer$Helper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fg extends fe {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final List IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final double MediaDescriptionCompat;
    public final fb MediaMetadataCompat;
    public final g5 MediaSessionCompatQueueItem;
    public final g4 MediaSessionCompatToken;
    public final double RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final LoadBalancer$Helper read;
    public final String write;

    @Override // o.fe
    public final g5 read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        g5 g5Var = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 11;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return g5Var;
        }
        throw null;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        int i4 = i2 % 2;
        g4 g4Var = this.MediaSessionCompatToken;
        int i5 = i3 + 87;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return g4Var;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fg(String str, List list, double d, fb fbVar, fd fdVar, int i, g5 g5Var, int i2) {
        String str2;
        fb fbVar2;
        LoadBalancer$Helper loadBalancer$Helper;
        boolean z;
        if ((i2 & 1) != 0) {
            int i3 = 2 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            int i4 = MediaSessionCompatResultReceiverWrapper + 71;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            fbVar2 = fb.POLYLINE;
        } else {
            fbVar2 = fbVar;
        }
        if ((i2 & 32) != 0) {
            fa faVar = fa.serializer;
            int i6 = PlaybackStateCompatCustomAction + 107;
            MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            loadBalancer$Helper = faVar;
        } else {
            loadBalancer$Helper = fdVar;
        }
        if ((i2 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            z = false;
        } else {
            int i8 = 2 % 2;
            z = true;
        }
        boolean z2 = z;
        int i9 = MediaSessionCompatResultReceiverWrapper + 5;
        PlaybackStateCompatCustomAction = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        int i11 = 2 % 2;
        this(str2, list, d, 0.0d, fbVar2, loadBalancer$Helper, i, z2, new g4(), g5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(String str, List list, double d, double d2, fb fbVar, LoadBalancer$Helper loadBalancer$Helper, int i, boolean z, g4 g4Var, g5 g5Var) {
        super(g5Var);
        fbVar.getClass();
        loadBalancer$Helper.getClass();
        g5Var.getClass();
        this.write = str;
        this.IconCompatParcelizer = list;
        this.MediaDescriptionCompat = d;
        this.RatingCompat = d2;
        this.MediaMetadataCompat = fbVar;
        this.read = loadBalancer$Helper;
        this.MediaBrowserCompatMediaItem = i;
        this.RemoteActionCompatParcelizer = z;
        this.MediaSessionCompatToken = g4Var;
        this.MediaSessionCompatQueueItem = g5Var;
    }

    public static fg serializer(fg fgVar, String str, double d, double d2, fd fdVar, int i, int i2) {
        double d3;
        LoadBalancer$Helper loadBalancer$Helper;
        double d4;
        int i3 = 2 % 2;
        int i4 = PlaybackStateCompatCustomAction;
        int i5 = i4 + 21;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        String str2 = (i5 % 2 == 0 ? (i2 & 1) == 0 : (i2 & 1) == 0) ? str : fgVar.write;
        List list = fgVar.IconCompatParcelizer;
        if ((i2 & 8) != 0) {
            int i6 = i4 + 51;
            MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                d4 = fgVar.RatingCompat;
                int i7 = 92 / 0;
            } else {
                d4 = fgVar.RatingCompat;
            }
            d3 = d4;
        } else {
            d3 = d2;
        }
        fb fbVar = fgVar.MediaMetadataCompat;
        if ((i2 & 32) != 0) {
            int i8 = i4 + 115;
            MediaSessionCompatResultReceiverWrapper = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                LoadBalancer$Helper loadBalancer$Helper2 = fgVar.read;
                throw null;
            }
            loadBalancer$Helper = fgVar.read;
        } else {
            loadBalancer$Helper = fdVar;
        }
        boolean z = fgVar.RemoteActionCompatParcelizer;
        g4 g4Var = fgVar.MediaSessionCompatToken;
        g5 g5Var = fgVar.MediaSessionCompatQueueItem;
        list.getClass();
        fbVar.getClass();
        loadBalancer$Helper.getClass();
        g4Var.getClass();
        g5Var.getClass();
        return new fg(str2, list, d, d3, fbVar, loadBalancer$Helper, i, z, g4Var, g5Var);
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompatCustomAction + 103;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i4;
        int i5 = i3 % 2;
        String str = this.write;
        if (str == null) {
            int i6 = i4 + 33;
            PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i8 = MediaSessionCompatResultReceiverWrapper + 121;
            PlaybackStateCompatCustomAction = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = iHashCode;
        }
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RatingCompat, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, i * 31, 31), 31), 31);
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, (this.read.hashCode() + ((iHashCode2 + iRemoteActionCompatParcelizer) * 31)) * 31, 31), 31, this.RemoteActionCompatParcelizer);
        return this.MediaSessionCompatQueueItem.hashCode() + ((this.MediaSessionCompatToken.hashCode() + iM) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 97;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Line(layerId=", this.write, ", coordinates=", this.IconCompatParcelizer, ", lineWidth=");
        sbSerializer.append(this.MediaDescriptionCompat);
        sbSerializer.append(", lineBlur=");
        sbSerializer.append(this.RatingCompat);
        sbSerializer.append(", lineStyle=");
        sbSerializer.append(this.MediaMetadataCompat);
        sbSerializer.append(", dashStyle=");
        sbSerializer.append(this.read);
        sbSerializer.append(", lineColor=");
        sbSerializer.append(this.MediaBrowserCompatMediaItem);
        sbSerializer.append(", isDynamicLine=");
        sbSerializer.append(this.RemoteActionCompatParcelizer);
        sbSerializer.append(", visibleZoomRange=");
        sbSerializer.append(this.MediaSessionCompatToken);
        sbSerializer.append(", showInSafeArea=");
        sbSerializer.append(this.MediaSessionCompatQueueItem);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = PlaybackStateCompatCustomAction + 117;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaSessionCompatResultReceiverWrapper + 53;
            PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, fgVar.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, fgVar.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || Double.compare(this.MediaDescriptionCompat, fgVar.MediaDescriptionCompat) != 0) {
            return false;
        }
        if (Double.compare(this.RatingCompat, fgVar.RatingCompat) != 0) {
            int i3 = MediaSessionCompatResultReceiverWrapper + 73;
            PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (this.MediaMetadataCompat != fgVar.MediaMetadataCompat) {
            int i5 = PlaybackStateCompatCustomAction + 13;
            MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, fgVar.read}, getCieXyz.write())).booleanValue()) {
            int i7 = PlaybackStateCompatCustomAction + 25;
            MediaSessionCompatResultReceiverWrapper = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (this.MediaBrowserCompatMediaItem != fgVar.MediaBrowserCompatMediaItem || this.RemoteActionCompatParcelizer != fgVar.RemoteActionCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, fgVar.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.MediaSessionCompatQueueItem == fgVar.MediaSessionCompatQueueItem) {
            return true;
        }
        int i9 = PlaybackStateCompatCustomAction;
        int i10 = i9 + 97;
        MediaSessionCompatResultReceiverWrapper = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        int i12 = i9 + 97;
        MediaSessionCompatResultReceiverWrapper = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
