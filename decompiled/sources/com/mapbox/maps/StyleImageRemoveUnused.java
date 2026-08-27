package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public final class StyleImageRemoveUnused implements Serializable {
    private final String imageId;
    private final Date timestamp;

    public String getImageId() {
        return this.imageId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.imageId, this.timestamp);
    }

    public StyleImageRemoveUnused(String str, Date date) {
        this.imageId = str;
        this.timestamp = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[imageId: ");
        IconCompatParcelizer.read(sb, this.imageId, ", timestamp: ");
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleImageRemoveUnused.class != obj.getClass()) {
            return false;
        }
        StyleImageRemoveUnused styleImageRemoveUnused = (StyleImageRemoveUnused) obj;
        return Objects.equals(this.imageId, styleImageRemoveUnused.imageId) && Objects.equals(this.timestamp, styleImageRemoveUnused.timestamp);
    }
}
