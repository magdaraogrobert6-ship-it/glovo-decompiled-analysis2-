package com.mapbox.navigation.core;

import com.mapbox.navigation.base.trip.notification.NotificationAction;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class MapboxNavigation$monitorNotificationActionButton$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[NotificationAction.values().length];
        try {
            iArr[NotificationAction.END_NAVIGATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
