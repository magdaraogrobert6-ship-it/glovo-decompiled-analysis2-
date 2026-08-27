package com.huawei.location.lite.common.adapter;

import android.location.Location;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
public class LocationProxyAdapter {
    private static final String TAG = "LocationProxyAdapter";
    private static ILocationProxyAdapterCallback iLocationProxyCallback = null;
    private static boolean locationProxyEnable = false;

    public static boolean isLocationProxyEnable() {
        return locationProxyEnable;
    }

    public static void injectLocation(Location location) {
        String str;
        try {
            if (!isLocationProxyEnable()) {
                str = "location proxy not enable, ignore location";
            } else if (location == null) {
                str = "location is null, ignore location";
            } else {
                if (iLocationProxyCallback != null) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "proxy location info, locTime: " + location.getTime() + ", ElapsedRealtime: " + location.getElapsedRealtimeNanos());
                    iLocationProxyCallback.onProxyLocationCallback(location);
                    return;
                }
                str = "iLocationProxyCallback is null because of empty request, ignore location";
            }
            WrappedCompositionsetContent1211.read(TAG, str);
        } catch (Exception e) {
            WrappedCompositionsetContent1211.read(TAG, "inject location exception: " + e.getMessage());
        }
    }

    public static void setLocationProxyCallback(ILocationProxyAdapterCallback iLocationProxyAdapterCallback) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "set location proxy callback");
        iLocationProxyCallback = iLocationProxyAdapterCallback;
    }

    public static boolean setLocationProxyEnable(boolean z) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "sdk type: " + Integer.parseInt("100") + ", locationProxyEnable receive: " + z);
        if (Integer.parseInt("100") != 100) {
            return false;
        }
        locationProxyEnable = z;
        return true;
    }
}
