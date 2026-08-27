package com.mapbox.maps.extension.style.sources;

import com.mapbox.maps.TileCacheBudget;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class SourceUtils$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TileCacheBudget.Type.values().length];
        try {
            iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_MEGABYTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_TILES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
