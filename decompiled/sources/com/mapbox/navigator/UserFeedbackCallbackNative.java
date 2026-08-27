package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes5.dex */
final class UserFeedbackCallbackNative implements UserFeedbackCallback {
    private long peer;

    public static class UserFeedbackCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            UserFeedbackCallbackNative.cleanNativePeer(this.peer);
        }

        public UserFeedbackCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.UserFeedbackCallback
    public native void run(Expected<String, Point> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private UserFeedbackCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new UserFeedbackCallbackPeerCleaner(j));
    }
}
