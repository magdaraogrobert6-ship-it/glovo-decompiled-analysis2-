package com.huawei.hms.location.api.request;

import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes4.dex */
public class RequestActivityIdentificationReq extends BaseLocationReq {

    @Packed
    private long detectionIntervalMillis;

    public long getDetectionIntervalMillis() {
        return this.detectionIntervalMillis;
    }

    public void setDetectionIntervalMillis(long j) {
        this.detectionIntervalMillis = j;
    }
}
