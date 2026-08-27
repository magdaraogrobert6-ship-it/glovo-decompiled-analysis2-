package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class IVulkanManagerNative implements IVulkanManager {
    protected long peer;

    public static class IVulkanManagerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            IVulkanManagerNative.cleanNativePeer(this.peer);
        }

        public IVulkanManagerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.IVulkanManager
    public native boolean init(long j);

    @Override // com.mapbox.maps.IVulkanManager
    public native void release();

    @Override // com.mapbox.maps.IVulkanManager
    public native void releaseSurface();

    @Override // com.mapbox.maps.IVulkanManager
    public native void render(RenderCallback renderCallback);

    @Override // com.mapbox.maps.IVulkanManager
    public native void resize(int i, int i2);

    @Override // com.mapbox.maps.IVulkanManager
    public native void setAntialiasingSampleCount(int i);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public IVulkanManagerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new IVulkanManagerPeerCleaner(j));
    }
}
