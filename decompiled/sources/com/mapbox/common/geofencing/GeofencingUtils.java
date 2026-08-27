package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class GeofencingUtils {
    public static final Companion Companion;
    private long peer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    public static final native boolean getUserConsent();

    public static final native boolean isActive();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    public static final native void setUserConsent(boolean z, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback);

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
            GeofencingUtils.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            GeofencingUtils.nativeSelfRegister();
        }

        public final boolean getUserConsent() {
            return GeofencingUtils.getUserConsent();
        }

        public final boolean isActive() {
            return GeofencingUtils.isActive();
        }

        public final void setUserConsent(boolean z, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback) {
            GeofencingUtils.setUserConsent(z, geofencingUtilsUserConsentResponseCallback);
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

    public GeofencingUtils(long j) {
        setPeer(j);
    }

    public final void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new GeofencingUtils$$ExternalSyntheticLambda0(j, 0));
    }
}
