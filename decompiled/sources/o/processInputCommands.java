package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class processInputCommands implements accessgetBaseInputConnection {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final int IconCompatParcelizer;
    public final String RatingCompat;
    public final setOnRequestDisallowInterceptTouchEventui RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final InAppCameraOverlay.Tags write;

    public processInputCommands(int i, String str, String str2, String str3, InAppCameraOverlay.Tags tags, setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui) {
        this.IconCompatParcelizer = i;
        this.RatingCompat = str;
        this.serializer = str2;
        this.read = str3;
        this.write = tags;
        this.RemoteActionCompatParcelizer = setonrequestdisallowintercepttoucheventui;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 23;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.IconCompatParcelizer) * 31, 31, this.RatingCompat), 31, this.serializer), 31, this.read);
        int iHashCode2 = this.write.hashCode();
        setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = this.RemoteActionCompatParcelizer;
        if (setonrequestdisallowintercepttoucheventui == null) {
            int i4 = MediaBrowserCompatMediaItem + 79;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = setonrequestdisallowintercepttoucheventui.hashCode();
        }
        return ((iHashCode2 + iM) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Loading(maxImages=", this.IconCompatParcelizer, ", title=", this.RatingCompat, ", imagesLabel=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", submitButtonText=", this.read, ", cameraOverlay=");
        sbM.append(this.write);
        sbM.append(", subjectInfo=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 59;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof processInputCommands)) {
                return false;
            }
            processInputCommands processinputcommands = (processInputCommands) obj;
            if (this.IconCompatParcelizer != processinputcommands.IconCompatParcelizer || !this.RatingCompat.equals(processinputcommands.RatingCompat) || !this.serializer.equals(processinputcommands.serializer) || !this.read.equals(processinputcommands.read) || !this.write.equals(processinputcommands.write)) {
                return false;
            }
            Object[] objArr = {this.RemoteActionCompatParcelizer, processinputcommands.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        int i4 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
