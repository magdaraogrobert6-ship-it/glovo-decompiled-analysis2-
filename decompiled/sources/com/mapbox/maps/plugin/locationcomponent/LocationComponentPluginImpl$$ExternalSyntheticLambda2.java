package com.mapbox.maps.plugin.locationcomponent;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LocationComponentPluginImpl$$ExternalSyntheticLambda2 {
    public final /* synthetic */ LocationComponentPluginImpl f$0;

    public final void onIndicatorAccuracyRadiusChanged() {
        Iterator it = this.f$0.onIndicatorAccuracyRadiusChangedListeners.iterator();
        while (it.hasNext()) {
            ((LocationComponentPluginImpl$$ExternalSyntheticLambda2) it.next()).onIndicatorAccuracyRadiusChanged();
        }
    }
}
