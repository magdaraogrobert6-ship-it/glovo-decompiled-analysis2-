package com.mapbox.maps.plugin.locationcomponent;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LocationComponentPluginImpl$$ExternalSyntheticLambda1 {
    public final /* synthetic */ LocationComponentPluginImpl f$0;

    public final void onIndicatorBearingChanged() {
        Iterator it = this.f$0.onIndicatorBearingChangedListeners.iterator();
        while (it.hasNext()) {
            ((LocationComponentPluginImpl$$ExternalSyntheticLambda1) it.next()).onIndicatorBearingChanged();
        }
    }
}
