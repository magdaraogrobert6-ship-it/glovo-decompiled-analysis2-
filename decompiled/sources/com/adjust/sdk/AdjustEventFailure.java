package com.adjust.sdk;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdjustEventFailure {
    public String adid;
    public String callbackId;
    public String eventToken;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;
    public boolean willRetry;

    public String toString() {
        String str = this.message;
        String str2 = this.timestamp;
        String str3 = this.adid;
        String str4 = this.eventToken;
        String str5 = this.callbackId;
        boolean z = this.willRetry;
        return Util.formatString("Event Failure msg:%s time:%s adid:%s event:%s cid:%s retry:%b json:%s", str, str2, str3, str4, str5, Boolean.valueOf(z), this.jsonResponse);
    }
}
