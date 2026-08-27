package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtractedRouteRestrictionData extends ExpressionOffsetData {
    public final boolean isInRestrictedSection;

    @Override // com.mapbox.navigation.ui.maps.route.line.model.ExpressionOffsetData
    public final ExpressionOffsetData copyWithNewOffset(double d) {
        return new ExtractedRouteRestrictionData(this.legIndex, d, this.isInRestrictedSection);
    }

    public ExtractedRouteRestrictionData(int i, double d, boolean z) {
        super(d, i);
        this.isInRestrictedSection = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractedRouteRestrictionData(isInRestrictedSection=");
        sb.append(this.isInRestrictedSection);
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
        if (!ExtractedRouteRestrictionData.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return this.isInRestrictedSection == ((ExtractedRouteRestrictionData) obj).isInRestrictedSection;
    }

    @Override // com.mapbox.navigation.ui.maps.route.line.model.ExpressionOffsetData
    public final int hashCode() {
        return Boolean.hashCode(this.isInRestrictedSection) + (super.hashCode() * 31);
    }
}
