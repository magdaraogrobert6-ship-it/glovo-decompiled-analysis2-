package com.huawei.location.base.activity.constant;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.onSessionStarted;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityErrorCode {
    public static final int ACTIVITY_IDENTIFICATION_NOT_AVAILABLE = 10301;
    public static final int ARGUMENTS_INVALID = 10101;
    private static final Map<Integer, String> CODE_MAPPING;
    public static final int CP_PERMISSION_DENIED = 10803;
    public static final int ENABLE_CONVERSION_EVENT_FAILED = 10300;
    public static final int INTERNAL_ERROR = 10000;
    public static final int NO_MATCHED_INTENT = 10108;
    public static final int PARAM_ERROR_INVALID = 10802;
    public static final int PERMISSION_DENIED = 10102;
    public static final int SUCCESS = 0;

    static {
        HashMap map = new HashMap();
        onSessionStarted.IconCompatParcelizer(0, map, "SUCCESS", 10000, "INTERNAL_ERROR");
        onSessionStarted.IconCompatParcelizer(10101, map, "ARGUMENTS_INVALID", PERMISSION_DENIED, "PERMISSION_DENIED");
        onSessionStarted.IconCompatParcelizer(NO_MATCHED_INTENT, map, "NO_MATCHED_INTENT", ENABLE_CONVERSION_EVENT_FAILED, "ENABLE_CONVERSION_EVENT_FAILED");
        onSessionStarted.IconCompatParcelizer(ACTIVITY_IDENTIFICATION_NOT_AVAILABLE, map, "ACTIVITY_IDENTIFICATION_NOT_AVAILABLE", 10802, "PARAM_ERROR_INVALID");
        map.put(10803, "CP_PERMISSION_DENIED");
        CODE_MAPPING = Collections.unmodifiableMap(map);
    }

    public static String getErrorCodeMessage(int i) {
        String str = CODE_MAPPING.get(Integer.valueOf(i));
        return str == null ? c8$$ExternalSyntheticOutline0.m(i, "unknown error code:") : str;
    }
}
