package com.huawei.location.lite.common.adapter;

import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class LocationTrackerAdapter {
    private static final String TAG = "LocationTrackerAdapter";
    private static boolean locationTrackerEnable = true;

    public static boolean isLocationTrackerEnable() {
        return locationTrackerEnable;
    }

    public static void setLocationTrackerEnable(boolean z) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "sdk type: " + Integer.parseInt("100") + ", set location tracker enable: " + z);
        if (Integer.parseInt("100") != 100) {
            return;
        }
        locationTrackerEnable = z;
    }
}
