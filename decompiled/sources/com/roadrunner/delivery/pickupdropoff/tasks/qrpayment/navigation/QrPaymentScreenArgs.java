package com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.navigation;

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
public final class QrPaymentScreenArgs implements Parcelable {
    public static final Parcelable.Creator<QrPaymentScreenArgs> CREATOR = new access700(2);
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat = 0;
    private static int read = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final long serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    static {
        int i = read + 87;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public QrPaymentScreenArgs(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.serializer = j;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 43;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            parcel.writeLong(this.serializer);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            int i4 = 71 / 0;
        } else {
            parcel.getClass();
            parcel.writeLong(this.serializer);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.RemoteActionCompatParcelizer);
        }
        int i5 = MediaSessionCompatQueueItem + 69;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int iM;
        String str;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 25;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(Long.hashCode(this.serializer) >> 13, 101, this.IconCompatParcelizer);
            str = this.RemoteActionCompatParcelizer;
        } else {
            iM = af$$ExternalSyntheticOutline0.m(Long.hashCode(this.serializer) * 31, 31, this.IconCompatParcelizer);
            str = this.RemoteActionCompatParcelizer;
        }
        int iHashCode = str.hashCode() + iM;
        int i3 = MediaSessionCompatQueueItem + 113;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 111;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("QrPaymentScreenArgs(deliveryId=", ", deliveryState=", this.serializer, this.IconCompatParcelizer), ", taskId=", this.RemoteActionCompatParcelizer, ")");
            int i3 = 79 / 0;
        } else {
            strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("QrPaymentScreenArgs(deliveryId=", ", deliveryState=", this.serializer, this.IconCompatParcelizer), ", taskId=", this.RemoteActionCompatParcelizer, ")");
        }
        int i4 = MediaSessionCompatQueueItem + 5;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaSessionCompatQueueItem + 35;
            RatingCompat = i2 % Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof QrPaymentScreenArgs)) {
            int i3 = RatingCompat + 61;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        QrPaymentScreenArgs qrPaymentScreenArgs = (QrPaymentScreenArgs) obj;
        if (this.serializer != qrPaymentScreenArgs.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, qrPaymentScreenArgs.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, qrPaymentScreenArgs.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = MediaSessionCompatQueueItem + 3;
        RatingCompat = i5 % Fields.SpotShadowColor;
        return i5 % 2 != 0;
    }
}
