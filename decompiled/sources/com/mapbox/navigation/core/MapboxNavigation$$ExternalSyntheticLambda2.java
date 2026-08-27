package com.mapbox.navigation.core;

import com.google.android.gms.internal.mlkit_vision_face.zznc;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxNavigation$$ExternalSyntheticLambda2 {
    public final /* synthetic */ MapboxNavigation f$0;

    public final void onOffRouteStateChanged(boolean z) {
        MapboxNavigation mapboxNavigation;
        zznc zzncVar;
        if (!z || (zzncVar = (mapboxNavigation = this.f$0).rerouteController) == null) {
            return;
        }
        zzncVar.rerouteOnDeviation(new MapboxNavigation$$ExternalSyntheticLambda4(0, mapboxNavigation));
    }

    public /* synthetic */ MapboxNavigation$$ExternalSyntheticLambda2(MapboxNavigation mapboxNavigation) {
        this.f$0 = mapboxNavigation;
    }
}
