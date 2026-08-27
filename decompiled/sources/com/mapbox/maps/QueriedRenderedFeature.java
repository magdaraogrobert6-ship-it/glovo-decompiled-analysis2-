package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public final class QueriedRenderedFeature implements Serializable {
    private final List<String> layers;
    private final QueriedFeature queriedFeature;
    private final List<FeaturesetQueryTarget> targets;

    public List<String> getLayers() {
        return this.layers;
    }

    public QueriedFeature getQueriedFeature() {
        return this.queriedFeature;
    }

    public List<FeaturesetQueryTarget> getTargets() {
        return this.targets;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.queriedFeature, this.layers, this.targets);
    }

    public QueriedRenderedFeature(QueriedFeature queriedFeature, List<String> list, List<FeaturesetQueryTarget> list2) {
        this.queriedFeature = queriedFeature;
        this.layers = list;
        this.targets = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[queriedFeature: ");
        sb.append(RecordUtils.fieldToString(this.queriedFeature));
        sb.append(", layers: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.layers, ", targets: ");
        return MediaSessionCompatQueueItem.read(this.targets, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueriedRenderedFeature.class != obj.getClass()) {
            return false;
        }
        QueriedRenderedFeature queriedRenderedFeature = (QueriedRenderedFeature) obj;
        return Objects.equals(this.queriedFeature, queriedRenderedFeature.queriedFeature) && Objects.equals(this.layers, queriedRenderedFeature.layers) && Objects.equals(this.targets, queriedRenderedFeature.targets);
    }
}
