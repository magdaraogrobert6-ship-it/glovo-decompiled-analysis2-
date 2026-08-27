package com.mapbox.maps;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAnnotationOptions implements Serializable {
    private final Boolean allowOverlap;
    private final Boolean allowOverlapWithPuck;
    private final Boolean allowZElevate;
    private final AnnotatedFeature annotatedFeature;
    private final Double height;
    private final Boolean ignoreCameraPadding;
    private final Float maxZoom;
    private final Float minZoom;
    private final Long priority;
    private final Boolean selected;
    private final List<ViewAnnotationAnchorConfig> variableAnchors;
    private final Boolean visible;
    private final Double width;

    public static final class Builder {
        private Boolean allowOverlap;
        private Boolean allowOverlapWithPuck;
        private Boolean allowZElevate;
        private AnnotatedFeature annotatedFeature;
        private Double height;
        private Boolean ignoreCameraPadding;
        private Float maxZoom;
        private Float minZoom;
        private Long priority;
        private Boolean selected;
        private List<ViewAnnotationAnchorConfig> variableAnchors;
        private Boolean visible;
        private Double width;

        public Builder allowOverlap(Boolean bool) {
            this.allowOverlap = bool;
            return this;
        }

        public Builder allowOverlapWithPuck(Boolean bool) {
            this.allowOverlapWithPuck = bool;
            return this;
        }

        public Builder allowZElevate(Boolean bool) {
            this.allowZElevate = bool;
            return this;
        }

        public Builder annotatedFeature(AnnotatedFeature annotatedFeature) {
            this.annotatedFeature = annotatedFeature;
            return this;
        }

        public Builder height(Double d) {
            this.height = d;
            return this;
        }

        public Builder ignoreCameraPadding(Boolean bool) {
            this.ignoreCameraPadding = bool;
            return this;
        }

        public Builder maxZoom(Float f) {
            this.maxZoom = f;
            return this;
        }

        public Builder minZoom(Float f) {
            this.minZoom = f;
            return this;
        }

        public Builder priority(Long l) {
            this.priority = l;
            return this;
        }

        @Deprecated
        public Builder selected(Boolean bool) {
            this.selected = bool;
            return this;
        }

        public Builder variableAnchors(List<ViewAnnotationAnchorConfig> list) {
            this.variableAnchors = list;
            return this;
        }

        public Builder visible(Boolean bool) {
            this.visible = bool;
            return this;
        }

        public Builder width(Double d) {
            this.width = d;
            return this;
        }

        public ViewAnnotationOptions build() {
            return new ViewAnnotationOptions(this.annotatedFeature, this.width, this.height, this.allowOverlap, this.allowOverlapWithPuck, this.allowZElevate, this.visible, this.variableAnchors, this.selected, this.priority, this.ignoreCameraPadding, this.minZoom, this.maxZoom);
        }
    }

    public Boolean getAllowOverlap() {
        return this.allowOverlap;
    }

    public Boolean getAllowOverlapWithPuck() {
        return this.allowOverlapWithPuck;
    }

    public Boolean getAllowZElevate() {
        return this.allowZElevate;
    }

    public AnnotatedFeature getAnnotatedFeature() {
        return this.annotatedFeature;
    }

    public Double getHeight() {
        return this.height;
    }

    public Boolean getIgnoreCameraPadding() {
        return this.ignoreCameraPadding;
    }

    public Float getMaxZoom() {
        return this.maxZoom;
    }

    public Float getMinZoom() {
        return this.minZoom;
    }

    public Long getPriority() {
        return this.priority;
    }

    @Deprecated
    public Boolean getSelected() {
        return this.selected;
    }

    public List<ViewAnnotationAnchorConfig> getVariableAnchors() {
        return this.variableAnchors;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Double getWidth() {
        return this.width;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.annotatedFeature, this.width, this.height, this.allowOverlap, this.allowOverlapWithPuck, this.allowZElevate, this.visible, this.variableAnchors, this.selected, this.priority, this.ignoreCameraPadding, this.minZoom, this.maxZoom);
    }

    public Builder toBuilder() {
        return new Builder().annotatedFeature(this.annotatedFeature).width(this.width).height(this.height).allowOverlap(this.allowOverlap).allowOverlapWithPuck(this.allowOverlapWithPuck).allowZElevate(this.allowZElevate).visible(this.visible).variableAnchors(this.variableAnchors).selected(this.selected).priority(this.priority).ignoreCameraPadding(this.ignoreCameraPadding).minZoom(this.minZoom).maxZoom(this.maxZoom);
    }

    private ViewAnnotationOptions(AnnotatedFeature annotatedFeature, Double d, Double d2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<ViewAnnotationAnchorConfig> list, Boolean bool5, Long l, Boolean bool6, Float f, Float f2) {
        this.annotatedFeature = annotatedFeature;
        this.width = d;
        this.height = d2;
        this.allowOverlap = bool;
        this.allowOverlapWithPuck = bool2;
        this.allowZElevate = bool3;
        this.visible = bool4;
        this.variableAnchors = list;
        this.selected = bool5;
        this.priority = l;
        this.ignoreCameraPadding = bool6;
        this.minZoom = f;
        this.maxZoom = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[annotatedFeature: ");
        sb.append(RecordUtils.fieldToString(this.annotatedFeature));
        sb.append(", width: ");
        af$$ExternalSyntheticOutline1.m(this.width, sb, ", height: ");
        af$$ExternalSyntheticOutline1.m(this.height, sb, ", allowOverlap: ");
        getBitmapFromCache.write(sb, ", allowOverlapWithPuck: ", this.allowOverlap);
        getBitmapFromCache.write(sb, ", allowZElevate: ", this.allowOverlapWithPuck);
        getBitmapFromCache.write(sb, ", visible: ", this.allowZElevate);
        getBitmapFromCache.write(sb, ", variableAnchors: ", this.visible);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.variableAnchors, ", selected: ");
        getBitmapFromCache.write(sb, ", priority: ", this.selected);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.priority, sb, ", ignoreCameraPadding: ");
        getBitmapFromCache.write(sb, ", minZoom: ", this.ignoreCameraPadding);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.minZoom, sb, ", maxZoom: ");
        sb.append(RecordUtils.fieldToString(this.maxZoom));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewAnnotationOptions.class != obj.getClass()) {
            return false;
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) obj;
        return Objects.equals(this.annotatedFeature, viewAnnotationOptions.annotatedFeature) && Objects.equals(this.width, viewAnnotationOptions.width) && Objects.equals(this.height, viewAnnotationOptions.height) && Objects.equals(this.allowOverlap, viewAnnotationOptions.allowOverlap) && Objects.equals(this.allowOverlapWithPuck, viewAnnotationOptions.allowOverlapWithPuck) && Objects.equals(this.allowZElevate, viewAnnotationOptions.allowZElevate) && Objects.equals(this.visible, viewAnnotationOptions.visible) && Objects.equals(this.variableAnchors, viewAnnotationOptions.variableAnchors) && Objects.equals(this.selected, viewAnnotationOptions.selected) && Objects.equals(this.priority, viewAnnotationOptions.priority) && Objects.equals(this.ignoreCameraPadding, viewAnnotationOptions.ignoreCameraPadding) && Objects.equals(this.minZoom, viewAnnotationOptions.minZoom) && Objects.equals(this.maxZoom, viewAnnotationOptions.maxZoom);
    }
}
