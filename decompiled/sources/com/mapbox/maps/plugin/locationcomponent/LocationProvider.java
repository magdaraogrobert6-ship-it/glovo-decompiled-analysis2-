package com.mapbox.maps.plugin.locationcomponent;

/* JADX INFO: loaded from: classes2.dex */
public interface LocationProvider {
    void registerLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl);

    void unRegisterLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl);
}
