package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public final class StyleAttributionsChanged implements Serializable {
    private final List<String> attributions;
    private final Date timestamp;

    public List<String> getAttributions() {
        return this.attributions;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.attributions, this.timestamp);
    }

    public StyleAttributionsChanged(List<String> list, Date date) {
        this.attributions = list;
        this.timestamp = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[attributions: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.attributions, ", timestamp: ");
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleAttributionsChanged.class != obj.getClass()) {
            return false;
        }
        StyleAttributionsChanged styleAttributionsChanged = (StyleAttributionsChanged) obj;
        return Objects.equals(this.attributions, styleAttributionsChanged.attributions) && Objects.equals(this.timestamp, styleAttributionsChanged.timestamp);
    }
}
