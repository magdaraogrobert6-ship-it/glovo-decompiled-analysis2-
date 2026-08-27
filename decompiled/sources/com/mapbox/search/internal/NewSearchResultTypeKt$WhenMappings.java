package com.mapbox.search.internal;

import com.mapbox.search.base.result.BaseSearchResultType;
import com.mapbox.search.result.SearchResultType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class NewSearchResultTypeKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[SearchResultType.values().length];
        try {
            iArr[SearchResultType.COUNTRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SearchResultType.REGION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SearchResultType.POSTCODE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SearchResultType.BLOCK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SearchResultType.PLACE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SearchResultType.DISTRICT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SearchResultType.LOCALITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SearchResultType.NEIGHBORHOOD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SearchResultType.STREET.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SearchResultType.ADDRESS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[SearchResultType.POI.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr2 = new int[BaseSearchResultType.values().length];
        try {
            iArr2[BaseSearchResultType.COUNTRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[BaseSearchResultType.REGION.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[BaseSearchResultType.POSTCODE.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[BaseSearchResultType.DISTRICT.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[BaseSearchResultType.PLACE.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[BaseSearchResultType.LOCALITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[BaseSearchResultType.NEIGHBORHOOD.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[BaseSearchResultType.STREET.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[BaseSearchResultType.ADDRESS.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[BaseSearchResultType.POI.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[BaseSearchResultType.BLOCK.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[BaseSearchResultType.UNKNOWN.ordinal()] = 12;
        } catch (NoSuchFieldError unused23) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
