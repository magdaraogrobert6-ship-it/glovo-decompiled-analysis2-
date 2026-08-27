package com.mapbox.search.result;

import com.mapbox.search.internal.bindgen.SearchAddressCountry;
import com.mapbox.search.internal.bindgen.SearchAddressRegion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchAddressKt {
    public static final com.mapbox.search.internal.bindgen.SearchAddress mapToCore(SearchAddress searchAddress) {
        SearchAddressRegion searchAddressRegion;
        SearchAddressCountry searchAddressCountry;
        searchAddress.getClass();
        String str = searchAddress.houseNumber;
        String str2 = searchAddress.street;
        String str3 = searchAddress.neighborhood;
        String str4 = searchAddress.locality;
        String str5 = searchAddress.postcode;
        String str6 = searchAddress.place;
        String str7 = searchAddress.district;
        com.mapbox.search.common.SearchAddressRegion searchAddressRegion2 = searchAddress.regionInfo;
        if (searchAddressRegion2 != null) {
            searchAddressRegion = new SearchAddressRegion(searchAddressRegion2.name, searchAddressRegion2.code, searchAddressRegion2.codeFull);
        } else {
            String str8 = searchAddress.region;
            searchAddressRegion = str8 != null ? new SearchAddressRegion(str8, null, null) : null;
        }
        com.mapbox.search.common.SearchAddressCountry searchAddressCountry2 = searchAddress.countryInfo;
        if (searchAddressCountry2 != null) {
            searchAddressCountry = new SearchAddressCountry(searchAddressCountry2.name, searchAddressCountry2.isoCodeAlpha2, searchAddressCountry2.isoCodeAlpha3);
        } else {
            String str9 = searchAddress.country;
            searchAddressCountry = str9 != null ? new SearchAddressCountry(str9, null, null) : null;
        }
        return new com.mapbox.search.internal.bindgen.SearchAddress(str, str2, str3, str4, str5, str6, str7, searchAddressRegion, searchAddressCountry);
    }
}
