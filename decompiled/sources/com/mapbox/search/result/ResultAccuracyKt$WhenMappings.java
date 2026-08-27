package com.mapbox.search.result;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ResultAccuracyKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[com.mapbox.search.internal.bindgen.ResultAccuracy.values().length];
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.ROOFTOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.PARCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.INTERPOLATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.INTERSECTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.APPROXIMATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.STREET.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[com.mapbox.search.internal.bindgen.ResultAccuracy.PROXIMATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
