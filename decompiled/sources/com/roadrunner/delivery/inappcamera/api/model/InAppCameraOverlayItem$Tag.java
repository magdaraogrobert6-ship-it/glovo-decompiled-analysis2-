package com.roadrunner.delivery.inappcamera.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import java.util.List;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraOverlayItem$Tag implements Parcelable {
    public static final Parcelable.Creator<InAppCameraOverlayItem$Tag> CREATOR = new SearchResult.Creator(13);
    private static int IconCompatParcelizer = 1;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    private static int read;
    public final String serializer;
    public final List write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public InAppCameraOverlayItem$Tag(String str, List list) {
        this.serializer = str;
        this.write = list;
    }

    static {
        int i = IconCompatParcelizer + 21;
        read = i % Fields.SpotShadowColor;
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
        int i3 = RemoteActionCompatParcelizer + 79;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.serializer);
        parcel.writeStringList(this.write);
        int i5 = MediaSessionCompatQueueItem + 99;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("Tag(title=", this.serializer, ", tags=", this.write, ")");
        int i4 = RemoteActionCompatParcelizer + 85;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.serializer;
        if (str == null) {
            int i2 = MediaSessionCompatQueueItem + 119;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List list = this.write;
        int iHashCode2 = (iHashCode * 31) + (list != null ? list.hashCode() : 0);
        int i4 = MediaSessionCompatQueueItem + 19;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 115;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 1;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof InAppCameraOverlayItem$Tag)) {
            return false;
        }
        InAppCameraOverlayItem$Tag inAppCameraOverlayItem$Tag = (InAppCameraOverlayItem$Tag) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, inAppCameraOverlayItem$Tag.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, inAppCameraOverlayItem$Tag.write}, getCieXyz.write())).booleanValue();
    }
}
