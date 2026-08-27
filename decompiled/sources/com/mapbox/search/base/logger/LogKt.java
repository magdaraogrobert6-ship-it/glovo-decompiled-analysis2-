package com.mapbox.search.base.logger;

import com.mapbox.common.CommonSdkLog;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LogKt {
    public static void logw$default(String str) {
        str.getClass();
        CommonSdkLog.INSTANCE.logw(null, str);
    }
}
