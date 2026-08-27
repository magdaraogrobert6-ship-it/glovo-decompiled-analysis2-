package com.mapbox.navigation.tripdata.progress;

import java.util.TimeZone;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TripProgressResult$RouteProgressCalculation {
    public final TimeZone arrivalTimeZone;
    public final double currentLegTimeRemaining;
    public final double distanceRemaining;
    public final long estimatedTimeToArrival;
    public final double percentRouteTraveled;
    public final double totalTimeRemaining;

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.percentRouteTraveled, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.totalTimeRemaining, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.currentLegTimeRemaining, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distanceRemaining, Long.hashCode(this.estimatedTimeToArrival) * 31, 31), 31), 31), 31);
        TimeZone timeZone = this.arrivalTimeZone;
        return iRemoteActionCompatParcelizer + (timeZone == null ? 0 : timeZone.hashCode());
    }

    public TripProgressResult$RouteProgressCalculation(long j, double d, double d2, double d3, double d4, TimeZone timeZone) {
        this.estimatedTimeToArrival = j;
        this.distanceRemaining = d;
        this.currentLegTimeRemaining = d2;
        this.totalTimeRemaining = d3;
        this.percentRouteTraveled = d4;
        this.arrivalTimeZone = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripProgressResult$RouteProgressCalculation)) {
            return false;
        }
        TripProgressResult$RouteProgressCalculation tripProgressResult$RouteProgressCalculation = (TripProgressResult$RouteProgressCalculation) obj;
        if (this.estimatedTimeToArrival != tripProgressResult$RouteProgressCalculation.estimatedTimeToArrival || Double.compare(this.distanceRemaining, tripProgressResult$RouteProgressCalculation.distanceRemaining) != 0 || Double.compare(this.currentLegTimeRemaining, tripProgressResult$RouteProgressCalculation.currentLegTimeRemaining) != 0 || Double.compare(this.totalTimeRemaining, tripProgressResult$RouteProgressCalculation.totalTimeRemaining) != 0 || Double.compare(this.percentRouteTraveled, tripProgressResult$RouteProgressCalculation.percentRouteTraveled) != 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.arrivalTimeZone, tripProgressResult$RouteProgressCalculation.arrivalTimeZone}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RouteProgressCalculation(estimatedTimeToArrival=" + this.estimatedTimeToArrival + ", distanceRemaining=" + this.distanceRemaining + ", currentLegTimeRemaining=" + this.currentLegTimeRemaining + ", totalTimeRemaining=" + this.totalTimeRemaining + ", percentRouteTraveled=" + this.percentRouteTraveled + ", arrivalTimeZone=" + this.arrivalTimeZone + ')';
    }
}
