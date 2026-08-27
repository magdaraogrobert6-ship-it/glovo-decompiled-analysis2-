package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes4.dex */
public interface OfflineIndexObserver {
    void onError(OfflineIndexError offlineIndexError);

    void onIndexChanged(OfflineIndexChangeEvent offlineIndexChangeEvent);
}
