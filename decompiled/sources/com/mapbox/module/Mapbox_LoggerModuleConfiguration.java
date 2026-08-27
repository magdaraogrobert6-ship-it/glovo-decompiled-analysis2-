package com.mapbox.module;

import androidx.annotation.Keep;
import com.mapbox.common.logger.MapboxLogger;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class Mapbox_LoggerModuleConfiguration {
    private static final boolean enableConfiguration = false;
    public static final Mapbox_LoggerModuleConfiguration INSTANCE = new Mapbox_LoggerModuleConfiguration();
    private static final Class<MapboxLogger> implClass = MapboxLogger.class;

    private Mapbox_LoggerModuleConfiguration() {
    }

    public static final boolean getEnableConfiguration() {
        return enableConfiguration;
    }

    public static /* synthetic */ void getEnableConfiguration$annotations() {
    }

    public static final Class<MapboxLogger> getImplClass() {
        return implClass;
    }

    public static /* synthetic */ void getImplClass$annotations() {
    }
}
