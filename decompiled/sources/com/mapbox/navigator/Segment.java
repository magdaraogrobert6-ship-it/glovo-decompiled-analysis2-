package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class Segment implements Serializable {
    private final AdasisConfigMessageOptions options;

    public AdasisConfigMessageOptions getOptions() {
        return this.options;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.options);
    }

    public Segment(AdasisConfigMessageOptions adasisConfigMessageOptions) {
        this.options = adasisConfigMessageOptions;
    }

    public String toString() {
        return "[options: " + RecordUtils.fieldToString(this.options) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.options, ((Segment) obj).options);
    }
}
