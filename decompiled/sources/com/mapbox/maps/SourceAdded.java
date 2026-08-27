package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public final class SourceAdded implements Serializable {
    private final String sourceId;
    private final Date timestamp;

    public String getSourceId() {
        return this.sourceId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.sourceId, this.timestamp);
    }

    public SourceAdded(String str, Date date) {
        this.sourceId = str;
        this.timestamp = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sourceId: ");
        IconCompatParcelizer.read(sb, this.sourceId, ", timestamp: ");
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceAdded.class != obj.getClass()) {
            return false;
        }
        SourceAdded sourceAdded = (SourceAdded) obj;
        return Objects.equals(this.sourceId, sourceAdded.sourceId) && Objects.equals(this.timestamp, sourceAdded.timestamp);
    }
}
