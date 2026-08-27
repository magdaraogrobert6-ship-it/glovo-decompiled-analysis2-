package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public final class RenderedRasterQueryOptions implements Serializable {
    private final List<String> layers;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private List<String> layers;

        public Builder layers(List<String> list) {
            this.layers = list;
            return this;
        }

        public RenderedRasterQueryOptions build() {
            return new RenderedRasterQueryOptions(this.layers);
        }
    }

    public List<String> getLayers() {
        return this.layers;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.layers);
    }

    public Builder toBuilder() {
        return new Builder().layers(this.layers);
    }

    private RenderedRasterQueryOptions(List<String> list) {
        this.layers = list;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read(this.layers, new StringBuilder("[layers: "), "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && RenderedRasterQueryOptions.class == obj.getClass() && Objects.equals(this.layers, ((RenderedRasterQueryOptions) obj).layers);
    }
}
