package com.huawei.location.mdc;

import android.location.Location;

/* JADX INFO: loaded from: classes2.dex */
public interface IMdcLocationListener {
    String getUuid();

    void onMdcLocationChanged(Location location);

    void onMdcStatusChanged(boolean z);
}
