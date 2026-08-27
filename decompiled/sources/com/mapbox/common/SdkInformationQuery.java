package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SdkInformationQuery implements SdkInformationQueryInterface {
    protected long peer;

    public static class SdkInformationQueryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SdkInformationQuery.cleanNativePeer(this.peer);
        }

        public SdkInformationQueryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native List<SdkInformation> getSdkInformation();

    public static native SdkInformation getSdkInformationByName(String str);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SdkInformationQuery(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SdkInformationQueryPeerCleaner(j));
    }
}
