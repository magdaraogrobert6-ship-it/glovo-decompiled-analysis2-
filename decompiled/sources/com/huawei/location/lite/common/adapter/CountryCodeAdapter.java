package com.huawei.location.lite.common.adapter;

import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class CountryCodeAdapter {
    private static final String TAG = "CountryCodeAdapter";
    private static String countryCode = "UNKNOWN";
    private static boolean countryCodeSet = false;

    public static String getCountryCode() {
        return countryCode;
    }

    public static boolean isCountryCodeSet() {
        return countryCodeSet;
    }

    public static boolean setCountryCode(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "sdk type: " + Integer.parseInt("100") + ", countryCode receive: " + str);
        if (Integer.parseInt("100") != 100) {
            return false;
        }
        countryCode = str;
        countryCodeSet = true;
        return true;
    }
}
