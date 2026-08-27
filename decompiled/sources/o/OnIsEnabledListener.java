package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnIsEnabledListener {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final long MediaSessionCompatQueueItem;
    public final isTrackingEnabled RatingCompat;
    public final GooglePlayInstallReferrerDetails RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final String write;

    public OnIsEnabledListener(long j, isTrackingEnabled istrackingenabled, String str, String str2, GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails, String str3, String str4, long j2) {
        istrackingenabled.getClass();
        str.getClass();
        this.serializer = j;
        this.RatingCompat = istrackingenabled;
        this.MediaDescriptionCompat = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = googlePlayInstallReferrerDetails;
        this.write = str3;
        this.read = str4;
        this.MediaSessionCompatQueueItem = j2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("StatusEntity(id=");
        sb.append(this.serializer);
        sb.append(", statusType=");
        sb.append(this.RatingCompat);
        c8$$ExternalSyntheticOutline0.m(sb, ", statusText=", this.MediaDescriptionCompat, ", description=", this.IconCompatParcelizer);
        sb.append(", actionType=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", actionText=");
        sb.append(this.write);
        af$$ExternalSyntheticOutline0.m(sb, ", actionUrl=", this.read, ", timestamp=");
        String strM = c8$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, ")", sb);
        int i2 = MediaBrowserCompatMediaItem + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m((this.RatingCompat.hashCode() + (Long.hashCode(this.serializer) * 31)) * 31, 31, this.MediaDescriptionCompat);
        String str = this.IconCompatParcelizer;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails = this.RemoteActionCompatParcelizer;
        if (googlePlayInstallReferrerDetails == null) {
            int i2 = MediaBrowserCompatMediaItem + 101;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = googlePlayInstallReferrerDetails.hashCode();
        }
        String str2 = this.write;
        if (str2 == null) {
            int i4 = MediaBrowserCompatMediaItem + 95;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.read;
        return Long.hashCode(this.MediaSessionCompatQueueItem) + ((((((((iM + iHashCode3) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 5;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 1;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof OnIsEnabledListener)) {
            return false;
        }
        OnIsEnabledListener onIsEnabledListener = (OnIsEnabledListener) obj;
        if (this.serializer != onIsEnabledListener.serializer) {
            int i7 = i2 + 103;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (this.RatingCompat != onIsEnabledListener.RatingCompat) {
            return false;
        }
        Object[] objArr = {this.MediaDescriptionCompat, onIsEnabledListener.MediaDescriptionCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.IconCompatParcelizer, onIsEnabledListener.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != onIsEnabledListener.RemoteActionCompatParcelizer) {
            return false;
        }
        Object[] objArr3 = {this.write, onIsEnabledListener.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.read, onIsEnabledListener.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i9 = MediaMetadataCompat + 65;
            MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (this.MediaSessionCompatQueueItem == onIsEnabledListener.MediaSessionCompatQueueItem) {
            return true;
        }
        int i11 = MediaBrowserCompatMediaItem;
        int i12 = i11 + 21;
        MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        int i14 = i11 + 45;
        MediaMetadataCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return false;
    }
}
