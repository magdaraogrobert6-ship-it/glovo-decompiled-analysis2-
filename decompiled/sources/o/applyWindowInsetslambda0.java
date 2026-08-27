package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.common.HttpHeaders;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class applyWindowInsetslambda0 {
    public static final AnimationUtils[] IconCompatParcelizer;
    public static final Map serializer;

    static {
        AnimationUtils animationUtils = new AnimationUtils(AnimationUtils.TARGET_AUTHORITY, "");
        RequestBuilder requestBuilder = AnimationUtils.TARGET_METHOD;
        AnimationUtils animationUtils2 = new AnimationUtils(requestBuilder, "GET");
        AnimationUtils animationUtils3 = new AnimationUtils(requestBuilder, "POST");
        RequestBuilder requestBuilder2 = AnimationUtils.TARGET_PATH;
        AnimationUtils animationUtils4 = new AnimationUtils(requestBuilder2, "/");
        AnimationUtils animationUtils5 = new AnimationUtils(requestBuilder2, "/index.html");
        RequestBuilder requestBuilder3 = AnimationUtils.TARGET_SCHEME;
        AnimationUtils animationUtils6 = new AnimationUtils(requestBuilder3, "http");
        AnimationUtils animationUtils7 = new AnimationUtils(requestBuilder3, com.adjust.sdk.Constants.SCHEME);
        RequestBuilder requestBuilder4 = AnimationUtils.RESPONSE_STATUS;
        AnimationUtils[] animationUtilsArr = {animationUtils, animationUtils2, animationUtils3, animationUtils4, animationUtils5, animationUtils6, animationUtils7, new AnimationUtils(requestBuilder4, "200"), new AnimationUtils(requestBuilder4, "204"), new AnimationUtils(requestBuilder4, "206"), new AnimationUtils(requestBuilder4, "304"), new AnimationUtils(requestBuilder4, "400"), new AnimationUtils(requestBuilder4, "404"), new AnimationUtils(requestBuilder4, "500"), new AnimationUtils("accept-charset", ""), new AnimationUtils("accept-encoding", "gzip, deflate"), new AnimationUtils("accept-language", ""), new AnimationUtils("accept-ranges", ""), new AnimationUtils(HttpHeaders.ACCEPT, ""), new AnimationUtils("access-control-allow-origin", ""), new AnimationUtils(HttpHeaders.AGE, ""), new AnimationUtils("allow", ""), new AnimationUtils("authorization", ""), new AnimationUtils(HttpHeaders.CACHE_CONTROL, ""), new AnimationUtils("content-disposition", ""), new AnimationUtils(HttpHeaders.CONTENT_ENCODING, ""), new AnimationUtils("content-language", ""), new AnimationUtils("content-length", ""), new AnimationUtils("content-location", ""), new AnimationUtils("content-range", ""), new AnimationUtils("content-type", ""), new AnimationUtils("cookie", ""), new AnimationUtils(HttpHeaders.DATE, ""), new AnimationUtils(HttpHeaders.ETAG, ""), new AnimationUtils("expect", ""), new AnimationUtils("expires", ""), new AnimationUtils(RemoteMessageConst.FROM, ""), new AnimationUtils("host", ""), new AnimationUtils("if-match", ""), new AnimationUtils("if-modified-since", ""), new AnimationUtils(HttpHeaders.IF_NONE_MATCH, ""), new AnimationUtils("if-range", ""), new AnimationUtils("if-unmodified-since", ""), new AnimationUtils(HttpHeaders.LAST_MODIFIED, ""), new AnimationUtils("link", ""), new AnimationUtils("location", ""), new AnimationUtils("max-forwards", ""), new AnimationUtils("proxy-authenticate", ""), new AnimationUtils("proxy-authorization", ""), new AnimationUtils("range", ""), new AnimationUtils("referer", ""), new AnimationUtils("refresh", ""), new AnimationUtils(HttpHeaders.RETRY_AFTER, ""), new AnimationUtils("server", ""), new AnimationUtils("set-cookie", ""), new AnimationUtils("strict-transport-security", ""), new AnimationUtils("transfer-encoding", ""), new AnimationUtils(HttpHeaders.USER_AGENT, ""), new AnimationUtils("vary", ""), new AnimationUtils("via", ""), new AnimationUtils("www-authenticate", "")};
        IconCompatParcelizer = animationUtilsArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(animationUtilsArr[i].name)) {
                linkedHashMap.put(animationUtilsArr[i].name, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        serializer = mapUnmodifiableMap;
    }

    public static void RemoteActionCompatParcelizer(RequestBuilder requestBuilder) throws IOException {
        requestBuilder.getClass();
        int iSerializer = requestBuilder.serializer();
        for (int i = 0; i < iSerializer; i++) {
            byte bWrite = requestBuilder.write(i);
            if (65 <= bWrite && bWrite < 91) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR response malformed: mixed case name: ".concat(requestBuilder.RatingCompat()));
                return;
            }
        }
    }
}
