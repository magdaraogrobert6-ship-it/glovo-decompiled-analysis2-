package com.mapbox.common;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public final class TileRegionLoadOptions implements Serializable {
    private final boolean acceptExpired;
    private final Integer averageBytesPerSecond;
    private final List<TilesetDescriptor> descriptors;
    private final Value extraOptions;
    private final Geometry geometry;
    private final Value metadata;
    private final NetworkRestriction networkRestriction;
    private final Point startLocation;

    public boolean getAcceptExpired() {
        return this.acceptExpired;
    }

    public Integer getAverageBytesPerSecond() {
        return this.averageBytesPerSecond;
    }

    public List<TilesetDescriptor> getDescriptors() {
        return this.descriptors;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public Value getMetadata() {
        return this.metadata;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public Point getStartLocation() {
        return this.startLocation;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        Geometry geometry = this.geometry;
        List<TilesetDescriptor> list = this.descriptors;
        Value value = this.metadata;
        boolean z = this.acceptExpired;
        return Objects.hash(geometry, list, value, Boolean.valueOf(z), this.networkRestriction, this.startLocation, this.averageBytesPerSecond, this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().geometry(this.geometry).descriptors(this.descriptors).metadata(this.metadata).acceptExpired(this.acceptExpired).networkRestriction(this.networkRestriction).startLocation(this.startLocation).averageBytesPerSecond(this.averageBytesPerSecond).extraOptions(this.extraOptions);
    }

    private TileRegionLoadOptions(Geometry geometry, List<TilesetDescriptor> list, Value value, Point point, Integer num, Value value2) {
        this.geometry = geometry;
        this.descriptors = list;
        this.metadata = value;
        this.startLocation = point;
        this.averageBytesPerSecond = num;
        this.extraOptions = value2;
        this.acceptExpired = false;
        this.networkRestriction = NetworkRestriction.NONE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[geometry: ");
        sb.append(RecordUtils.fieldToString(this.geometry));
        sb.append(", descriptors: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.descriptors, ", metadata: ");
        sb.append(RecordUtils.fieldToString(this.metadata));
        sb.append(", acceptExpired: ");
        MediaSessionCompatQueueItem.write(sb, this.acceptExpired, ", networkRestriction: ");
        sb.append(RecordUtils.fieldToString(this.networkRestriction));
        sb.append(", startLocation: ");
        c8$$ExternalSyntheticOutline0.m(this.startLocation, sb, ", averageBytesPerSecond: ");
        SweepGradientShader9KIMszodefault.read(this.averageBytesPerSecond, ", extraOptions: ", sb);
        sb.append(RecordUtils.fieldToString(this.extraOptions));
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private Integer averageBytesPerSecond;
        private List<TilesetDescriptor> descriptors;
        private Value extraOptions;
        private Geometry geometry;
        private Value metadata;
        private Point startLocation;
        private boolean acceptExpired = false;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;

        public Builder acceptExpired(boolean z) {
            this.acceptExpired = z;
            return this;
        }

        public Builder averageBytesPerSecond(Integer num) {
            this.averageBytesPerSecond = num;
            return this;
        }

        public Builder descriptors(List<TilesetDescriptor> list) {
            this.descriptors = list;
            return this;
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder geometry(Geometry geometry) {
            this.geometry = geometry;
            return this;
        }

        public Builder metadata(Value value) {
            this.metadata = value;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        public Builder startLocation(Point point) {
            this.startLocation = point;
            return this;
        }

        public TileRegionLoadOptions build() {
            NetworkRestriction networkRestriction = this.networkRestriction;
            if (networkRestriction != null) {
                return new TileRegionLoadOptions(this.geometry, this.descriptors, this.metadata, this.acceptExpired, networkRestriction, this.startLocation, this.averageBytesPerSecond, this.extraOptions);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("networkRestriction shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileRegionLoadOptions.class != obj.getClass()) {
            return false;
        }
        TileRegionLoadOptions tileRegionLoadOptions = (TileRegionLoadOptions) obj;
        return Objects.equals(this.geometry, tileRegionLoadOptions.geometry) && Objects.equals(this.descriptors, tileRegionLoadOptions.descriptors) && Objects.equals(this.metadata, tileRegionLoadOptions.metadata) && this.acceptExpired == tileRegionLoadOptions.acceptExpired && Objects.equals(this.networkRestriction, tileRegionLoadOptions.networkRestriction) && Objects.equals(this.startLocation, tileRegionLoadOptions.startLocation) && Objects.equals(this.averageBytesPerSecond, tileRegionLoadOptions.averageBytesPerSecond) && Objects.equals(this.extraOptions, tileRegionLoadOptions.extraOptions);
    }

    private TileRegionLoadOptions(Geometry geometry, List<TilesetDescriptor> list, Value value, boolean z, NetworkRestriction networkRestriction, Point point, Integer num, Value value2) {
        this.geometry = geometry;
        this.descriptors = list;
        this.metadata = value;
        this.acceptExpired = z;
        this.networkRestriction = networkRestriction;
        this.startLocation = point;
        this.averageBytesPerSecond = num;
        this.extraOptions = value2;
    }
}
