package com.mapbox.maps;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxConstants {
    public static final String CORE_SHARED_LIBRARY_NAME = "mapbox-common";
    private static final Locale MAPBOX_LOCALE;
    public static final String MAP_SHARED_LIBRARY_NAME = "mapbox-maps";
    public static final double MAXIMUM_BEARING = 360.0d;
    public static final float MAXIMUM_ZOOM = 25.5f;
    public static final double MINIMUM_BEARING = 0.0d;
    public static final float MINIMUM_ZOOM = 0.0f;

    public static final Locale getMAPBOX_LOCALE() {
        return MAPBOX_LOCALE;
    }

    static {
        Locale locale = Locale.US;
        locale.getClass();
        MAPBOX_LOCALE = locale;
    }
}
