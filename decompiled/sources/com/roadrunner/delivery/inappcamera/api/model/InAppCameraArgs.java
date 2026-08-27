package com.roadrunner.delivery.inappcamera.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraArgs implements Parcelable {
    public static final Parcelable.Creator<InAppCameraArgs> CREATOR = new SearchResult.Creator(12);
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat = 1;
    public final InAppCameraOverlay RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 75;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public InAppCameraArgs(String str, InAppCameraOverlay inAppCameraOverlay, boolean z, boolean z2) {
        str.getClass();
        inAppCameraOverlay.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = inAppCameraOverlay;
        this.read = z;
        this.write = z2;
    }

    static {
        int i = IconCompatParcelizer + 43;
        MediaMetadataCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 39 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            parcel.getClass();
            parcel.writeString(this.serializer);
            parcel.writeParcelable(this.RemoteActionCompatParcelizer, i);
            parcel.writeInt(this.read ? 1 : 0);
            parcel.writeInt(this.write ? 1 : 0);
            int i4 = 33 / 0;
        } else {
            parcel.getClass();
            parcel.writeString(this.serializer);
            parcel.writeParcelable(this.RemoteActionCompatParcelizer, i);
            parcel.writeInt(this.read ? 1 : 0);
            parcel.writeInt(this.write ? 1 : 0);
        }
        int i5 = RatingCompat + 35;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.write) + d$$ExternalSyntheticOutline0.m((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31, 31, this.read);
        int i4 = MediaBrowserCompatMediaItem + 103;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("InAppCameraArgs(outputFilePath=");
        sb.append(this.serializer);
        sb.append(", overlay=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", enablePinchZoom=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sb, this.read, ", enableZoomControl=", this.write, ")");
        int i2 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strSerializer;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppCameraArgs)) {
            return false;
        }
        InAppCameraArgs inAppCameraArgs = (InAppCameraArgs) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, inAppCameraArgs.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, inAppCameraArgs.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.read == inAppCameraArgs.read) {
            return this.write == inAppCameraArgs.write;
        }
        int i3 = MediaBrowserCompatMediaItem + 115;
        int i4 = i3 % Fields.SpotShadowColor;
        RatingCompat = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 29;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
