package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setConnectionOptions extends setGdprUrl {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final t3 IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final Integer MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final Boolean write;

    public setConnectionOptions(String str, String str2, String str3, String str4, Integer num, String str5, t3 t3Var, Boolean bool) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.MediaBrowserCompatMediaItem = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.serializer = str4;
        this.MediaDescriptionCompat = num;
        this.MediaSessionCompatQueueItem = str5;
        this.IconCompatParcelizer = t3Var;
        this.write = bool;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Available(title=", this.MediaBrowserCompatMediaItem, ", subtitle=", this.read, ", area=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", formattedDescription=", this.serializer, ", zoneId=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(", zoneName=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", bonusMultiplier=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", calendarEnabled=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RatingCompat + 91;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem.hashCode() * 31, 31, this.read), 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        Integer num = this.MediaDescriptionCompat;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.MediaSessionCompatQueueItem;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        t3 t3Var = this.IconCompatParcelizer;
        int iHashCode3 = this.write.hashCode() + ((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (t3Var != null ? t3Var.hashCode() : 0)) * 31);
        int i4 = MediaMetadataCompat + 59;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 3;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof setConnectionOptions)) {
                return false;
            }
            setConnectionOptions setconnectionoptions = (setConnectionOptions) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, setconnectionoptions.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setconnectionoptions.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, setconnectionoptions.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!this.serializer.equals(setconnectionoptions.serializer)) {
                int i3 = MediaMetadataCompat + 109;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, setconnectionoptions.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, setconnectionoptions.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setconnectionoptions.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || (!this.write.equals(setconnectionoptions.write))) {
                return false;
            }
        }
        return true;
    }
}
