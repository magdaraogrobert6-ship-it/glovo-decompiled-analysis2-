package com.mapbox.navigator;

import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class BLEServiceKt {
    public static final List<ParcelUuid> compatGetServiceSolicitationUuids(ScanRecord scanRecord) {
        scanRecord.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            List<ParcelUuid> serviceSolicitationUuids = scanRecord.getServiceSolicitationUuids();
            return serviceSolicitationUuids == null ? new ArrayList() : serviceSolicitationUuids;
        }
        SentryLogcatAdapter.IconCompatParcelizer(BLEServiceImpl.TAG, "SDK_INT < 29, using empty list as solicitationUuids value");
        return new ArrayList();
    }

    public static final boolean compatIsConnectable(android.bluetooth.le.ScanResult scanResult) {
        scanResult.getClass();
        return scanResult.isConnectable();
    }
}
