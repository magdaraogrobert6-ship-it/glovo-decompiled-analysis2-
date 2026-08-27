package com.mapbox.common.location;

/* JADX INFO: loaded from: classes4.dex */
public interface LocationServiceObserver {
    void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    void onAvailabilityChanged(boolean z);

    void onPermissionStatusChanged(PermissionStatus permissionStatus);
}
