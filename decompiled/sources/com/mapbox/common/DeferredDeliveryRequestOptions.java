package com.mapbox.common;

import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class DeferredDeliveryRequestOptions implements Serializable {
    private final long ttl;

    public long getTtl() {
        return this.ttl;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public String toString() {
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.ttl, "]", new StringBuilder("[ttl: "));
    }

    public DeferredDeliveryRequestOptions() {
        this.ttl = 0L;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.ttl));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.ttl == ((DeferredDeliveryRequestOptions) obj).ttl;
    }

    public DeferredDeliveryRequestOptions(long j) {
        this.ttl = j;
    }
}
