package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import o.access700;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class QrScanTaskArgs implements Parcelable {
    public static final Parcelable.Creator<QrScanTaskArgs> CREATOR = new access700(4);
    private static int IconCompatParcelizer = 1;
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final long write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 15;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    static {
        int i = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public QrScanTaskArgs(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.write = j;
        this.read = str;
        this.serializer = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 75;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeLong(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.serializer);
        int i5 = MediaMetadataCompat + 75;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 101;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) * 31, 31, this.read);
        int i4 = MediaDescriptionCompat + 75;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("QrScanTaskArgs(deliveryId=", ", deliveryState=", this.write, this.read), ", taskId=", this.serializer, ")");
        int i4 = MediaDescriptionCompat + 99;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 103;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaMetadataCompat = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 9;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof QrScanTaskArgs)) {
            int i8 = i2 + 77;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        QrScanTaskArgs qrScanTaskArgs = (QrScanTaskArgs) obj;
        if (this.write != qrScanTaskArgs.write) {
            int i10 = i4 + 55;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        Object[] objArr = {this.read, qrScanTaskArgs.read};
        Object obj2 = null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i12 = MediaDescriptionCompat + 49;
            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                return false;
            }
            throw null;
        }
        Object[] objArr2 = {this.serializer, qrScanTaskArgs.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i13 = MediaDescriptionCompat + 55;
        MediaMetadataCompat = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
