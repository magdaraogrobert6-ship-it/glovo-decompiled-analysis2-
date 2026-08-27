package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1 {
    public static final Map write;

    static {
        HashMap map = new HashMap();
        onSessionStarted.IconCompatParcelizer(0, map, "SUCCESS", 10000, "INTERNAL_ERROR");
        onSessionStarted.IconCompatParcelizer(LocationStatusCode.ARGUMENTS_EMPTY, map, "ARGUMENTS_EMPTY", 10101, "ARGUMENTS_INVALID");
        onSessionStarted.IconCompatParcelizer(ActivityErrorCode.PERMISSION_DENIED, map, "PERMISSION_DENIED", 10103, "NOT_IN_MOCK_MODE");
        onSessionStarted.IconCompatParcelizer(10104, map, "NO_MATCHED_CALLBACK", LocationStatusCode.NETWORK_LOCATION_SERVICES_DISABLED, "NETWORK_LOCATION_SERVICES_DISABLED");
        onSessionStarted.IconCompatParcelizer(10107, map, "HD_LOCATION_REQUEST_FAILED", ActivityErrorCode.NO_MATCHED_INTENT, "NO_MATCHED_INTENT");
        onSessionStarted.IconCompatParcelizer(10200, map, "GEOFENCE_NOT_AVAILABLE", 10201, "GEOFENCE_TOO_MANY_GEOFENCES");
        onSessionStarted.IconCompatParcelizer(10202, map, "GEOFENCE_TOO_MANY_PENDING_INTENTS", 10204, "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION");
        onSessionStarted.IconCompatParcelizer(10205, map, "GEOFENCE_REQUEST_TOO_FREQUENT", ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED, "ENABLE_CONVERSION_EVENT_FAILED");
        onSessionStarted.IconCompatParcelizer(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE, map, "ACTIVITY_IDENTIFICATION_NOT_AVAILABLE", 10400, "GEOCODER_TOO_MANY_REQUEST");
        onSessionStarted.IconCompatParcelizer(10401, map, "GEOCODER_NEWWORK_FAILED", 10803, "PERMISSION_DENIED");
        onSessionStarted.IconCompatParcelizer(LocationStatusCode.NO_PRECISE_LOCATION_PERMISSION, map, "NO_PRECISE_LOCATION_PERMISSION", 10206, "GEOFENCING_SERVICE_SWITCH_OFF");
        onSessionStarted.IconCompatParcelizer(LocationStatusCode.NOT_SUPPORT_WATCH, map, "NOT_SUPPORT_WATCH", LocationStatusCode.NOT_IN_WHITELIST, "NOT_IN_WHITELIST");
        onSessionStarted.IconCompatParcelizer(LocationStatusCode.NAVIGATION_NOT_AVAILABLE, map, "NAVIGATION_NOT_AVAILABLE", LocationStatusCode.NAVIGATION_EMPTY_RESULT, "NAVIGATION_EMPTY_RESULT");
        onSessionStarted.IconCompatParcelizer(20010, map, "Huawei Account Not Login", 20011, "Setting gnss switch is close");
        onSessionStarted.IconCompatParcelizer(20000, map, "device do not support hd", 20020, "huawei AGC checkCerFingerprint fail");
        onSessionStarted.IconCompatParcelizer(20030, map, "get empty UUID from lbs with max retry count", 20031, "get empty UUID");
        onSessionStarted.IconCompatParcelizer(20032, map, "encrypt Data fail", 20033, "decrypt Data fail");
        onSessionStarted.IconCompatParcelizer(20040, map, "getRequest failed ,requestBody is null", 20041, "not support hd from hw server");
        onSessionStarted.IconCompatParcelizer(20042, map, "he APPID is different from hw server", 20043, "Server response failure");
        onSessionStarted.IconCompatParcelizer(20044, map, "authentication error from hw server", 20050, "handler cahche data fail");
        onSessionStarted.IconCompatParcelizer(20051, map, "handler clear data fail", 20016, "lbs close rtk fail because of other app use rtk");
        onSessionStarted.IconCompatParcelizer(30000, map, "device do not support indoorHD", 10602, "DEVICE_NOT_SUPPORT_MAG_POSITION");
        map.put(Integer.valueOf(LocationStatusCode.OFFLINE_LOCATION_MODE_OFF), "OFFLINE_LOCATION_MODE_OFF");
        write = Collections.unmodifiableMap(map);
    }

    public static String serializer(int i) {
        String str = (String) write.get(Integer.valueOf(i));
        return str == null ? c8$$ExternalSyntheticOutline0.m(i, "unknown error code:") : str;
    }
}
