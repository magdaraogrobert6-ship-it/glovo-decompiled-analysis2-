package com.mapbox.navigation.tripdata.speedlimit.api;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.Location;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.base.formatter.UnitType;
import com.mapbox.navigation.base.speed.model.SpeedLimitInfo;
import com.mapbox.navigation.base.speed.model.SpeedUnit;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.tripdata.speedlimit.SpeedLimitProcessor$WhenMappings;
import com.mapbox.navigation.tripdata.speedlimit.model.PostedAndCurrentSpeedFormatter;
import com.mapbox.navigation.tripdata.speedlimit.model.SpeedData;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSpeedInfoApi {
    public final DeltaDecoder updatePostedAndCurrentSpeed(LocationMatcherResult locationMatcherResult, DistanceFormatterOptions distanceFormatterOptions, PostedAndCurrentSpeedFormatter postedAndCurrentSpeedFormatter) {
        SpeedUnit speedUnit;
        locationMatcherResult.getClass();
        distanceFormatterOptions.getClass();
        UnitType unitType = distanceFormatterOptions.unitType;
        postedAndCurrentSpeedFormatter.getClass();
        Location location = locationMatcherResult.enhancedLocation;
        SpeedLimitInfo speedLimitInfo = locationMatcherResult.speedLimitInfo;
        Double speed = location.getSpeed();
        SpeedData speedData = speed != null ? new SpeedData(speed.doubleValue(), SpeedUnit.METERS_PER_SECOND, unitType) : null;
        Integer numValueOf = speedData != null ? Integer.valueOf(((Number) postedAndCurrentSpeedFormatter.format(speedData)).intValue()) : null;
        Integer num = speedLimitInfo.speed;
        Integer numValueOf2 = num != null ? Integer.valueOf(((Number) postedAndCurrentSpeedFormatter.format(new SpeedData(num.intValue(), speedLimitInfo.unit, unitType))).intValue()) : null;
        int i = SpeedLimitProcessor$WhenMappings.$EnumSwitchMapping$0[unitType.ordinal()];
        if (i == 1) {
            speedUnit = SpeedUnit.KILOMETERS_PER_HOUR;
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            speedUnit = SpeedUnit.MILES_PER_HOUR;
        }
        speedUnit.getClass();
        if (numValueOf != null) {
            return new DeltaDecoder(numValueOf2, numValueOf.intValue(), speedUnit);
        }
        return null;
    }
}
