package com.roadrunner.vendor.review.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import o.access700;
import o.subscribeToPushNotificationEventslambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class VendorReviewArgs implements Parcelable {
    public static final Parcelable.Creator<VendorReviewArgs> CREATOR = new access700(14);
    private static int IconCompatParcelizer = 1;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    private static int read;
    public final int RemoteActionCompatParcelizer;
    public final long serializer;
    public final subscribeToPushNotificationEventslambda0 write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 33;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 47;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return i4;
    }

    public VendorReviewArgs(subscribeToPushNotificationEventslambda0 subscribetopushnotificationeventslambda0, long j, int i) {
        subscribetopushnotificationeventslambda0.getClass();
        this.write = subscribetopushnotificationeventslambda0;
        this.serializer = j;
        this.RemoteActionCompatParcelizer = i;
    }

    static {
        int i = IconCompatParcelizer + 37;
        read = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 97;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer) + d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.serializer);
        int i4 = MediaDescriptionCompat + 35;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 109;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.write.name());
        parcel.writeLong(this.serializer);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        int i5 = MediaDescriptionCompat + 117;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorReviewArgs)) {
            return false;
        }
        VendorReviewArgs vendorReviewArgs = (VendorReviewArgs) obj;
        if (this.write != vendorReviewArgs.write) {
            int i2 = MediaDescriptionCompat + 113;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (this.serializer != vendorReviewArgs.serializer) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == vendorReviewArgs.RemoteActionCompatParcelizer) {
            return true;
        }
        int i4 = MediaDescriptionCompat + 125;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReviewArgs(sourceScreen=" + this.write + ", deliveryId=" + this.serializer + ", score=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = MediaDescriptionCompat + 71;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
