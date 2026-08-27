package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@ExperimentalPreviewMapboxNavigationAPI
public final class HistoryRoutablePoint {
    private final HistoryPoint coordinates;

    public final HistoryPoint getCoordinates() {
        return this.coordinates;
    }

    public int hashCode() {
        return this.coordinates.hashCode();
    }

    public HistoryRoutablePoint(HistoryPoint historyPoint) {
        historyPoint.getClass();
        this.coordinates = historyPoint;
    }

    public String toString() {
        return "HistoryRoutablePoint(coordinates=" + this.coordinates + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HistoryRoutablePoint.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinates, ((HistoryRoutablePoint) obj).coordinates}, getCieXyz.write())).booleanValue();
    }
}
