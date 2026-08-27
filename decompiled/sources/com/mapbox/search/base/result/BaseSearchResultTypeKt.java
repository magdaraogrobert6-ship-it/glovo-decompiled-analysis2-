package com.mapbox.search.base.result;

import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.internal.bindgen.ResultType;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSearchResultTypeKt {
    public static final List ALLOWED_MULTI_PLACE_TYPES = SQLite.read(ResultType.COUNTRY, ResultType.REGION, ResultType.POSTCODE, ResultType.DISTRICT, ResultType.PLACE, ResultType.LOCALITY);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BaseSearchResultType.values().length];
            try {
                iArr[BaseSearchResultType.COUNTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseSearchResultType.REGION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseSearchResultType.POSTCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseSearchResultType.BLOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseSearchResultType.PLACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseSearchResultType.DISTRICT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseSearchResultType.LOCALITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseSearchResultType.NEIGHBORHOOD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BaseSearchResultType.STREET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BaseSearchResultType.ADDRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BaseSearchResultType.POI.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BaseSearchResultType.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[ResultType.values().length];
            try {
                iArr2[ResultType.COUNTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ResultType.REGION.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ResultType.PLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ResultType.DISTRICT.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ResultType.LOCALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ResultType.NEIGHBORHOOD.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ResultType.ADDRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ResultType.POI.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ResultType.STREET.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[ResultType.POSTCODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[ResultType.BLOCK.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[ResultType.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[ResultType.USER_RECORD.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[ResultType.CATEGORY.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[ResultType.BRAND.ordinal()] = 15;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[ResultType.QUERY.ordinal()] = 16;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BaseSearchResultType tryMapToSearchResultType(ResultType resultType) {
        resultType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[resultType.ordinal()]) {
            case 1:
                return BaseSearchResultType.COUNTRY;
            case 2:
                return BaseSearchResultType.REGION;
            case 3:
                return BaseSearchResultType.PLACE;
            case 4:
                return BaseSearchResultType.DISTRICT;
            case 5:
                return BaseSearchResultType.LOCALITY;
            case 6:
                return BaseSearchResultType.NEIGHBORHOOD;
            case 7:
                return BaseSearchResultType.ADDRESS;
            case 8:
                return BaseSearchResultType.POI;
            case 9:
                return BaseSearchResultType.STREET;
            case 10:
                return BaseSearchResultType.POSTCODE;
            case 11:
                return BaseSearchResultType.BLOCK;
            case 12:
                return BaseSearchResultType.UNKNOWN;
            case 13:
            case 14:
            case 15:
            case 16:
                return null;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }

    public static final boolean isValidMultiType(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        return ALLOWED_MULTI_PLACE_TYPES.containsAll(collection) || collection.size() == 1;
    }
}
