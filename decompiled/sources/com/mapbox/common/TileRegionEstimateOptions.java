package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class TileRegionEstimateOptions implements Serializable {
    private final float errorMargin;
    private final Value extraOptions;
    private final long preciseEstimationTimeout;
    private final long timeout;

    public float getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public long getPreciseEstimationTimeout() {
        return this.preciseEstimationTimeout;
    }

    public long getTimeout() {
        return this.timeout;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateOptions(Value value) {
        this.extraOptions = value;
        this.errorMargin = 0.05f;
        this.preciseEstimationTimeout = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        this.timeout = 0L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[errorMargin: ");
        getBitmapFromCache.write(this.errorMargin, ", preciseEstimationTimeout: ", sb);
        af$$ExternalSyntheticOutline1.m(this.preciseEstimationTimeout, ", timeout: ", sb);
        af$$ExternalSyntheticOutline1.m(this.timeout, ", extraOptions: ", sb);
        sb.append(RecordUtils.fieldToString(this.extraOptions));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        float f = this.errorMargin;
        long j = this.preciseEstimationTimeout;
        long j2 = this.timeout;
        return Objects.hash(Float.valueOf(f), Long.valueOf(j), Long.valueOf(j2), this.extraOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateOptions tileRegionEstimateOptions = (TileRegionEstimateOptions) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateOptions.errorMargin) && this.preciseEstimationTimeout == tileRegionEstimateOptions.preciseEstimationTimeout && this.timeout == tileRegionEstimateOptions.timeout && Objects.equals(this.extraOptions, tileRegionEstimateOptions.extraOptions);
    }

    public TileRegionEstimateOptions(float f, long j, long j2, Value value) {
        this.errorMargin = f;
        this.preciseEstimationTimeout = j;
        this.timeout = j2;
        this.extraOptions = value;
    }
}
