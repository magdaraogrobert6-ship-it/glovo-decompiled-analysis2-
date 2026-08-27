package com.huawei.location.vdr.listener;

import android.location.Location;

/* JADX INFO: loaded from: classes2.dex */
public interface IVdrLocationListener {
    String getUuid();

    void onVdrLocationChanged(Location location);
}
