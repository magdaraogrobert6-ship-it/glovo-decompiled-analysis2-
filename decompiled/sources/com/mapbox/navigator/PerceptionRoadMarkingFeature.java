package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionRoadMarkingFeature implements Serializable {
    private final PerceptionFeatureData data;
    private final RoadMarkingType type;

    public final PerceptionFeatureData getData() {
        return this.data;
    }

    public final RoadMarkingType getType() {
        return this.type;
    }

    public static final class Builder {
        private PerceptionFeatureData data;
        private RoadMarkingType type;

        public final PerceptionFeatureData getData() {
            return this.data;
        }

        public final RoadMarkingType getType() {
            return this.type;
        }

        public Builder(RoadMarkingType roadMarkingType, PerceptionFeatureData perceptionFeatureData) {
            roadMarkingType.getClass();
            perceptionFeatureData.getClass();
            this.type = roadMarkingType;
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setData, reason: collision with other method in class */
        public final /* synthetic */ void m4833setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m4834setType(RoadMarkingType roadMarkingType) {
            roadMarkingType.getClass();
            this.type = roadMarkingType;
        }

        public final PerceptionRoadMarkingFeature build() {
            RoadMarkingType roadMarkingType = this.type;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (roadMarkingType == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionRoadMarkingFeature through PerceptionRoadMarkingFeature.Builder because type was null.");
                return null;
            }
            if (this.data == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionRoadMarkingFeature through PerceptionRoadMarkingFeature.Builder because data was null.");
                return null;
            }
            roadMarkingType.getClass();
            PerceptionFeatureData perceptionFeatureData = this.data;
            perceptionFeatureData.getClass();
            return new PerceptionRoadMarkingFeature(roadMarkingType, perceptionFeatureData, defaultConstructorMarker);
        }

        public final Builder setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
            return this;
        }

        public final Builder setType(RoadMarkingType roadMarkingType) {
            roadMarkingType.getClass();
            this.type = roadMarkingType;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.type, this.data);
    }

    public final Builder toBuilder() {
        return new Builder(this.type, this.data).setType(this.type).setData(this.data);
    }

    private PerceptionRoadMarkingFeature(RoadMarkingType roadMarkingType, PerceptionFeatureData perceptionFeatureData) {
        this.type = roadMarkingType;
        this.data = perceptionFeatureData;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PerceptionRoadMarkingFeature)) {
            return false;
        }
        PerceptionRoadMarkingFeature perceptionRoadMarkingFeature = (PerceptionRoadMarkingFeature) obj;
        if (this.type != perceptionRoadMarkingFeature.type) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, perceptionRoadMarkingFeature.data}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PerceptionRoadMarkingFeature(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ PerceptionRoadMarkingFeature(RoadMarkingType roadMarkingType, PerceptionFeatureData perceptionFeatureData, DefaultConstructorMarker defaultConstructorMarker) {
        this(roadMarkingType, perceptionFeatureData);
    }
}
