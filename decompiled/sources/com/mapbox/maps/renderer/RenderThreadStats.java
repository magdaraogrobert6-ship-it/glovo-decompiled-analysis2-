package com.mapbox.maps.renderer;

import com.mapbox.maps.MapboxExperimental;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public final class RenderThreadStats {
    private final List<Double> frameTimeList;
    private final Double percentile50;
    private final Double percentile90;
    private final Double percentile95;
    private final Double percentile99;
    private final long totalDroppedFrames;
    private final long totalFrames;
    private final long totalTime;

    public static final class Builder {
        private List<Double> frameTimeList = instance_delegatelambda0.write;
        private Double percentile50;
        private Double percentile90;
        private Double percentile95;
        private Double percentile99;
        private long totalDroppedFrames;
        private long totalFrames;
        private long totalTime;

        public final Builder setPercentile50(Double d) {
            this.percentile50 = d;
            return this;
        }

        public final Builder setPercentile90(Double d) {
            this.percentile90 = d;
            return this;
        }

        public final Builder setPercentile95(Double d) {
            this.percentile95 = d;
            return this;
        }

        public final Builder setPercentile99(Double d) {
            this.percentile99 = d;
            return this;
        }

        public final Builder setTotalDroppedFrames(long j) {
            this.totalDroppedFrames = j;
            return this;
        }

        public final Builder setTotalFrames(long j) {
            this.totalFrames = j;
            return this;
        }

        public final Builder setTotalTime(long j) {
            this.totalTime = j;
            return this;
        }

        public final RenderThreadStats build() {
            return new RenderThreadStats(this.totalTime, this.totalFrames, this.totalDroppedFrames, this.frameTimeList, this.percentile50, this.percentile90, this.percentile95, this.percentile99, null);
        }

        public final Builder setFrameTimeList(List<Double> list) {
            list.getClass();
            this.frameTimeList = list;
            return this;
        }
    }

    public final List<Double> getFrameTimeList() {
        return this.frameTimeList;
    }

    public final Double getPercentile50() {
        return this.percentile50;
    }

    public final Double getPercentile90() {
        return this.percentile90;
    }

    public final Double getPercentile95() {
        return this.percentile95;
    }

    public final Double getPercentile99() {
        return this.percentile99;
    }

    public final long getTotalDroppedFrames() {
        return this.totalDroppedFrames;
    }

    public final long getTotalFrames() {
        return this.totalFrames;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    private RenderThreadStats(long j, long j2, long j3, List<Double> list, Double d, Double d2, Double d3, Double d4) {
        this.totalTime = j;
        this.totalFrames = j2;
        this.totalDroppedFrames = j3;
        this.frameTimeList = list;
        this.percentile50 = d;
        this.percentile90 = d2;
        this.percentile95 = d3;
        this.percentile99 = d4;
    }

    public String toString() {
        return "RenderThreadStats(totalTime=" + this.totalTime + ", totalFrames=" + this.totalFrames + ", totalDroppedFrames=" + this.totalDroppedFrames + ", frameTimeList=" + this.frameTimeList + ", percentile50=" + this.percentile50 + ", percentile90=" + this.percentile90 + ", percentile95=" + this.percentile95 + ", percentile99=" + this.percentile99 + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RenderThreadStats.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RenderThreadStats renderThreadStats = (RenderThreadStats) obj;
        if (this.totalTime != renderThreadStats.totalTime || this.totalFrames != renderThreadStats.totalFrames || this.totalDroppedFrames != renderThreadStats.totalDroppedFrames || !removeNodeAtDepth.read(this.percentile50, renderThreadStats.percentile50) || !removeNodeAtDepth.read(this.percentile90, renderThreadStats.percentile90) || !removeNodeAtDepth.read(this.percentile95, renderThreadStats.percentile95) || !removeNodeAtDepth.read(this.percentile99, renderThreadStats.percentile99)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.frameTimeList, renderThreadStats.frameTimeList}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        long j = this.totalTime;
        long j2 = this.totalFrames;
        long j3 = this.totalDroppedFrames;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), this.percentile50, this.percentile90, this.percentile95, this.percentile99);
    }

    public /* synthetic */ RenderThreadStats(long j, long j2, long j3, List list, Double d, Double d2, Double d3, Double d4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, list, d, d2, d3, d4);
    }
}
