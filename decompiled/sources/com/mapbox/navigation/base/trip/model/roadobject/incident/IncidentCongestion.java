package com.mapbox.navigation.base.trip.model.roadobject.incident;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IncidentCongestion {
    public final Integer value;

    public IncidentCongestion(Integer num) {
        this.value = num;
    }

    public final int hashCode() {
        Integer num = this.value;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "IncidentCongestion(value=" + this.value + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IncidentCongestion.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((IncidentCongestion) obj).value}, getCieXyz.write())).booleanValue();
    }
}
