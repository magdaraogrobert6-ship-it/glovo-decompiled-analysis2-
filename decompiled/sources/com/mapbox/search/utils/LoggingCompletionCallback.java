package com.mapbox.search.utils;

import com.mapbox.common.CommonSdkLog;
import com.mapbox.search.common.CompletionCallback;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class LoggingCompletionCallback implements CompletionCallback {
    public final String operationName;

    @Override // com.mapbox.search.common.CompletionCallback
    public final void onComplete(Object obj) {
        ((createFromParcel) obj).getClass();
        CommonSdkLog.INSTANCE.logd(null, this.operationName.concat(" completed"));
    }

    public LoggingCompletionCallback(String str) {
        this.operationName = str;
    }

    @Override // com.mapbox.search.common.CompletionCallback
    public final void onError(Exception exc) {
        exc.getClass();
        CommonSdkLog.INSTANCE.loge(null, this.operationName + " error: " + exc.getMessage());
    }
}
