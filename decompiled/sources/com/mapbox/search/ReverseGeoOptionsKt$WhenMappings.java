package com.mapbox.search;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ReverseGeoOptionsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ReverseMode.values().length];
        try {
            iArr[ReverseMode.DISTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReverseMode.SCORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
