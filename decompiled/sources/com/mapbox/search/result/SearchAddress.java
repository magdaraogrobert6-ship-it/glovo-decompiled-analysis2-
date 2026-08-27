package com.mapbox.search.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.search.common.SearchAddressCountry;
import com.mapbox.search.common.SearchAddressRegion;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAddress implements Parcelable {
    public static final Parcelable.Creator<SearchAddress> CREATOR = new SearchResult.Creator(4);
    public final String country;
    public final SearchAddressCountry countryInfo;
    public final String district;
    public final String houseNumber;
    public final String locality;
    public final String neighborhood;
    public final String place;
    public final String postcode;
    public final String region;
    public final SearchAddressRegion regionInfo;
    public final String street;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.houseNumber;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.street;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.neighborhood;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.locality;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.postcode;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.place;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.district;
        int iHashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.region;
        int iHashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.country;
        int iHashCode9 = str9 != null ? str9.hashCode() : 0;
        SearchAddressRegion searchAddressRegion = this.regionInfo;
        int iHashCode10 = searchAddressRegion != null ? searchAddressRegion.hashCode() : 0;
        SearchAddressCountry searchAddressCountry = this.countryInfo;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (searchAddressCountry != null ? searchAddressCountry.hashCode() : 0);
    }

    public SearchAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SearchAddressRegion searchAddressRegion, SearchAddressCountry searchAddressCountry) {
        this.houseNumber = str;
        this.street = str2;
        this.neighborhood = str3;
        this.locality = str4;
        this.postcode = str5;
        this.place = str6;
        this.district = str7;
        this.region = str8;
        this.country = str9;
        this.regionInfo = searchAddressRegion;
        this.countryInfo = searchAddressCountry;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.houseNumber);
        parcel.writeString(this.street);
        parcel.writeString(this.neighborhood);
        parcel.writeString(this.locality);
        parcel.writeString(this.postcode);
        parcel.writeString(this.place);
        parcel.writeString(this.district);
        parcel.writeString(this.region);
        parcel.writeString(this.country);
        parcel.writeParcelable(this.regionInfo, i);
        parcel.writeParcelable(this.countryInfo, i);
    }

    public final String toString() {
        return "SearchAddress(houseNumber=" + this.houseNumber + ", street=" + this.street + ", neighborhood=" + this.neighborhood + ", locality=" + this.locality + ", postcode=" + this.postcode + ", place=" + this.place + ", district=" + this.district + ", region=" + this.region + ", country=" + this.country + ", regionInfo=" + this.regionInfo + ", countryInfo=" + this.countryInfo + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchAddress.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchAddress searchAddress = (SearchAddress) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.houseNumber, searchAddress.houseNumber}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.street, searchAddress.street}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.neighborhood, searchAddress.neighborhood}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locality, searchAddress.locality}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.postcode, searchAddress.postcode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.place, searchAddress.place}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.district, searchAddress.district}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.region, searchAddress.region}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, searchAddress.country}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.regionInfo, searchAddress.regionInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryInfo, searchAddress.countryInfo}, getCieXyz.write())).booleanValue();
    }
}
