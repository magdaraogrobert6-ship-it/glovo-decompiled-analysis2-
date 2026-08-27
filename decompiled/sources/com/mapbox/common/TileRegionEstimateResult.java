package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class TileRegionEstimateResult implements Serializable {
    private final double errorMargin;
    private final Value extraData;
    private final long storageSize;
    private final long transferSize;

    public double getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public long getStorageSize() {
        return this.storageSize;
    }

    public long getTransferSize() {
        return this.transferSize;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateResult(double d, long j, long j2, Value value) {
        this.errorMargin = d;
        this.transferSize = j;
        this.storageSize = j2;
        this.extraData = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[errorMargin: ");
        m1$$ExternalSyntheticOutline0.m(this.errorMargin, ", transferSize: ", sb);
        af$$ExternalSyntheticOutline1.m(this.transferSize, ", storageSize: ", sb);
        af$$ExternalSyntheticOutline1.m(this.storageSize, ", extraData: ", sb);
        sb.append(RecordUtils.fieldToString(this.extraData));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        double d = this.errorMargin;
        long j = this.transferSize;
        long j2 = this.storageSize;
        return Objects.hash(Double.valueOf(d), Long.valueOf(j), Long.valueOf(j2), this.extraData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateResult tileRegionEstimateResult = (TileRegionEstimateResult) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateResult.errorMargin) && this.transferSize == tileRegionEstimateResult.transferSize && this.storageSize == tileRegionEstimateResult.storageSize && Objects.equals(this.extraData, tileRegionEstimateResult.extraData);
    }
}
