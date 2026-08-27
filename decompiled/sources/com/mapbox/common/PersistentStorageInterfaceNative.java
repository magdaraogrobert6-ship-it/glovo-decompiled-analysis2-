package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class PersistentStorageInterfaceNative implements PersistentStorageInterface {
    protected long peer;

    public static class PersistentStorageInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PersistentStorageInterfaceNative.cleanNativePeer(this.peer);
        }

        public PersistentStorageInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, PersistentStorageData> get(String str);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, List<PersistentStorageData>> getAll();

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, List<PersistentStorageData>> getMulti(List<String> list);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Long> getStorageSize();

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Date> put(String str, DataRef dataRef);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Date> putMulti(List<PersistentStorageKeyValue> list);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, None> remove(String str);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Long> removeAll();

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Long> removeMulti(List<String> list, boolean z);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, None> shrinkToFit();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PersistentStorageInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new PersistentStorageInterfacePeerCleaner(j));
    }
}
