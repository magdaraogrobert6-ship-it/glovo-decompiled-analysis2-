package com.huawei.hms.common.api;

import com.huawei.hms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature feature;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.feature + " is unsupported";
    }

    public UnsupportedApiCallException(Feature feature) {
        this.feature = feature;
    }
}
