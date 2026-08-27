package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.locationSdk.j0;
import com.huawei.hms.locationSdk.t;
import com.huawei.hms.locationSdk.v0;
import java.util.Locale;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class GeocoderService {
    private j0 locationClient;

    public setShouldUseDispatchDrawui getFromLocation(GetFromLocationRequest getFromLocationRequest) {
        return this.locationClient.a(getFromLocationRequest);
    }

    public setShouldUseDispatchDrawui getFromLocationName(GetFromLocationNameRequest getFromLocationNameRequest) {
        return this.locationClient.a(getFromLocationNameRequest);
    }

    public GeocoderService(Activity activity, Locale locale) {
        this.locationClient = t.a(activity, locale, (v0) null);
    }

    public GeocoderService(Context context, Locale locale) {
        this.locationClient = t.a(context, locale, (v0) null);
    }
}
