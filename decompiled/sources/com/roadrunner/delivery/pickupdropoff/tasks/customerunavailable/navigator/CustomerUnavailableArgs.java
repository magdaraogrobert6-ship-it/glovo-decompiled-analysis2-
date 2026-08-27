package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableArgs implements Parcelable {
    public static final Parcelable.Creator<CustomerUnavailableArgs> CREATOR = new SearchResult.Creator(27);
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    private static int read = 1;
    public final String RemoteActionCompatParcelizer;
    public final long serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public CustomerUnavailableArgs(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.serializer = j;
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    static {
        int i = read + 23;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 69;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            parcel.getClass();
            parcel.writeLong(this.serializer);
            parcel.writeString(this.write);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            int i4 = 41 / 0;
        } else {
            parcel.getClass();
            parcel.writeLong(this.serializer);
            parcel.writeString(this.write);
            parcel.writeString(this.RemoteActionCompatParcelizer);
        }
        int i5 = MediaBrowserCompatMediaItem + 101;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 27;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.serializer) * 31, 31, this.write);
        int i4 = MediaMetadataCompat + 93;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 93;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("CustomerUnavailableArgs(deliveryId=", ", deliveryState=", this.serializer, this.write), ", taskId=", this.RemoteActionCompatParcelizer, ")");
        int i4 = MediaBrowserCompatMediaItem + 53;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerUnavailableArgs) {
            CustomerUnavailableArgs customerUnavailableArgs = (CustomerUnavailableArgs) obj;
            if (this.serializer == customerUnavailableArgs.serializer) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, customerUnavailableArgs.write}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, customerUnavailableArgs.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = MediaBrowserCompatMediaItem + 111;
                    MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                int i3 = MediaMetadataCompat + 21;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = MediaBrowserCompatMediaItem + 53;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = MediaMetadataCompat + 87;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
