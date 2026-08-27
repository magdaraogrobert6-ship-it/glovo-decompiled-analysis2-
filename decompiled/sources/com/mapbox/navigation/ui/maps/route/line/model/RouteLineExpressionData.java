package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineExpressionData extends ExpressionOffsetData {
    public final String congestionValue;
    public final SegmentColorType segmentColorType;

    @Override // com.mapbox.navigation.ui.maps.route.line.model.ExpressionOffsetData
    public final ExpressionOffsetData copyWithNewOffset(double d) {
        return new RouteLineExpressionData(d, this.congestionValue, this.segmentColorType, this.legIndex);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineExpressionData(double d, String str, SegmentColorType segmentColorType, int i) {
        super(d, i);
        segmentColorType.getClass();
        this.congestionValue = str;
        this.segmentColorType = segmentColorType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteLineExpressionData(congestionValue=");
        sb.append(this.congestionValue);
        sb.append(", segmentColorProvider=");
        sb.append(this.segmentColorType);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", legIndex=");
        return af$$ExternalSyntheticOutline0.m(sb, this.legIndex, ')');
    }

    @Override // com.mapbox.navigation.ui.maps.route.line.model.ExpressionOffsetData
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLineExpressionData.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        RouteLineExpressionData routeLineExpressionData = (RouteLineExpressionData) obj;
        return this.congestionValue.equals(routeLineExpressionData.congestionValue) && this.segmentColorType == routeLineExpressionData.segmentColorType;
    }

    @Override // com.mapbox.navigation.ui.maps.route.line.model.ExpressionOffsetData
    public final int hashCode() {
        return this.segmentColorType.hashCode() + af$$ExternalSyntheticOutline0.m(super.hashCode() * 31, 31, this.congestionValue);
    }
}
