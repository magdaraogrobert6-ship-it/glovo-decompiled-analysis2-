package com.mapbox.navigation.base.trip.model.eh;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class EHorizonGraphPath {
    public final List edges;
    public final double length;
    public final double percentAlongBegin;
    public final double percentAlongEnd;

    public final int hashCode() {
        return Double.hashCode(this.length) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.percentAlongEnd, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.percentAlongBegin, this.edges.hashCode() * 31, 31), 31);
    }

    public EHorizonGraphPath(List list, double d, double d2, double d3) {
        this.edges = list;
        this.percentAlongBegin = d;
        this.percentAlongEnd = d2;
        this.length = d3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EHorizonGraphPath(edges=");
        sb.append(this.edges);
        sb.append(", percentAlongBegin=");
        sb.append(this.percentAlongBegin);
        sb.append(", percentAlongEnd=");
        sb.append(this.percentAlongEnd);
        sb.append(", length=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.length, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EHorizonGraphPath.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        EHorizonGraphPath eHorizonGraphPath = (EHorizonGraphPath) obj;
        return this.edges.equals(eHorizonGraphPath.edges) && this.percentAlongBegin == eHorizonGraphPath.percentAlongBegin && this.percentAlongEnd == eHorizonGraphPath.percentAlongEnd && this.length == eHorizonGraphPath.length;
    }
}
