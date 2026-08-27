package com.mapbox.navigation.ui.maps.route.line.model;

/* JADX INFO: loaded from: classes2.dex */
public final class InactiveRouteColors {
    public final SegmentColorType inactiveRouteLegClosureColorType;
    public final SegmentColorType inactiveRouteLegHeavyCongestionColorType;
    public final SegmentColorType inactiveRouteLegLowCongestionColorType;
    public final SegmentColorType inactiveRouteLegModerateCongestionColorType;
    public final SegmentColorType inactiveRouteLegRestrictedRoadColorType;
    public final SegmentColorType inactiveRouteLegSevereCongestionColorType;
    public final SegmentColorType inactiveRouteLegUnknownCongestionColorType;

    public final int hashCode() {
        int iHashCode = this.inactiveRouteLegLowCongestionColorType.hashCode();
        int iHashCode2 = this.inactiveRouteLegModerateCongestionColorType.hashCode();
        int iHashCode3 = this.inactiveRouteLegHeavyCongestionColorType.hashCode();
        int iHashCode4 = this.inactiveRouteLegSevereCongestionColorType.hashCode();
        int iHashCode5 = this.inactiveRouteLegUnknownCongestionColorType.hashCode();
        return this.inactiveRouteLegRestrictedRoadColorType.hashCode() + ((this.inactiveRouteLegClosureColorType.hashCode() + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public InactiveRouteColors(SegmentColorType segmentColorType, SegmentColorType segmentColorType2, SegmentColorType segmentColorType3, SegmentColorType segmentColorType4, SegmentColorType segmentColorType5, SegmentColorType segmentColorType6, SegmentColorType segmentColorType7) {
        segmentColorType.getClass();
        segmentColorType2.getClass();
        segmentColorType3.getClass();
        segmentColorType4.getClass();
        segmentColorType5.getClass();
        segmentColorType6.getClass();
        segmentColorType7.getClass();
        this.inactiveRouteLegLowCongestionColorType = segmentColorType;
        this.inactiveRouteLegModerateCongestionColorType = segmentColorType2;
        this.inactiveRouteLegHeavyCongestionColorType = segmentColorType3;
        this.inactiveRouteLegSevereCongestionColorType = segmentColorType4;
        this.inactiveRouteLegUnknownCongestionColorType = segmentColorType5;
        this.inactiveRouteLegClosureColorType = segmentColorType6;
        this.inactiveRouteLegRestrictedRoadColorType = segmentColorType7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InactiveRouteColors)) {
            return false;
        }
        InactiveRouteColors inactiveRouteColors = (InactiveRouteColors) obj;
        return this.inactiveRouteLegLowCongestionColorType == inactiveRouteColors.inactiveRouteLegLowCongestionColorType && this.inactiveRouteLegModerateCongestionColorType == inactiveRouteColors.inactiveRouteLegModerateCongestionColorType && this.inactiveRouteLegHeavyCongestionColorType == inactiveRouteColors.inactiveRouteLegHeavyCongestionColorType && this.inactiveRouteLegSevereCongestionColorType == inactiveRouteColors.inactiveRouteLegSevereCongestionColorType && this.inactiveRouteLegUnknownCongestionColorType == inactiveRouteColors.inactiveRouteLegUnknownCongestionColorType && this.inactiveRouteLegClosureColorType == inactiveRouteColors.inactiveRouteLegClosureColorType && this.inactiveRouteLegRestrictedRoadColorType == inactiveRouteColors.inactiveRouteLegRestrictedRoadColorType;
    }

    public final String toString() {
        return "InactiveRouteColors(inactiveRouteLegLowCongestionColorType=" + this.inactiveRouteLegLowCongestionColorType + ", inactiveRouteLegModerateCongestionColorType=" + this.inactiveRouteLegModerateCongestionColorType + ", inactiveRouteLegHeavyCongestionColorType=" + this.inactiveRouteLegHeavyCongestionColorType + ", inactiveRouteLegSevereCongestionColorType=" + this.inactiveRouteLegSevereCongestionColorType + ", inactiveRouteLegUnknownCongestionColorType=" + this.inactiveRouteLegUnknownCongestionColorType + ", inactiveRouteLegClosureColorType=" + this.inactiveRouteLegClosureColorType + ", inactiveRouteLegRestrictedRoadColorType=" + this.inactiveRouteLegRestrictedRoadColorType + ')';
    }
}
