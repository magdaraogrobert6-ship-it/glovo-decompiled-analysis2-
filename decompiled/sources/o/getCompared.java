package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getCompared {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final boolean IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final String MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final List read;
    public final String serializer;
    public final String write;

    public getCompared(String str, String str2, boolean z, String str3, List list, String str4, List list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.serializer = str;
        this.write = str2;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = str3;
        this.read = list;
        this.MediaSessionCompatQueueItem = str4;
        this.MediaBrowserCompatMediaItem = list2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 107;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("CustomerCall(customerCallButtonTitle=", this.serializer, ", customerPhoneNumber=REDACTED, callMasked=", ", callee=", this.IconCompatParcelizer);
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.RemoteActionCompatParcelizer, ", callTrackingEvents=", this.read, ", id=");
        String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sbM, this.MediaSessionCompatQueueItem, ", requiredSteps=", this.MediaBrowserCompatMediaItem, ")");
        int i4 = MediaMetadataCompat + 19;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 31;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write), 31, this.IconCompatParcelizer);
        String str = this.RemoteActionCompatParcelizer;
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.read, (iM + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.MediaSessionCompatQueueItem;
        if (str2 == null) {
            int i4 = MediaMetadataCompat + 7;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        List list = this.MediaBrowserCompatMediaItem;
        return ((iM2 + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaMetadataCompat + 59;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getCompared)) {
            return false;
        }
        getCompared getcompared = (getCompared) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getcompared.serializer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getcompared.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.IconCompatParcelizer == getcompared.IconCompatParcelizer) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getcompared.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getcompared.read}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getcompared.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, getcompared.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i4 = MediaMetadataCompat + 53;
                        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return false;
                    }
                    int i6 = RatingCompat + 117;
                    MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                int i8 = RatingCompat + 47;
                MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = RatingCompat + 17;
            MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i10 % 2 != 0;
        }
        int i11 = MediaMetadataCompat + 29;
        RatingCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
