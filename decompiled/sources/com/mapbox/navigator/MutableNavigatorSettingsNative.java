package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class MutableNavigatorSettingsNative implements MutableNavigatorSettings {
    protected long peer;

    public static class MutableNavigatorSettingsPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MutableNavigatorSettingsNative.cleanNativePeer(this.peer);
        }

        public MutableNavigatorSettingsPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native Float avoidManeuverSeconds();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setAvoidManeuverSeconds(Float f);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setTestingContext(TestingContext testingContext);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setUserLanguages(List<String> list);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setVehicleType(VehicleType vehicleType);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native TestingContext testingContext();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native String userLanguageSupportedByValhalla();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native List<String> userLanguages();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native VehicleType vehicleType();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MutableNavigatorSettingsNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MutableNavigatorSettingsPeerCleaner(j));
    }
}
