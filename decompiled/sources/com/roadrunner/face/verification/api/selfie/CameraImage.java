package com.roadrunner.face.verification.api.selfie;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraImage implements Parcelable {
    public static final Parcelable.Creator<CameraImage> CREATOR = new access700(8);
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final Uri IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 35;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public CameraImage(String str, Uri uri, String str2) {
        str.getClass();
        uri.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = uri;
        this.read = str2;
    }

    static {
        int i = serializer + 31;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 121;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeParcelable(this.IconCompatParcelizer, i);
            parcel.writeString(this.read);
            throw null;
        }
        parcel.getClass();
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeString(this.read);
        int i4 = MediaBrowserCompatMediaItem + 47;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 69;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = this.read.hashCode() >> ((this.IconCompatParcelizer.hashCode() - (iHashCode2 / 54)) >> 54);
        } else {
            int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = this.read.hashCode() + ((this.IconCompatParcelizer.hashCode() + (iHashCode3 * 31)) * 31);
        }
        int i3 = MediaBrowserCompatMediaItem + 35;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CameraImage(imageName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", contentUri=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", absolutePath=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = RatingCompat + 17;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 75;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CameraImage)) {
            int i4 = RatingCompat + 75;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        CameraImage cameraImage = (CameraImage) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, cameraImage.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i6 = MediaBrowserCompatMediaItem + 45;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, cameraImage.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, cameraImage.read}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = MediaBrowserCompatMediaItem + 75;
        RatingCompat = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
