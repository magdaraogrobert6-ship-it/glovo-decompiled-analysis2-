package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class RouteLineViewEventValue {

    @SerializedName("action")
    private final String action;

    public final String getAction() {
        return this.action;
    }

    public RouteLineViewEventValue(String str) {
        str.getClass();
        this.action = str;
    }
}
