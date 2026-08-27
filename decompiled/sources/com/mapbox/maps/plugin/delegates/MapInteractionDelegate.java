package com.mapbox.maps.plugin.delegates;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.PlatformEventInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface MapInteractionDelegate {
    Cancelable addInteraction(MapInteraction mapInteraction);

    void dispatch(PlatformEventInfo platformEventInfo);
}
