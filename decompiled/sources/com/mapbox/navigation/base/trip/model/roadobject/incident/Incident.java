package com.mapbox.navigation.base.trip.model.roadobject.incident;

import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Incident extends RoadObject {
    public final IncidentInfo info;

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        return "Incident(info=" + this.info + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Incident.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.info, ((Incident) obj).info}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final int hashCode() {
        return this.info.hashCode() + (super.hashCode() * 31);
    }

    public Incident(String str, IncidentInfo incidentInfo, Double d, String str2, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        super(str, 6, d, str2, bool, roadObject);
        this.info = incidentInfo;
    }
}
