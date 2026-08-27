package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonSdkLog {
    private static final String SDK_IDENTIFIER = "search-sdk-android";
    public static final CommonSdkLog INSTANCE = new CommonSdkLog();
    private static LogImpl logger = new CommonSdkLogImpl();

    public interface LogImpl {
        void logd(String str, String str2);

        void loge(String str, String str2);

        void logi(String str, String str2);

        void logw(String str, String str2);
    }

    private CommonSdkLog() {
    }

    public final void resetLogImpl() {
        logger = null;
    }

    public static final class CommonSdkLogImpl implements LogImpl {
        @Override // com.mapbox.common.CommonSdkLog.LogImpl
        public void logd(String str, String str2) {
            str2.getClass();
            Log.debug(str2, CommonSdkLog.INSTANCE.formatCategory(str));
        }

        @Override // com.mapbox.common.CommonSdkLog.LogImpl
        public void loge(String str, String str2) {
            str2.getClass();
            Log.error(str2, CommonSdkLog.INSTANCE.formatCategory(str));
        }

        @Override // com.mapbox.common.CommonSdkLog.LogImpl
        public void logi(String str, String str2) {
            str2.getClass();
            Log.info(str2, CommonSdkLog.INSTANCE.formatCategory(str));
        }

        @Override // com.mapbox.common.CommonSdkLog.LogImpl
        public void logw(String str, String str2) {
            str2.getClass();
            Log.warning(str2, CommonSdkLog.INSTANCE.formatCategory(str));
        }
    }

    public final void reinitializeLogImpl() {
        logger = new CommonSdkLogImpl();
    }

    public final void logd(String str, String str2) {
        str2.getClass();
        LogImpl logImpl = logger;
        if (logImpl != null) {
            logImpl.logd(str, str2);
        }
    }

    public final void loge(String str, String str2) {
        str2.getClass();
        LogImpl logImpl = logger;
        if (logImpl != null) {
            logImpl.loge(str, str2);
        }
    }

    public final void logi(String str, String str2) {
        str2.getClass();
        LogImpl logImpl = logger;
        if (logImpl != null) {
            logImpl.logi(str, str2);
        }
    }

    public final void logw(String str, String str2) {
        str2.getClass();
        LogImpl logImpl = logger;
        if (logImpl != null) {
            logImpl.logw(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCategory(String str) {
        if (str == null) {
            return SDK_IDENTIFIER;
        }
        return "search-sdk-android\\".concat(str);
    }
}
