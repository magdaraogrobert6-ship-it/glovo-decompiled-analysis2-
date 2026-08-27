package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class gExternalSyntheticLambda0 extends fe {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final Options.Companion IconCompatParcelizer;
    public final f8 MediaDescriptionCompat;
    public final g5 MediaSessionCompatQueueItem;
    public final g4 RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final f7 read;
    public final String write;

    @Override // o.fe
    public final g5 read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 113;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g5 g5Var = this.MediaSessionCompatQueueItem;
        int i5 = i2 + 33;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return g5Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 3;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g4 g4Var = this.RatingCompat;
        int i5 = i2 + 57;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gExternalSyntheticLambda0(boolean z, f8 f8Var, Options.Companion companion, f7 f7Var, g4 g4Var, g5 g5Var, String str) {
        super(g5Var);
        f8Var.getClass();
        companion.getClass();
        f7Var.getClass();
        g4Var.getClass();
        g5Var.getClass();
        str.getClass();
        this.RemoteActionCompatParcelizer = z;
        this.MediaDescriptionCompat = f8Var;
        this.IconCompatParcelizer = companion;
        this.read = f7Var;
        this.RatingCompat = g4Var;
        this.MediaSessionCompatQueueItem = g5Var;
        this.write = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gExternalSyntheticLambda0(f8 f8Var, Options.Companion companion, f7 f7Var, g5 g5Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            int i2 = MediaBrowserCompatMediaItem + 97;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        } else {
            int i5 = 2 % 2;
            z = true;
        }
        boolean z2 = z;
        int i6 = MediaMetadataCompat + 117;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i7;
        int i8 = i6 % 2;
        if ((i & 8) != 0) {
            int i9 = i7 + 91;
            MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            f7Var = f7.NONE;
        }
        this(z2, f8Var, companion, f7Var, new g4(), g5Var, d$$ExternalSyntheticOutline0.m());
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode2 = this.MediaDescriptionCompat.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        int iHashCode4 = this.read.hashCode();
        int iHashCode5 = this.RatingCompat.hashCode();
        int iHashCode6 = this.write.hashCode() + ((this.MediaSessionCompatQueueItem.hashCode() + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        int i4 = MediaBrowserCompatMediaItem + 11;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode6;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Marker(isIncludedInAutoZoom=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", point=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", markerStyle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", clusterGroup=");
        sb.append(this.read);
        sb.append(", visibleZoomRange=");
        sb.append(this.RatingCompat);
        sb.append(", showInSafeArea=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", id=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.write, ")");
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 3;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof gExternalSyntheticLambda0) {
            gExternalSyntheticLambda0 gexternalsyntheticlambda0 = (gExternalSyntheticLambda0) obj;
            if (this.RemoteActionCompatParcelizer != gexternalsyntheticlambda0.RemoteActionCompatParcelizer) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, gexternalsyntheticlambda0.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, gexternalsyntheticlambda0.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.read != gexternalsyntheticlambda0.read) {
                    int i4 = MediaBrowserCompatMediaItem + 59;
                    MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 != 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, gexternalsyntheticlambda0.RatingCompat}, getCieXyz.write())).booleanValue() || this.MediaSessionCompatQueueItem != gexternalsyntheticlambda0.MediaSessionCompatQueueItem) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, gexternalsyntheticlambda0.write}, getCieXyz.write())).booleanValue();
            }
            int i5 = MediaBrowserCompatMediaItem + 107;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = MediaMetadataCompat + 25;
        MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
