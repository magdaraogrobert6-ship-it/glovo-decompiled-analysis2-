package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public class UpcomingRouteAlertUpdate implements Serializable {
    private final double distanceToStart;
    private final String id;

    public double getDistanceToStart() {
        return this.distanceToStart;
    }

    public String getId() {
        return this.id;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, Double.valueOf(this.distanceToStart));
    }

    public UpcomingRouteAlertUpdate(String str, double d) {
        this.id = str;
        this.distanceToStart = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", distanceToStart: ");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.distanceToStart, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpcomingRouteAlertUpdate upcomingRouteAlertUpdate = (UpcomingRouteAlertUpdate) obj;
        return Objects.equals(this.id, upcomingRouteAlertUpdate.id) && PartialEq.compare(this.distanceToStart, upcomingRouteAlertUpdate.distanceToStart);
    }
}
