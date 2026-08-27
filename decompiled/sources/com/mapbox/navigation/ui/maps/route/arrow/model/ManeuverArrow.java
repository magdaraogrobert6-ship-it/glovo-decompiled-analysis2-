package com.mapbox.navigation.ui.maps.route.arrow.model;

import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverArrow {
    public final List points;

    public final int hashCode() {
        return this.points.hashCode();
    }

    public ManeuverArrow(List list) {
        this.points = list;
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("ManeuverArrow(points="), this.points, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ManeuverArrow.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.points.equals(((ManeuverArrow) obj).points);
    }
}
