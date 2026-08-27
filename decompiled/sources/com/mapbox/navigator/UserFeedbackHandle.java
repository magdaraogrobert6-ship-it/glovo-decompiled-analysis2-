package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes4.dex */
public class UserFeedbackHandle implements UserFeedbackHandleInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class UserFeedbackHandlePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            UserFeedbackHandle.cleanNativePeer(this.peer);
        }

        public UserFeedbackHandlePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.UserFeedbackHandleInterface
    public native UserFeedbackMetadata getMetadata();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public UserFeedbackHandle(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new UserFeedbackHandlePeerCleaner(j));
    }
}
