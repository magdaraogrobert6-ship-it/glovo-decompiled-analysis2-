package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes2.dex */
public class TileCacheBudgetInTiles implements Serializable {
    private final long size;

    public long getSize() {
        return this.size;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public TileCacheBudgetInTiles(long j) {
        this.size = j;
    }

    public String toString() {
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.size, "]", new StringBuilder("[size: "));
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.size));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.size == ((TileCacheBudgetInTiles) obj).size;
    }
}
