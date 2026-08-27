package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public final class MapLoadingError implements Serializable {
    private final String message;
    private final String sourceId;
    private final CanonicalTileID tileId;
    private final Date timestamp;
    private final MapLoadingErrorType type;

    public String getMessage() {
        return this.message;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public CanonicalTileID getTileId() {
        return this.tileId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public MapLoadingErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, this.sourceId, this.tileId, this.timestamp);
    }

    public MapLoadingError(MapLoadingErrorType mapLoadingErrorType, String str, String str2, CanonicalTileID canonicalTileID, Date date) {
        this.type = mapLoadingErrorType;
        this.message = str;
        this.sourceId = str2;
        this.tileId = canonicalTileID;
        this.timestamp = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", message: ");
        IconCompatParcelizer.read(sb, this.message, ", sourceId: ");
        IconCompatParcelizer.read(sb, this.sourceId, ", tileId: ");
        sb.append(RecordUtils.fieldToString(this.tileId));
        sb.append(", timestamp: ");
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapLoadingError.class != obj.getClass()) {
            return false;
        }
        MapLoadingError mapLoadingError = (MapLoadingError) obj;
        return Objects.equals(this.type, mapLoadingError.type) && Objects.equals(this.message, mapLoadingError.message) && Objects.equals(this.sourceId, mapLoadingError.sourceId) && Objects.equals(this.tileId, mapLoadingError.tileId) && Objects.equals(this.timestamp, mapLoadingError.timestamp);
    }
}
