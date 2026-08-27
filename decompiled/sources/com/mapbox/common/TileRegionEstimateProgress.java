package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class TileRegionEstimateProgress implements Serializable {
    private final long completedResourceCount;
    private final long erroredResourceCount;
    private final TileRegionEstimateResult partialResult;
    private final long requiredResourceCount;

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public TileRegionEstimateResult getPartialResult() {
        return this.partialResult;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateProgress(long j, long j2, long j3, TileRegionEstimateResult tileRegionEstimateResult) {
        this.requiredResourceCount = j;
        this.erroredResourceCount = j2;
        this.completedResourceCount = j3;
        this.partialResult = tileRegionEstimateResult;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[requiredResourceCount: ");
        af$$ExternalSyntheticOutline1.m(this.requiredResourceCount, ", erroredResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.erroredResourceCount, ", completedResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.completedResourceCount, ", partialResult: ", sb);
        sb.append(RecordUtils.fieldToString(this.partialResult));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.requiredResourceCount;
        long j2 = this.erroredResourceCount;
        long j3 = this.completedResourceCount;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), this.partialResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateProgress tileRegionEstimateProgress = (TileRegionEstimateProgress) obj;
        return this.requiredResourceCount == tileRegionEstimateProgress.requiredResourceCount && this.erroredResourceCount == tileRegionEstimateProgress.erroredResourceCount && this.completedResourceCount == tileRegionEstimateProgress.completedResourceCount && Objects.equals(this.partialResult, tileRegionEstimateProgress.partialResult);
    }
}
