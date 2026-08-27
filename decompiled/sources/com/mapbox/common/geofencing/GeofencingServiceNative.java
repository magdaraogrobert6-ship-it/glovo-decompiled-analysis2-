package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.geojson.Feature;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofencingServiceNative implements GeofencingService {
    public static final Companion Companion;
    private long peer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void addFeature(Feature feature, AddFeatureCallback addFeatureCallback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void addObserver(GeofencingObserver geofencingObserver, AddObserverCallback addObserverCallback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void clearFeatures(ClearFeaturesCallback clearFeaturesCallback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void configure(GeofencingOptions geofencingOptions, ConfigureCallback configureCallback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void getFeature(String str, GetFeatureCallback getFeatureCallback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void getOptions(GetOptionsCallback getOptionsCallback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void removeFeature(String str, RemoveFeatureCallback removeFeatureCallback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void removeObserver(GeofencingObserver geofencingObserver, RemoveObserverCallback removeObserverCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(long j) {
        Companion.cleanNativePeer(j);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long j) {
            GeofencingServiceNative.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            GeofencingServiceNative.nativeSelfRegister();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        BaseMapboxInitializer.Companion.init(MapboxSDKCommonInitializerImpl.class);
        try {
            companion.nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private GeofencingServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GeofencingUtils$$ExternalSyntheticLambda0(j, 12));
    }
}
