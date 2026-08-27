package com.mapbox.navigation.base.trip.model.eh;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class EHorizonGraphPosition {
    public final long edgeId;
    public final double percentAlong;

    public final int hashCode() {
        return Double.hashCode(this.percentAlong) + (Long.hashCode(this.edgeId) * 31);
    }

    public EHorizonGraphPosition(long j, double d) {
        this.edgeId = j;
        this.percentAlong = d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EHorizonGraphPosition(edgeId=");
        sb.append(this.edgeId);
        sb.append(", percentAlong=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.percentAlong, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EHorizonGraphPosition.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        EHorizonGraphPosition eHorizonGraphPosition = (EHorizonGraphPosition) obj;
        return this.edgeId == eHorizonGraphPosition.edgeId && this.percentAlong == eHorizonGraphPosition.percentAlong;
    }
}
