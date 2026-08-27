package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class MatchingOptions implements Serializable {
    private final boolean allowPartialMatching;
    private final PartialPolylineDistanceCalculationStrategy partialPolylineDistanceCalculationStrategy;
    private final boolean useOnlyPreloadedTiles;

    public boolean getAllowPartialMatching() {
        return this.allowPartialMatching;
    }

    public PartialPolylineDistanceCalculationStrategy getPartialPolylineDistanceCalculationStrategy() {
        return this.partialPolylineDistanceCalculationStrategy;
    }

    public boolean getUseOnlyPreloadedTiles() {
        return this.useOnlyPreloadedTiles;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchingOptions(boolean z, boolean z2, PartialPolylineDistanceCalculationStrategy partialPolylineDistanceCalculationStrategy) {
        this.useOnlyPreloadedTiles = z;
        this.allowPartialMatching = z2;
        this.partialPolylineDistanceCalculationStrategy = partialPolylineDistanceCalculationStrategy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[useOnlyPreloadedTiles: ");
        MediaSessionCompatQueueItem.write(sb, this.useOnlyPreloadedTiles, ", allowPartialMatching: ");
        MediaSessionCompatQueueItem.write(sb, this.allowPartialMatching, ", partialPolylineDistanceCalculationStrategy: ");
        sb.append(RecordUtils.fieldToString(this.partialPolylineDistanceCalculationStrategy));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        boolean z = this.useOnlyPreloadedTiles;
        boolean z2 = this.allowPartialMatching;
        return Objects.hash(Boolean.valueOf(z), Boolean.valueOf(z2), this.partialPolylineDistanceCalculationStrategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchingOptions matchingOptions = (MatchingOptions) obj;
        return this.useOnlyPreloadedTiles == matchingOptions.useOnlyPreloadedTiles && this.allowPartialMatching == matchingOptions.allowPartialMatching && Objects.equals(this.partialPolylineDistanceCalculationStrategy, matchingOptions.partialPolylineDistanceCalculationStrategy);
    }
}
