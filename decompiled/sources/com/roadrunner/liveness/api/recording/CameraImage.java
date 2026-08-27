package com.roadrunner.liveness.api.recording;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraImage implements Parcelable {
    public static final Parcelable.Creator<CameraImage> CREATOR = new access700(10);
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final Uri serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 85;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CameraImage(String str, Uri uri, String str2, boolean z) {
        str.getClass();
        uri.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.serializer = uri;
        this.read = str2;
        this.IconCompatParcelizer = z;
    }

    static {
        int i = write + 91;
        MediaDescriptionCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 29;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            parcel.getClass();
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeParcelable(this.serializer, i);
            parcel.writeString(this.read);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
            int i4 = 31 / 0;
        } else {
            parcel.getClass();
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeParcelable(this.serializer, i);
            parcel.writeString(this.read);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        }
        int i5 = MediaSessionCompatQueueItem + 77;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 21;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + (iHashCode * 31)) * 31, 31, this.read);
        int i4 = MediaSessionCompatQueueItem + 45;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CameraImage(imageName=" + this.RemoteActionCompatParcelizer + ", contentUri=" + this.serializer + ", absolutePath=" + this.read + ", isImageSaved=" + this.IconCompatParcelizer + ")";
        int i2 = MediaMetadataCompat + 13;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 89;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraImage)) {
            int i4 = i3 + 29;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        CameraImage cameraImage = (CameraImage) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, cameraImage.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, cameraImage.serializer}, getCieXyz.write())).booleanValue()) {
            int i5 = MediaMetadataCompat + 1;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, cameraImage.read}, getCieXyz.write())).booleanValue()) {
            int i7 = MediaSessionCompatQueueItem + 93;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        if (this.IconCompatParcelizer == cameraImage.IconCompatParcelizer) {
            return true;
        }
        int i8 = MediaSessionCompatQueueItem + 79;
        MediaMetadataCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
