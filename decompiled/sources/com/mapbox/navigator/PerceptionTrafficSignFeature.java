package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionTrafficSignFeature implements Serializable {
    private final PerceptionFeatureData data;
    private final TrafficSignType type;

    public final PerceptionFeatureData getData() {
        return this.data;
    }

    public final TrafficSignType getType() {
        return this.type;
    }

    public static final class Builder {
        private PerceptionFeatureData data;
        private TrafficSignType type;

        public final PerceptionFeatureData getData() {
            return this.data;
        }

        public final TrafficSignType getType() {
            return this.type;
        }

        public Builder(TrafficSignType trafficSignType, PerceptionFeatureData perceptionFeatureData) {
            trafficSignType.getClass();
            perceptionFeatureData.getClass();
            this.type = trafficSignType;
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setData, reason: collision with other method in class */
        public final /* synthetic */ void m4835setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m4836setType(TrafficSignType trafficSignType) {
            trafficSignType.getClass();
            this.type = trafficSignType;
        }

        public final PerceptionTrafficSignFeature build() {
            TrafficSignType trafficSignType = this.type;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (trafficSignType == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionTrafficSignFeature through PerceptionTrafficSignFeature.Builder because type was null.");
                return null;
            }
            if (this.data == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionTrafficSignFeature through PerceptionTrafficSignFeature.Builder because data was null.");
                return null;
            }
            trafficSignType.getClass();
            PerceptionFeatureData perceptionFeatureData = this.data;
            perceptionFeatureData.getClass();
            return new PerceptionTrafficSignFeature(trafficSignType, perceptionFeatureData, defaultConstructorMarker);
        }

        public final Builder setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
            return this;
        }

        public final Builder setType(TrafficSignType trafficSignType) {
            trafficSignType.getClass();
            this.type = trafficSignType;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.type, this.data);
    }

    public final Builder toBuilder() {
        return new Builder(this.type, this.data).setType(this.type).setData(this.data);
    }

    private PerceptionTrafficSignFeature(TrafficSignType trafficSignType, PerceptionFeatureData perceptionFeatureData) {
        this.type = trafficSignType;
        this.data = perceptionFeatureData;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PerceptionTrafficSignFeature)) {
            return false;
        }
        PerceptionTrafficSignFeature perceptionTrafficSignFeature = (PerceptionTrafficSignFeature) obj;
        if (this.type != perceptionTrafficSignFeature.type) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, perceptionTrafficSignFeature.data}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PerceptionTrafficSignFeature(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ PerceptionTrafficSignFeature(TrafficSignType trafficSignType, PerceptionFeatureData perceptionFeatureData, DefaultConstructorMarker defaultConstructorMarker) {
        this(trafficSignType, perceptionFeatureData);
    }
}
