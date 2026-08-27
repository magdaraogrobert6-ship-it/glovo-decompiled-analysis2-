package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomLayerRenderParameters implements Serializable {
    private final double bearing;
    private final DepthRange depthRange;
    private final ElevationData elevationData;
    private final double fieldOfView;
    private final double height;
    private final double latitude;
    private final double longitude;
    private final double pitch;
    private final CustomLayerMapProjection projection;
    private final List<Double> projectionMatrix;
    private final List<CanonicalTileID> renderToTilesIDs;
    private final double width;
    private final double zoom;

    public double getBearing() {
        return this.bearing;
    }

    public DepthRange getDepthRange() {
        return this.depthRange;
    }

    public ElevationData getElevationData() {
        return this.elevationData;
    }

    public double getFieldOfView() {
        return this.fieldOfView;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getPitch() {
        return this.pitch;
    }

    public CustomLayerMapProjection getProjection() {
        return this.projection;
    }

    public List<Double> getProjectionMatrix() {
        return this.projectionMatrix;
    }

    public List<CanonicalTileID> getRenderToTilesIDs() {
        return this.renderToTilesIDs;
    }

    public double getWidth() {
        return this.width;
    }

    public double getZoom() {
        return this.zoom;
    }

    private CustomLayerRenderParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, List<Double> list, DepthRange depthRange, ElevationData elevationData, List<CanonicalTileID> list2, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d;
        this.height = d2;
        this.latitude = d3;
        this.longitude = d4;
        this.zoom = d5;
        this.bearing = d6;
        this.pitch = d7;
        this.fieldOfView = d8;
        this.projectionMatrix = list;
        this.depthRange = depthRange;
        this.elevationData = elevationData;
        this.renderToTilesIDs = list2;
        this.projection = customLayerMapProjection;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[width: ");
        m1$$ExternalSyntheticOutline0.m(this.width, ", height: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.height, ", latitude: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.latitude, ", longitude: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.longitude, ", zoom: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.zoom, ", bearing: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.bearing, ", pitch: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.pitch, ", fieldOfView: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.fieldOfView, ", projectionMatrix: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.projectionMatrix, ", depthRange: ");
        sb.append(RecordUtils.fieldToString(this.depthRange));
        sb.append(", elevationData: ");
        sb.append(RecordUtils.fieldToString(this.elevationData));
        sb.append(", renderToTilesIDs: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.renderToTilesIDs, ", projection: ");
        sb.append(RecordUtils.fieldToString(this.projection));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        double d = this.width;
        double d2 = this.height;
        double d3 = this.latitude;
        double d4 = this.longitude;
        double d5 = this.zoom;
        double d6 = this.bearing;
        double d7 = this.pitch;
        double d8 = this.fieldOfView;
        return Objects.hash(Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d8), this.projectionMatrix, this.depthRange, this.elevationData, this.renderToTilesIDs, this.projection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderParameters.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderParameters customLayerRenderParameters = (CustomLayerRenderParameters) obj;
        return Double.compare(this.width, customLayerRenderParameters.width) == 0 && Double.compare(this.height, customLayerRenderParameters.height) == 0 && Double.compare(this.latitude, customLayerRenderParameters.latitude) == 0 && Double.compare(this.longitude, customLayerRenderParameters.longitude) == 0 && Double.compare(this.zoom, customLayerRenderParameters.zoom) == 0 && Double.compare(this.bearing, customLayerRenderParameters.bearing) == 0 && Double.compare(this.pitch, customLayerRenderParameters.pitch) == 0 && Double.compare(this.fieldOfView, customLayerRenderParameters.fieldOfView) == 0 && Objects.equals(this.projectionMatrix, customLayerRenderParameters.projectionMatrix) && Objects.equals(this.depthRange, customLayerRenderParameters.depthRange) && Objects.equals(this.elevationData, customLayerRenderParameters.elevationData) && Objects.equals(this.renderToTilesIDs, customLayerRenderParameters.renderToTilesIDs) && Objects.equals(this.projection, customLayerRenderParameters.projection);
    }

    @Deprecated
    public CustomLayerRenderParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, List<Double> list, DepthRange depthRange, ElevationData elevationData, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d;
        this.height = d2;
        this.latitude = d3;
        this.longitude = d4;
        this.zoom = d5;
        this.bearing = d6;
        this.pitch = d7;
        this.fieldOfView = d8;
        this.projectionMatrix = list;
        this.depthRange = depthRange;
        this.elevationData = elevationData;
        this.renderToTilesIDs = null;
        this.projection = customLayerMapProjection;
    }
}
