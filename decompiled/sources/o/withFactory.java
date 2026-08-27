package o;

import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class withFactory {
    public static final Map read;

    static {
        HashMap map = new HashMap();
        onSessionStarted.IconCompatParcelizer(0, map, "SUCCESS", 10000, "INTERNAL_ERROR");
        onSessionStarted.IconCompatParcelizer(LocationStatusCode.ARGUMENTS_EMPTY, map, "ARGUMENTS_EMPTY", 10101, "ARGUMENTS_INVALID");
        onSessionStarted.IconCompatParcelizer(ActivityErrorCode.PERMISSION_DENIED, map, "PERMISSION_DENIED", 10104, "NO_MATCHED_CALLBACK");
        onSessionStarted.IconCompatParcelizer(LocationStatusCode.NETWORK_LOCATION_SERVICES_DISABLED, map, "NETWORK_LOCATION_SERVICES_DISABLED", 10803, "PERMISSION_DENIED");
        read = Collections.unmodifiableMap(map);
    }
}
