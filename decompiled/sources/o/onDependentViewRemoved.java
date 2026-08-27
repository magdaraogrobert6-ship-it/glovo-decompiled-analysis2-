package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.face.verification.api.selfie.CameraImage;

/* JADX INFO: loaded from: classes3.dex */
public final class onDependentViewRemoved {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final CameraImage IconCompatParcelizer;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final boolean serializer;
    public final boolean write;

    public onDependentViewRemoved(CameraImage cameraImage, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        this.IconCompatParcelizer = cameraImage;
        this.MediaMetadataCompat = z;
        this.RemoteActionCompatParcelizer = z2;
        this.write = z3;
        this.read = i;
        this.MediaSessionCompatQueueItem = z4;
        this.serializer = z5;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 55;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.serializer) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.MediaMetadataCompat), 31, this.RemoteActionCompatParcelizer), 31, this.write), 31), 31, this.MediaSessionCompatQueueItem);
        int i4 = MediaDescriptionCompat + 39;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public static onDependentViewRemoved write(onDependentViewRemoved ondependentviewremoved, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2) {
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        int i4 = 2 % 2;
        CameraImage cameraImage = ondependentviewremoved.IconCompatParcelizer;
        boolean z8 = (i2 & 2) != 0 ? ondependentviewremoved.MediaMetadataCompat : z;
        boolean z9 = (i2 & 4) != 0 ? ondependentviewremoved.RemoteActionCompatParcelizer : z2;
        if ((i2 & 8) != 0) {
            int i5 = RatingCompat + 27;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                z7 = ondependentviewremoved.write;
                int i6 = 21 / 0;
            } else {
                z7 = ondependentviewremoved.write;
            }
            z5 = z7;
        } else {
            z5 = z3;
        }
        if ((i2 & 16) != 0) {
            int i7 = MediaDescriptionCompat + 5;
            RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i3 = ondependentviewremoved.read;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            int i9 = RatingCompat + 5;
            MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z6 = ondependentviewremoved.MediaSessionCompatQueueItem;
        } else {
            z6 = z4;
        }
        boolean z10 = ondependentviewremoved.serializer;
        ondependentviewremoved.getClass();
        return new onDependentViewRemoved(cameraImage, z8, z9, z5, i3, z6, z10);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = MediaDescriptionCompat + 85;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return true;
            }
            int i4 = 4 % 4;
            return true;
        }
        if (!(obj instanceof onDependentViewRemoved)) {
            return false;
        }
        onDependentViewRemoved ondependentviewremoved = (onDependentViewRemoved) obj;
        if (!this.IconCompatParcelizer.equals(ondependentviewremoved.IconCompatParcelizer) || this.MediaMetadataCompat != ondependentviewremoved.MediaMetadataCompat || this.RemoteActionCompatParcelizer != ondependentviewremoved.RemoteActionCompatParcelizer) {
            return false;
        }
        if (this.write == ondependentviewremoved.write) {
            if (this.read == ondependentviewremoved.read) {
                return this.MediaSessionCompatQueueItem == ondependentviewremoved.MediaSessionCompatQueueItem && this.serializer == ondependentviewremoved.serializer;
            }
            i = RatingCompat + 47;
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = MediaDescriptionCompat + 39;
            RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i5 = i % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SelfieCameraViewState(cameraImage=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", showLoading=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", selfieSubmittingBlocked=");
        af$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", showFaceDetectionError=", this.write, ", imageIdentifier=");
        sb.append(this.read);
        sb.append(", shutterButtonEnabled=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", isSelfieConsentEnabled=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ")");
        int i2 = MediaDescriptionCompat + 91;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }
}
