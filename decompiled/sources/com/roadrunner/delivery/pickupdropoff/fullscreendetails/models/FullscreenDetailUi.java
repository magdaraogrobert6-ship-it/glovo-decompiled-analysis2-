package com.roadrunner.delivery.pickupdropoff.fullscreendetails.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class FullscreenDetailUi implements Parcelable {
    public static final Parcelable.Creator<FullscreenDetailUi> CREATOR = new SearchResult.Creator(20);
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 37;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    public FullscreenDetailUi(String str, String str2, String str3, String str4) {
        str3.getClass();
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
    }

    static {
        int i = MediaDescriptionCompat + 17;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 89;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
            int i4 = 40 / 0;
        } else {
            parcel.getClass();
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
        }
        int i5 = MediaBrowserCompatMediaItem + 37;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 55;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("FullscreenDetailUi(bags=", this.IconCompatParcelizer, ", shelves=", this.write, ", fullscreenTitle="), this.RemoteActionCompatParcelizer, ", pickedUpTitle=", this.read, ")");
        int i4 = MediaBrowserCompatMediaItem + 7;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.IconCompatParcelizer;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = MediaBrowserCompatMediaItem + 47;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.write;
        int iM = af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.RemoteActionCompatParcelizer);
        String str3 = this.read;
        if (str3 == null) {
            int i4 = MediaBrowserCompatMediaItem + 105;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
        } else {
            iHashCode2 = str3.hashCode();
        }
        return iM + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 53;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 19;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof FullscreenDetailUi)) {
            int i7 = i4 + 117;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        FullscreenDetailUi fullscreenDetailUi = (FullscreenDetailUi) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, fullscreenDetailUi.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, fullscreenDetailUi.write}, getCieXyz.write())).booleanValue()) {
            int i8 = MediaBrowserCompatMediaItem + 7;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            return i8 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, fullscreenDetailUi.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, fullscreenDetailUi.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i9 = MediaSessionCompatQueueItem + 89;
        MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
