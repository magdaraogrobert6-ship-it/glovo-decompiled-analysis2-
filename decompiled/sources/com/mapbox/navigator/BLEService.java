package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public interface BLEService {
    int registerScanResultCallback(ScanResultCallback scanResultCallback);

    void unregisterCallback(int i);
}
