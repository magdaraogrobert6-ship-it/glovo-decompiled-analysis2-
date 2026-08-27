package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class LogConfiguration {
    protected long peer;

    public static class LogConfigurationPeerCleaner implements Runnable {
        public static int serializer;
        public static int write;
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LogConfiguration.cleanNativePeer(this.peer);
        }

        public LogConfigurationPeerCleaner(long j) {
            this.peer = j;
        }

        public static int IconCompatParcelizer() {
            int i = write;
            int i2 = i % 8870793;
            write = i + 1;
            if (i2 != 0) {
                return serializer;
            }
            int iNextInt = new Random().nextInt(618451934);
            serializer = iNextInt;
            return iNextInt;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native LoggingLevel getLoggingLevel();

    public static native LoggingLevel getLoggingLevel(String str);

    private static native void nativeSelfRegister();

    public static native void registerLogWriterBackend(LogWriterBackend logWriterBackend);

    public static native void resetLoggingLevel(String str);

    public static native void setLoggingLevel(LoggingLevel loggingLevel);

    public static native void setLoggingLevel(String str, LoggingLevel loggingLevel);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LogConfiguration(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LogConfigurationPeerCleaner(j));
    }
}
