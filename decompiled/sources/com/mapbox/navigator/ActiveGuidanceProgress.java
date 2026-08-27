package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class ActiveGuidanceProgress implements Serializable {
    private final double distanceTraveled;
    private final double fractionTraveled;
    private final double remainingDistance;
    private final long remainingDuration;

    public double getDistanceTraveled() {
        return this.distanceTraveled;
    }

    public double getFractionTraveled() {
        return this.fractionTraveled;
    }

    public double getRemainingDistance() {
        return this.remainingDistance;
    }

    public long getRemainingDuration() {
        return this.remainingDuration;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ActiveGuidanceProgress(double d, double d2, double d3, long j) {
        this.distanceTraveled = d;
        this.fractionTraveled = d2;
        this.remainingDistance = d3;
        this.remainingDuration = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[distanceTraveled: ");
        m1$$ExternalSyntheticOutline0.m(this.distanceTraveled, ", fractionTraveled: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.fractionTraveled, ", remainingDistance: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.remainingDistance, ", remainingDuration: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.remainingDuration, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distanceTraveled), Double.valueOf(this.fractionTraveled), Double.valueOf(this.remainingDistance), Long.valueOf(this.remainingDuration));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActiveGuidanceProgress activeGuidanceProgress = (ActiveGuidanceProgress) obj;
        return PartialEq.compare(this.distanceTraveled, activeGuidanceProgress.distanceTraveled) && PartialEq.compare(this.fractionTraveled, activeGuidanceProgress.fractionTraveled) && PartialEq.compare(this.remainingDistance, activeGuidanceProgress.remainingDistance) && this.remainingDuration == activeGuidanceProgress.remainingDuration;
    }
}
