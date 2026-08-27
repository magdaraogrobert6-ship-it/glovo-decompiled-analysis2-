package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.common.HttpHeaders;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setCustomLocationAttributelambda1 {
    public static final incrementCustomUserAttributelambda1[] IconCompatParcelizer;
    public static final RequestBuilder read;
    public static final Map serializer;

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        read = ImageHeaderParserImageType.serializer(":");
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda1 = new incrementCustomUserAttributelambda1(incrementCustomUserAttributelambda1.read, "");
        RequestBuilder requestBuilder2 = incrementCustomUserAttributelambda1.write;
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda2 = new incrementCustomUserAttributelambda1(requestBuilder2, "GET");
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda3 = new incrementCustomUserAttributelambda1(requestBuilder2, "POST");
        RequestBuilder requestBuilder3 = incrementCustomUserAttributelambda1.serializer;
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda4 = new incrementCustomUserAttributelambda1(requestBuilder3, "/");
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda5 = new incrementCustomUserAttributelambda1(requestBuilder3, "/index.html");
        RequestBuilder requestBuilder4 = incrementCustomUserAttributelambda1.IconCompatParcelizer;
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda6 = new incrementCustomUserAttributelambda1(requestBuilder4, "http");
        incrementCustomUserAttributelambda1 incrementcustomuserattributelambda7 = new incrementCustomUserAttributelambda1(requestBuilder4, com.adjust.sdk.Constants.SCHEME);
        RequestBuilder requestBuilder5 = incrementCustomUserAttributelambda1.RemoteActionCompatParcelizer;
        incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr = {incrementcustomuserattributelambda1, incrementcustomuserattributelambda2, incrementcustomuserattributelambda3, incrementcustomuserattributelambda4, incrementcustomuserattributelambda5, incrementcustomuserattributelambda6, incrementcustomuserattributelambda7, new incrementCustomUserAttributelambda1(requestBuilder5, "200"), new incrementCustomUserAttributelambda1(requestBuilder5, "204"), new incrementCustomUserAttributelambda1(requestBuilder5, "206"), new incrementCustomUserAttributelambda1(requestBuilder5, "304"), new incrementCustomUserAttributelambda1(requestBuilder5, "400"), new incrementCustomUserAttributelambda1(requestBuilder5, "404"), new incrementCustomUserAttributelambda1(requestBuilder5, "500"), new incrementCustomUserAttributelambda1("accept-charset", ""), new incrementCustomUserAttributelambda1("accept-encoding", "gzip, deflate"), new incrementCustomUserAttributelambda1("accept-language", ""), new incrementCustomUserAttributelambda1("accept-ranges", ""), new incrementCustomUserAttributelambda1(HttpHeaders.ACCEPT, ""), new incrementCustomUserAttributelambda1("access-control-allow-origin", ""), new incrementCustomUserAttributelambda1(HttpHeaders.AGE, ""), new incrementCustomUserAttributelambda1("allow", ""), new incrementCustomUserAttributelambda1("authorization", ""), new incrementCustomUserAttributelambda1(HttpHeaders.CACHE_CONTROL, ""), new incrementCustomUserAttributelambda1("content-disposition", ""), new incrementCustomUserAttributelambda1(HttpHeaders.CONTENT_ENCODING, ""), new incrementCustomUserAttributelambda1("content-language", ""), new incrementCustomUserAttributelambda1("content-length", ""), new incrementCustomUserAttributelambda1("content-location", ""), new incrementCustomUserAttributelambda1("content-range", ""), new incrementCustomUserAttributelambda1("content-type", ""), new incrementCustomUserAttributelambda1("cookie", ""), new incrementCustomUserAttributelambda1(HttpHeaders.DATE, ""), new incrementCustomUserAttributelambda1(HttpHeaders.ETAG, ""), new incrementCustomUserAttributelambda1("expect", ""), new incrementCustomUserAttributelambda1("expires", ""), new incrementCustomUserAttributelambda1(RemoteMessageConst.FROM, ""), new incrementCustomUserAttributelambda1("host", ""), new incrementCustomUserAttributelambda1("if-match", ""), new incrementCustomUserAttributelambda1("if-modified-since", ""), new incrementCustomUserAttributelambda1(HttpHeaders.IF_NONE_MATCH, ""), new incrementCustomUserAttributelambda1("if-range", ""), new incrementCustomUserAttributelambda1("if-unmodified-since", ""), new incrementCustomUserAttributelambda1(HttpHeaders.LAST_MODIFIED, ""), new incrementCustomUserAttributelambda1("link", ""), new incrementCustomUserAttributelambda1("location", ""), new incrementCustomUserAttributelambda1("max-forwards", ""), new incrementCustomUserAttributelambda1("proxy-authenticate", ""), new incrementCustomUserAttributelambda1("proxy-authorization", ""), new incrementCustomUserAttributelambda1("range", ""), new incrementCustomUserAttributelambda1("referer", ""), new incrementCustomUserAttributelambda1("refresh", ""), new incrementCustomUserAttributelambda1(HttpHeaders.RETRY_AFTER, ""), new incrementCustomUserAttributelambda1("server", ""), new incrementCustomUserAttributelambda1("set-cookie", ""), new incrementCustomUserAttributelambda1("strict-transport-security", ""), new incrementCustomUserAttributelambda1("transfer-encoding", ""), new incrementCustomUserAttributelambda1(HttpHeaders.USER_AGENT, ""), new incrementCustomUserAttributelambda1("vary", ""), new incrementCustomUserAttributelambda1("via", ""), new incrementCustomUserAttributelambda1("www-authenticate", "")};
        IconCompatParcelizer = incrementcustomuserattributelambda1Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(incrementcustomuserattributelambda1Arr[i].MediaSessionCompatQueueItem)) {
                linkedHashMap.put(incrementcustomuserattributelambda1Arr[i].MediaSessionCompatQueueItem, Integer.valueOf(i));
            }
        }
        serializer = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void read(RequestBuilder requestBuilder) throws IOException {
        int iSerializer = requestBuilder.serializer();
        for (int i = 0; i < iSerializer; i++) {
            byte bWrite = requestBuilder.write(i);
            if (bWrite >= 65 && bWrite <= 90) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR response malformed: mixed case name: ".concat(requestBuilder.RatingCompat()));
                return;
            }
        }
    }
}
