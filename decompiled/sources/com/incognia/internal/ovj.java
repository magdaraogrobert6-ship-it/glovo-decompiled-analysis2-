package com.incognia.internal;

import androidx.sqlite.SQLite;
import com.huawei.hms.support.api.location.common.LocationConstant;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ovj {
    public static final List BGx = SQLite.read("android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", LocationConstant.BACKGROUND_PERMISSION, "android.permission.QUERY_ALL_PACKAGES", "com.google.android.gms.permission.AD_ID", "android.permission.READ_PHONE_STATE", "com.google.android.providers.gsf.permission.READ_GSERVICES");
}
