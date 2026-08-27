package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends Options.Companion {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public final int IconCompatParcelizer;
    public final g1 MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final f6 read;
    public final int serializer;
    public final int write;

    @Override // okio.Options.Companion
    public final f6 L_() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        f6 f6Var = this.read;
        int i5 = i3 + 19;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return f6Var;
    }

    @Override // okio.Options.Companion
    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        boolean z = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 29;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public g2(int i, int i2, int i3, int i4, int i5, g1 g1Var, f6 f6Var, boolean z, boolean z2, int i6) {
        if ((i6 & 32) != 0) {
            int i7 = PlaybackStateCompat + 121;
            PlaybackStateCompatCustomAction = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i5 = 0;
        }
        if ((i6 & 64) != 0) {
            int i10 = PlaybackStateCompatCustomAction + 15;
            PlaybackStateCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            g1Var = g1.ROUNDED_SQUARE;
        }
        if ((i6 & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
            int i12 = PlaybackStateCompatCustomAction + 57;
            PlaybackStateCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            z2 = false;
        }
        g1Var.getClass();
        f6Var.getClass();
        this.MediaMetadataCompat = i;
        this.write = i2;
        this.IconCompatParcelizer = com.logistics.rider.glovo.R.color.neutral_00;
        this.MediaDescriptionCompat = i3;
        this.MediaSessionCompatQueueItem = i4;
        this.serializer = i5;
        this.MediaBrowserCompatMediaItem = g1Var;
        this.read = f6Var;
        this.RemoteActionCompatParcelizer = z;
        this.RatingCompat = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 57;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.write, Integer.hashCode(this.MediaMetadataCompat) * 31, 31), 31), 31), 31), 31);
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode2 = Boolean.hashCode(this.RatingCompat) + d$$ExternalSyntheticOutline0.m((this.read.hashCode() + ((iHashCode + iM) * 31)) * 31, 31, this.RemoteActionCompatParcelizer);
        int i4 = PlaybackStateCompat + 91;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 123;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat, this.write, "RingIconMarkerV3(iconDrawable=", ", backgroundColor=", ", iconColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaDescriptionCompat, ", pinPointColor=", ", pinStringColor=", sbM);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.MediaSessionCompatQueueItem, this.serializer, ", badgeCount=", ", pinShape=", sbM);
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", iconAnchor=");
        sbM.append(this.read);
        sbM.append(", highlighted=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sbM, this.RemoteActionCompatParcelizer, ", small=", this.RatingCompat, ")");
        int i4 = PlaybackStateCompatCustomAction + 111;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 61;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i4;
        if (i3 % 2 == 0) {
            int i5 = 72 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof g2) {
            g2 g2Var = (g2) obj;
            if (this.MediaMetadataCompat == g2Var.MediaMetadataCompat) {
                if (this.write != g2Var.write) {
                    int i6 = i2 + 73;
                    PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else if (this.IconCompatParcelizer == g2Var.IconCompatParcelizer && this.MediaDescriptionCompat == g2Var.MediaDescriptionCompat && this.MediaSessionCompatQueueItem == g2Var.MediaSessionCompatQueueItem) {
                    if (this.serializer != g2Var.serializer) {
                        int i8 = i4 + 39;
                        PlaybackStateCompatCustomAction = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    } else if (this.MediaBrowserCompatMediaItem == g2Var.MediaBrowserCompatMediaItem) {
                        Object[] objArr = {this.read, g2Var.read};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == g2Var.RemoteActionCompatParcelizer && this.RatingCompat == g2Var.RatingCompat) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
