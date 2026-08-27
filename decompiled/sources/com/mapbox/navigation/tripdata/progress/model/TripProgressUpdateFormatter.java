package com.mapbox.navigation.tripdata.progress.model;

import android.text.SpannableString;
import com.mapbox.navigation.ui.base.formatter.ValueFormatter;

/* JADX INFO: loaded from: classes2.dex */
public final class TripProgressUpdateFormatter {
    public final ValueFormatter distanceRemainingFormatter;
    public final ValueFormatter estimatedTimeOfArrivalFormatter;
    public final ValueFormatter percentRouteTraveledFormatter;
    public final ValueFormatter timeRemainingFormatter;

    public final int hashCode() {
        int iHashCode = this.estimatedTimeOfArrivalFormatter.hashCode();
        int iHashCode2 = this.distanceRemainingFormatter.hashCode();
        return this.percentRouteTraveledFormatter.hashCode() + ((this.timeRemainingFormatter.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public TripProgressUpdateFormatter(ValueFormatter valueFormatter, ValueFormatter valueFormatter2, ValueFormatter valueFormatter3, ValueFormatter valueFormatter4) {
        this.estimatedTimeOfArrivalFormatter = valueFormatter;
        this.distanceRemainingFormatter = valueFormatter2;
        this.timeRemainingFormatter = valueFormatter3;
        this.percentRouteTraveledFormatter = valueFormatter4;
    }

    public final String toString() {
        return "TripProgressUpdateFormatter(estimatedTimeOfArrivalFormatter=" + this.estimatedTimeOfArrivalFormatter + ", distanceRemainingFormatter=" + this.distanceRemainingFormatter + ", timeRemainingFormatter=" + this.timeRemainingFormatter + ", percentRouteTraveledFormatter=" + this.percentRouteTraveledFormatter + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TripProgressUpdateFormatter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        TripProgressUpdateFormatter tripProgressUpdateFormatter = (TripProgressUpdateFormatter) obj;
        return this.distanceRemainingFormatter.equals(tripProgressUpdateFormatter.distanceRemainingFormatter) && this.estimatedTimeOfArrivalFormatter.equals(tripProgressUpdateFormatter.estimatedTimeOfArrivalFormatter) && this.percentRouteTraveledFormatter.equals(tripProgressUpdateFormatter.percentRouteTraveledFormatter) && this.timeRemainingFormatter.equals(tripProgressUpdateFormatter.timeRemainingFormatter);
    }

    public final SpannableString getDistanceRemaining(double d) {
        return (SpannableString) this.distanceRemainingFormatter.format(Double.valueOf(d));
    }

    public final SpannableString getTimeRemaining(double d) {
        return (SpannableString) this.timeRemainingFormatter.format(Double.valueOf(d));
    }
}
