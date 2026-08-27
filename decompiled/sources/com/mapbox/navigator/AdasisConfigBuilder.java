package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class AdasisConfigBuilder implements AdasisConfigBuilderInterface {
    protected long peer;

    public static class AdasisConfigBuilderPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            AdasisConfigBuilder.cleanNativePeer(this.peer);
        }

        public AdasisConfigBuilderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native AdasisConfig defaultOptions();

    @MapboxExperimental
    public static native Expected<String, AdasisConfig> fromJson(String str);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public AdasisConfigBuilder(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new AdasisConfigBuilderPeerCleaner(j));
    }
}
