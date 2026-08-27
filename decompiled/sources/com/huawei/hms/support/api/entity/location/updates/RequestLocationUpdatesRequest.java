package com.huawei.hms.support.api.entity.location.updates;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

/* JADX INFO: loaded from: classes2.dex */
public class RequestLocationUpdatesRequest extends LocationBaseRequest {

    @Packed
    private LocationRequest locationRequest;
    private boolean resendFromHMS;

    @Packed
    private String uuid;

    public RequestLocationUpdatesRequest() {
    }

    public LocationRequest getLocationRequest() {
        return this.locationRequest;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isResendFromHMS() {
        return this.resendFromHMS;
    }

    public void setLocationRequest(LocationRequest locationRequest) {
        this.locationRequest = locationRequest;
    }

    public void setResendFromHMS(boolean z) {
        this.resendFromHMS = z;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public RequestLocationUpdatesRequest(Context context) {
        super(context);
    }
}
