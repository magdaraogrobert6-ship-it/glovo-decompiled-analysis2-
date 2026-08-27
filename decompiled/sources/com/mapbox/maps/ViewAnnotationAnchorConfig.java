package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAnnotationAnchorConfig implements Serializable {
    private final ViewAnnotationAnchor anchor;
    private final double offsetX;
    private final double offsetY;

    public ViewAnnotationAnchor getAnchor() {
        return this.anchor;
    }

    public double getOffsetX() {
        return this.offsetX;
    }

    public double getOffsetY() {
        return this.offsetY;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.anchor, Double.valueOf(this.offsetX), Double.valueOf(this.offsetY));
    }

    public Builder toBuilder() {
        return new Builder().anchor(this.anchor).offsetX(this.offsetX).offsetY(this.offsetY);
    }

    private ViewAnnotationAnchorConfig(ViewAnnotationAnchor viewAnnotationAnchor, double d, double d2) {
        this.anchor = viewAnnotationAnchor;
        this.offsetX = d;
        this.offsetY = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[anchor: ");
        sb.append(RecordUtils.fieldToString(this.anchor));
        sb.append(", offsetX: ");
        m1$$ExternalSyntheticOutline0.m(this.offsetX, ", offsetY: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.offsetY, "]", sb);
    }

    public static final class Builder {
        private ViewAnnotationAnchor anchor;
        private double offsetX;
        private double offsetY;

        public Builder anchor(ViewAnnotationAnchor viewAnnotationAnchor) {
            this.anchor = viewAnnotationAnchor;
            return this;
        }

        public Builder offsetX(double d) {
            this.offsetX = d;
            return this;
        }

        public Builder offsetY(double d) {
            this.offsetY = d;
            return this;
        }

        public ViewAnnotationAnchorConfig build() {
            ViewAnnotationAnchor viewAnnotationAnchor = this.anchor;
            if (viewAnnotationAnchor != null) {
                return new ViewAnnotationAnchorConfig(viewAnnotationAnchor, this.offsetX, this.offsetY);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("anchor shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewAnnotationAnchorConfig.class != obj.getClass()) {
            return false;
        }
        ViewAnnotationAnchorConfig viewAnnotationAnchorConfig = (ViewAnnotationAnchorConfig) obj;
        return Objects.equals(this.anchor, viewAnnotationAnchorConfig.anchor) && PartialEq.compare(this.offsetX, viewAnnotationAnchorConfig.offsetX) && PartialEq.compare(this.offsetY, viewAnnotationAnchorConfig.offsetY);
    }
}
