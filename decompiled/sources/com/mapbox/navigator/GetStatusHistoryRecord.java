package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class GetStatusHistoryRecord implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final NavigationStatus result;

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public NavigationStatus getResult() {
        return this.result;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GetStatusHistoryRecord(long j, NavigationStatus navigationStatus) {
        this.monotonicTimestampNanoseconds = j;
        this.result = navigationStatus;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[monotonicTimestampNanoseconds: ");
        af$$ExternalSyntheticOutline1.m(this.monotonicTimestampNanoseconds, ", result: ", sb);
        sb.append(RecordUtils.fieldToString(this.result));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.monotonicTimestampNanoseconds;
        return Objects.hash(Long.valueOf(j), this.result);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetStatusHistoryRecord getStatusHistoryRecord = (GetStatusHistoryRecord) obj;
        return this.monotonicTimestampNanoseconds == getStatusHistoryRecord.monotonicTimestampNanoseconds && Objects.equals(this.result, getStatusHistoryRecord.result);
    }
}
