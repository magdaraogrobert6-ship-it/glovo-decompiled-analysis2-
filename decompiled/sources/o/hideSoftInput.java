package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class hideSoftInput {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final boolean IconCompatParcelizer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaBrowserCompatMediaItem;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final InputState_androidKt read;
    public final String serializer;
    public final String write;

    public hideSoftInput(String str, String str2, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, InputState_androidKt inputState_androidKt, String str3, String str4, String str5, boolean z) {
        str.getClass();
        str2.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        str3.getClass();
        this.MediaSessionCompatQueueItem = str;
        this.write = str2;
        this.MediaBrowserCompatMediaItem = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.read = inputState_androidKt;
        this.serializer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.RatingCompat = str5;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 15;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem.hashCode() * 31, 31, this.write);
        int iHashCode2 = this.MediaBrowserCompatMediaItem.hashCode();
        InputState_androidKt inputState_androidKt = this.read;
        int iHashCode3 = 0;
        if (inputState_androidKt == null) {
            int i4 = MediaDescriptionCompat + 7;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = inputState_androidKt.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((iHashCode2 + iM) * 31) + iHashCode) * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer);
        String str = this.RatingCompat;
        if (str == null) {
            int i6 = MediaDescriptionCompat + 57;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode3 = str.hashCode();
        }
        return Boolean.hashCode(this.IconCompatParcelizer) + ((iM2 + iHashCode3) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ReportSheet(title=", this.MediaSessionCompatQueueItem, ", description=", this.write, ", reasons=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", blockUserOption=");
        sbM.append(this.read);
        sbM.append(", confirmLabel=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", dismissLabel=", this.RemoteActionCompatParcelizer, ", selectedReasonId=");
        sbM.append(this.RatingCompat);
        sbM.append(", blockUserChecked=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 67;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hideSoftInput)) {
            return false;
        }
        hideSoftInput hidesoftinput = (hideSoftInput) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, hidesoftinput.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, hidesoftinput.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, hidesoftinput.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, hidesoftinput.read}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, hidesoftinput.serializer}, getCieXyz.write())).booleanValue() || !this.RemoteActionCompatParcelizer.equals(hidesoftinput.RemoteActionCompatParcelizer)) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, hidesoftinput.RatingCompat}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == hidesoftinput.IconCompatParcelizer;
            }
            i = MediaMetadataCompat + 7;
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = MediaDescriptionCompat + 63;
            MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i3 = i % 2;
        return false;
    }
}
