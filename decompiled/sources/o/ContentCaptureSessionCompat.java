package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ContentCaptureSessionCompat {
    public static final Map RemoteActionCompatParcelizer;

    static {
        HashMap map = new HashMap();
        onSessionStarted.IconCompatParcelizer(0, map, "SUCCESS", 10000, "INTERNAL_ERROR");
        onSessionStarted.IconCompatParcelizer(LocationStatusCode.ARGUMENTS_EMPTY, map, "SCAN_RESULT_ERROR", 11000, "LOCATION_CLOUD_ERROR");
        RemoteActionCompatParcelizer = Collections.unmodifiableMap(map);
    }

    public static String IconCompatParcelizer(int i) {
        String str = (String) RemoteActionCompatParcelizer.get(Integer.valueOf(i));
        return str == null ? c8$$ExternalSyntheticOutline0.m(i, "unknown error code:") : str;
    }
}
