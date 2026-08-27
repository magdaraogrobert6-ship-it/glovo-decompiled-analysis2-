package com.google.android.gms.internal.mlkit_vision_face;

import com.mapbox.navigation.navigator.internal.TripStatus;
import com.mapbox.navigator.RouteState;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmm {
    public static final boolean access$isOffRoute(TripStatus tripStatus) {
        return tripStatus.navigationStatus.getRouteState() == RouteState.OFF_ROUTE;
    }
}
