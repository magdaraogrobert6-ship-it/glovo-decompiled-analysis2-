package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UserRecordsLayer {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class UserRecordsLayerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            UserRecordsLayer.cleanNativePeer(this.peer);
        }

        public UserRecordsLayerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native void clear();

    public native String name();

    public native void remove(String str);

    public native void removeMulti(List<String> list);

    public native void upsert(UserRecord userRecord);

    public native void upsertMulti(List<UserRecord> list);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public UserRecordsLayer(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new UserRecordsLayerPeerCleaner(j));
    }
}
