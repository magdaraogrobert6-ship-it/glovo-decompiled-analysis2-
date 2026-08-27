package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int PlaybackStateCompat = 1;
    public static final t4 RemoteActionCompatParcelizer = new t4(com.logistics.rider.glovo.R.color.neutral_100, com.logistics.rider.glovo.R.color.neutral_100, com.logistics.rider.glovo.R.color.neutral_80, com.logistics.rider.glovo.R.color.neutral_00, com.logistics.rider.glovo.R.color.neutral_00);
    public static final t4 read = new t4(com.logistics.rider.glovo.R.color.neutral_00, com.logistics.rider.glovo.R.color.neutral_20, com.logistics.rider.glovo.R.color.neutral_50, com.logistics.rider.glovo.R.color.neutral_100, com.logistics.rider.glovo.R.color.neutral_100);
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int RatingCompat;
    public final int serializer;
    public final int write;

    public t4(int i, int i2, int i3, int i4, int i5) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
        this.write = i3;
        this.RatingCompat = i4;
        this.MediaBrowserCompatMediaItem = i5;
    }

    static {
        int i = MediaDescriptionCompat + 75;
        MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 33;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.serializer, "PillColors(backgroundColor=", ", borderColor=", ", badgeBackgroundColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.write, this.RatingCompat, ", iconColor=", ", textColor=", sbM);
        String strM = af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, ")", sbM);
        int i4 = PlaybackStateCompat + 57;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 77;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.MediaBrowserCompatMediaItem) + af$$ExternalSyntheticOutline0.m(this.RatingCompat, af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.serializer, Integer.hashCode(this.IconCompatParcelizer) * 31, 31), 31), 31);
        int i4 = PlaybackStateCompat + 1;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        if (i2 % 2 != 0) {
            int i4 = 99 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            if (this.IconCompatParcelizer == t4Var.IconCompatParcelizer && this.serializer == t4Var.serializer) {
                if (this.write != t4Var.write) {
                    int i5 = i3 + 121;
                    PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                } else if (this.RatingCompat == t4Var.RatingCompat && this.MediaBrowserCompatMediaItem == t4Var.MediaBrowserCompatMediaItem) {
                    return true;
                }
            }
        }
        return false;
    }
}
