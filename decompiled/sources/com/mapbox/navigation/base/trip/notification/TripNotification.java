package com.mapbox.navigation.base.trip.notification;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public interface TripNotification {
    Notification getNotification();

    int getNotificationId();

    void onTripSessionStopped();
}
