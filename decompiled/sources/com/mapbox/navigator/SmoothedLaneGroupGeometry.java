package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class SmoothedLaneGroupGeometry implements Serializable {
    private final long beginSegmentOnRoute;
    private final List<Point> geometry;
    private final long laneGroupId;

    public long getBeginSegmentOnRoute() {
        return this.beginSegmentOnRoute;
    }

    public List<Point> getGeometry() {
        return this.geometry;
    }

    public long getLaneGroupId() {
        return this.laneGroupId;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SmoothedLaneGroupGeometry(long j, long j2, List<Point> list) {
        this.laneGroupId = j;
        this.beginSegmentOnRoute = j2;
        this.geometry = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneGroupId: ");
        af$$ExternalSyntheticOutline1.m(this.laneGroupId, ", beginSegmentOnRoute: ", sb);
        af$$ExternalSyntheticOutline1.m(this.beginSegmentOnRoute, ", geometry: ", sb);
        return MediaSessionCompatQueueItem.read(this.geometry, sb, "]");
    }

    public int hashCode() {
        long j = this.laneGroupId;
        long j2 = this.beginSegmentOnRoute;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), this.geometry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmoothedLaneGroupGeometry smoothedLaneGroupGeometry = (SmoothedLaneGroupGeometry) obj;
        return this.laneGroupId == smoothedLaneGroupGeometry.laneGroupId && this.beginSegmentOnRoute == smoothedLaneGroupGeometry.beginSegmentOnRoute && Objects.equals(this.geometry, smoothedLaneGroupGeometry.geometry);
    }
}
