package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.common.HttpHeaders;
import com.sentiance.okio.ByteString;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class _get_sdkFlavor_lambda0 {
    public static final Map IconCompatParcelizer;
    public static final _get_defaultNotificationAccentColor_lambda0[] write;

    static {
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda0 = new _get_defaultNotificationAccentColor_lambda0(_get_defaultNotificationAccentColor_lambda0.MediaSessionCompatQueueItem, "");
        ByteString byteString = _get_defaultNotificationAccentColor_lambda0.read;
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda1 = new _get_defaultNotificationAccentColor_lambda0(byteString, "GET");
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda2 = new _get_defaultNotificationAccentColor_lambda0(byteString, "POST");
        ByteString byteString2 = _get_defaultNotificationAccentColor_lambda0.serializer;
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda3 = new _get_defaultNotificationAccentColor_lambda0(byteString2, "/");
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda4 = new _get_defaultNotificationAccentColor_lambda0(byteString2, "/index.html");
        ByteString byteString3 = _get_defaultNotificationAccentColor_lambda0.RemoteActionCompatParcelizer;
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda5 = new _get_defaultNotificationAccentColor_lambda0(byteString3, "http");
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda6 = new _get_defaultNotificationAccentColor_lambda0(byteString3, com.adjust.sdk.Constants.SCHEME);
        ByteString byteString4 = _get_defaultNotificationAccentColor_lambda0.IconCompatParcelizer;
        _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = {_get_defaultnotificationaccentcolor_lambda0, _get_defaultnotificationaccentcolor_lambda1, _get_defaultnotificationaccentcolor_lambda2, _get_defaultnotificationaccentcolor_lambda3, _get_defaultnotificationaccentcolor_lambda4, _get_defaultnotificationaccentcolor_lambda5, _get_defaultnotificationaccentcolor_lambda6, new _get_defaultNotificationAccentColor_lambda0(byteString4, "200"), new _get_defaultNotificationAccentColor_lambda0(byteString4, "204"), new _get_defaultNotificationAccentColor_lambda0(byteString4, "206"), new _get_defaultNotificationAccentColor_lambda0(byteString4, "304"), new _get_defaultNotificationAccentColor_lambda0(byteString4, "400"), new _get_defaultNotificationAccentColor_lambda0(byteString4, "404"), new _get_defaultNotificationAccentColor_lambda0(byteString4, "500"), new _get_defaultNotificationAccentColor_lambda0("accept-charset", ""), new _get_defaultNotificationAccentColor_lambda0("accept-encoding", "gzip, deflate"), new _get_defaultNotificationAccentColor_lambda0("accept-language", ""), new _get_defaultNotificationAccentColor_lambda0("accept-ranges", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.ACCEPT, ""), new _get_defaultNotificationAccentColor_lambda0("access-control-allow-origin", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.AGE, ""), new _get_defaultNotificationAccentColor_lambda0("allow", ""), new _get_defaultNotificationAccentColor_lambda0("authorization", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.CACHE_CONTROL, ""), new _get_defaultNotificationAccentColor_lambda0("content-disposition", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.CONTENT_ENCODING, ""), new _get_defaultNotificationAccentColor_lambda0("content-language", ""), new _get_defaultNotificationAccentColor_lambda0("content-length", ""), new _get_defaultNotificationAccentColor_lambda0("content-location", ""), new _get_defaultNotificationAccentColor_lambda0("content-range", ""), new _get_defaultNotificationAccentColor_lambda0("content-type", ""), new _get_defaultNotificationAccentColor_lambda0("cookie", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.DATE, ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.ETAG, ""), new _get_defaultNotificationAccentColor_lambda0("expect", ""), new _get_defaultNotificationAccentColor_lambda0("expires", ""), new _get_defaultNotificationAccentColor_lambda0(RemoteMessageConst.FROM, ""), new _get_defaultNotificationAccentColor_lambda0("host", ""), new _get_defaultNotificationAccentColor_lambda0("if-match", ""), new _get_defaultNotificationAccentColor_lambda0("if-modified-since", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.IF_NONE_MATCH, ""), new _get_defaultNotificationAccentColor_lambda0("if-range", ""), new _get_defaultNotificationAccentColor_lambda0("if-unmodified-since", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.LAST_MODIFIED, ""), new _get_defaultNotificationAccentColor_lambda0("link", ""), new _get_defaultNotificationAccentColor_lambda0("location", ""), new _get_defaultNotificationAccentColor_lambda0("max-forwards", ""), new _get_defaultNotificationAccentColor_lambda0("proxy-authenticate", ""), new _get_defaultNotificationAccentColor_lambda0("proxy-authorization", ""), new _get_defaultNotificationAccentColor_lambda0("range", ""), new _get_defaultNotificationAccentColor_lambda0("referer", ""), new _get_defaultNotificationAccentColor_lambda0("refresh", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.RETRY_AFTER, ""), new _get_defaultNotificationAccentColor_lambda0("server", ""), new _get_defaultNotificationAccentColor_lambda0("set-cookie", ""), new _get_defaultNotificationAccentColor_lambda0("strict-transport-security", ""), new _get_defaultNotificationAccentColor_lambda0("transfer-encoding", ""), new _get_defaultNotificationAccentColor_lambda0(HttpHeaders.USER_AGENT, ""), new _get_defaultNotificationAccentColor_lambda0("vary", ""), new _get_defaultNotificationAccentColor_lambda0("via", ""), new _get_defaultNotificationAccentColor_lambda0("www-authenticate", "")};
        write = _get_defaultnotificationaccentcolor_lambda0Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(_get_defaultnotificationaccentcolor_lambda0Arr[i].RatingCompat)) {
                linkedHashMap.put(_get_defaultnotificationaccentcolor_lambda0Arr[i].RatingCompat, Integer.valueOf(i));
            }
        }
        IconCompatParcelizer = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void serializer(ByteString byteString) throws IOException {
        int iWrite = byteString.write();
        for (int i = 0; i < iWrite; i++) {
            byte bRemoteActionCompatParcelizer = byteString.RemoteActionCompatParcelizer(i);
            if (bRemoteActionCompatParcelizer >= 65 && bRemoteActionCompatParcelizer <= 90) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(byteString.RatingCompat(), "PROTOCOL_ERROR response malformed: mixed case name: ");
                return;
            }
        }
    }
}
