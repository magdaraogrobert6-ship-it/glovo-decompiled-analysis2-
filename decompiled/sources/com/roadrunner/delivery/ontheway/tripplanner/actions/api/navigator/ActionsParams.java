package com.roadrunner.delivery.ontheway.tripplanner.actions.api.navigator;

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
public final class ActionsParams implements Parcelable {
    public static final Parcelable.Creator<ActionsParams> CREATOR = new SearchResult.Creator(15);
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final long read;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 69;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    public ActionsParams(long j, String str, String str2) {
        str.getClass();
        this.read = j;
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    static {
        int i = RemoteActionCompatParcelizer + 109;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 63;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            parcel.getClass();
            parcel.writeLong(this.read);
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer);
            return;
        }
        parcel.getClass();
        parcel.writeLong(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 9;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("ActionsParams(deliveryId=", ", contactName=", this.read, this.write), ", orderInfo=", this.IconCompatParcelizer, ")");
        int i4 = MediaDescriptionCompat + 57;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) * 31, 31, this.write);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i2 = MediaDescriptionCompat + 91;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = iM + iHashCode;
        int i5 = MediaDescriptionCompat + 113;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 77;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionsParams)) {
            return false;
        }
        ActionsParams actionsParams = (ActionsParams) obj;
        if (this.read != actionsParams.read) {
            int i4 = i3 + 83;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, actionsParams.write}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, actionsParams.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i6 = MediaSessionCompatQueueItem + 111;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
