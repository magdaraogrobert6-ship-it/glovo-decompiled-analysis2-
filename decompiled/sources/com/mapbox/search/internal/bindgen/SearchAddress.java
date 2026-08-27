package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class SearchAddress implements Serializable {
    private final SearchAddressCountry country;
    private final String district;
    private final String houseNumber;
    private final String locality;
    private final String neighborhood;
    private final String place;
    private final String postcode;
    private final SearchAddressRegion region;
    private final String street;

    public SearchAddressCountry getCountry() {
        return this.country;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public String getLocality() {
        return this.locality;
    }

    public String getNeighborhood() {
        return this.neighborhood;
    }

    public String getPlace() {
        return this.place;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public SearchAddressRegion getRegion() {
        return this.region;
    }

    public String getStreet() {
        return this.street;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.houseNumber, this.street, this.neighborhood, this.locality, this.postcode, this.place, this.district, this.region, this.country);
    }

    public SearchAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, SearchAddressRegion searchAddressRegion, SearchAddressCountry searchAddressCountry) {
        this.houseNumber = str;
        this.street = str2;
        this.neighborhood = str3;
        this.locality = str4;
        this.postcode = str5;
        this.place = str6;
        this.district = str7;
        this.region = searchAddressRegion;
        this.country = searchAddressCountry;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[houseNumber: ");
        IconCompatParcelizer.read(sb, this.houseNumber, ", street: ");
        IconCompatParcelizer.read(sb, this.street, ", neighborhood: ");
        IconCompatParcelizer.read(sb, this.neighborhood, ", locality: ");
        IconCompatParcelizer.read(sb, this.locality, ", postcode: ");
        IconCompatParcelizer.read(sb, this.postcode, ", place: ");
        IconCompatParcelizer.read(sb, this.place, ", district: ");
        IconCompatParcelizer.read(sb, this.district, ", region: ");
        sb.append(RecordUtils.fieldToString(this.region));
        sb.append(", country: ");
        sb.append(RecordUtils.fieldToString(this.country));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchAddress searchAddress = (SearchAddress) obj;
        return Objects.equals(this.houseNumber, searchAddress.houseNumber) && Objects.equals(this.street, searchAddress.street) && Objects.equals(this.neighborhood, searchAddress.neighborhood) && Objects.equals(this.locality, searchAddress.locality) && Objects.equals(this.postcode, searchAddress.postcode) && Objects.equals(this.place, searchAddress.place) && Objects.equals(this.district, searchAddress.district) && Objects.equals(this.region, searchAddress.region) && Objects.equals(this.country, searchAddress.country);
    }
}
