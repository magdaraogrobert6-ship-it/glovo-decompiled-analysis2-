package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class drawTextOnPath extends drawLine {
    private static int MediaSessionCompatToken = 1;
    private static int ParcelableVolumeInfo;
    public final getDrawFilter IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final getMaximumBitmapHeight MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final List serializer;
    public final boolean write;

    public final getDrawFilter IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 3;
        ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getDrawFilter getdrawfilter = this.IconCompatParcelizer;
        int i5 = i2 + 87;
        ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return getdrawfilter;
    }

    public final getMaximumBitmapHeight serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        getMaximumBitmapHeight getmaximumbitmapheight = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 39;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getmaximumbitmapheight;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 5;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public drawTextOnPath(getMaximumBitmapHeight getmaximumbitmapheight, getDrawFilter getdrawfilter, String str, boolean z, boolean z2, String str2, String str3, boolean z3, boolean z4, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.MediaSessionCompatQueueItem = getmaximumbitmapheight;
        this.IconCompatParcelizer = getdrawfilter;
        this.read = str;
        this.MediaDescriptionCompat = z;
        this.write = z2;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.RatingCompat = z3;
        this.RemoteActionCompatParcelizer = z4;
        this.serializer = list;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatToken + 51;
        ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode();
        getDrawFilter getdrawfilter = this.IconCompatParcelizer;
        if (getdrawfilter == null) {
            i = 0;
        } else {
            int iHashCode2 = getdrawfilter.hashCode();
            int i5 = ParcelableVolumeInfo + 121;
            MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + i) * 31, 31, this.read), 31, this.MediaDescriptionCompat), 31, this.write), 31, this.MediaMetadataCompat), 31, this.MediaBrowserCompatMediaItem), 31, this.RatingCompat), 31, this.RemoteActionCompatParcelizer);
    }

    public static drawTextOnPath RemoteActionCompatParcelizer(drawTextOnPath drawtextonpath, getMaximumBitmapHeight getmaximumbitmapheight, getDrawFilter getdrawfilter, boolean z, boolean z2, int i) {
        getMaximumBitmapHeight getmaximumbitmapheight2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = MediaSessionCompatToken + 125;
            ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            getmaximumbitmapheight2 = drawtextonpath.MediaSessionCompatQueueItem;
        } else {
            getmaximumbitmapheight2 = getmaximumbitmapheight;
        }
        getDrawFilter getdrawfilter2 = (i & 2) != 0 ? drawtextonpath.IconCompatParcelizer : getdrawfilter;
        String str = drawtextonpath.read;
        boolean z3 = (i & 8) != 0 ? drawtextonpath.MediaDescriptionCompat : false;
        boolean z4 = (i & 16) != 0 ? drawtextonpath.write : z;
        String str2 = drawtextonpath.MediaMetadataCompat;
        String str3 = drawtextonpath.MediaBrowserCompatMediaItem;
        boolean z5 = (i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? drawtextonpath.RatingCompat : true;
        boolean z6 = (i & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? drawtextonpath.RemoteActionCompatParcelizer : z2;
        List list = drawtextonpath.serializer;
        drawtextonpath.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        drawTextOnPath drawtextonpath2 = new drawTextOnPath(getmaximumbitmapheight2, getdrawfilter2, str, z3, z4, str2, str3, z5, z6, list);
        int i5 = ParcelableVolumeInfo + 97;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return drawtextonpath2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Selection(screenData=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", location=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", hint=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.read, ", showHint=", ", buttonEnabled=", sb, this.MediaDescriptionCompat);
        IconCompatParcelizer.RemoteActionCompatParcelizer(", successSubtitle=", this.MediaMetadataCompat, ", retrySubtitle=", sb, this.write);
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, ", shouldShowButton=", ", isLoadingAddress=", sb, this.RatingCompat);
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", pinChangeTrackingEvents=");
        sb.append(this.serializer);
        sb.append(")");
        String string = sb.toString();
        int i2 = MediaSessionCompatToken + 111;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof drawTextOnPath)) {
                return false;
            }
            drawTextOnPath drawtextonpath = (drawTextOnPath) obj;
            if (!this.MediaSessionCompatQueueItem.equals(drawtextonpath.MediaSessionCompatQueueItem)) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, drawtextonpath.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, drawtextonpath.read}, getCieXyz.write())).booleanValue()) {
                    i = ParcelableVolumeInfo + 81;
                } else {
                    if (this.MediaDescriptionCompat != drawtextonpath.MediaDescriptionCompat || this.write != drawtextonpath.write) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, drawtextonpath.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                        int i3 = ParcelableVolumeInfo + 85;
                        MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            return false;
                        }
                        int i4 = 4 % 5;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, drawtextonpath.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue() || this.RatingCompat != drawtextonpath.RatingCompat || this.RemoteActionCompatParcelizer != drawtextonpath.RemoteActionCompatParcelizer) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, drawtextonpath.serializer}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                }
            } else {
                i = ParcelableVolumeInfo + 33;
            }
            MediaSessionCompatToken = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i % 2;
            return false;
        }
        return true;
    }
}
