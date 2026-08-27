package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
public class PersistentStorageFactory {
    protected long peer;

    public static class PersistentStorageFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PersistentStorageFactory.cleanNativePeer(this.peer);
        }

        public PersistentStorageFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByFile(String str);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByKey(String str);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PersistentStorageFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new PersistentStorageFactoryPeerCleaner(j));
    }
}
