package com.mapbox.maps;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes2.dex */
public final class MapAttributeParser {
    private static final int CONSTRAIN_MODE_HEIGHT_ONLY = 1;
    private static final int IDEOGRAPHS_RASTERIZED_LOCALLY = 1;
    public static final MapAttributeParser INSTANCE = new MapAttributeParser();
    private static final int NO_GLYPHS_RASTERIZED_LOCALLY = 0;

    private MapAttributeParser() {
    }

    public final MapOptions parseMapOptions(TypedArray typedArray, float f) {
        typedArray.getClass();
        int i = typedArray.getInt(R.styleable.mapbox_MapView_mapbox_mapContextMode, 0);
        int i2 = typedArray.getInt(R.styleable.mapbox_MapView_mapbox_mapConstrainMode, 1);
        int i3 = typedArray.getInt(R.styleable.mapbox_MapView_mapbox_mapOrientation, 0);
        int i4 = typedArray.getInt(R.styleable.mapbox_MapView_mapbox_mapGlyphRasterizationMode, 1);
        MapOptions mapOptionsBuild = new MapOptions.Builder().contextMode(ContextMode.values()[i]).constrainMode(ConstrainMode.values()[i2]).viewportMode(ViewportMode.values()[typedArray.getInt(R.styleable.mapbox_MapView_mapbox_mapViewportMode, 0)]).orientation(NorthOrientation.values()[i3]).crossSourceCollisions(Boolean.valueOf(typedArray.getBoolean(R.styleable.mapbox_MapView_mapbox_mapCrossSourceCollisionsEnabled, true))).pixelRatio(typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_mapPixelRatio, f)).glyphsRasterizationOptions(new GlyphsRasterizationOptions.Builder().rasterizationMode(GlyphsRasterizationMode.values()[i4]).fontFamily(i4 != 0 ? FontUtils.INSTANCE.extractValidFont(typedArray.getString(R.styleable.mapbox_MapView_mapbox_mapFontFamily)) : null).build()).build();
        mapOptionsBuild.getClass();
        return mapOptionsBuild;
    }

    public static /* synthetic */ MapOptions parseMapOptions$default(MapAttributeParser mapAttributeParser, TypedArray typedArray, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return mapAttributeParser.parseMapOptions(typedArray, f);
    }
}
