package com.google.android.gms.common.api;

import com.google.android.gms.location.LocationSettingsResult;
import o.accessgetNumPadCommacp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Response {
    private accessgetNumPadCommacp read;

    public accessgetNumPadCommacp getResult() {
        return this.read;
    }

    public void setResult(accessgetNumPadCommacp accessgetnumpadcommacp) {
        this.read = accessgetnumpadcommacp;
    }

    public Response(LocationSettingsResult locationSettingsResult) {
        this.read = locationSettingsResult;
    }
}
