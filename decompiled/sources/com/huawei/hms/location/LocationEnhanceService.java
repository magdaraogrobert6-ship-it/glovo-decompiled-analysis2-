package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.huawei.hms.locationSdk.g0;
import com.huawei.hms.locationSdk.t;
import com.huawei.hms.locationSdk.v0;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class LocationEnhanceService {
    private static final String TAG = "LocationEnhanceService";
    private g0 locationEnhanceClient;

    private setShouldUseDispatchDrawui reportLocation(Location location, String str) {
        return this.locationEnhanceClient.a(location, str);
    }

    public setShouldUseDispatchDrawui getHistoryStationInfo(String str) {
        return this.locationEnhanceClient.b(str);
    }

    public setShouldUseDispatchDrawui getLocationSceneResponse(LocationSceneRequest locationSceneRequest) {
        return this.locationEnhanceClient.a(locationSceneRequest);
    }

    public setShouldUseDispatchDrawui getNavigationState(NavigationRequest navigationRequest) {
        return this.locationEnhanceClient.a(navigationRequest);
    }

    public setShouldUseDispatchDrawui getStationLines(String str, String str2) {
        return this.locationEnhanceClient.a(str, str2);
    }

    public setShouldUseDispatchDrawui requestStationRecognition(String str) {
        return this.locationEnhanceClient.a(str);
    }

    public setShouldUseDispatchDrawui setLocationSceneMode(LocationSceneRequest locationSceneRequest) {
        return this.locationEnhanceClient.b(locationSceneRequest);
    }

    public setShouldUseDispatchDrawui setRoadData(RoadData roadData) {
        return this.locationEnhanceClient.a(roadData);
    }

    public LocationEnhanceService(Activity activity) {
        this.locationEnhanceClient = t.c(activity, (v0) null);
    }

    public LocationEnhanceService(Context context) {
        this.locationEnhanceClient = t.c(context, (v0) null);
    }
}
