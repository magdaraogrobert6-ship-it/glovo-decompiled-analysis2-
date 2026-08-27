package com.huawei.hms.support.api.entity.location.updates;

import com.huawei.hms.support.api.client.Result;

/* JADX INFO: loaded from: classes4.dex */
public class RequestLocationUpdatesResult extends Result {
    private RequestLocationUpdatesResponse requestLocationUpdatesResponse;

    public RequestLocationUpdatesResponse getRequestLocationUpdatesResponse() {
        return this.requestLocationUpdatesResponse;
    }

    public void setRequestLocationUpdatesResponse(RequestLocationUpdatesResponse requestLocationUpdatesResponse) {
        this.requestLocationUpdatesResponse = requestLocationUpdatesResponse;
    }
}
