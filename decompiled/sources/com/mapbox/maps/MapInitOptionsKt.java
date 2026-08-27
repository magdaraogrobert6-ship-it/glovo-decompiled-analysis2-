package com.mapbox.maps;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class MapInitOptionsKt {
    public static final MapOptions.Builder applyDefaultParams(MapOptions.Builder builder, float f) {
        builder.getClass();
        builder.glyphsRasterizationOptions(new GlyphsRasterizationOptions.Builder().rasterizationMode(GlyphsRasterizationMode.IDEOGRAPHS_RASTERIZED_LOCALLY).fontFamily(FontUtils.INSTANCE.extractValidFont(null)).build());
        builder.pixelRatio(f);
        builder.constrainMode(ConstrainMode.HEIGHT_ONLY);
        builder.contextMode(ContextMode.UNIQUE);
        builder.orientation(NorthOrientation.UPWARDS);
        builder.viewportMode(ViewportMode.DEFAULT);
        builder.crossSourceCollisions(Boolean.TRUE);
        return builder;
    }

    public static final MapOptions.Builder applyDefaultParams(MapOptions.Builder builder, Context context) {
        builder.getClass();
        context.getClass();
        return applyDefaultParams(builder, context.getResources().getDisplayMetrics().density);
    }
}
