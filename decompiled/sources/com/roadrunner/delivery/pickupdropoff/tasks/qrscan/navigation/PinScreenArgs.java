package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import o.access700;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PinScreenArgs implements Parcelable {
    public static final Parcelable.Creator<PinScreenArgs> CREATOR = new access700(3);
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        boolean z = this.IconCompatParcelizer;
        int i5 = i3 + 49;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = RatingCompat + 63;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public PinScreenArgs(long j, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.read = j;
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 85;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeLong(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        int i5 = MediaMetadataCompat + 53;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 75;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) * 31, 31, this.write), 31, this.RemoteActionCompatParcelizer);
        int i4 = MediaMetadataCompat + 57;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("PinScreenArgs(deliveryId=", ", deliveryState=", this.read, this.write);
        sb.append(", taskId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isNestedInScanner=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i4 = MediaMetadataCompat + 33;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PinScreenArgs) {
            PinScreenArgs pinScreenArgs = (PinScreenArgs) obj;
            if (this.read != pinScreenArgs.read) {
                int i2 = MediaBrowserCompatMediaItem + 61;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            Object[] objArr = {this.write, pinScreenArgs.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.RemoteActionCompatParcelizer, pinScreenArgs.RemoteActionCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.IconCompatParcelizer == pinScreenArgs.IconCompatParcelizer) {
                    return true;
                }
                int i4 = MediaMetadataCompat + 99;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = MediaBrowserCompatMediaItem + 13;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i7 = MediaMetadataCompat + 17;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
