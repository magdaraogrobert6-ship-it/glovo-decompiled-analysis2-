package com.roadrunner.custom.password.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import o.getCieXyz;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomPasswordLaunchData implements Parcelable {
    public static final Parcelable.Creator<CustomPasswordLaunchData> CREATOR = new SearchResult.Creator(5);
    private static int IconCompatParcelizer = 1;
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    private static int write;
    public final insertOrUpdateTransformedNodeSubhierarchy RemoteActionCompatParcelizer;
    public final String read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 125;
        serializer = i2 % Fields.SpotShadowColor;
        return i2 % 2 != 0 ? 1 : 0;
    }

    static {
        int i = IconCompatParcelizer + 1;
        write = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public CustomPasswordLaunchData(String str, insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy) {
        insertorupdatetransformednodesubhierarchy.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = insertorupdatetransformednodesubhierarchy;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 69;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            parcel.getClass();
            parcel.writeString(this.read);
            parcel.writeString(this.RemoteActionCompatParcelizer.name());
            throw null;
        }
        parcel.getClass();
        parcel.writeString(this.read);
        parcel.writeString(this.RemoteActionCompatParcelizer.name());
        int i4 = serializer + 115;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.read;
        if (str == null) {
            int i5 = i3 + 119;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 67;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 125;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof CustomPasswordLaunchData)) {
            return false;
        }
        CustomPasswordLaunchData customPasswordLaunchData = (CustomPasswordLaunchData) obj;
        Object[] objArr = {this.read, customPasswordLaunchData.read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            if (this.RemoteActionCompatParcelizer != customPasswordLaunchData.RemoteActionCompatParcelizer) {
                return false;
            }
            int i7 = MediaMetadataCompat + 33;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = serializer + 37;
        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomPasswordLaunchData(password=" + this.read + ", invocationSite=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = MediaMetadataCompat + 87;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
        return str;
    }
}
