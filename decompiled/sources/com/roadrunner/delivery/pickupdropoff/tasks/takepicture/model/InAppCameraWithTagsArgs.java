package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model;

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
public final class InAppCameraWithTagsArgs implements Parcelable {
    public static final Parcelable.Creator<InAppCameraWithTagsArgs> CREATOR = new access700(5);
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat = 0;
    private static int serializer = 1;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 93;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 27;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = serializer + 67;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public InAppCameraWithTagsArgs(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = j;
        this.write = str;
        this.read = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 71;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        int i5 = MediaSessionCompatQueueItem + 13;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return af$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.write) + this.read.hashCode();
        }
        return this.read.hashCode() << af$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) - 106, 17, this.write);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 121;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("InAppCameraWithTagsArgs(deliveryId=", ", deliveryState=", this.RemoteActionCompatParcelizer, this.write), ", taskId=", this.read, ")");
        int i4 = RatingCompat + 103;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RatingCompat + 105;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof InAppCameraWithTagsArgs)) {
            return false;
        }
        InAppCameraWithTagsArgs inAppCameraWithTagsArgs = (InAppCameraWithTagsArgs) obj;
        if (this.RemoteActionCompatParcelizer != inAppCameraWithTagsArgs.RemoteActionCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, inAppCameraWithTagsArgs.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, inAppCameraWithTagsArgs.read}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i3 = RatingCompat + 93;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        return i3 % 2 == 0;
    }
}
