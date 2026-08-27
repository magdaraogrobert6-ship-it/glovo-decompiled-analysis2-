package com.huawei.hms.support.api.entity.location.stationrecognition;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class HistoryStationInfoRequest extends LocationBaseRequest {

    @SerializedName("tripId")
    private String tripId;

    public HistoryStationInfoRequest(Context context) {
        super(context);
    }

    public String getTripId() {
        return this.tripId;
    }

    public void setTripId(String str) {
        this.tripId = str;
    }
}
