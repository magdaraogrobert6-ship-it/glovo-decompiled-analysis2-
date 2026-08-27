package com.huawei.location.gwi.listener;

import android.location.Location;

/* JADX INFO: loaded from: classes4.dex */
public interface ICarVdrLocationListener {
    void onLocationChanged(Location location);

    void onVdrError(int i, String str);
}
