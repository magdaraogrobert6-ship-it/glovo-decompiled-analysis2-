package com.roadrunner.delivery.inappcamera.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraOverlayState implements Parcelable {
    public static final Parcelable.Creator<InAppCameraOverlayState> CREATOR = new SearchResult.Creator(14);
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final ArrayList RemoteActionCompatParcelizer;
    public final ArrayList read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public InAppCameraOverlayState(ArrayList arrayList, ArrayList arrayList2) {
        this.RemoteActionCompatParcelizer = arrayList;
        this.read = arrayList2;
    }

    static {
        int i = write + 75;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 63;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "InAppCameraOverlayState(instructions=" + this.RemoteActionCompatParcelizer + ", tags=" + this.read + ")";
        int i2 = MediaDescriptionCompat + 3;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 35;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            if (!(obj instanceof InAppCameraOverlayState)) {
                return false;
            }
            InAppCameraOverlayState inAppCameraOverlayState = (InAppCameraOverlayState) obj;
            if (!this.RemoteActionCompatParcelizer.equals(inAppCameraOverlayState.RemoteActionCompatParcelizer) || (!this.read.equals(inAppCameraOverlayState.read))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        parcel.getClass();
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        int i3 = IconCompatParcelizer + 109;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 4 % 5;
        }
        while (it.hasNext()) {
            int i5 = IconCompatParcelizer + 43;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            ((InAppCameraOverlayItem$Instruction) it.next()).writeToParcel(parcel, i);
        }
        ArrayList arrayList2 = this.read;
        parcel.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int i7 = MediaDescriptionCompat + 41;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ((InAppCameraOverlayItem$Tag) it2.next()).writeToParcel(parcel, i);
        }
    }
}
