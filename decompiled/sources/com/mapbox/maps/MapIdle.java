package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class MapIdle implements Serializable {
    private final Date timestamp;

    public Date getTimestamp() {
        return this.timestamp;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.timestamp);
    }

    public MapIdle(Date date) {
        this.timestamp = date;
    }

    public String toString() {
        return "[timestamp: " + RecordUtils.fieldToString(this.timestamp) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MapIdle.class == obj.getClass() && Objects.equals(this.timestamp, ((MapIdle) obj).timestamp);
    }
}
