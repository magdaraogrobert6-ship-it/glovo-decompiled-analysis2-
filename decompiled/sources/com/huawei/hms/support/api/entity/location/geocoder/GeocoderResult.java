package com.huawei.hms.support.api.entity.location.geocoder;

import com.huawei.hms.support.api.client.Result;

/* JADX INFO: loaded from: classes4.dex */
public class GeocoderResult extends Result {
    private GeocoderResponse geocoderResponse;

    public GeocoderResponse getGeocoderResponse() {
        return this.geocoderResponse;
    }

    public void setGeocoderResponse(GeocoderResponse geocoderResponse) {
        this.geocoderResponse = geocoderResponse;
    }
}
