package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends Options.Companion {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int MediaSessionCompatToken;
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final f6 MediaSessionCompatQueueItem;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final Integer read;
    public final int serializer;
    public final boolean write;

    @Override // okio.Options.Companion
    public final f6 L_() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        f6 f6Var = this.MediaSessionCompatQueueItem;
        int i4 = i3 + 39;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return f6Var;
        }
        obj.hashCode();
        throw null;
    }

    @Override // okio.Options.Companion
    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        boolean z = this.write;
        int i5 = i3 + 99;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public g0(String str, int i, int i2, int i3, int i4, int i5, int i6, Integer num, String str2, f6 f6Var, boolean z) {
        this.RatingCompat = str;
        this.MediaMetadataCompat = i;
        this.serializer = i2;
        this.IconCompatParcelizer = i3;
        this.MediaDescriptionCompat = i4;
        this.MediaBrowserCompatMediaItem = i5;
        this.RemoteActionCompatParcelizer = i6;
        this.read = num;
        this.PlaybackStateCompatCustomAction = str2;
        this.MediaSessionCompatQueueItem = f6Var;
        this.write = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 35;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat, this.RatingCompat.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.read;
        if (num == null) {
            int i4 = MediaSessionCompatResultReceiverWrapper + 97;
            MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.PlaybackStateCompatCustomAction);
        int iHashCode2 = Boolean.hashCode(this.write) + ((this.MediaSessionCompatQueueItem.hashCode() + iM2) * 31);
        int i6 = MediaSessionCompatResultReceiverWrapper + 51;
        MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 81;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("DynamicPill(text=", this.MediaMetadataCompat, this.RatingCompat, ", iconDrawable=", ", backgroundColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.serializer, this.IconCompatParcelizer, ", borderColor=", ", iconColor=", sbM);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, ", textColor=", ", badgeBackgroundColor=", sbM);
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", badgeDrawable=");
        sbM.append(this.read);
        sbM.append(", type=");
        sbM.append(this.PlaybackStateCompatCustomAction);
        sbM.append(", iconAnchor=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", highlighted=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.write, ")");
        int i4 = MediaSessionCompatResultReceiverWrapper + 7;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 43;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.RatingCompat.equals(g0Var.RatingCompat) && this.MediaMetadataCompat == g0Var.MediaMetadataCompat && this.serializer == g0Var.serializer && this.IconCompatParcelizer == g0Var.IconCompatParcelizer && this.MediaDescriptionCompat == g0Var.MediaDescriptionCompat) {
                if (this.MediaBrowserCompatMediaItem != g0Var.MediaBrowserCompatMediaItem) {
                    int i4 = MediaSessionCompatResultReceiverWrapper + 85;
                    MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else if (this.RemoteActionCompatParcelizer == g0Var.RemoteActionCompatParcelizer) {
                    Object[] objArr = {this.read, g0Var.read};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.PlaybackStateCompatCustomAction.equals(g0Var.PlaybackStateCompatCustomAction) && this.MediaSessionCompatQueueItem.equals(g0Var.MediaSessionCompatQueueItem) && this.write == g0Var.write) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
