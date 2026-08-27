package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.af$$ExternalSyntheticOutline0;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtractedRouteData {
    public final boolean isLegOrigin;
    public final int legIndex;
    public final double offset;
    public final String roadClass;
    public final String trafficCongestionIdentifier;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(Double.hashCode(this.offset) * 31, 31, this.trafficCongestionIdentifier);
        String str = this.roadClass;
        int iM2 = af$$ExternalSyntheticOutline0.m(this.legIndex, (iM + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.isLegOrigin;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iM2 + r1;
    }

    public ExtractedRouteData(double d, String str, String str2, int i, boolean z) {
        str.getClass();
        this.offset = d;
        this.trafficCongestionIdentifier = str;
        this.roadClass = str2;
        this.legIndex = i;
        this.isLegOrigin = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtractedRouteData)) {
            return false;
        }
        ExtractedRouteData extractedRouteData = (ExtractedRouteData) obj;
        if (Double.compare(this.offset, extractedRouteData.offset) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trafficCongestionIdentifier, extractedRouteData.trafficCongestionIdentifier}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roadClass, extractedRouteData.roadClass}, getCieXyz.write())).booleanValue() && this.legIndex == extractedRouteData.legIndex && this.isLegOrigin == extractedRouteData.isLegOrigin;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractedRouteData(offset=");
        sb.append(this.offset);
        sb.append(", trafficCongestionIdentifier=");
        sb.append(this.trafficCongestionIdentifier);
        sb.append(", roadClass=");
        sb.append(this.roadClass);
        sb.append(", legIndex=");
        sb.append(this.legIndex);
        sb.append(", isLegOrigin=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isLegOrigin, ')');
    }
}
