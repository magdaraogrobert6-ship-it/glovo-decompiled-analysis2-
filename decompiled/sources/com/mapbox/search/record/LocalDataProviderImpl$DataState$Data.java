package com.mapbox.search.record;

import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import java.util.Map;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDataProviderImpl$DataState$Data extends SpUtil {
    public final Map records;

    public final int hashCode() {
        return this.records.hashCode();
    }

    public LocalDataProviderImpl$DataState$Data(Map map) {
        this.records = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDataProviderImpl$DataState$Data) && this.records.equals(((LocalDataProviderImpl$DataState$Data) obj).records);
    }

    public final String toString() {
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(new StringBuilder("Data(records="), this.records, ')');
    }
}
