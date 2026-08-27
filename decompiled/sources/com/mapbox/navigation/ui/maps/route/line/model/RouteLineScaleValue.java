package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.navigation.base.internal.utils.FloatKt;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineScaleValue {
    public final float scale;
    public final float scaleMultiplier;
    public final float scaleStop;

    public final int hashCode() {
        return Float.hashCode(this.scale) + af$$ExternalSyntheticOutline1.m(this.scaleMultiplier, Float.hashCode(this.scaleStop) * 31, 31);
    }

    public RouteLineScaleValue(float f, float f2, float f3) {
        this.scaleStop = f;
        this.scaleMultiplier = f2;
        this.scale = f3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteLineScaleValue(scaleStop=");
        sb.append(this.scaleStop);
        sb.append(", scaleMultiplier=");
        sb.append(this.scaleMultiplier);
        sb.append(", scale=");
        return MediaSessionCompatQueueItem.serializer(sb, this.scale, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLineScaleValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteLineScaleValue routeLineScaleValue = (RouteLineScaleValue) obj;
        if (!FloatKt.safeCompareTo(Float.valueOf(this.scaleStop), Float.valueOf(routeLineScaleValue.scaleStop))) {
            return false;
        }
        if (FloatKt.safeCompareTo(Float.valueOf(this.scaleMultiplier), Float.valueOf(routeLineScaleValue.scaleMultiplier))) {
            return FloatKt.safeCompareTo(Float.valueOf(this.scale), Float.valueOf(routeLineScaleValue.scale));
        }
        return false;
    }
}
