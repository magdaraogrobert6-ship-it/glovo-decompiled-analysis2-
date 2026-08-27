package com.mapbox.navigation.base.trip.model.roadobject.distanceinfo;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObjectPosition;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class Gate {
    public final double distance;
    public final int id;
    public final RoadObjectPosition position;
    public final double probability;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        return Double.hashCode(this.distance) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.probability, (this.position.hashCode() + (iHashCode * 31)) * 31, 31);
    }

    public Gate(int i, RoadObjectPosition roadObjectPosition, double d, double d2) {
        this.id = i;
        this.position = roadObjectPosition;
        this.probability = d;
        this.distance = d2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Gate(id=");
        sb.append(this.id);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", probability=");
        sb.append(this.probability);
        sb.append(", distance=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.distance, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Gate.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Gate gate = (Gate) obj;
        return this.id == gate.id && this.position.equals(gate.position) && this.probability == gate.probability && this.distance == gate.distance;
    }
}
