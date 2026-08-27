package com.mapbox.search;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class SearchEngineFactory$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ApiType.values().length];
        try {
            iArr[ApiType.GEOCODING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApiType.SBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
