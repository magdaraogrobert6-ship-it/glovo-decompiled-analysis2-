package com.mapbox.common.location;

import android.app.PendingIntent;
import android.os.Looper;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.Cancelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceLocationProviderNative implements DeviceLocationProvider {
    public static final Companion Companion = new Companion(null);
    private long peer;

    public static final class DeviceLocationProviderPeerCleaner implements Runnable {
        private final long peer;

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderNative.Companion.cleanNativePeer(this.peer);
        }

        public DeviceLocationProviderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationProvider
    public native void addLocationObserver(LocationObserver locationObserver);

    @Override // com.mapbox.common.location.LocationProvider
    public native Cancelable getLastLocation(GetLocationCallback getLocationCallback);

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public native String getName();

    public final long getPeer() {
        return this.peer;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native void removeLocationObserver(LocationObserver locationObserver);

    public final void setPeer(long j) {
        this.peer = j;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cleanNativePeer(long j) {
            DeviceLocationProviderNative.cleanNativePeer(j);
        }

        private Companion() {
        }
    }

    public DeviceLocationProviderNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DeviceLocationProviderPeerCleaner(j));
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver locationObserver, Looper looper) {
        locationObserver.getClass();
        looper.getClass();
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }
}
