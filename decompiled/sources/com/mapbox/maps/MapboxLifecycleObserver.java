package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public interface MapboxLifecycleObserver {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onResume(MapboxLifecycleObserver mapboxLifecycleObserver) {
        }
    }

    void onDestroy();

    void onLowMemory();

    void onResume();

    void onStart();

    void onStop();
}
