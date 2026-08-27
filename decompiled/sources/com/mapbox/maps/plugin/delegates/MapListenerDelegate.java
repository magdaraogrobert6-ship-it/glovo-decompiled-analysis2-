package com.mapbox.maps.plugin.delegates;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraChangedCoalescedCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface MapListenerDelegate {
    Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback);
}
