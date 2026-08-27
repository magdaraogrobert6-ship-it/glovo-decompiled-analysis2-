package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;

/* JADX INFO: loaded from: classes3.dex */
public class UserActivityReporter implements UserActivityReporterInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class UserActivityReporterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            UserActivityReporter.cleanNativePeer(this.peer);
        }

        public UserActivityReporterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native UserActivityReporter getOrCreate(UserActivityReporterOptions userActivityReporterOptions);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.UserActivityReporterInterface
    public native void reportActivity(String str);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public UserActivityReporter(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new UserActivityReporterPeerCleaner(j));
    }
}
