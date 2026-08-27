package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class getBaseInputConnection implements accessgetBaseInputConnection {
    private static int MediaDescriptionCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    public final int IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final setOnRequestDisallowInterceptTouchEventui RatingCompat;
    public final generatePOSTBodyString RemoteActionCompatParcelizer;
    public final InAppCameraOverlay.Tags read;
    public final String serializer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public getBaseInputConnection(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, int i, String str, String str2, String str3, InAppCameraOverlay.Tags tags, generatePOSTBodyString generatepostbodystring, boolean z, setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = i;
        this.MediaMetadataCompat = str;
        this.serializer = str2;
        this.MediaSessionCompatQueueItem = str3;
        this.read = tags;
        this.RemoteActionCompatParcelizer = generatepostbodystring;
        this.MediaBrowserCompatMediaItem = z;
        this.RatingCompat = setonrequestdisallowintercepttoucheventui;
    }

    public static getBaseInputConnection serializer(getBaseInputConnection getbaseinputconnection, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ParcelableVolumeInfo + 89;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = getbaseinputconnection.write;
            } else {
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = getbaseinputconnection.write;
                throw null;
            }
        }
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        int i4 = getbaseinputconnection.IconCompatParcelizer;
        String str = getbaseinputconnection.MediaMetadataCompat;
        String str2 = getbaseinputconnection.serializer;
        String str3 = getbaseinputconnection.MediaSessionCompatQueueItem;
        InAppCameraOverlay.Tags tags = getbaseinputconnection.read;
        generatePOSTBodyString generatepostbodystring = getbaseinputconnection.RemoteActionCompatParcelizer;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i5 = ParcelableVolumeInfo + 3;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = getbaseinputconnection.MediaBrowserCompatMediaItem;
        }
        setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = getbaseinputconnection.RatingCompat;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3.getClass();
        return new getBaseInputConnection(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3, i4, str, str2, str3, tags, generatepostbodystring, z, setonrequestdisallowintercepttoucheventui);
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 9;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.write.hashCode() * 31, 31), 31, this.MediaMetadataCompat), 31, this.serializer), 31, this.MediaSessionCompatQueueItem);
        int iM2 = d$$ExternalSyntheticOutline0.m((this.RemoteActionCompatParcelizer.hashCode() + ((this.read.hashCode() + iM) * 31)) * 31, 31, this.MediaBrowserCompatMediaItem);
        setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = this.RatingCompat;
        if (setonrequestdisallowintercepttoucheventui == null) {
            int i4 = MediaDescriptionCompat + 119;
            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = setonrequestdisallowintercepttoucheventui.hashCode();
        }
        return iM2 + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ShowImages(capturedImages=");
        sb.append(this.write);
        sb.append(", maxImages=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", title=");
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaMetadataCompat, ", imagesLabel=", this.serializer, ", submitButtonText=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", cameraOverlay=");
        sb.append(this.read);
        sb.append(", cancelDialogEntity=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", showCancelDialog=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", subjectInfo=");
        sb.append(this.RatingCompat);
        sb.append(")");
        String string = sb.toString();
        int i2 = ParcelableVolumeInfo + 13;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getBaseInputConnection) {
                getBaseInputConnection getbaseinputconnection = (getBaseInputConnection) obj;
                Object[] objArr = {this.write, getbaseinputconnection.write};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != getbaseinputconnection.IconCompatParcelizer) {
                    return false;
                }
                if (this.MediaMetadataCompat.equals(getbaseinputconnection.MediaMetadataCompat)) {
                    if (!this.serializer.equals(getbaseinputconnection.serializer) || !this.MediaSessionCompatQueueItem.equals(getbaseinputconnection.MediaSessionCompatQueueItem) || !this.read.equals(getbaseinputconnection.read) || !this.RemoteActionCompatParcelizer.equals(getbaseinputconnection.RemoteActionCompatParcelizer) || this.MediaBrowserCompatMediaItem != getbaseinputconnection.MediaBrowserCompatMediaItem) {
                        return false;
                    }
                    Object[] objArr2 = {this.RatingCompat, getbaseinputconnection.RatingCompat};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                } else {
                    int i2 = ParcelableVolumeInfo + 85;
                    MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return false;
                    }
                    int i3 = 5 % 4;
                    return false;
                }
            } else {
                int i4 = MediaDescriptionCompat + 123;
                ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
