package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class DetectedObject implements Serializable {
    private final Float bearing;
    private final DetectedObjectCategory category;
    private final Point3d center;
    private final Float confidence;
    private final List<Float> dimensions;
    private final long id;
    private final Float speed;
    private final DetectionState state;
    private final String type;

    public static final class Builder {
        private Float bearing;
        private DetectedObjectCategory category;
        private Point3d center;
        private Float confidence;
        private List<Float> dimensions;
        private long id;
        private Float speed;
        private DetectionState state;
        private String type;

        public final Float getBearing() {
            return this.bearing;
        }

        public final DetectedObjectCategory getCategory() {
            return this.category;
        }

        public final Point3d getCenter() {
            return this.center;
        }

        public final Float getConfidence() {
            return this.confidence;
        }

        public final List<Float> getDimensions() {
            return this.dimensions;
        }

        public final long getId() {
            return this.id;
        }

        public final Float getSpeed() {
            return this.speed;
        }

        public final DetectionState getState() {
            return this.state;
        }

        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: setBearing, reason: collision with other method in class */
        public final /* synthetic */ void m4793setBearing(Float f) {
            this.bearing = f;
        }

        /* JADX INFO: renamed from: setConfidence, reason: collision with other method in class */
        public final /* synthetic */ void m4796setConfidence(Float f) {
            this.confidence = f;
        }

        /* JADX INFO: renamed from: setDimensions, reason: collision with other method in class */
        public final /* synthetic */ void m4797setDimensions(List list) {
            this.dimensions = list;
        }

        /* JADX INFO: renamed from: setId, reason: collision with other method in class */
        public final /* synthetic */ void m4798setId(long j) {
            this.id = j;
        }

        /* JADX INFO: renamed from: setSpeed, reason: collision with other method in class */
        public final /* synthetic */ void m4799setSpeed(Float f) {
            this.speed = f;
        }

        /* JADX INFO: renamed from: setState, reason: collision with other method in class */
        public final /* synthetic */ void m4800setState(DetectionState detectionState) {
            this.state = detectionState;
        }

        public final DetectedObject build() {
            long j = this.id;
            String str = this.type;
            if (str == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of DetectedObject through DetectedObject.Builder because type was null.");
                return null;
            }
            if (this.category == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of DetectedObject through DetectedObject.Builder because category was null.");
                return null;
            }
            if (this.center == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of DetectedObject through DetectedObject.Builder because center was null.");
                return null;
            }
            str.getClass();
            DetectedObjectCategory detectedObjectCategory = this.category;
            detectedObjectCategory.getClass();
            DetectionState detectionState = this.state;
            Point3d point3d = this.center;
            point3d.getClass();
            return new DetectedObject(j, str, detectedObjectCategory, detectionState, point3d, this.bearing, this.speed, this.confidence, this.dimensions, null);
        }

        public Builder(long j, String str, DetectedObjectCategory detectedObjectCategory, Point3d point3d) {
            str.getClass();
            detectedObjectCategory.getClass();
            point3d.getClass();
            this.id = j;
            this.type = str;
            this.category = detectedObjectCategory;
            this.center = point3d;
        }

        public final Builder setBearing(Float f) {
            this.bearing = f;
            return this;
        }

        /* JADX INFO: renamed from: setCategory, reason: collision with other method in class */
        public final /* synthetic */ void m4794setCategory(DetectedObjectCategory detectedObjectCategory) {
            detectedObjectCategory.getClass();
            this.category = detectedObjectCategory;
        }

        /* JADX INFO: renamed from: setCenter, reason: collision with other method in class */
        public final /* synthetic */ void m4795setCenter(Point3d point3d) {
            point3d.getClass();
            this.center = point3d;
        }

        public final Builder setConfidence(Float f) {
            this.confidence = f;
            return this;
        }

        public final Builder setDimensions(List<Float> list) {
            this.dimensions = list;
            return this;
        }

        public final Builder setId(long j) {
            this.id = j;
            return this;
        }

        public final Builder setSpeed(Float f) {
            this.speed = f;
            return this;
        }

        public final Builder setState(DetectionState detectionState) {
            this.state = detectionState;
            return this;
        }

        /* JADX INFO: renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m4801setType(String str) {
            str.getClass();
            this.type = str;
        }

        public final Builder setCategory(DetectedObjectCategory detectedObjectCategory) {
            detectedObjectCategory.getClass();
            this.category = detectedObjectCategory;
            return this;
        }

        public final Builder setCenter(Point3d point3d) {
            point3d.getClass();
            this.center = point3d;
            return this;
        }

        public final Builder setType(String str) {
            str.getClass();
            this.type = str;
            return this;
        }
    }

    public final Float getBearing() {
        return this.bearing;
    }

    public final DetectedObjectCategory getCategory() {
        return this.category;
    }

    public final Point3d getCenter() {
        return this.center;
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final List<Float> getDimensions() {
        return this.dimensions;
    }

    public final long getId() {
        return this.id;
    }

    public final Float getSpeed() {
        return this.speed;
    }

    public final DetectionState getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public final Builder toBuilder() {
        return new Builder(this.id, this.type, this.category, this.center).setId(this.id).setType(this.type).setCategory(this.category).setState(this.state).setCenter(this.center).setBearing(this.bearing).setSpeed(this.speed).setConfidence(this.confidence).setDimensions(this.dimensions);
    }

    private DetectedObject(long j, String str, DetectedObjectCategory detectedObjectCategory, DetectionState detectionState, Point3d point3d, Float f, Float f2, Float f3, List<Float> list) {
        this.id = j;
        this.type = str;
        this.category = detectedObjectCategory;
        this.state = detectionState;
        this.center = point3d;
        this.bearing = f;
        this.speed = f2;
        this.confidence = f3;
        this.dimensions = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DetectedObject)) {
            return false;
        }
        DetectedObject detectedObject = (DetectedObject) obj;
        if (this.id != detectedObject.id) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, detectedObject.type}, getCieXyz.write())).booleanValue() || this.category != detectedObject.category) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.state, detectedObject.state}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.center, detectedObject.center}, getCieXyz.write())).booleanValue() || !removeNodeAtDepth.IconCompatParcelizer(this.bearing, detectedObject.bearing) || !removeNodeAtDepth.IconCompatParcelizer(this.speed, detectedObject.speed) || !removeNodeAtDepth.IconCompatParcelizer(this.confidence, detectedObject.confidence)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dimensions, detectedObject.dimensions}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DetectedObject(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", center=");
        sb.append(this.center);
        sb.append(", bearing=");
        sb.append(this.bearing);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", confidence=");
        sb.append(this.confidence);
        sb.append(", dimensions=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.dimensions, ')');
    }

    public int hashCode() {
        long j = this.id;
        return Objects.hash(Long.valueOf(j), this.type, this.category, this.state, this.center, this.bearing, this.speed, this.confidence, this.dimensions);
    }

    public /* synthetic */ DetectedObject(long j, String str, DetectedObjectCategory detectedObjectCategory, DetectionState detectionState, Point3d point3d, Float f, Float f2, Float f3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, detectedObjectCategory, detectionState, point3d, f, f2, f3, list);
    }
}
