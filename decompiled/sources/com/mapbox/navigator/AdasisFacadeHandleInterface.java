package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;

/* JADX INFO: loaded from: classes3.dex */
public interface AdasisFacadeHandleInterface {
    void resetAdasisMessageCallback();

    @MapboxExperimental
    void setAdasisMessageCallback(ADASISv2MessageCallback aDASISv2MessageCallback, AdasisConfig adasisConfig);

    void triggerResetOfEhProvider();
}
