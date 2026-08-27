package com.adjust.sdk;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdjustSessionFailure {
    public String adid;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;
    public boolean willRetry;

    public String toString() {
        String str = this.message;
        String str2 = this.timestamp;
        String str3 = this.adid;
        boolean z = this.willRetry;
        return Util.formatString("Session Failure msg:%s time:%s adid:%s retry:%b json:%s", str, str2, str3, Boolean.valueOf(z), this.jsonResponse);
    }
}
