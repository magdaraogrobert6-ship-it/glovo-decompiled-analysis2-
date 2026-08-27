package com.mapbox.navigation.base.trip.model.eh;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class EHorizonEdge {
    public final long id;
    public final boolean isOnRoute;
    public final byte level;
    public final ArrayList out;
    public final double probability;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        return this.out.hashCode() + d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.probability, ((iHashCode * 31) + this.level) * 31, 31), 31, this.isOnRoute);
    }

    public EHorizonEdge(long j, byte b, double d, boolean z, ArrayList arrayList) {
        this.id = j;
        this.level = b;
        this.probability = d;
        this.isOnRoute = z;
        this.out = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Edge(id=");
        sb.append(this.id);
        sb.append(", level=");
        sb.append((int) this.level);
        sb.append(", probability=");
        sb.append(this.probability);
        sb.append(", isOnRoute=");
        sb.append(this.isOnRoute);
        sb.append(", out=");
        return af$$ExternalSyntheticOutline1.m(sb, this.out, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EHorizonEdge.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        EHorizonEdge eHorizonEdge = (EHorizonEdge) obj;
        return this.id == eHorizonEdge.id && this.level == eHorizonEdge.level && this.probability == eHorizonEdge.probability && this.isOnRoute == eHorizonEdge.isOnRoute && this.out.equals(eHorizonEdge.out);
    }
}
