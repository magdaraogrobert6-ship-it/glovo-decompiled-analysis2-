package com.mapbox.search.record;

import com.huawei.wisesecurity.ucs.common.utils.SpUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDataProviderImpl$DataState$Error extends SpUtil {
    public final Exception error;

    public final int hashCode() {
        return this.error.hashCode();
    }

    public LocalDataProviderImpl$DataState$Error(Exception exc) {
        this.error = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDataProviderImpl$DataState$Error) && this.error.equals(((LocalDataProviderImpl$DataState$Error) obj).error);
    }

    public final String toString() {
        return "Error(error=" + this.error + ')';
    }
}
