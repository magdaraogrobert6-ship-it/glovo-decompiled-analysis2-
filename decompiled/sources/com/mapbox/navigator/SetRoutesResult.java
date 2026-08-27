package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class SetRoutesResult implements Serializable {
    private final List<RouteAlternative> alternatives;
    private final RouteInterface primaryRoute;

    public List<RouteAlternative> getAlternatives() {
        return this.alternatives;
    }

    public RouteInterface getPrimaryRoute() {
        return this.primaryRoute;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.primaryRoute, this.alternatives);
    }

    public SetRoutesResult(RouteInterface routeInterface, List<RouteAlternative> list) {
        this.primaryRoute = routeInterface;
        this.alternatives = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[primaryRoute: ");
        sb.append(RecordUtils.fieldToString(this.primaryRoute));
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
        SetRoutesResult setRoutesResult = (SetRoutesResult) obj;
        return Objects.equals(this.primaryRoute, setRoutesResult.primaryRoute) && Objects.equals(this.alternatives, setRoutesResult.alternatives);
    }
}
