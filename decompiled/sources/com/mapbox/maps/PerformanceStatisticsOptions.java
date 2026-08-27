package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public final class PerformanceStatisticsOptions implements Serializable {
    private final List<PerformanceSamplerOptions> samplerOptions;
    private final double samplingDurationMillis;

    public List<PerformanceSamplerOptions> getSamplerOptions() {
        return this.samplerOptions;
    }

    public double getSamplingDurationMillis() {
        return this.samplingDurationMillis;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.samplerOptions, Double.valueOf(this.samplingDurationMillis));
    }

    public Builder toBuilder() {
        return new Builder().samplerOptions(this.samplerOptions).samplingDurationMillis(this.samplingDurationMillis);
    }

    private PerformanceStatisticsOptions(List<PerformanceSamplerOptions> list) {
        this.samplerOptions = list;
        this.samplingDurationMillis = 1000.0d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[samplerOptions: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.samplerOptions, ", samplingDurationMillis: ");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.samplingDurationMillis, "]", sb);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private List<PerformanceSamplerOptions> samplerOptions;
        private double samplingDurationMillis = 1000.0d;

        public Builder samplerOptions(List<PerformanceSamplerOptions> list) {
            this.samplerOptions = list;
            return this;
        }

        public Builder samplingDurationMillis(double d) {
            this.samplingDurationMillis = d;
            return this;
        }

        public PerformanceStatisticsOptions build() {
            List<PerformanceSamplerOptions> list = this.samplerOptions;
            if (list != null) {
                return new PerformanceStatisticsOptions(list, this.samplingDurationMillis);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("samplerOptions shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerformanceStatisticsOptions.class != obj.getClass()) {
            return false;
        }
        PerformanceStatisticsOptions performanceStatisticsOptions = (PerformanceStatisticsOptions) obj;
        return Objects.equals(this.samplerOptions, performanceStatisticsOptions.samplerOptions) && PartialEq.compare(this.samplingDurationMillis, performanceStatisticsOptions.samplingDurationMillis);
    }

    private PerformanceStatisticsOptions(List<PerformanceSamplerOptions> list, double d) {
        this.samplerOptions = list;
        this.samplingDurationMillis = d;
    }
}
