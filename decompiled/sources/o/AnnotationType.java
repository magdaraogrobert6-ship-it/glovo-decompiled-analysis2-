package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationType {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final long IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;
    public final boolean write;

    public AnnotationType(long j, int i, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = z;
        this.read = z2;
        this.write = z3;
        this.RatingCompat = str;
        this.MediaMetadataCompat = str2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, Long.hashCode(this.IconCompatParcelizer) * 31, 31), 31, this.serializer), 31, this.read), 31, this.write), 31, this.RatingCompat);
        String str = this.MediaMetadataCompat;
        if (str == null) {
            int i3 = MediaSessionCompatQueueItem;
            int i4 = i3 + 35;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 33;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i8 = MediaSessionCompatQueueItem + 21;
            MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotationType)) {
            return false;
        }
        AnnotationType annotationType = (AnnotationType) obj;
        if (this.IconCompatParcelizer == annotationType.IconCompatParcelizer) {
            if (this.RemoteActionCompatParcelizer != annotationType.RemoteActionCompatParcelizer || this.serializer != annotationType.serializer || this.read != annotationType.read || this.write != annotationType.write || !this.RatingCompat.equals(annotationType.RatingCompat)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, annotationType.MediaMetadataCompat}, getCieXyz.write())).booleanValue();
        }
        int i5 = i3 + 13;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("NativeCacheDeviceStats(availableDiskSpaceBytes=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", batteryLevelPercent=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isCharging=");
        sb.append(this.serializer);
        sb.append(", isPowerSaveModeEnabled=");
        sb.append(this.read);
        sb.append(", isDataSaverEnabled=");
        sb.append(this.write);
        sb.append(", networkType=");
        sb.append(this.RatingCompat);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", networkTier=", this.MediaMetadataCompat, ")");
        int i2 = MediaSessionCompatQueueItem + 59;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return strM;
    }
}
