package com.mapbox.navigator;

import android.os.SystemClock;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PerceptionLaneMarkingFeature implements Serializable {
    private final PerceptionFeatureData data;
    private final LaneMarkingType type;

    public final PerceptionFeatureData getData() {
        return this.data;
    }

    public final LaneMarkingType getType() {
        return this.type;
    }

    public static final class Builder {
        public static int IconCompatParcelizer;
        public static int RemoteActionCompatParcelizer;
        private PerceptionFeatureData data;
        private LaneMarkingType type;

        public final PerceptionFeatureData getData() {
            return this.data;
        }

        public final LaneMarkingType getType() {
            return this.type;
        }

        public Builder(LaneMarkingType laneMarkingType, PerceptionFeatureData perceptionFeatureData) {
            laneMarkingType.getClass();
            perceptionFeatureData.getClass();
            this.type = laneMarkingType;
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setData, reason: collision with other method in class */
        public final /* synthetic */ void m4829setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
        }

        /* JADX INFO: renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m4830setType(LaneMarkingType laneMarkingType) {
            laneMarkingType.getClass();
            this.type = laneMarkingType;
        }

        public final PerceptionLaneMarkingFeature build() {
            LaneMarkingType laneMarkingType = this.type;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (laneMarkingType == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionLaneMarkingFeature through PerceptionLaneMarkingFeature.Builder because type was null.");
                return null;
            }
            if (this.data == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionLaneMarkingFeature through PerceptionLaneMarkingFeature.Builder because data was null.");
                return null;
            }
            laneMarkingType.getClass();
            PerceptionFeatureData perceptionFeatureData = this.data;
            perceptionFeatureData.getClass();
            return new PerceptionLaneMarkingFeature(laneMarkingType, perceptionFeatureData, defaultConstructorMarker);
        }

        public final Builder setData(PerceptionFeatureData perceptionFeatureData) {
            perceptionFeatureData.getClass();
            this.data = perceptionFeatureData;
            return this;
        }

        public final Builder setType(LaneMarkingType laneMarkingType) {
            laneMarkingType.getClass();
            this.type = laneMarkingType;
            return this;
        }

        public static int write() {
            int i = RemoteActionCompatParcelizer;
            int i2 = i % 7338281;
            RemoteActionCompatParcelizer = i + 1;
            if (i2 != 0) {
                return IconCompatParcelizer;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            IconCompatParcelizer = iUptimeMillis;
            return iUptimeMillis;
        }
    }

    public int hashCode() {
        return Objects.hash(this.type, this.data);
    }

    public final Builder toBuilder() {
        return new Builder(this.type, this.data).setType(this.type).setData(this.data);
    }

    private PerceptionLaneMarkingFeature(LaneMarkingType laneMarkingType, PerceptionFeatureData perceptionFeatureData) {
        this.type = laneMarkingType;
        this.data = perceptionFeatureData;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PerceptionLaneMarkingFeature)) {
            return false;
        }
        PerceptionLaneMarkingFeature perceptionLaneMarkingFeature = (PerceptionLaneMarkingFeature) obj;
        if (this.type != perceptionLaneMarkingFeature.type) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, perceptionLaneMarkingFeature.data}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PerceptionLaneMarkingFeature(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ PerceptionLaneMarkingFeature(LaneMarkingType laneMarkingType, PerceptionFeatureData perceptionFeatureData, DefaultConstructorMarker defaultConstructorMarker) {
        this(laneMarkingType, perceptionFeatureData);
    }
}
