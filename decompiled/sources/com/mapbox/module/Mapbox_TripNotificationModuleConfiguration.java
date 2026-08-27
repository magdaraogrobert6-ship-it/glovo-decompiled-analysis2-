package com.mapbox.module;

import androidx.annotation.Keep;
import com.mapbox.navigation.trip.notification.internal.MapboxTripNotification;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class Mapbox_TripNotificationModuleConfiguration {
    private static final boolean enableConfiguration = false;
    public static final Mapbox_TripNotificationModuleConfiguration INSTANCE = new Mapbox_TripNotificationModuleConfiguration();
    private static final Class<MapboxTripNotification> implClass = MapboxTripNotification.class;

    private Mapbox_TripNotificationModuleConfiguration() {
    }

    public static final boolean getEnableConfiguration() {
        return enableConfiguration;
    }

    public static /* synthetic */ void getEnableConfiguration$annotations() {
    }

    public static final Class<MapboxTripNotification> getImplClass() {
        return implClass;
    }

    public static /* synthetic */ void getImplClass$annotations() {
    }
}
