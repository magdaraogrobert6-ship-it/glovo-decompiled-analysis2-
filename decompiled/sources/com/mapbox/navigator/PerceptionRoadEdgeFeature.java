package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionRoadEdgeFeature implements Serializable {
    private final PerceptionFeatureData data;
    private final RoadEdgeType type;

    public final PerceptionFeatureData getData() {
        return this.data;
    }

    public final RoadEdgeType getType() {
        return this.type;
    }

    public static final class Builder {
        private PerceptionFeatureData data;
        private RoadEdgeType type;

        public final PerceptionFeatureData getData() {
            return this.data;
        }

        public final RoadEdgeType getType() {
            return this.type;
        }

        public Builder(RoadEdgeType roadEdgeType, PerceptionFeatureData perceptionFeatureData) {
            roadEdgeType.getClass();
            perceptionFeatureData.getClass();
            this.type = roadEdgeType;
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setData, reason: collision with other method in class */
        public final /* synthetic */ void m4831setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m4832setType(RoadEdgeType roadEdgeType) {
            roadEdgeType.getClass();
            this.type = roadEdgeType;
        }

        public final PerceptionRoadEdgeFeature build() {
            RoadEdgeType roadEdgeType = this.type;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (roadEdgeType == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionRoadEdgeFeature through PerceptionRoadEdgeFeature.Builder because type was null.");
                return null;
            }
            if (this.data == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionRoadEdgeFeature through PerceptionRoadEdgeFeature.Builder because data was null.");
                return null;
            }
            roadEdgeType.getClass();
            PerceptionFeatureData perceptionFeatureData = this.data;
            perceptionFeatureData.getClass();
            return new PerceptionRoadEdgeFeature(roadEdgeType, perceptionFeatureData, defaultConstructorMarker);
        }

        public final Builder setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
            return this;
        }

        public final Builder setType(RoadEdgeType roadEdgeType) {
            roadEdgeType.getClass();
            this.type = roadEdgeType;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.type, this.data);
    }

    public final Builder toBuilder() {
        return new Builder(this.type, this.data).setType(this.type).setData(this.data);
    }

    private PerceptionRoadEdgeFeature(RoadEdgeType roadEdgeType, PerceptionFeatureData perceptionFeatureData) {
        this.type = roadEdgeType;
        this.data = perceptionFeatureData;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PerceptionRoadEdgeFeature)) {
            return false;
        }
        PerceptionRoadEdgeFeature perceptionRoadEdgeFeature = (PerceptionRoadEdgeFeature) obj;
        if (this.type != perceptionRoadEdgeFeature.type) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, perceptionRoadEdgeFeature.data}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PerceptionRoadEdgeFeature(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ PerceptionRoadEdgeFeature(RoadEdgeType roadEdgeType, PerceptionFeatureData perceptionFeatureData, DefaultConstructorMarker defaultConstructorMarker) {
        this(roadEdgeType, perceptionFeatureData);
    }
}
