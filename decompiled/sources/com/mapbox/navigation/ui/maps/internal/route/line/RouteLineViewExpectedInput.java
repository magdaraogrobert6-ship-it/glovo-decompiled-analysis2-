package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class RouteLineViewExpectedInput {

    @SerializedName("type")
    private final String type;

    public final String getType() {
        return this.type;
    }

    public RouteLineViewExpectedInput(String str) {
        str.getClass();
        this.type = str;
    }
}
