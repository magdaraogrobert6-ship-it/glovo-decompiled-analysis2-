package com.mapbox.maps;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public class ViewAnnotationPositionDescriptor implements Serializable {
    private final ViewAnnotationAnchorConfig anchorConfig;
    private final Point anchorCoordinate;
    private final double height;
    private final String identifier;
    private final ScreenCoordinate leftTopCoordinate;
    private final double width;

    public ViewAnnotationAnchorConfig getAnchorConfig() {
        return this.anchorConfig;
    }

    public Point getAnchorCoordinate() {
        return this.anchorCoordinate;
    }

    public double getHeight() {
        return this.height;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public ScreenCoordinate getLeftTopCoordinate() {
        return this.leftTopCoordinate;
    }

    public double getWidth() {
        return this.width;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.identifier;
        double d = this.width;
        double d2 = this.height;
        return Objects.hash(str, Double.valueOf(d), Double.valueOf(d2), this.leftTopCoordinate, this.anchorCoordinate, this.anchorConfig);
    }

    public ViewAnnotationPositionDescriptor(String str, double d, double d2, ScreenCoordinate screenCoordinate, Point point, ViewAnnotationAnchorConfig viewAnnotationAnchorConfig) {
        this.identifier = str;
        this.width = d;
        this.height = d2;
        this.leftTopCoordinate = screenCoordinate;
        this.anchorCoordinate = point;
        this.anchorConfig = viewAnnotationAnchorConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[identifier: ");
        IconCompatParcelizer.read(sb, this.identifier, ", width: ");
        m1$$ExternalSyntheticOutline0.m(this.width, ", height: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.height, ", leftTopCoordinate: ", sb);
        sb.append(RecordUtils.fieldToString(this.leftTopCoordinate));
        sb.append(", anchorCoordinate: ");
        c8$$ExternalSyntheticOutline0.m(this.anchorCoordinate, sb, ", anchorConfig: ");
        sb.append(RecordUtils.fieldToString(this.anchorConfig));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ViewAnnotationPositionDescriptor viewAnnotationPositionDescriptor = (ViewAnnotationPositionDescriptor) obj;
        return Objects.equals(this.identifier, viewAnnotationPositionDescriptor.identifier) && PartialEq.compare(this.width, viewAnnotationPositionDescriptor.width) && PartialEq.compare(this.height, viewAnnotationPositionDescriptor.height) && Objects.equals(this.leftTopCoordinate, viewAnnotationPositionDescriptor.leftTopCoordinate) && Objects.equals(this.anchorCoordinate, viewAnnotationPositionDescriptor.anchorCoordinate) && Objects.equals(this.anchorConfig, viewAnnotationPositionDescriptor.anchorConfig);
    }
}
