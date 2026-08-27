package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class RouteLaneGuidance implements Serializable {
    private final double beginDistanceFromStartOfRoute;
    private final List<ConnectedLaneSequence> connectedLaneSequences;
    private final double endDistanceFromStartOfRoute;
    private final String routeId;
    private final List<RouteLaneGroup> routeLaneGroups;

    public double getBeginDistanceFromStartOfRoute() {
        return this.beginDistanceFromStartOfRoute;
    }

    public List<ConnectedLaneSequence> getConnectedLaneSequences() {
        return this.connectedLaneSequences;
    }

    public double getEndDistanceFromStartOfRoute() {
        return this.endDistanceFromStartOfRoute;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public List<RouteLaneGroup> getRouteLaneGroups() {
        return this.routeLaneGroups;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.routeId, this.routeLaneGroups, this.connectedLaneSequences, Double.valueOf(this.beginDistanceFromStartOfRoute), Double.valueOf(this.endDistanceFromStartOfRoute));
    }

    public RouteLaneGuidance(String str, List<RouteLaneGroup> list, List<ConnectedLaneSequence> list2, double d, double d2) {
        this.routeId = str;
        this.routeLaneGroups = list;
        this.connectedLaneSequences = list2;
        this.beginDistanceFromStartOfRoute = d;
        this.endDistanceFromStartOfRoute = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[routeId: ");
        IconCompatParcelizer.read(sb, this.routeId, ", routeLaneGroups: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.routeLaneGroups, ", connectedLaneSequences: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.connectedLaneSequences, ", beginDistanceFromStartOfRoute: ");
        m1$$ExternalSyntheticOutline0.m(this.beginDistanceFromStartOfRoute, ", endDistanceFromStartOfRoute: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.endDistanceFromStartOfRoute, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLaneGuidance routeLaneGuidance = (RouteLaneGuidance) obj;
        return Objects.equals(this.routeId, routeLaneGuidance.routeId) && Objects.equals(this.routeLaneGroups, routeLaneGuidance.routeLaneGroups) && Objects.equals(this.connectedLaneSequences, routeLaneGuidance.connectedLaneSequences) && PartialEq.compare(this.beginDistanceFromStartOfRoute, routeLaneGuidance.beginDistanceFromStartOfRoute) && PartialEq.compare(this.endDistanceFromStartOfRoute, routeLaneGuidance.endDistanceFromStartOfRoute);
    }
}
