package com.mapbox.maps.plugin;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidPluginConfigurationException extends Exception {
    public InvalidPluginConfigurationException() {
        super("Can't look up an instance of plugin, is it available on the clazz path and loaded through the map?");
    }
}
