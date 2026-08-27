package com.huawei.hms.support.api.location.common.exception;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.common.api.CommonStatusCodes;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.onSessionStarted;

/* JADX INFO: loaded from: classes2.dex */
public class LocationStatusCode extends CommonStatusCodes {
    public static final int AGC_CHECK_FAIL = 10808;
    public static final int ARGUMENTS_EMPTY = 10100;
    public static final int ARGUMENTS_INVALID = 10101;
    private static final Map<Integer, String> CODE_MAPPING;
    public static final int GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION = 10204;
    public static final int GEOFENCE_NOT_AVAILABLE = 10200;
    public static final int GEOFENCE_REQUEST_TOO_FREQUENT = 10205;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 10201;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 10202;
    public static final int LOCATION_ENABLE_OFF = 10106;
    public static final int LOCATION_INTERNAL_ERROR = 10000;
    public static final int METHOD_INVOKE_ERROR = 10807;
    public static final int NAVIGATION_EMPTY_RESULT = 10110;
    public static final int NAVIGATION_NOT_AVAILABLE = 10109;
    public static final int NETWORK_LOCATION_SERVICES_DISABLED = 10105;
    public static final int NOT_IN_WHITELIST = 10111;
    public static final int NOT_SUPPORT_WATCH = 10601;
    public static final int NOT_YET_SUPPORTED = 10806;
    public static final int NO_MATCHED_CALLBACK = 10804;
    public static final int NO_MATCHED_INTENT = 10805;
    public static final int NO_PRECISE_LOCATION_PERMISSION = 10809;
    public static final int OFFLINE_LOCATION_MODE_OFF = 10112;
    public static final int PARAM_ERROR_EMPTY = 10801;
    public static final int PARAM_ERROR_INVALID = 10802;
    public static final int PERMISSION_DENIED = 10803;
    public static final int SUCCESS = 0;

    static {
        HashMap map = new HashMap(0);
        onSessionStarted.IconCompatParcelizer(0, map, "SUCCESS", LOCATION_ENABLE_OFF, "LOCATION_ENABLE_OFF");
        onSessionStarted.IconCompatParcelizer(8, map, "INTERNAL_ERROR", ARGUMENTS_EMPTY, "ARGUMENTS_EMPTY");
        onSessionStarted.IconCompatParcelizer(10101, map, "ARGUMENTS_INVALID", 10802, "PARAM_ERROR_INVALID");
        onSessionStarted.IconCompatParcelizer(10803, map, "PERMISSION_DENIED", NO_MATCHED_CALLBACK, "NO_MATCHED_CALLBACK");
        onSessionStarted.IconCompatParcelizer(NOT_YET_SUPPORTED, map, "NOT_YET_SUPPORTED", NETWORK_LOCATION_SERVICES_DISABLED, "NETWORK_LOCATION_SERVICES_DISABLED");
        onSessionStarted.IconCompatParcelizer(NO_MATCHED_INTENT, map, "NO_MATCHED_INTENT", PARAM_ERROR_EMPTY, "PARAM_ERROR_EMPTY");
        onSessionStarted.IconCompatParcelizer(METHOD_INVOKE_ERROR, map, "METHOD_INVOKE_ERROR", AGC_CHECK_FAIL, "AGC_CHECK_FAIL");
        onSessionStarted.IconCompatParcelizer(NO_PRECISE_LOCATION_PERMISSION, map, "NO_PRECISE_LOCATION_PERMISSION", 10200, "GEOFENCE_NOT_AVAILABLE");
        onSessionStarted.IconCompatParcelizer(10201, map, "GEOFENCE_TOO_MANY_GEOFENCES", 10202, "GEOFENCE_TOO_MANY_PENDING_INTENTS");
        onSessionStarted.IconCompatParcelizer(10204, map, "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION", 10205, "GEOFENCE_REQUEST_TOO_FREQUENT");
        onSessionStarted.IconCompatParcelizer(NOT_SUPPORT_WATCH, map, "NOT_SUPPORT_WATCH", NOT_IN_WHITELIST, "NOT_IN_WHITELIST");
        onSessionStarted.IconCompatParcelizer(NAVIGATION_NOT_AVAILABLE, map, "NAVIGATION_NOT_AVAILABLE", NAVIGATION_EMPTY_RESULT, "NAVIGATION_EMPTY_RESULT");
        map.put(Integer.valueOf(OFFLINE_LOCATION_MODE_OFF), "OFFLINE_LOCATION_MODE_OFF");
        CODE_MAPPING = Collections.unmodifiableMap(map);
    }

    public static String getStatusCodeString(int i) {
        String str = CODE_MAPPING.get(Integer.valueOf(i));
        return str == null ? c8$$ExternalSyntheticOutline0.m(i, "unknown error code:") : str;
    }
}
