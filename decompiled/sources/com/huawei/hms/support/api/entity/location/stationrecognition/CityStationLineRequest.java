package com.huawei.hms.support.api.entity.location.stationrecognition;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class CityStationLineRequest extends LocationBaseRequest {

    @SerializedName("cityCode")
    private String cityCode;

    @SerializedName("stationType")
    private String stationType;

    public String getCityCode() {
        return this.cityCode;
    }

    public String getStationType() {
        return this.stationType;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setStationType(String str) {
        this.stationType = str;
    }

    public CityStationLineRequest(Context context) {
        super(context);
        this.stationType = "0802004";
    }
}
