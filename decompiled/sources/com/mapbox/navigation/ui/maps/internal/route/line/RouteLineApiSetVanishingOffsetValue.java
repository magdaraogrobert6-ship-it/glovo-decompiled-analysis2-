package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class RouteLineApiSetVanishingOffsetValue extends RouteLineApiEventValue {
    private final double offset;

    public final double getOffset() {
        return this.offset;
    }

    public RouteLineApiSetVanishingOffsetValue(double d) {
        super("set_vanishing_offset");
        this.offset = d;
    }
}
