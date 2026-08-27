package com.mapbox.navigator;

import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalizedLaneData implements Serializable {
    private final Long currentLaneIndex;
    private final Float currentLaneOffset;
    private final Float currentLaneWidth;
    private final Integer laneCount;
    private final Point matchedCoordinate;
    private final Float matchedHeading;
    private final long monotonicTimestampNanoseconds;

    public final Long getCurrentLaneIndex() {
        return this.currentLaneIndex;
    }

    public final Float getCurrentLaneOffset() {
        return this.currentLaneOffset;
    }

    public final Float getCurrentLaneWidth() {
        return this.currentLaneWidth;
    }

    public final Integer getLaneCount() {
        return this.laneCount;
    }

    public final Point getMatchedCoordinate() {
        return this.matchedCoordinate;
    }

    public final Float getMatchedHeading() {
        return this.matchedHeading;
    }

    public final long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private Long currentLaneIndex;
        private Float currentLaneOffset;
        private Float currentLaneWidth;
        private Integer laneCount;
        private Point matchedCoordinate;
        private Float matchedHeading;
        private long monotonicTimestampNanoseconds;

        public final Long getCurrentLaneIndex() {
            return this.currentLaneIndex;
        }

        public final Float getCurrentLaneOffset() {
            return this.currentLaneOffset;
        }

        public final Float getCurrentLaneWidth() {
            return this.currentLaneWidth;
        }

        public final Integer getLaneCount() {
            return this.laneCount;
        }

        public final Point getMatchedCoordinate() {
            return this.matchedCoordinate;
        }

        public final Float getMatchedHeading() {
            return this.matchedHeading;
        }

        public final long getMonotonicTimestampNanoseconds() {
            return this.monotonicTimestampNanoseconds;
        }

        /* JADX INFO: renamed from: setCurrentLaneIndex, reason: collision with other method in class */
        public final /* synthetic */ void m4813setCurrentLaneIndex(Long l) {
            this.currentLaneIndex = l;
        }

        /* JADX INFO: renamed from: setCurrentLaneOffset, reason: collision with other method in class */
        public final /* synthetic */ void m4814setCurrentLaneOffset(Float f) {
            this.currentLaneOffset = f;
        }

        /* JADX INFO: renamed from: setCurrentLaneWidth, reason: collision with other method in class */
        public final /* synthetic */ void m4815setCurrentLaneWidth(Float f) {
            this.currentLaneWidth = f;
        }

        /* JADX INFO: renamed from: setLaneCount, reason: collision with other method in class */
        public final /* synthetic */ void m4816setLaneCount(Integer num) {
            this.laneCount = num;
        }

        /* JADX INFO: renamed from: setMatchedCoordinate, reason: collision with other method in class */
        public final /* synthetic */ void m4817setMatchedCoordinate(Point point) {
            this.matchedCoordinate = point;
        }

        /* JADX INFO: renamed from: setMatchedHeading, reason: collision with other method in class */
        public final /* synthetic */ void m4818setMatchedHeading(Float f) {
            this.matchedHeading = f;
        }

        /* JADX INFO: renamed from: setMonotonicTimestampNanoseconds, reason: collision with other method in class */
        public final /* synthetic */ void m4819setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
        }

        public Builder(long j) {
            this.monotonicTimestampNanoseconds = j;
        }

        public final Builder setCurrentLaneIndex(Long l) {
            this.currentLaneIndex = l;
            return this;
        }

        public final Builder setCurrentLaneOffset(Float f) {
            this.currentLaneOffset = f;
            return this;
        }

        public final Builder setCurrentLaneWidth(Float f) {
            this.currentLaneWidth = f;
            return this;
        }

        public final Builder setLaneCount(Integer num) {
            this.laneCount = num;
            return this;
        }

        public final Builder setMatchedCoordinate(Point point) {
            this.matchedCoordinate = point;
            return this;
        }

        public final Builder setMatchedHeading(Float f) {
            this.matchedHeading = f;
            return this;
        }

        public final Builder setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
            return this;
        }

        public final LocalizedLaneData build() {
            return new LocalizedLaneData(this.currentLaneIndex, this.laneCount, this.currentLaneOffset, this.currentLaneWidth, this.matchedCoordinate, this.matchedHeading, this.monotonicTimestampNanoseconds, null);
        }
    }

    public int hashCode() {
        return Objects.hash(this.currentLaneIndex, this.laneCount, this.currentLaneOffset, this.currentLaneWidth, this.matchedCoordinate, this.matchedHeading, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public final Builder toBuilder() {
        return new Builder(this.monotonicTimestampNanoseconds).setCurrentLaneIndex(this.currentLaneIndex).setLaneCount(this.laneCount).setCurrentLaneOffset(this.currentLaneOffset).setCurrentLaneWidth(this.currentLaneWidth).setMatchedCoordinate(this.matchedCoordinate).setMatchedHeading(this.matchedHeading).setMonotonicTimestampNanoseconds(this.monotonicTimestampNanoseconds);
    }

    private LocalizedLaneData(Long l, Integer num, Float f, Float f2, Point point, Float f3, long j) {
        this.currentLaneIndex = l;
        this.laneCount = num;
        this.currentLaneOffset = f;
        this.currentLaneWidth = f2;
        this.matchedCoordinate = point;
        this.matchedHeading = f3;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocalizedLaneData)) {
            return false;
        }
        LocalizedLaneData localizedLaneData = (LocalizedLaneData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currentLaneIndex, localizedLaneData.currentLaneIndex}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.laneCount, localizedLaneData.laneCount}, getCieXyz.write())).booleanValue() || !removeNodeAtDepth.IconCompatParcelizer(this.currentLaneOffset, localizedLaneData.currentLaneOffset) || !removeNodeAtDepth.IconCompatParcelizer(this.currentLaneWidth, localizedLaneData.currentLaneWidth)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.matchedCoordinate, localizedLaneData.matchedCoordinate}, getCieXyz.write())).booleanValue() && removeNodeAtDepth.IconCompatParcelizer(this.matchedHeading, localizedLaneData.matchedHeading) && this.monotonicTimestampNanoseconds == localizedLaneData.monotonicTimestampNanoseconds;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocalizedLaneData(currentLaneIndex=");
        sb.append(this.currentLaneIndex);
        sb.append(", laneCount=");
        sb.append(this.laneCount);
        sb.append(", currentLaneOffset=");
        sb.append(this.currentLaneOffset);
        sb.append(", currentLaneWidth=");
        sb.append(this.currentLaneWidth);
        sb.append(", matchedCoordinate=");
        sb.append(this.matchedCoordinate);
        sb.append(", matchedHeading=");
        sb.append(this.matchedHeading);
        sb.append(", monotonicTimestampNanoseconds=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.monotonicTimestampNanoseconds, ')');
    }

    public /* synthetic */ LocalizedLaneData(Long l, Integer num, Float f, Float f2, Point point, Float f3, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, num, f, f2, point, f3, j);
    }
}
