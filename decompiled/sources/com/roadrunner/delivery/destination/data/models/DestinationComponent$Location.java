package com.roadrunner.delivery.destination.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DestinationComponent$Location implements Parcelable {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String caption;
    public final double latitude;
    public final double longitude;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DestinationComponent$Location> CREATOR = new SearchResult.Creator(7);

    public static final class Companion {
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 55;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            DestinationComponent$Location$$serializer destinationComponent$Location$$serializer = DestinationComponent$Location$$serializer.read;
            int i4 = write + 53;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return destinationComponent$Location$$serializer;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    static {
        int i = serializer + 45;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ DestinationComponent$Location(double d, double d2, int i, String str) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
            if ((i & 4) == 0) {
                this.caption = null;
                int i2 = IconCompatParcelizer + 1;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.caption = str;
            int i3 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, DestinationComponent$Location$$serializer.read.getDescriptor());
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            parcel.getClass();
            parcel.writeDouble(this.latitude);
            parcel.writeDouble(this.longitude);
            parcel.writeString(this.caption);
            throw null;
        }
        parcel.getClass();
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeString(this.caption);
        int i4 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1 r2
  0x0038: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r2v8 java.lang.String) = (r2v2 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iRemoteActionCompatParcelizer;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) % 123, 101);
            str = this.caption;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
            str = this.caption;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        int i3 = iRemoteActionCompatParcelizer + iHashCode;
        int i4 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return i3;
    }

    public DestinationComponent$Location(String str, double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
        this.caption = str;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.latitude, "Location(latitude=", ", longitude=");
        sbM.append(this.longitude);
        sbM.append(", caption=");
        sbM.append(this.caption);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof DestinationComponent$Location) {
            DestinationComponent$Location destinationComponent$Location = (DestinationComponent$Location) obj;
            if (Double.compare(this.latitude, destinationComponent$Location.latitude) == 0) {
                if (Double.compare(this.longitude, destinationComponent$Location.longitude) != 0) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.caption, destinationComponent$Location.caption}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer + 67;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
