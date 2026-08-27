package com.mapbox.maps.debugoptions;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapViewDebugOptions {
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final MapViewDebugOptions TILE_BORDERS = new MapViewDebugOptions("TILE_BORDERS");
    public static final MapViewDebugOptions PARSE_STATUS = new MapViewDebugOptions("PARSE_STATUS");
    public static final MapViewDebugOptions TIMESTAMPS = new MapViewDebugOptions("TIMESTAMPS");
    public static final MapViewDebugOptions COLLISION = new MapViewDebugOptions("COLLISION");
    public static final MapViewDebugOptions OVERDRAW = new MapViewDebugOptions("OVERDRAW");
    public static final MapViewDebugOptions STENCIL_CLIP = new MapViewDebugOptions("STENCIL_CLIP");
    public static final MapViewDebugOptions DEPTH_BUFFER = new MapViewDebugOptions("DEPTH_BUFFER");
    public static final MapViewDebugOptions MODEL_BOUNDS = new MapViewDebugOptions("MODEL_BOUNDS");
    public static final MapViewDebugOptions TERRAIN_WIREFRAME = new MapViewDebugOptions("TERRAIN_WIREFRAME");
    public static final MapViewDebugOptions LAYERS2_DWIREFRAME = new MapViewDebugOptions("LAYERS2_DWIREFRAME");
    public static final MapViewDebugOptions LAYERS3_DWIREFRAME = new MapViewDebugOptions("LAYERS3_DWIREFRAME");
    public static final MapViewDebugOptions LIGHT = new MapViewDebugOptions("LIGHT");
    public static final MapViewDebugOptions CAMERA = new MapViewDebugOptions("CAMERA");
    public static final MapViewDebugOptions PADDING = new MapViewDebugOptions("PADDING");

    public final String component1$maps_sdk_release() {
        return this.name;
    }

    public final String getName$maps_sdk_release() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapViewDebugOptions(String str) {
        str.getClass();
        this.name = str;
    }

    public static /* synthetic */ MapViewDebugOptions copy$default(MapViewDebugOptions mapViewDebugOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mapViewDebugOptions.name;
        }
        return mapViewDebugOptions.copy(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapViewDebugOptions)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, ((MapViewDebugOptions) obj).name}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("MapViewDebugOptions(name="), this.name, ')');
    }

    public final MapViewDebugOptions copy(String str) {
        str.getClass();
        return new MapViewDebugOptions(str);
    }
}
