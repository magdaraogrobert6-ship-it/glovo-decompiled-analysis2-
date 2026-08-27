package com.mapbox.common.location;

import android.location.Criteria;
import com.google.android.gms.location.LocationRequest;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationProviderSettingsExtKt {
    public static final float minimumDisplacement(LocationProviderRequest locationProviderRequest, float f) {
        Float displacement = locationProviderRequest != null ? locationProviderRequest.getDisplacement() : null;
        return displacement == null ? f : displacement.floatValue();
    }

    public static final long minimumInterval(LocationProviderRequest locationProviderRequest, long j) {
        IntervalSettings interval;
        Long minimumInterval = (locationProviderRequest == null || (interval = locationProviderRequest.getInterval()) == null) ? null : interval.getMinimumInterval();
        return minimumInterval == null ? j : minimumInterval.longValue();
    }

    public static final Expected<LocationError, Criteria> toCriteria(LocationProviderRequest locationProviderRequest) {
        Criteria criteria = new Criteria();
        if (locationProviderRequest != null) {
            locationProviderRequest.getAccuracy();
            AccuracyLevel accuracy = locationProviderRequest.getAccuracy();
            int i = accuracy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracy.ordinal()];
            if (i == 1) {
                criteria.setCostAllowed(true);
                criteria.setPowerRequirement(3);
                criteria.setHorizontalAccuracy(3);
                criteria.setVerticalAccuracy(3);
                criteria.setBearingAccuracy(3);
                criteria.setSpeedAccuracy(3);
            } else if (i == 2) {
                criteria.setPowerRequirement(3);
                criteria.setHorizontalAccuracy(3);
                criteria.setVerticalAccuracy(3);
                criteria.setBearingAccuracy(3);
                criteria.setSpeedAccuracy(3);
            } else if (i == 3) {
                criteria.setPowerRequirement(2);
                criteria.setHorizontalAccuracy(2);
                criteria.setVerticalAccuracy(2);
                criteria.setBearingAccuracy(2);
                criteria.setSpeedAccuracy(2);
            } else if (i == 4) {
                criteria.setPowerRequirement(1);
                criteria.setHorizontalAccuracy(1);
                criteria.setVerticalAccuracy(1);
                criteria.setBearingAccuracy(1);
                criteria.setSpeedAccuracy(1);
            } else if (i != 5) {
                Expected<LocationError, Criteria> expectedCreateError = ExpectedFactory.createError(new LocationError(LocationErrorCode.INVALID_ARGUMENT, "Unsupported AccuracyLevel value: " + locationProviderRequest.getAccuracy()));
                expectedCreateError.getClass();
                return expectedCreateError;
            }
        }
        Expected<LocationError, Criteria> expectedCreateValue = ExpectedFactory.createValue(criteria);
        expectedCreateValue.getClass();
        return expectedCreateValue;
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccuracyLevel.values().length];
            try {
                iArr[AccuracyLevel.HIGHEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccuracyLevel.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccuracyLevel.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccuracyLevel.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccuracyLevel.PASSIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ float minimumDisplacement$default(LocationProviderRequest locationProviderRequest, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return minimumDisplacement(locationProviderRequest, f);
    }

    public static /* synthetic */ long minimumInterval$default(LocationProviderRequest locationProviderRequest, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return minimumInterval(locationProviderRequest, j);
    }

    public static final Expected<LocationError, LocationRequest> toLocationRequest(LocationProviderRequest locationProviderRequest) {
        int i;
        Long maximumInterval;
        Long minimumInterval;
        Long interval;
        LocationRequest locationRequestCreate = LocationRequest.create();
        AccuracyLevel accuracy = locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null;
        int i2 = accuracy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracy.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = 100;
        } else if (i2 == 3) {
            i = 102;
        } else if (i2 == 4) {
            i = 104;
        } else {
            if (i2 != 5) {
                LocationErrorCode locationErrorCode = LocationErrorCode.INVALID_ARGUMENT;
                StringBuilder sb = new StringBuilder("Unsupported AccuracyLevel value: ");
                sb.append(locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null);
                Expected<LocationError, LocationRequest> expectedCreateError = ExpectedFactory.createError(new LocationError(locationErrorCode, sb.toString()));
                expectedCreateError.getClass();
                return expectedCreateError;
            }
            i = 105;
        }
        locationRequestCreate.setPriority(i);
        IntervalSettings interval2 = locationProviderRequest.getInterval();
        if (interval2 != null && (interval = interval2.getInterval()) != null) {
            locationRequestCreate.setInterval(interval.longValue());
        }
        IntervalSettings interval3 = locationProviderRequest.getInterval();
        if (interval3 != null && (minimumInterval = interval3.getMinimumInterval()) != null) {
            locationRequestCreate.setFastestInterval(minimumInterval.longValue());
        }
        IntervalSettings interval4 = locationProviderRequest.getInterval();
        if (interval4 != null && (maximumInterval = interval4.getMaximumInterval()) != null) {
            locationRequestCreate.setMaxWaitTime(maximumInterval.longValue());
        }
        Float displacement = locationProviderRequest.getDisplacement();
        if (displacement != null) {
            locationRequestCreate.setSmallestDisplacement(displacement.floatValue());
        }
        Expected<LocationError, LocationRequest> expectedCreateValue = ExpectedFactory.createValue(locationRequestCreate);
        expectedCreateValue.getClass();
        return expectedCreateValue;
    }
}
