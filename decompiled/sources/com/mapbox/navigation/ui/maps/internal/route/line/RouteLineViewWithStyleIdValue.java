package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class RouteLineViewWithStyleIdValue extends RouteLineViewEventValue {
    private final String styleId;

    public final String getStyleId() {
        return this.styleId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewWithStyleIdValue(String str, String str2) {
        super(str);
        str.getClass();
        this.styleId = str2;
    }
}
