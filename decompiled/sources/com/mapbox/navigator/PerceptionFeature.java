package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionFeature {
    public static final Companion Companion = new Companion(null);
    private Type type;
    private Object value;

    public enum Type {
        PERCEPTION_LANE_MARKING_FEATURE,
        PERCEPTION_ROAD_EDGE_FEATURE,
        PERCEPTION_ROAD_MARKING_FEATURE,
        PERCEPTION_TRAFFIC_SIGN_FEATURE
    }

    public final Type getTypeInfo() {
        return this.type;
    }

    public static final PerceptionFeature valueOf(PerceptionLaneMarkingFeature perceptionLaneMarkingFeature) {
        return Companion.valueOf(perceptionLaneMarkingFeature);
    }

    public final boolean isPerceptionLaneMarkingFeature() {
        return this.type == Type.PERCEPTION_LANE_MARKING_FEATURE;
    }

    public final boolean isPerceptionRoadEdgeFeature() {
        return this.type == Type.PERCEPTION_ROAD_EDGE_FEATURE;
    }

    public final boolean isPerceptionRoadMarkingFeature() {
        return this.type == Type.PERCEPTION_ROAD_MARKING_FEATURE;
    }

    public final boolean isPerceptionTrafficSignFeature() {
        return this.type == Type.PERCEPTION_TRAFFIC_SIGN_FEATURE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PerceptionFeature valueOf(PerceptionLaneMarkingFeature perceptionLaneMarkingFeature) {
            perceptionLaneMarkingFeature.getClass();
            return new PerceptionFeature(perceptionLaneMarkingFeature);
        }

        public final PerceptionFeature valueOf(PerceptionRoadEdgeFeature perceptionRoadEdgeFeature) {
            perceptionRoadEdgeFeature.getClass();
            return new PerceptionFeature(perceptionRoadEdgeFeature);
        }

        public final PerceptionFeature valueOf(PerceptionRoadMarkingFeature perceptionRoadMarkingFeature) {
            perceptionRoadMarkingFeature.getClass();
            return new PerceptionFeature(perceptionRoadMarkingFeature);
        }

        public final PerceptionFeature valueOf(PerceptionTrafficSignFeature perceptionTrafficSignFeature) {
            perceptionTrafficSignFeature.getClass();
            return new PerceptionFeature(perceptionTrafficSignFeature);
        }
    }

    public PerceptionFeature(PerceptionLaneMarkingFeature perceptionLaneMarkingFeature) {
        perceptionLaneMarkingFeature.getClass();
        this.type = Type.PERCEPTION_LANE_MARKING_FEATURE;
        this.value = perceptionLaneMarkingFeature;
    }

    public final PerceptionLaneMarkingFeature getPerceptionLaneMarkingFeature() {
        if (!isPerceptionLaneMarkingFeature()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PerceptionLaneMarkingFeature)");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (PerceptionLaneMarkingFeature) obj;
    }

    public final PerceptionRoadEdgeFeature getPerceptionRoadEdgeFeature() {
        if (!isPerceptionRoadEdgeFeature()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PerceptionRoadEdgeFeature)");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (PerceptionRoadEdgeFeature) obj;
    }

    public final PerceptionRoadMarkingFeature getPerceptionRoadMarkingFeature() {
        if (!isPerceptionRoadMarkingFeature()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PerceptionRoadMarkingFeature)");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (PerceptionRoadMarkingFeature) obj;
    }

    public final PerceptionTrafficSignFeature getPerceptionTrafficSignFeature() {
        if (!isPerceptionTrafficSignFeature()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PerceptionTrafficSignFeature)");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (PerceptionTrafficSignFeature) obj;
    }

    public static final PerceptionFeature valueOf(PerceptionRoadEdgeFeature perceptionRoadEdgeFeature) {
        return Companion.valueOf(perceptionRoadEdgeFeature);
    }

    public static final PerceptionFeature valueOf(PerceptionRoadMarkingFeature perceptionRoadMarkingFeature) {
        return Companion.valueOf(perceptionRoadMarkingFeature);
    }

    public static final PerceptionFeature valueOf(PerceptionTrafficSignFeature perceptionTrafficSignFeature) {
        return Companion.valueOf(perceptionTrafficSignFeature);
    }

    public PerceptionFeature(PerceptionRoadEdgeFeature perceptionRoadEdgeFeature) {
        perceptionRoadEdgeFeature.getClass();
        this.type = Type.PERCEPTION_ROAD_EDGE_FEATURE;
        this.value = perceptionRoadEdgeFeature;
    }

    public PerceptionFeature(PerceptionRoadMarkingFeature perceptionRoadMarkingFeature) {
        perceptionRoadMarkingFeature.getClass();
        this.type = Type.PERCEPTION_ROAD_MARKING_FEATURE;
        this.value = perceptionRoadMarkingFeature;
    }

    public PerceptionFeature(PerceptionTrafficSignFeature perceptionTrafficSignFeature) {
        perceptionTrafficSignFeature.getClass();
        this.type = Type.PERCEPTION_TRAFFIC_SIGN_FEATURE;
        this.value = perceptionTrafficSignFeature;
    }
}
