package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class LaneChangeAssistData implements Serializable {
    private final LaneChangeDirection laneChangeDirection;
    private final Point3d laneChangeOffset;
    private final LaneChangeState laneChangeState;
    private final long monotonicTimestampNanoseconds;

    public final LaneChangeDirection getLaneChangeDirection() {
        return this.laneChangeDirection;
    }

    public final Point3d getLaneChangeOffset() {
        return this.laneChangeOffset;
    }

    public final LaneChangeState getLaneChangeState() {
        return this.laneChangeState;
    }

    public final long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private LaneChangeDirection laneChangeDirection;
        private Point3d laneChangeOffset;
        private LaneChangeState laneChangeState;
        private long monotonicTimestampNanoseconds;

        public final LaneChangeDirection getLaneChangeDirection() {
            return this.laneChangeDirection;
        }

        public final Point3d getLaneChangeOffset() {
            return this.laneChangeOffset;
        }

        public final LaneChangeState getLaneChangeState() {
            return this.laneChangeState;
        }

        public final long getMonotonicTimestampNanoseconds() {
            return this.monotonicTimestampNanoseconds;
        }

        /* JADX INFO: renamed from: setLaneChangeOffset, reason: collision with other method in class */
        public final /* synthetic */ void m4810setLaneChangeOffset(Point3d point3d) {
            this.laneChangeOffset = point3d;
        }

        /* JADX INFO: renamed from: setMonotonicTimestampNanoseconds, reason: collision with other method in class */
        public final /* synthetic */ void m4812setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
        }

        public Builder(LaneChangeDirection laneChangeDirection, LaneChangeState laneChangeState, long j) {
            laneChangeDirection.getClass();
            laneChangeState.getClass();
            this.laneChangeDirection = laneChangeDirection;
            this.laneChangeState = laneChangeState;
            this.monotonicTimestampNanoseconds = j;
        }

        /* JADX INFO: renamed from: setLaneChangeDirection, reason: collision with other method in class */
        public final /* synthetic */ void m4809setLaneChangeDirection(LaneChangeDirection laneChangeDirection) {
            laneChangeDirection.getClass();
            this.laneChangeDirection = laneChangeDirection;
        }

        public final Builder setLaneChangeOffset(Point3d point3d) {
            this.laneChangeOffset = point3d;
            return this;
        }

        /* JADX INFO: renamed from: setLaneChangeState, reason: collision with other method in class */
        public final /* synthetic */ void m4811setLaneChangeState(LaneChangeState laneChangeState) {
            laneChangeState.getClass();
            this.laneChangeState = laneChangeState;
        }

        public final Builder setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
            return this;
        }

        public final LaneChangeAssistData build() {
            LaneChangeDirection laneChangeDirection = this.laneChangeDirection;
            if (laneChangeDirection == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of LaneChangeAssistData through LaneChangeAssistData.Builder because laneChangeDirection was null.");
                return null;
            }
            if (this.laneChangeState == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of LaneChangeAssistData through LaneChangeAssistData.Builder because laneChangeState was null.");
                return null;
            }
            laneChangeDirection.getClass();
            LaneChangeState laneChangeState = this.laneChangeState;
            laneChangeState.getClass();
            return new LaneChangeAssistData(laneChangeDirection, laneChangeState, this.laneChangeOffset, this.monotonicTimestampNanoseconds, null);
        }

        public final Builder setLaneChangeDirection(LaneChangeDirection laneChangeDirection) {
            laneChangeDirection.getClass();
            this.laneChangeDirection = laneChangeDirection;
            return this;
        }

        public final Builder setLaneChangeState(LaneChangeState laneChangeState) {
            laneChangeState.getClass();
            this.laneChangeState = laneChangeState;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.laneChangeDirection, this.laneChangeState, this.laneChangeOffset, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public final Builder toBuilder() {
        return new Builder(this.laneChangeDirection, this.laneChangeState, this.monotonicTimestampNanoseconds).setLaneChangeDirection(this.laneChangeDirection).setLaneChangeState(this.laneChangeState).setLaneChangeOffset(this.laneChangeOffset).setMonotonicTimestampNanoseconds(this.monotonicTimestampNanoseconds);
    }

    private LaneChangeAssistData(LaneChangeDirection laneChangeDirection, LaneChangeState laneChangeState, Point3d point3d, long j) {
        this.laneChangeDirection = laneChangeDirection;
        this.laneChangeState = laneChangeState;
        this.laneChangeOffset = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LaneChangeAssistData)) {
            return false;
        }
        LaneChangeAssistData laneChangeAssistData = (LaneChangeAssistData) obj;
        if (this.laneChangeDirection != laneChangeAssistData.laneChangeDirection || this.laneChangeState != laneChangeAssistData.laneChangeState) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.laneChangeOffset, laneChangeAssistData.laneChangeOffset}, getCieXyz.write())).booleanValue() && this.monotonicTimestampNanoseconds == laneChangeAssistData.monotonicTimestampNanoseconds;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LaneChangeAssistData(laneChangeDirection=");
        sb.append(this.laneChangeDirection);
        sb.append(", laneChangeState=");
        sb.append(this.laneChangeState);
        sb.append(", laneChangeOffset=");
        sb.append(this.laneChangeOffset);
        sb.append(", monotonicTimestampNanoseconds=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.monotonicTimestampNanoseconds, ')');
    }

    public /* synthetic */ LaneChangeAssistData(LaneChangeDirection laneChangeDirection, LaneChangeState laneChangeState, Point3d point3d, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(laneChangeDirection, laneChangeState, point3d, j);
    }
}
