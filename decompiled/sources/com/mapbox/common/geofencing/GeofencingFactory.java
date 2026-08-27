package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofencingFactory {
    public static final Companion Companion;
    private long peer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    public static final native GeofencingService getOrCreate();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    public static final native void reset();

    public static final native void setUserDefined(GeofencingService geofencingService);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j) {
        Companion.cleanNativePeer(j);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long j) {
            GeofencingFactory.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            GeofencingFactory.nativeSelfRegister();
        }

        public final GeofencingService getOrCreate() {
            return GeofencingFactory.getOrCreate();
        }

        public final void reset() {
            GeofencingFactory.reset();
        }

        public final void setUserDefined(GeofencingService geofencingService) {
            GeofencingFactory.setUserDefined(geofencingService);
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

    public GeofencingFactory(long j) {
        setPeer(j);
    }

    public final void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new GeofencingUtils$$ExternalSyntheticLambda0(j, 10));
    }
}
