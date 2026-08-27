package com.sentiance.sdk.ondevice.api.venue;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.GeoLocation;
import java.util.Objects;
import o.setStyleIfSupportedlambda0;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class Venue implements Parcelable {
    public static final Parcelable.Creator<Venue> CREATOR = new setStyleIfSupportedlambda0();
    private final GeoLocation mLocation;
    private final VenueSignificance mVenueSignificance;
    private final VenueType mVenueType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GeoLocation getLocation() {
        return this.mLocation;
    }

    public VenueSignificance getSignificance() {
        return this.mVenueSignificance;
    }

    public VenueType getType() {
        return this.mVenueType;
    }

    public int hashCode() {
        int iHashCode = this.mVenueSignificance.hashCode();
        int iHashCode2 = this.mVenueType.hashCode();
        GeoLocation geoLocation = this.mLocation;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (geoLocation != null ? geoLocation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mVenueSignificance.ordinal());
        parcel.writeInt(this.mVenueType.ordinal());
        parcel.writeParcelable(this.mLocation, i);
    }

    public Venue(Parcel parcel) {
        this.mVenueSignificance = VenueSignificance.values()[parcel.readInt()];
        this.mVenueType = VenueType.values()[parcel.readInt()];
        this.mLocation = (GeoLocation) parcel.readParcelable(GeoLocation.class.getClassLoader());
    }

    public String toString() {
        return "Venue{mVenueSignificance=" + this.mVenueSignificance + ", mVenueType=" + this.mVenueType + ", mLocation=" + this.mLocation + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Venue venue = (Venue) obj;
        if (this.mVenueSignificance == venue.mVenueSignificance && this.mVenueType == venue.mVenueType) {
            return Objects.equals(this.mLocation, venue.mLocation);
        }
        return false;
    }

    public Venue(VenueSignificance venueSignificance, VenueType venueType, GeoLocation geoLocation) {
        this.mVenueSignificance = venueSignificance;
        this.mVenueType = venueType;
        this.mLocation = geoLocation;
    }
}
