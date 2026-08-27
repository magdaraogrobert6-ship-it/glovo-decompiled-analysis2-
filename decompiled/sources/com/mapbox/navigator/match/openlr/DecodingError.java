package com.mapbox.navigator.match.openlr;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class DecodingError implements Serializable {
    private final String description;

    public String getDescription() {
        return this.description;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.description);
    }

    public DecodingError(String str) {
        this.description = str;
    }

    public String toString() {
        return SweepGradientShader9KIMszodefault.read(new StringBuilder("[description: "), this.description, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.description, ((DecodingError) obj).description);
    }
}
