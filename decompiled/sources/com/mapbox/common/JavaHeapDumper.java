package com.mapbox.common;

import android.os.Debug;
import android.os.SystemClock;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaHeapDumper {
    private static final long COOLDOWN_MS = 300000;
    public static final JavaHeapDumper INSTANCE = new JavaHeapDumper();
    private static Long heapBytesOverrideForTest;
    private static volatile long lastDumpTime;
    private static volatile long memoryThresholdBytes;
    private static volatile Thread.UncaughtExceptionHandler previousHandler;

    private JavaHeapDumper() {
    }

    public static /* synthetic */ void getHeapBytesOverrideForTest$common_release$annotations() {
    }

    public final Long getHeapBytesOverrideForTest$common_release() {
        return heapBytesOverrideForTest;
    }

    public final void setHeapBytesOverrideForTest$common_release(Long l) {
        heapBytesOverrideForTest = l;
    }

    public static final void disable() {
        memoryThresholdBytes = 0L;
        Thread.setDefaultUncaughtExceptionHandler(previousHandler);
        previousHandler = null;
    }

    public static final void enable(long j) {
        long j2 = memoryThresholdBytes;
        memoryThresholdBytes = j;
        if (j2 == 0) {
            previousHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new JavaHeapDumper$$ExternalSyntheticLambda0(0));
        }
    }

    public static final void checkAndDump() {
        if (SystemClock.elapsedRealtime() - lastDumpTime < COOLDOWN_MS) {
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        if (runtime.maxMemory() <= 0) {
            return;
        }
        long j = runtime.totalMemory();
        Long l = heapBytesOverrideForTest;
        long jLongValue = l != null ? l.longValue() : memoryThresholdBytes;
        if (jLongValue <= 0 || j < jLongValue) {
            return;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Memory use ", " exceeds (or equals) threshold ");
        sbM.append(jLongValue);
        sbM.append(", dumping heap");
        Log.warning(sbM.toString(), "memory");
        INSTANCE.dump();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$1(Thread thread, Throwable th) {
        if (th instanceof OutOfMemoryError) {
            try {
                INSTANCE.dump();
            } catch (Throwable unused) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private final void dump() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Debug.dumpHprofData(MapboxSDKCommon.INSTANCE.getContext().getCacheDir() + "/heap_" + jElapsedRealtime + ".hprof");
            lastDumpTime = jElapsedRealtime;
        } catch (Throwable th) {
            Log.warning("Failed to write Java heap dump: " + th.getMessage(), "memory");
        }
    }
}
