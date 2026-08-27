package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofencingObserverNative implements GeofencingObserver {
    public static final Companion Companion;
    private long peer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onDwell(GeofencingEvent geofencingEvent);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onEntry(GeofencingEvent geofencingEvent);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onError(GeofencingError geofencingError);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onExit(GeofencingEvent geofencingEvent);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onUserConsentChanged(boolean z);

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
            GeofencingObserverNative.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            GeofencingObserverNative.nativeSelfRegister();
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

    private GeofencingObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GeofencingUtils$$ExternalSyntheticLambda0(j, 11));
    }
}
