package com.mapbox.common;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class TileStoreAmbientCacheFilterOptions implements Serializable {
    private final List<TileDataDomain> domainFilter;
    private final List<TileStoreAmbientCacheType> typeFilter;

    public List<TileDataDomain> getDomainFilter() {
        return this.domainFilter;
    }

    public List<TileStoreAmbientCacheType> getTypeFilter() {
        return this.typeFilter;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.typeFilter, this.domainFilter);
    }

    public TileStoreAmbientCacheFilterOptions(List<TileStoreAmbientCacheType> list, List<TileDataDomain> list2) {
        this.typeFilter = list;
        this.domainFilter = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[typeFilter: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.typeFilter, ", domainFilter: ");
        return MediaSessionCompatQueueItem.read(this.domainFilter, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileStoreAmbientCacheFilterOptions tileStoreAmbientCacheFilterOptions = (TileStoreAmbientCacheFilterOptions) obj;
        return Objects.equals(this.typeFilter, tileStoreAmbientCacheFilterOptions.typeFilter) && Objects.equals(this.domainFilter, tileStoreAmbientCacheFilterOptions.domainFilter);
    }
}
