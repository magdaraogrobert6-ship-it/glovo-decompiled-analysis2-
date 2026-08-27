package com.mapbox.common.location;

import android.content.Context;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.support.api.location.common.LocationConstant;
import com.mapbox.bindgen.Value;
import com.mapbox.common.ValueUtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.FocusListener;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationServiceUtils {
    private static final String GOOGLE_API_AVAILABILITY = "com.google.android.gms.common.GoogleApiAvailability";
    private static boolean googlePlayServicesBundled = isOnClasspath(GOOGLE_API_AVAILABILITY);

    public static final boolean getGooglePlayServicesBundled() {
        return googlePlayServicesBundled;
    }

    public static final int getVersionSDKInt() {
        return Build.VERSION.SDK_INT;
    }

    public static final void setGooglePlayServicesBundled(boolean z) {
        googlePlayServicesBundled = z;
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccuracyAuthorization.values().length];
            try {
                iArr[AccuracyAuthorization.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PermissionStatus getPermissionStatus(Context context) {
        context.getClass();
        if (WhenMappings.$EnumSwitchMapping$0[getAccuracyAuthorization(context).ordinal()] == 1) {
            return PermissionStatus.DENIED;
        }
        if (getVersionSDKInt() >= 29) {
            return isPermissionGranted(context, LocationConstant.BACKGROUND_PERMISSION) ? PermissionStatus.BACKGROUND : PermissionStatus.FOREGROUND;
        }
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        return (resources == null || resources.getIdentifier("com.mapbox.common.location.sdk28_use_background_permissions", "bool", packageName) == 0) ? PermissionStatus.GRANTED : PermissionStatus.BACKGROUND;
    }

    public static final boolean isOnClasspath(String str) {
        str.getClass();
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        context.getClass();
        str.getClass();
        return FocusListener.write(context, str) == 0;
    }

    public static final AccuracyAuthorization getAccuracyAuthorization(Context context) {
        context.getClass();
        if (isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return AccuracyAuthorization.EXACT;
        }
        return isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION") ? AccuracyAuthorization.INEXACT : AccuracyAuthorization.NONE;
    }

    public static final android.location.Location toAndroidLocation(Location location) {
        Object obj;
        boolean zBooleanValue;
        location.getClass();
        android.location.Location location2 = new android.location.Location(location.getSource());
        location2.setLatitude(location.getLatitude());
        location2.setLongitude(location.getLongitude());
        location2.setTime(location.getTimestamp());
        Long monotonicTimestamp = location.getMonotonicTimestamp();
        if (monotonicTimestamp != null) {
            location2.setElapsedRealtimeNanos(monotonicTimestamp.longValue());
        }
        Double altitude = location.getAltitude();
        if (altitude != null) {
            location2.setAltitude(altitude.doubleValue());
        }
        Double horizontalAccuracy = location.getHorizontalAccuracy();
        if (horizontalAccuracy != null) {
            location2.setAccuracy((float) horizontalAccuracy.doubleValue());
        }
        Double speed = location.getSpeed();
        if (speed != null) {
            location2.setSpeed((float) speed.doubleValue());
        }
        Double bearing = location.getBearing();
        if (bearing != null) {
            location2.setBearing((float) bearing.doubleValue());
        }
        Double verticalAccuracy = location.getVerticalAccuracy();
        if (verticalAccuracy != null) {
            location2.setVerticalAccuracyMeters((float) verticalAccuracy.doubleValue());
        }
        Double speedAccuracy = location.getSpeedAccuracy();
        if (speedAccuracy != null) {
            location2.setSpeedAccuracyMetersPerSecond((float) speedAccuracy.doubleValue());
        }
        Double bearingAccuracy = location.getBearingAccuracy();
        if (bearingAccuracy != null) {
            location2.setBearingAccuracyDegrees((float) bearingAccuracy.doubleValue());
        }
        Value extra = location.getExtra();
        location2.setExtras(extra != null ? toBundle(extra) : null);
        Value extra2 = location.getExtra();
        Object contents = extra2 != null ? extra2.getContents() : null;
        HashMap map = contents instanceof HashMap ? (HashMap) contents : null;
        if (map != null && (obj = map.get(LocationExtraKeys.IS_MOCK)) != null) {
            Value value = obj instanceof Value ? (Value) obj : null;
            Object contents2 = value != null ? value.getContents() : null;
            Boolean bool = contents2 instanceof Boolean ? (Boolean) contents2 : null;
            if (bool != null && (zBooleanValue = bool.booleanValue())) {
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        location2.setMock(zBooleanValue);
                    } else {
                        android.location.Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE).invoke(location2, ((Value) obj).getContents());
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return location2;
    }

    public static final Bundle toBundle(Value value) {
        value.getClass();
        Bundle bundle = new Bundle();
        Object contents = value.getContents();
        if (contents instanceof HashMap) {
            for (Map.Entry entry : ((Map) contents).entrySet()) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                if ((key instanceof String) && (value2 instanceof Value) && !key.equals(LocationExtraKeys.IS_MOCK)) {
                    Object contents2 = ((Value) value2).getContents();
                    if (contents2 instanceof String) {
                        bundle.putString((String) key, (String) contents2);
                    } else if (contents2 instanceof Boolean) {
                        bundle.putBoolean((String) key, ((Boolean) contents2).booleanValue());
                    } else if (contents2 instanceof Long) {
                        bundle.putLong((String) key, ((Number) contents2).longValue());
                    } else if (contents2 instanceof Double) {
                        bundle.putDouble((String) key, ((Number) contents2).doubleValue());
                    } else if (contents2 instanceof List) {
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (Object obj : (Iterable) contents2) {
                            if (obj instanceof Value) {
                                arrayList.add(toBundle((Value) obj));
                            }
                        }
                        bundle.putParcelableArrayList((String) key, arrayList);
                    } else if (contents2 instanceof HashMap) {
                        Value valueValueOf = Value.valueOf((HashMap<String, Value>) contents2);
                        valueValueOf.getClass();
                        bundle.putBundle((String) key, toBundle(valueValueOf));
                    }
                }
            }
        }
        return bundle;
    }

    public static final Location toCommonLocation(android.location.Location location) {
        Value valueValueOf;
        location.getClass();
        Location.Builder builderMonotonicTimestamp = new Location.Builder().latitude(location.getLatitude()).longitude(location.getLongitude()).timestamp(location.getTime()).monotonicTimestamp(Long.valueOf(location.getElapsedRealtimeNanos()));
        if (location.hasAccuracy()) {
            builderMonotonicTimestamp.horizontalAccuracy(Double.valueOf(location.getAccuracy()));
        }
        if (location.hasAltitude()) {
            builderMonotonicTimestamp.altitude(Double.valueOf(location.getAltitude()));
        }
        if (location.hasBearing()) {
            builderMonotonicTimestamp.bearing(Double.valueOf(location.getBearing()));
        }
        if (location.hasSpeed()) {
            builderMonotonicTimestamp.speed(Double.valueOf(location.getSpeed()));
        }
        String provider = location.getProvider();
        if (provider != null) {
            builderMonotonicTimestamp.source(provider);
        }
        if (location.hasVerticalAccuracy()) {
            builderMonotonicTimestamp.verticalAccuracy(Double.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasSpeedAccuracy()) {
            builderMonotonicTimestamp.speedAccuracy(Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.hasBearingAccuracy()) {
            builderMonotonicTimestamp.bearingAccuracy(Double.valueOf(location.getBearingAccuracyDegrees()));
        }
        Bundle extras = location.getExtras();
        if (extras == null || (valueValueOf = ValueUtilsKt.toValue((BaseBundle) extras)) == null) {
            valueValueOf = Value.valueOf((HashMap<String, Value>) new HashMap());
            valueValueOf.getClass();
        }
        Object contents = valueValueOf.getContents();
        contents.getClass();
        Value valueValueOf2 = Value.valueOf(isMock(location));
        valueValueOf2.getClass();
        ((HashMap) contents).put(LocationExtraKeys.IS_MOCK, valueValueOf2);
        builderMonotonicTimestamp.extra(valueValueOf);
        Location locationBuild = builderMonotonicTimestamp.build();
        locationBuild.getClass();
        return locationBuild;
    }

    private static final boolean isMock(android.location.Location location) {
        return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
    }
}
