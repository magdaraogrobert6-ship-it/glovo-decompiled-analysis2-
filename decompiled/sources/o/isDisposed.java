package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.location.LocationRequest;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.gwi.util.yn;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class isDisposed {
    public static final HashMap IconCompatParcelizer;
    public final String read;
    public final int serializer;

    static {
        HashMap map = new HashMap();
        IconCompatParcelizer = map;
        yn.yn(0, map, "success", 1, "inner error");
        yn.yn(200, map, "HTTP_OK", 201, "HTTP_CREATED");
        yn.yn(202, map, "HTTP_ACCEPTED", 203, "HTTP_NOT_AUTHORITATIVE");
        yn.yn(Constant.ERROR_ACC_INVALID, map, "HTTP_NO_CONTENT", Constant.ERROR_ACC_GRAVITY_INVALID, "HTTP_RESET");
        yn.yn(Constant.ERROR_ACC_JUMP, map, "HTTP_PARTIAL", LocationRequest.PRIORITY_INDOOR, "HTTP_MULT_CHOICE");
        yn.yn(LocationRequest.PRIORITY_MAG_POSITION, map, "HTTP_MOVED_PERM", 302, "HTTP_MOVED_TEMP");
        yn.yn(303, map, "HTTP_SEE_OTHER", 304, "HTTP_NOT_MODIFIED");
        yn.yn(305, map, "HTTP_USE_PROXY", 400, "HTTP_BAD_REQUEST");
        yn.yn(Constant.ERROR_ALGO_NULL_RESULT, map, "HTTP_UNAUTHORIZED", Constant.ERROR_ALGO_NOT_START, "HTTP_PAYMENT_REQUIRED");
        yn.yn(403, map, "HTTP_FORBIDDEN", 404, "HTTP_NOT_FOUND");
        yn.yn(405, map, "HTTP_BAD_METHOD", 406, "HTTP_NOT_ACCEPTABLE");
        yn.yn(407, map, "HTTP_PROXY_AUTH", 408, "HTTP_CLIENT_TIMEOUT");
        yn.yn(409, map, "HTTP_CONFLICT", 410, "HTTP_GONE");
        yn.yn(411, map, "HTTP_LENGTH_REQUIRED", 412, "HTTP_PRECON_FAILED");
        yn.yn(413, map, "HTTP_ENTITY_TOO_LARGE", 414, "HTTP_REQ_TOO_LONG");
        yn.yn(415, map, "HTTP_UNSUPPORTED_TYPE", Constant.ERROR_UNKNOWN, "HTTP_INTERNAL_ERROR");
        yn.yn(501, map, "HTTP_NOT_IMPLEMENTED", 502, "HTTP_BAD_GATEWAY");
        yn.yn(503, map, "HTTP_UNAVAILABLE", 504, "HTTP_GATEWAY_TIMEOUT");
        yn.yn(505, map, "HTTP_VERSION", 10000, "internal error");
        yn.yn(ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED, map, "GET_RESPONSE_FAILED", 10302, "no network");
        yn.yn(10304, map, "json parse failed", ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE, "server response format is error");
        yn.yn(10315, map, "server response error code", 10307, "okHttp Response is null");
        yn.yn(10309, map, "param error", 10308, "common network kit not init");
        yn.yn(10500, map, "TSS_SIGN_PARAM_ERROR", 10501, "TSS_GET_CREDENTIAL_API_FAILED");
        yn.yn(10502, map, "TSS_GET_CREDENTIAL_JSON_PARSE_FAILED", 10503, "TSS_GET_CREDENTIAL_EXC_FAILED");
        yn.yn(10504, map, "TSS_GET_CREDENTIAL_TIME_OUT", 10505, "TSS_GET_CREDENTIAL_TIME_OUT_RETURN");
        yn.yn(10506, map, "TSS_GET_CREDENTIAL_INTER_EXC", 10510, "TSS_GET_SECRET_FAILED_CREDENTIAL_EMPTY");
        yn.yn(10511, map, "TSS_GET_SECRET_API_FAILED", 10512, "TSS_GET_SECRET_JSON_PARSE_FAILED");
        yn.yn(10513, map, "TSS_GET_SECRET_EXC_FAILED", 10514, "TSS_GET_SECRET_TIME_OUT");
        yn.yn(10515, map, "TSS_GET_SECRET_TIME_OUT_RETURN", 10516, "TSS_GET_SECRET_INTER_EXC");
        yn.yn(10517, map, "TSS_GET_SECRET_FAILED_OTHER", 10518, "TSS_GET_SECRET_DROPPING_CUR_IS_VALID");
        yn.yn(10519, map, "TSS_ENCRYPT_FAILED", 10520, "TSS_GET_SECRET_SUCCESS");
        map.put(10550, "UCS_SIGN_FAILED");
    }

    public isDisposed(int i, String str) {
        this.serializer = i;
        this.read = str;
    }

    public static String serializer(int i) {
        HashMap map = IconCompatParcelizer;
        if (!map.containsKey(Integer.valueOf(i))) {
            i = 10000;
        }
        return (String) map.get(Integer.valueOf(i));
    }

    public static isDisposed write(int i) {
        HashMap map = IconCompatParcelizer;
        if (map.containsKey(Integer.valueOf(i))) {
            return new isDisposed(i, (String) map.get(Integer.valueOf(i)));
        }
        return new isDisposed(10000, (String) map.get(10000));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorCode{code=");
        sb.append(this.serializer);
        sb.append(", msg='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, "'}");
    }
}
