package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public final class SourceQueryOptions implements Serializable {
    private final Value filter;
    private final List<String> sourceLayerIds;

    public Value getFilter() {
        return this.filter;
    }

    public List<String> getSourceLayerIds() {
        return this.sourceLayerIds;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.sourceLayerIds, this.filter);
    }

    public SourceQueryOptions(List<String> list, Value value) {
        this.sourceLayerIds = list;
        this.filter = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sourceLayerIds: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.sourceLayerIds, ", filter: ");
        sb.append(RecordUtils.fieldToString(this.filter));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceQueryOptions.class != obj.getClass()) {
            return false;
        }
        SourceQueryOptions sourceQueryOptions = (SourceQueryOptions) obj;
        return Objects.equals(this.sourceLayerIds, sourceQueryOptions.sourceLayerIds) && Objects.equals(this.filter, sourceQueryOptions.filter);
    }
}
