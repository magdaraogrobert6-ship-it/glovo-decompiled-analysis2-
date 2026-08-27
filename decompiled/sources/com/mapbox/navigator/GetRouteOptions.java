package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class GetRouteOptions implements Serializable {
    private final Long timeoutSeconds;

    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.timeoutSeconds);
    }

    public GetRouteOptions(Long l) {
        this.timeoutSeconds = l;
    }

    public String toString() {
        return "[timeoutSeconds: " + RecordUtils.fieldToString(this.timeoutSeconds) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.timeoutSeconds, ((GetRouteOptions) obj).timeoutSeconds);
    }
}
