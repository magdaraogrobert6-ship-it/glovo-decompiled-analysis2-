package com.mapbox.module;

import androidx.annotation.Keep;
import com.mapbox.common.loader.MapboxLibraryLoader;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class Mapbox_LibraryLoaderModuleConfiguration {
    private static final boolean enableConfiguration = false;
    public static final Mapbox_LibraryLoaderModuleConfiguration INSTANCE = new Mapbox_LibraryLoaderModuleConfiguration();
    private static final Class<MapboxLibraryLoader> implClass = MapboxLibraryLoader.class;

    private Mapbox_LibraryLoaderModuleConfiguration() {
    }

    public static final boolean getEnableConfiguration() {
        return enableConfiguration;
    }

    public static /* synthetic */ void getEnableConfiguration$annotations() {
    }

    public static final Class<MapboxLibraryLoader> getImplClass() {
        return implClass;
    }

    public static /* synthetic */ void getImplClass$annotations() {
    }
}
