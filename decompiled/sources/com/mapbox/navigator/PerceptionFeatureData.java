package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PerceptionFeatureData implements Serializable {
    private final List<Float> accuracy;
    private final Float angle;
    private final FeatureColor color;
    private final Value extras;
    private final List<Point3d> geometry;
    private final Long id;
    private final Float probability;

    public final List<Float> getAccuracy() {
        return this.accuracy;
    }

    public final Float getAngle() {
        return this.angle;
    }

    public final FeatureColor getColor() {
        return this.color;
    }

    public final Value getExtras() {
        return this.extras;
    }

    public final List<Point3d> getGeometry() {
        return this.geometry;
    }

    public final Long getId() {
        return this.id;
    }

    public final Float getProbability() {
        return this.probability;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Builder {
        private List<Float> accuracy;
        private Float angle;
        private FeatureColor color;
        private Value extras;
        private List<? extends Point3d> geometry;
        private Long id;
        private Float probability;

        public final List<Float> getAccuracy() {
            return this.accuracy;
        }

        public final Float getAngle() {
            return this.angle;
        }

        public final FeatureColor getColor() {
            return this.color;
        }

        public final Value getExtras() {
            return this.extras;
        }

        public final List<Point3d> getGeometry() {
            return this.geometry;
        }

        public final Long getId() {
            return this.id;
        }

        public final Float getProbability() {
            return this.probability;
        }

        /* JADX INFO: renamed from: setAccuracy, reason: collision with other method in class */
        public final /* synthetic */ void m4822setAccuracy(List list) {
            this.accuracy = list;
        }

        /* JADX INFO: renamed from: setAngle, reason: collision with other method in class */
        public final /* synthetic */ void m4823setAngle(Float f) {
            this.angle = f;
        }

        /* JADX INFO: renamed from: setColor, reason: collision with other method in class */
        public final /* synthetic */ void m4824setColor(FeatureColor featureColor) {
            this.color = featureColor;
        }

        /* JADX INFO: renamed from: setExtras, reason: collision with other method in class */
        public final /* synthetic */ void m4825setExtras(Value value) {
            this.extras = value;
        }

        /* JADX INFO: renamed from: setId, reason: collision with other method in class */
        public final /* synthetic */ void m4827setId(Long l) {
            this.id = l;
        }

        /* JADX INFO: renamed from: setProbability, reason: collision with other method in class */
        public final /* synthetic */ void m4828setProbability(Float f) {
            this.probability = f;
        }

        public Builder(List<? extends Point3d> list) {
            list.getClass();
            this.geometry = list;
        }

        public final Builder setAccuracy(List<Float> list) {
            this.accuracy = list;
            return this;
        }

        public final Builder setAngle(Float f) {
            this.angle = f;
            return this;
        }

        public final Builder setColor(FeatureColor featureColor) {
            this.color = featureColor;
            return this;
        }

        public final Builder setExtras(Value value) {
            this.extras = value;
            return this;
        }

        /* JADX INFO: renamed from: setGeometry, reason: collision with other method in class */
        public final /* synthetic */ void m4826setGeometry(List list) {
            list.getClass();
            this.geometry = list;
        }

        public final Builder setId(Long l) {
            this.id = l;
            return this;
        }

        public final Builder setProbability(Float f) {
            this.probability = f;
            return this;
        }

        public final PerceptionFeatureData build() {
            List<? extends Point3d> list = this.geometry;
            if (list == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionFeatureData through PerceptionFeatureData.Builder because geometry was null.");
                return null;
            }
            Long l = this.id;
            list.getClass();
            return new PerceptionFeatureData(l, list, this.angle, this.color, this.probability, this.accuracy, this.extras, null);
        }

        public final Builder setGeometry(List<? extends Point3d> list) {
            list.getClass();
            this.geometry = list;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.id, this.geometry, this.angle, this.color, this.probability, this.accuracy, this.extras);
    }

    public final Builder toBuilder() {
        return new Builder(this.geometry).setId(this.id).setGeometry((List<? extends Point3d>) this.geometry).setAngle(this.angle).setColor(this.color).setProbability(this.probability).setAccuracy(this.accuracy).setExtras(this.extras);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PerceptionFeatureData(Long l, List<? extends Point3d> list, Float f, FeatureColor featureColor, Float f2, List<Float> list2, Value value) {
        this.id = l;
        this.geometry = list;
        this.angle = f;
        this.color = featureColor;
        this.probability = f2;
        this.accuracy = list2;
        this.extras = value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PerceptionFeatureData)) {
            return false;
        }
        PerceptionFeatureData perceptionFeatureData = (PerceptionFeatureData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, perceptionFeatureData.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.geometry, perceptionFeatureData.geometry}, getCieXyz.write())).booleanValue() || !removeNodeAtDepth.IconCompatParcelizer(this.angle, perceptionFeatureData.angle) || this.color != perceptionFeatureData.color || !removeNodeAtDepth.IconCompatParcelizer(this.probability, perceptionFeatureData.probability)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accuracy, perceptionFeatureData.accuracy}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.extras, perceptionFeatureData.extras}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PerceptionFeatureData(id=" + this.id + ", geometry=" + this.geometry + ", angle=" + this.angle + ", color=" + this.color + ", probability=" + this.probability + ", accuracy=" + this.accuracy + ", extras=" + this.extras + ')';
    }

    public /* synthetic */ PerceptionFeatureData(Long l, List list, Float f, FeatureColor featureColor, Float f2, List list2, Value value, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, list, f, featureColor, f2, list2, value);
    }
}
