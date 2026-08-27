package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public final class SourceDataLoaded implements Serializable {
    private final String dataId;
    private final Boolean loaded;
    private final String sourceId;
    private final CanonicalTileID tileId;
    private final EventTimeInterval timeInterval;
    private final SourceDataLoadedType type;

    public String getDataId() {
        return this.dataId;
    }

    public Boolean getLoaded() {
        return this.loaded;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public CanonicalTileID getTileId() {
        return this.tileId;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public SourceDataLoadedType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.sourceId, this.type, this.loaded, this.tileId, this.dataId, this.timeInterval);
    }

    public SourceDataLoaded(String str, SourceDataLoadedType sourceDataLoadedType, Boolean bool, CanonicalTileID canonicalTileID, String str2, EventTimeInterval eventTimeInterval) {
        this.sourceId = str;
        this.type = sourceDataLoadedType;
        this.loaded = bool;
        this.tileId = canonicalTileID;
        this.dataId = str2;
        this.timeInterval = eventTimeInterval;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sourceId: ");
        IconCompatParcelizer.read(sb, this.sourceId, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", loaded: ");
        getBitmapFromCache.write(sb, ", tileId: ", this.loaded);
        sb.append(RecordUtils.fieldToString(this.tileId));
        sb.append(", dataId: ");
        IconCompatParcelizer.read(sb, this.dataId, ", timeInterval: ");
        sb.append(RecordUtils.fieldToString(this.timeInterval));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceDataLoaded.class != obj.getClass()) {
            return false;
        }
        SourceDataLoaded sourceDataLoaded = (SourceDataLoaded) obj;
        return Objects.equals(this.sourceId, sourceDataLoaded.sourceId) && Objects.equals(this.type, sourceDataLoaded.type) && Objects.equals(this.loaded, sourceDataLoaded.loaded) && Objects.equals(this.tileId, sourceDataLoaded.tileId) && Objects.equals(this.dataId, sourceDataLoaded.dataId) && Objects.equals(this.timeInterval, sourceDataLoaded.timeInterval);
    }
}
