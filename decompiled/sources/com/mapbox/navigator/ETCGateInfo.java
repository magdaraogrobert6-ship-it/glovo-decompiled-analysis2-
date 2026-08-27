package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class ETCGateInfo implements Serializable {
    private final int id;
    private final long monotonicTimestampNanoseconds;

    public int getId() {
        return this.id;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ETCGateInfo(int i, long j) {
        this.id = i;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.write(this.id, ", monotonicTimestampNanoseconds: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ETCGateInfo eTCGateInfo = (ETCGateInfo) obj;
        return this.id == eTCGateInfo.id && this.monotonicTimestampNanoseconds == eTCGateInfo.monotonicTimestampNanoseconds;
    }
}
