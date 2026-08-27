package com.mapbox.navigation.base.trip.model.eh;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class EHorizonPosition {
    public final EHorizon eHorizon;
    public final EHorizonGraphPosition eHorizonGraphPosition;
    public final String eHorizonResultType;

    public final int hashCode() {
        int iHashCode = this.eHorizonGraphPosition.hashCode();
        return this.eHorizonResultType.hashCode() + ((this.eHorizon.start.hashCode() + (iHashCode * 31)) * 31);
    }

    public EHorizonPosition(EHorizonGraphPosition eHorizonGraphPosition, EHorizon eHorizon, String str) {
        this.eHorizonGraphPosition = eHorizonGraphPosition;
        this.eHorizon = eHorizon;
        this.eHorizonResultType = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EHorizonPosition(eHorizonGraphPosition=");
        sb.append(this.eHorizonGraphPosition);
        sb.append(", eHorizon=");
        sb.append(this.eHorizon);
        sb.append(", eHorizonResultType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.eHorizonResultType, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EHorizonPosition.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        EHorizonPosition eHorizonPosition = (EHorizonPosition) obj;
        return this.eHorizonGraphPosition.equals(eHorizonPosition.eHorizonGraphPosition) && this.eHorizon.equals(eHorizonPosition.eHorizon) && this.eHorizonResultType.equals(eHorizonPosition.eHorizonResultType);
    }
}
