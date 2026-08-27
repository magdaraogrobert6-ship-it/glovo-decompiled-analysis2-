package com.mapbox.turf.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class LineIntersectsResult {
    public final Double horizontalIntersection;
    public final boolean onLine1;
    public final boolean onLine2;
    public final Double verticalIntersection;

    public final int hashCode() {
        Double d = this.horizontalIntersection;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.verticalIntersection;
        int iHashCode2 = d2 != null ? d2.hashCode() : 0;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (this.onLine1 ? 1231 : 1237)) * 1000003) ^ (this.onLine2 ? 1231 : 1237);
    }

    public final N$b toBuilder() {
        N$b n$b = new N$b();
        Boolean bool = Boolean.FALSE;
        n$b.IconCompatParcelizer = bool;
        n$b.serializer = bool;
        n$b.read = this.horizontalIntersection;
        n$b.write = this.verticalIntersection;
        n$b.IconCompatParcelizer = Boolean.valueOf(this.onLine1);
        n$b.serializer = Boolean.valueOf(this.onLine2);
        return n$b;
    }

    public LineIntersectsResult(Double d, Double d2, boolean z, boolean z2) {
        this.horizontalIntersection = d;
        this.verticalIntersection = d2;
        this.onLine1 = z;
        this.onLine2 = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LineIntersectsResult)) {
            return false;
        }
        LineIntersectsResult lineIntersectsResult = (LineIntersectsResult) obj;
        Double d = lineIntersectsResult.horizontalIntersection;
        Double d2 = this.horizontalIntersection;
        if (d2 == null) {
            if (d != null) {
                return false;
            }
        } else if (!d2.equals(d)) {
            return false;
        }
        Double d3 = lineIntersectsResult.verticalIntersection;
        Double d4 = this.verticalIntersection;
        if (d4 == null) {
            if (d3 != null) {
                return false;
            }
        } else if (!d4.equals(d3)) {
            return false;
        }
        return this.onLine1 == lineIntersectsResult.onLine1 && this.onLine2 == lineIntersectsResult.onLine2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineIntersectsResult{horizontalIntersection=");
        sb.append(this.horizontalIntersection);
        sb.append(", verticalIntersection=");
        sb.append(this.verticalIntersection);
        sb.append(", onLine1=");
        sb.append(this.onLine1);
        sb.append(", onLine2=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.onLine2, "}");
    }
}
