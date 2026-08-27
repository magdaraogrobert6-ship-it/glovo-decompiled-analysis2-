package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RequestCancelled implements Serializable {
    private final String reason;

    public String getReason() {
        return this.reason;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.reason);
    }

    public RequestCancelled(String str) {
        this.reason = str;
    }

    public String toString() {
        return SweepGradientShader9KIMszodefault.read(new StringBuilder("[reason: "), this.reason, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.reason, ((RequestCancelled) obj).reason);
    }
}
