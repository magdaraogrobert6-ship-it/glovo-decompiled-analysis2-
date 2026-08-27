package com.mapbox.navigation.base.trip.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.navigation.base.internal.utils.DoubleKt;
import o.getCieXyz;
import o.getCollapse;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TripNotificationState$TripNotificationData extends getCollapse {
    public final BannerInstructions bannerInstructions;
    public final Double distanceRemaining;
    public final String drivingSide;
    public final Double durationRemaining;

    public final int hashCode() {
        BannerInstructions bannerInstructions = this.bannerInstructions;
        int iHashCode = bannerInstructions != null ? bannerInstructions.hashCode() : 0;
        Double d = this.distanceRemaining;
        int iHashCode2 = d != null ? d.hashCode() : 0;
        Double d2 = this.durationRemaining;
        int iHashCode3 = d2 != null ? d2.hashCode() : 0;
        String str = this.drivingSide;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public TripNotificationState$TripNotificationData(BannerInstructions bannerInstructions, Double d, Double d2, String str) {
        this.bannerInstructions = bannerInstructions;
        this.distanceRemaining = d;
        this.durationRemaining = d2;
        this.drivingSide = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripNotificationData(bannerInstructions=");
        sb.append(this.bannerInstructions);
        sb.append(", distanceRemaining=");
        sb.append(this.distanceRemaining);
        sb.append(", durationRemaining=");
        sb.append(this.durationRemaining);
        sb.append(", drivingSide=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.drivingSide, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TripNotificationState$TripNotificationData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        TripNotificationState$TripNotificationData tripNotificationState$TripNotificationData = (TripNotificationState$TripNotificationData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bannerInstructions, tripNotificationState$TripNotificationData.bannerInstructions}, getCieXyz.write())).booleanValue() || !DoubleKt.safeCompareTo(this.distanceRemaining, tripNotificationState$TripNotificationData.distanceRemaining) || !DoubleKt.safeCompareTo(this.durationRemaining, tripNotificationState$TripNotificationData.durationRemaining)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.drivingSide, tripNotificationState$TripNotificationData.drivingSide}, getCieXyz.write())).booleanValue();
    }
}
