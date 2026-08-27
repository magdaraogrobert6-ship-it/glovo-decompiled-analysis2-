package com.sentiance.sdk.venuemapper;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.DontObfuscate;
import o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class PoiAddress {
    private String mCity;
    private String mCityType;
    private String mCountry;

    public String getCity() {
        return this.mCity;
    }

    public String getCityType() {
        return this.mCityType;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public static PoiAddress fromThrift(setDeviceObjectAllowlistEnabledandroid_sdk_base_release setdeviceobjectallowlistenabledandroid_sdk_base_release) {
        return new PoiAddress(setdeviceobjectallowlistenabledandroid_sdk_base_release.RemoteActionCompatParcelizer, setdeviceobjectallowlistenabledandroid_sdk_base_release.read, setdeviceobjectallowlistenabledandroid_sdk_base_release.write);
    }

    public int hashCode() {
        return this.mCityType.hashCode() + af$$ExternalSyntheticOutline0.m(this.mCountry.hashCode() * 31, 31, this.mCity);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoiAddress{mCountry='");
        sb.append(this.mCountry);
        sb.append("', mCity='");
        sb.append(this.mCity);
        sb.append("', mCityType='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.mCityType, "'}");
    }

    public PoiAddress(String str, String str2, String str3) {
        this.mCountry = str == null ? "" : str;
        this.mCity = str2 == null ? "" : str2;
        this.mCityType = str3 == null ? "" : str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoiAddress poiAddress = (PoiAddress) obj;
        if (this.mCountry.equals(poiAddress.mCountry) && this.mCity.equals(poiAddress.mCity)) {
            return this.mCityType.equals(poiAddress.mCityType);
        }
        return false;
    }
}
