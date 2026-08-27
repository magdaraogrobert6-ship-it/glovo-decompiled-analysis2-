package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes3.dex */
@MapboxExperimental
public class AdasisFacadeBuilder implements AdasisFacadeBuilderInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class AdasisFacadeBuilderPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            AdasisFacadeBuilder.cleanNativePeer(this.peer);
        }

        public AdasisFacadeBuilderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    @MapboxExperimental
    @Deprecated
    public static native AdasisFacadeHandle build(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle);

    @MapboxExperimental
    public static native AdasisFacadeHandle build(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle);

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public AdasisFacadeBuilder(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new AdasisFacadeBuilderPeerCleaner(j));
    }
}
