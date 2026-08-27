package com.roadrunner.delivery.destination.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Location implements Parcelable {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final double latitude;
    public final double longitude;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Location> CREATOR = new SearchResult.Creator(9);

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 45;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Location$$serializer location$$serializer = Location$$serializer.write;
            int i4 = serializer + 99;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return location$$serializer;
            }
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    static {
        int i = read + 47;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ Location(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Location$$serializer.write.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 73;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        int i5 = write + 123;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        int i4 = RemoteActionCompatParcelizer + 109;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
            return ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "Location(latitude=", ", longitude="));
        }
        return ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "Location(latitude=", ", longitude="));
    }

    public Location(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Location) {
            Location location = (Location) obj;
            if (Double.compare(this.latitude, location.latitude) != 0) {
                return false;
            }
            if (Double.compare(this.longitude, location.longitude) == 0) {
                return true;
            }
            int i2 = write + 105;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
