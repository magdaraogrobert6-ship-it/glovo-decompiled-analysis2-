package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class RoutesLaneGuidance implements Serializable {
    private final List<RouteLaneGuidance> alternatives;
    private final RouteLaneGuidance current;

    public List<RouteLaneGuidance> getAlternatives() {
        return this.alternatives;
    }

    public RouteLaneGuidance getCurrent() {
        return this.current;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.current, this.alternatives);
    }

    public RoutesLaneGuidance(RouteLaneGuidance routeLaneGuidance, List<RouteLaneGuidance> list) {
        this.current = routeLaneGuidance;
        this.alternatives = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[current: ");
        sb.append(RecordUtils.fieldToString(this.current));
        sb.append(", alternatives: ");
        return MediaSessionCompatQueueItem.read(this.alternatives, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutesLaneGuidance routesLaneGuidance = (RoutesLaneGuidance) obj;
        return Objects.equals(this.current, routesLaneGuidance.current) && Objects.equals(this.alternatives, routesLaneGuidance.alternatives);
    }
}
