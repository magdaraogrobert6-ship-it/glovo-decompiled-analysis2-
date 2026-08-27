package com.mapbox.annotation.module;

/* JADX INFO: loaded from: classes2.dex */
public enum MapboxModuleType {
    CommonLibraryLoader("LibraryLoader", "com.mapbox.common.module", "LibraryLoader"),
    CommonLogger("Logger", "com.mapbox.base.common.logger", "Logger"),
    MapTelemetry("MapTelemetry", "com.mapbox.maps.module", "MapTelemetry"),
    NavigationTripNotification("TripNotification", "com.mapbox.navigation.base.trip.notification", "TripNotification");

    private final String interfaceClassName;
    private final String interfacePackage;
    private final String simplifiedName;

    public final String getInterfaceClassName() {
        return this.interfaceClassName;
    }

    public final String getInterfacePackage() {
        return this.interfacePackage;
    }

    public final String getSimplifiedName() {
        return this.simplifiedName;
    }

    MapboxModuleType(String str, String str2, String str3) {
        this.simplifiedName = str;
        this.interfacePackage = str2;
        this.interfaceClassName = str3;
    }
}
