package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class LocationServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceFactory.cleanNativePeer(this.peer);
        }

        public LocationServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static LocationService getOrCreate() {
        return LocationServiceImpl.createPlatformLocationService();
    }

    public static native void reset();

    public LocationServiceFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LocationServiceFactoryPeerCleaner(j));
    }
}
