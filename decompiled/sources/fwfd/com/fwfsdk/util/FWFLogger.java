package fwfd.com.fwfsdk.util;

import com.braze.Constants;

/* JADX INFO: loaded from: classes5.dex */
public class FWFLogger {
    public static FWFLogLevel logLevel = FWFLogLevel.verbose;
    private static String stringLog = "";
    private static boolean isUnitTest = false;

    public static String getStringLog() {
        return stringLog;
    }

    public static void setIsUnitTest(boolean z) {
        isUnitTest = z;
    }

    public enum FWFLogLevel {
        verbose(0),
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);

        private int value;

        public int getValue() {
            return this.value;
        }

        FWFLogLevel(int i) {
            this.value = i;
        }
    }

    public static void logDebug(String str) {
        if (logLevel.getValue() <= FWFLogLevel.debug.getValue()) {
            log(str, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
        }
    }

    public static void logError(String str) {
        if (logLevel.getValue() <= FWFLogLevel.error.getValue()) {
            log(str, "e");
        }
    }

    public static void logInfo(String str) {
        if (logLevel.getValue() <= FWFLogLevel.info.getValue()) {
            log(str, "i");
        }
    }

    public static void logVerbose(String str) {
        if (logLevel.getValue() <= FWFLogLevel.verbose.getValue()) {
            log(str, "v");
        }
    }

    public static void logWarning(String str) {
        if (logLevel.getValue() <= FWFLogLevel.warning.getValue()) {
            log(str, "w");
        }
    }

    private static void log(String str, String str2) {
        if (isUnitTest) {
            stringLog = str;
            System.out.println(str);
        }
    }
}
