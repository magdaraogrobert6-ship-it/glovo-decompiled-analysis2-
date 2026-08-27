package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HistoryRecorderHandle implements HistoryRecorderHandleInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class HistoryRecorderHandlePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HistoryRecorderHandle.cleanNativePeer(this.peer);
        }

        public HistoryRecorderHandlePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native HistoryRecorderHandle build(String str, SdkHistoryInfo sdkHistoryInfo, ConfigHandle configHandle);

    public static native HistoryRecorderHandle buildCompositeRecorder(List<HistoryRecorderHandle> list);

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.HistoryRecorderHandleInterface
    public native void pushHistory(String str, String str2);

    @Override // com.mapbox.navigator.HistoryRecorderHandleInterface
    public native List<String> startRecording();

    @Override // com.mapbox.navigator.HistoryRecorderHandleInterface
    public native void stopRecording(DumpHistoryCallback dumpHistoryCallback);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public HistoryRecorderHandle(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new HistoryRecorderHandlePeerCleaner(j));
    }
}
