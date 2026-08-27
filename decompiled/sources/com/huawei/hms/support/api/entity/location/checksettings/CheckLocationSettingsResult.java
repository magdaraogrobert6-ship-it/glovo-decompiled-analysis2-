package com.huawei.hms.support.api.entity.location.checksettings;

import com.huawei.hms.support.api.client.Result;

/* JADX INFO: loaded from: classes4.dex */
public class CheckLocationSettingsResult extends Result {
    private CheckLocationSettingsResponse checkLocationSettingsResponse;

    public CheckLocationSettingsResponse getCheckLocationSettingsResponse() {
        return this.checkLocationSettingsResponse;
    }

    public void setCheckLocationSettingsResponse(CheckLocationSettingsResponse checkLocationSettingsResponse) {
        this.checkLocationSettingsResponse = checkLocationSettingsResponse;
    }
}
