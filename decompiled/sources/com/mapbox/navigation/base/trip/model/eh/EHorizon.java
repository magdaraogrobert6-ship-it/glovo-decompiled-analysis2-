package com.mapbox.navigation.base.trip.model.eh;

/* JADX INFO: loaded from: classes2.dex */
public final class EHorizon {
    public final EHorizonEdge start;

    public final int hashCode() {
        return this.start.hashCode();
    }

    public EHorizon(EHorizonEdge eHorizonEdge) {
        this.start = eHorizonEdge;
    }

    public final String toString() {
        return "EHorizon(start=" + this.start + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EHorizon.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.start.equals(((EHorizon) obj).start);
    }
}
