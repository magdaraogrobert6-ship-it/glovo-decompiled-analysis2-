package com.mapbox.navigation.core.navigator;

import com.mapbox.bindgen.Value;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationExtraKeys;
import com.mapbox.navigator.FixLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LocationEx {
    public static final Location toLocation(FixLocation fixLocation) {
        fixLocation.getClass();
        Location.Builder builderMonotonicTimestamp = new Location.Builder().latitude(fixLocation.getCoordinate().latitude()).longitude(fixLocation.getCoordinate().longitude()).source(fixLocation.getProvider()).timestamp(fixLocation.getTime().getTime()).monotonicTimestamp(Long.valueOf(fixLocation.getMonotonicTimestampNanoseconds()));
        Float speed = fixLocation.getSpeed();
        Location.Builder builderSpeed = builderMonotonicTimestamp.speed(speed != null ? Double.valueOf(speed.floatValue()) : null);
        Float bearing = fixLocation.getBearing();
        Location.Builder builderBearing = builderSpeed.bearing(bearing != null ? Double.valueOf(bearing.floatValue()) : null);
        Float altitude = fixLocation.getAltitude();
        Location.Builder builderAltitude = builderBearing.altitude(altitude != null ? Double.valueOf(altitude.floatValue()) : null);
        Float accuracyHorizontal = fixLocation.getAccuracyHorizontal();
        Location.Builder builderHorizontalAccuracy = builderAltitude.horizontalAccuracy(accuracyHorizontal != null ? Double.valueOf(accuracyHorizontal.floatValue()) : null);
        Float bearingAccuracy = fixLocation.getBearingAccuracy();
        Location.Builder builderBearingAccuracy = builderHorizontalAccuracy.bearingAccuracy(bearingAccuracy != null ? Double.valueOf(bearingAccuracy.floatValue()) : null);
        Float speedAccuracy = fixLocation.getSpeedAccuracy();
        Location.Builder builderSpeedAccuracy = builderBearingAccuracy.speedAccuracy(speedAccuracy != null ? Double.valueOf(speedAccuracy.floatValue()) : null);
        Float verticalAccuracy = fixLocation.getVerticalAccuracy();
        Location.Builder builderVerticalAccuracy = builderSpeedAccuracy.verticalAccuracy(verticalAccuracy != null ? Double.valueOf(verticalAccuracy.floatValue()) : null);
        HashMap map = new HashMap(fixLocation.getExtras());
        map.put(LocationExtraKeys.IS_MOCK, new Value(fixLocation.getIsMock()));
        Location locationBuild = builderVerticalAccuracy.extra(Value.valueOf((HashMap<String, Value>) map)).build();
        locationBuild.getClass();
        return locationBuild;
    }

    public static final ArrayList toLocations(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toLocation((FixLocation) it.next()));
        }
        return arrayList;
    }
}
