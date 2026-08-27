package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.locationSdk.d0;
import com.huawei.hms.locationSdk.t;
import com.huawei.hms.locationSdk.v0;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsClient {
    private d0 locationClient;
    private Activity mActivity;
    private Context mContext;

    public setShouldUseDispatchDrawui checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        return this.locationClient.a(locationSettingsRequest);
    }

    public setShouldUseDispatchDrawui setLogConfig(LogConfig logConfig) {
        return this.locationClient.a(logConfig);
    }

    public SettingsClient(Activity activity) {
        this.mActivity = activity;
        this.locationClient = t.b(activity, (v0) null);
    }

    public SettingsClient(Context context) {
        this.mContext = context;
        this.locationClient = t.b(context, (v0) null);
    }
}
