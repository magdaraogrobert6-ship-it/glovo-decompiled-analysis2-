package com.mapbox.common.location;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import com.mapbox.common.MapboxTracing;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLocationProvider implements LocationProvider {
    protected static final Companion Companion = new Companion(null);
    protected static final Handler EMPTY_HANDLER = new Handler(Looper.getMainLooper());
    private final ConcurrentHashMap<LocationObserver, Handler> observers = new ConcurrentHashMap<>();

    public final ConcurrentHashMap<LocationObserver, Handler> getObservers() {
        return this.observers;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyLocationUpdate$lambda$2$lambda$1$lambda$0(LocationObserver locationObserver, List list) {
        locationObserver.getClass();
        list.getClass();
        locationObserver.onLocationUpdateReceived(list);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver locationObserver) {
        locationObserver.getClass();
        ConcurrentHashMap<LocationObserver, Handler> concurrentHashMap = this.observers;
        Looper looperMyLooper = Looper.myLooper();
        concurrentHashMap.put(locationObserver, looperMyLooper != null ? new Handler(looperMyLooper) : EMPTY_HANDLER);
    }

    public void notifyLocationUpdate(List<? extends Location> list) {
        list.getClass();
        int i = 0;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            for (Map.Entry<LocationObserver, Handler> entry : this.observers.entrySet()) {
                LocationObserver key = entry.getKey();
                Handler value = entry.getValue();
                Object[] objArr = {value, EMPTY_HANDLER};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {value.getLooper(), Looper.myLooper()};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        value.post(new BaseLocationProvider$$ExternalSyntheticLambda0(key, i, list));
                    }
                }
                key.onLocationUpdateReceived(list);
            }
            return;
        }
        Trace.beginSection("mbx: BaseLocationProvider#notifyLocationUpdate");
        try {
            for (Map.Entry<LocationObserver, Handler> entry2 : this.observers.entrySet()) {
                LocationObserver key2 = entry2.getKey();
                Handler value2 = entry2.getValue();
                Object[] objArr3 = {value2, EMPTY_HANDLER};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    Object[] objArr4 = {value2.getLooper(), Looper.myLooper()};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                        value2.post(new BaseLocationProvider$$ExternalSyntheticLambda0(key2, i, list));
                    }
                }
                key2.onLocationUpdateReceived(list);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void removeLocationObserver(LocationObserver locationObserver) {
        locationObserver.getClass();
        this.observers.remove(locationObserver);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver locationObserver, Looper looper) {
        locationObserver.getClass();
        looper.getClass();
        this.observers.put(locationObserver, new Handler(looper));
    }
}
