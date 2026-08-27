package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class PerformanceStatistics implements Serializable {
    private final double collectionDurationMillis;
    private final CumulativeRenderingStatistics cumulativeStatistics;
    private final DurationStatistics mapRenderDurationStatistics;
    private final PerFrameRenderingStatistics perFrameStatistics;

    public double getCollectionDurationMillis() {
        return this.collectionDurationMillis;
    }

    public CumulativeRenderingStatistics getCumulativeStatistics() {
        return this.cumulativeStatistics;
    }

    public DurationStatistics getMapRenderDurationStatistics() {
        return this.mapRenderDurationStatistics;
    }

    public PerFrameRenderingStatistics getPerFrameStatistics() {
        return this.perFrameStatistics;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public PerformanceStatistics(double d, DurationStatistics durationStatistics, CumulativeRenderingStatistics cumulativeRenderingStatistics, PerFrameRenderingStatistics perFrameRenderingStatistics) {
        this.collectionDurationMillis = d;
        this.mapRenderDurationStatistics = durationStatistics;
        this.cumulativeStatistics = cumulativeRenderingStatistics;
        this.perFrameStatistics = perFrameRenderingStatistics;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[collectionDurationMillis: ");
        m1$$ExternalSyntheticOutline0.m(this.collectionDurationMillis, ", mapRenderDurationStatistics: ", sb);
        sb.append(RecordUtils.fieldToString(this.mapRenderDurationStatistics));
        sb.append(", cumulativeStatistics: ");
        sb.append(RecordUtils.fieldToString(this.cumulativeStatistics));
        sb.append(", perFrameStatistics: ");
        sb.append(RecordUtils.fieldToString(this.perFrameStatistics));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        double d = this.collectionDurationMillis;
        return Objects.hash(Double.valueOf(d), this.mapRenderDurationStatistics, this.cumulativeStatistics, this.perFrameStatistics);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerformanceStatistics.class != obj.getClass()) {
            return false;
        }
        PerformanceStatistics performanceStatistics = (PerformanceStatistics) obj;
        return PartialEq.compare(this.collectionDurationMillis, performanceStatistics.collectionDurationMillis) && Objects.equals(this.mapRenderDurationStatistics, performanceStatistics.mapRenderDurationStatistics) && Objects.equals(this.cumulativeStatistics, performanceStatistics.cumulativeStatistics) && Objects.equals(this.perFrameStatistics, performanceStatistics.perFrameStatistics);
    }
}
