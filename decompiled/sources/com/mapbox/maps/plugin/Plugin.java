package com.mapbox.maps.plugin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Plugin {
    public final String id;
    public final MapPlugin instance;

    public final int hashCode() {
        return this.id.hashCode() + 31;
    }

    public Plugin(String str, MapPlugin mapPlugin) {
        this.id = str;
        this.instance = mapPlugin;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("pluginId = ");
        sb.append(this.id);
        sb.append(", pluginInstance = ");
        MapPlugin mapPlugin = this.instance;
        sb.append(mapPlugin != null ? mapPlugin.getClass() : null);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass().equals(obj.getClass()) && ((Plugin) obj).id.equals(this.id);
    }
}
