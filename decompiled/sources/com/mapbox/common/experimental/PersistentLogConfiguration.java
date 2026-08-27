package com.mapbox.common.experimental;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public final class PersistentLogConfiguration {
    protected long peer;

    public static class PersistentLogConfigurationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PersistentLogConfiguration.cleanNativePeer(this.peer);
        }

        public PersistentLogConfigurationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native boolean getFileAllowHeader();

    @MapboxExperimental
    public static native Long getFileFlushBufferSize();

    @MapboxExperimental
    public static native LoggingLevel getFileFlushImmediateFromLogLevel();

    @MapboxExperimental
    public static native Long getFileFlushLines();

    @MapboxExperimental
    public static native Long getFileFlushSeconds();

    @MapboxExperimental
    public static native LoggingLevel getFileLoggingLevel();

    @MapboxExperimental
    public static native LoggingLevel getFileLoggingLevelForCategory(String str);

    @MapboxExperimental
    public static native long getFileMaxSize();

    @MapboxExperimental
    public static native String getFilePath();

    @MapboxExperimental
    public static native boolean getFilePerCategory();

    @MapboxExperimental
    public static native long getFileRotateCount();

    private static native void nativeSelfRegister();

    @MapboxExperimental
    public static native void resetFileLoggingLevelForCategory(String str);

    @MapboxExperimental
    public static native void setFileAllowHeader(boolean z);

    @MapboxExperimental
    public static native void setFileFlushConfig(Long l, Long l2, Long l3, LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileLoggingLevel(LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileLoggingLevelForCategory(String str, LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileMaxSize(long j);

    @MapboxExperimental
    public static native void setFilePath(String str);

    @MapboxExperimental
    public static native void setFilePerCategory(boolean z);

    @MapboxExperimental
    public static native void setFileRotateCount(long j);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PersistentLogConfiguration(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new PersistentLogConfigurationPeerCleaner(j));
    }
}
