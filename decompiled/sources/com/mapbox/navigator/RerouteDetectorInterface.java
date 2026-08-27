package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface RerouteDetectorInterface {
    void cancelReroute();

    void forceReroute(ForceRerouteReason forceRerouteReason);

    void forceReroute(ForceRerouteReason forceRerouteReason, ForceRerouteCallback forceRerouteCallback);

    boolean isReroute();
}
