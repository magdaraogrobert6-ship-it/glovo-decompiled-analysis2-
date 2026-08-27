package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.grpc.LoadBalancer$Helper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gExternalSyntheticLambda1 extends fe {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final int IconCompatParcelizer;
    public final g5 MediaDescriptionCompat;
    public final g4 MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final double read;
    public final LoadBalancer$Helper write;

    public gExternalSyntheticLambda1(List list, double d, int i, int i2, g5 g5Var, LoadBalancer$Helper loadBalancer$Helper, int i3) {
        g4 g4Var = new g4();
        if ((i3 & 64) != 0) {
            int i4 = RatingCompat + 45;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                fa faVar = fa.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            loadBalancer$Helper = fa.serializer;
            int i5 = 2 % 2;
        }
        list.getClass();
        g5Var.getClass();
        super(g5Var);
        this.MediaSessionCompatQueueItem = list;
        this.read = d;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaMetadataCompat = g4Var;
        this.MediaDescriptionCompat = g5Var;
        this.write = loadBalancer$Helper;
    }

    @Override // o.fe
    public final g5 read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaDescriptionCompat;
        }
        throw null;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        g4 g4Var = this.MediaMetadataCompat;
        int i5 = i3 + 11;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g4Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, this.MediaSessionCompatQueueItem.hashCode() * 31, 31), 31), 31);
        int iHashCode = this.MediaMetadataCompat.hashCode();
        int iHashCode2 = this.write.hashCode() + ((this.MediaDescriptionCompat.hashCode() + ((iHashCode + iM) * 31)) * 31);
        int i4 = RatingCompat + 55;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Polygon(points=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", lineWidth=");
        sb.append(this.read);
        c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, ", lineColor=", ", fillColor=", sb);
        sb.append(", visibleZoomRange=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", showInSafeArea=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", dashStyle=");
        sb.append(this.write);
        sb.append(")");
        String string = sb.toString();
        int i2 = MediaBrowserCompatMediaItem + 101;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof gExternalSyntheticLambda1) {
            gExternalSyntheticLambda1 gexternalsyntheticlambda1 = (gExternalSyntheticLambda1) obj;
            Object[] objArr = {this.MediaSessionCompatQueueItem, gexternalsyntheticlambda1.MediaSessionCompatQueueItem};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && Double.compare(this.read, gexternalsyntheticlambda1.read) == 0) {
                if (this.IconCompatParcelizer != gexternalsyntheticlambda1.IconCompatParcelizer) {
                    int i3 = MediaBrowserCompatMediaItem + 21;
                    RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i4 = 3 / 5;
                    }
                } else if (this.RemoteActionCompatParcelizer == gexternalsyntheticlambda1.RemoteActionCompatParcelizer && this.MediaMetadataCompat.equals(gexternalsyntheticlambda1.MediaMetadataCompat) && this.MediaDescriptionCompat == gexternalsyntheticlambda1.MediaDescriptionCompat && this.write.equals(gexternalsyntheticlambda1.write)) {
                    return true;
                }
            }
        }
        int i5 = RatingCompat + 85;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
