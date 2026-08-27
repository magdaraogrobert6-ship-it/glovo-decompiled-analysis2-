package com.mapbox.navigation.base.trip.model.roadobject.ic;

import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Interchange extends RoadObject {
    public final ArrayList name;

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final int hashCode() {
        return this.name.hashCode();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        return "Interchange(name='" + this.name + "')";
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Interchange.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, ((Interchange) obj).name}, getCieXyz.write())).booleanValue();
    }

    public Interchange(String str, ArrayList arrayList, Double d, String str2, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        super(str, 9, d, str2, bool, roadObject);
        this.name = arrayList;
    }
}
