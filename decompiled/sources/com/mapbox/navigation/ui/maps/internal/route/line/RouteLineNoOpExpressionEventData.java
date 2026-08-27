package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineNoOpExpressionEventData extends RouteLineExpressionEventData {
    public RouteLineNoOpExpressionEventData() {
        super("no_op");
    }

    public int hashCode() {
        return RouteLineNoOpExpressionEventData.class.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return RouteLineNoOpExpressionEventData.class.equals(obj != null ? obj.getClass() : null);
    }
}
