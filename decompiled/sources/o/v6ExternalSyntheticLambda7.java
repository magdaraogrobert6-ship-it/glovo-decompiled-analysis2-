package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class v6ExternalSyntheticLambda7 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final long MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public v6ExternalSyntheticLambda7(String str, long j, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, String str2, String str3, String str4) {
        str.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.read = str;
        this.MediaDescriptionCompat = j;
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaMetadataCompat = str3;
        this.IconCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HourlyBonusMultiplier(multiplierText=", this.read, ", tileColor=", androidx.compose.ui.graphics.Color.m730toStringimpl(this.MediaDescriptionCompat), ", bonusIndicators=");
        sbM.append(this.write);
        sbM.append(", highlighted=");
        sbM.append(this.serializer);
        sbM.append(", highlightText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", startTimeText=", this.MediaMetadataCompat, ", endTimeText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ")");
        int i4 = MediaSessionCompatQueueItem + 79;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m((this.write.hashCode() + MediaSessionCompatQueueItem.IconCompatParcelizer(this.read.hashCode() * 31, 31, this.MediaDescriptionCompat)) * 31, 31, this.serializer);
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = MediaBrowserCompatMediaItem + 123;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 103;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.MediaMetadataCompat);
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            int i7 = MediaBrowserCompatMediaItem + 59;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return iM2 + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 67;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6ExternalSyntheticLambda7)) {
            return false;
        }
        v6ExternalSyntheticLambda7 v6externalsyntheticlambda7 = (v6ExternalSyntheticLambda7) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, v6externalsyntheticlambda7.read}, getCieXyz.write())).booleanValue() || !androidx.compose.ui.graphics.Color.m723equalsimpl0(this.MediaDescriptionCompat, v6externalsyntheticlambda7.MediaDescriptionCompat)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, v6externalsyntheticlambda7.write}, getCieXyz.write())).booleanValue()) {
            i = MediaSessionCompatQueueItem + 27;
        } else {
            if (this.serializer != v6externalsyntheticlambda7.serializer) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, v6externalsyntheticlambda7.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!this.MediaMetadataCompat.equals(v6externalsyntheticlambda7.MediaMetadataCompat)) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, v6externalsyntheticlambda7.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            i = MediaSessionCompatQueueItem + 73;
        }
        MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i % 2;
        return false;
    }
}
