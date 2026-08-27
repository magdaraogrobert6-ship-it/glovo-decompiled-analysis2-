package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI;
import com.mapbox.navigation.base.internal.utils.DoubleKt;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@ExperimentalPreviewMapboxNavigationAPI
public final class HistoryPoint {
    private final double latitude;
    private final double longitude;

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    public HistoryPoint(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HistoryPoint(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.longitude, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HistoryPoint.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        HistoryPoint historyPoint = (HistoryPoint) obj;
        if (DoubleKt.safeCompareTo(Double.valueOf(this.latitude), Double.valueOf(historyPoint.latitude))) {
            return DoubleKt.safeCompareTo(Double.valueOf(this.longitude), Double.valueOf(historyPoint.longitude));
        }
        return false;
    }
}
