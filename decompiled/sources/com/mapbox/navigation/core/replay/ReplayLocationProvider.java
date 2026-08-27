package com.mapbox.navigation.core.replay;

import android.os.Looper;
import com.mapbox.common.Cancelable;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.LocationObserver;
import com.mapbox.common.location.LocationProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayLocationProvider implements LocationProvider {
    public final ArrayList lastLocationCallbacks;
    public final LinkedHashMap locationObservers;

    public ReplayLocationProvider(MapboxReplayer mapboxReplayer) {
        mapboxReplayer.getClass();
        this.locationObservers = new LinkedHashMap();
        this.lastLocationCallbacks = new ArrayList();
        mapboxReplayer.replayEventsObservers.add(this);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final void addLocationObserver(LocationObserver locationObserver, Looper looper) {
        locationObserver.getClass();
        looper.getClass();
        this.locationObservers.put(locationObserver, looper);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final Cancelable getLastLocation(final GetLocationCallback getLocationCallback) {
        getLocationCallback.getClass();
        this.lastLocationCallbacks.add(getLocationCallback);
        return new Cancelable() { // from class: com.mapbox.navigation.core.replay.ReplayLocationProvider$$ExternalSyntheticLambda0
            @Override // com.mapbox.common.Cancelable
            public final void cancel() {
                this.f$0.lastLocationCallbacks.remove(getLocationCallback);
            }
        };
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final void removeLocationObserver(LocationObserver locationObserver) {
        locationObserver.getClass();
        this.locationObservers.remove(locationObserver);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final void addLocationObserver(LocationObserver locationObserver) {
        locationObserver.getClass();
        this.locationObservers.put(locationObserver, null);
    }
}
