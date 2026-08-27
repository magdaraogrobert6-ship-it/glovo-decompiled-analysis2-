package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final InAppCameraOverlay.Tags read;
    public final setOnRequestDisallowInterceptTouchEventui serializer;
    public final String write;

    public r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk(int i, String str, String str2, String str3, InAppCameraOverlay.Tags tags, setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui) {
        this.RemoteActionCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.read = tags;
        this.serializer = setonrequestdisallowintercepttoucheventui;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 69;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.MediaSessionCompatQueueItem), 31, this.IconCompatParcelizer), 31, this.write);
        int iHashCode2 = this.read.hashCode();
        setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = this.serializer;
        if (setonrequestdisallowintercepttoucheventui == null) {
            int i4 = MediaDescriptionCompat + 5;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = setonrequestdisallowintercepttoucheventui.hashCode();
        }
        return ((iHashCode2 + iM) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("ContentSharingConfig(maxImages=", this.RemoteActionCompatParcelizer, ", title=", this.MediaSessionCompatQueueItem, ", imagesLabel=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", submitButtonText=", this.write, ", cameraOverlay=");
        sbM.append(this.read);
        sbM.append(", subjectInfo=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 3;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk)) {
            return false;
        }
        r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk r8lambda6tztbw4pjan6bllsogyhmp8jczk = (r8lambda6TZTbW4pjaN6BLlSoGyhMP8JCZk) obj;
        if (this.RemoteActionCompatParcelizer != r8lambda6tztbw4pjan6bllsogyhmp8jczk.RemoteActionCompatParcelizer) {
            return false;
        }
        if (this.MediaSessionCompatQueueItem.equals(r8lambda6tztbw4pjan6bllsogyhmp8jczk.MediaSessionCompatQueueItem)) {
            if (this.IconCompatParcelizer.equals(r8lambda6tztbw4pjan6bllsogyhmp8jczk.IconCompatParcelizer)) {
                if (!this.write.equals(r8lambda6tztbw4pjan6bllsogyhmp8jczk.write) || !this.read.equals(r8lambda6tztbw4pjan6bllsogyhmp8jczk.read)) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambda6tztbw4pjan6bllsogyhmp8jczk.serializer}, getCieXyz.write())).booleanValue();
            }
            int i2 = MediaMetadataCompat + 79;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            int i3 = 5 / 5;
            return false;
        }
        int i4 = MediaDescriptionCompat + 63;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
