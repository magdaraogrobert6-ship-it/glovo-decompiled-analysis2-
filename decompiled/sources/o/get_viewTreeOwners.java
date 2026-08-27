package o;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

/* JADX INFO: loaded from: classes2.dex */
public final class get_viewTreeOwners extends handleMotionEvent8iAsVTc {
    public static final getWindowInfoannotations IconCompatParcelizer = getWindowInfoannotations.write();
    public final NetworkRequestMetric RemoteActionCompatParcelizer;
    public final Context serializer;

    @Override // o.handleMotionEvent8iAsVTc
    public final boolean read() {
        URI uriCreate;
        NetworkRequestMetric networkRequestMetric = this.RemoteActionCompatParcelizer;
        String url = networkRequestMetric.getUrl();
        boolean zIsEmpty = url == null ? true : url.trim().isEmpty();
        getWindowInfoannotations getwindowinfoannotations = IconCompatParcelizer;
        if (zIsEmpty) {
            getwindowinfoannotations.read("URL is missing:" + networkRequestMetric.getUrl());
            return false;
        }
        String url2 = networkRequestMetric.getUrl();
        if (url2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(url2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                getwindowinfoannotations.write("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            getwindowinfoannotations.read("URL cannot be parsed");
            return false;
        }
        Context context = this.serializer;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            getWindowInfoannotations.write().read();
            if (set_composeViewContext.write == null) {
                set_composeViewContext.write = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = set_composeViewContext.write;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        getwindowinfoannotations.read("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            getwindowinfoannotations.read("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !com.adjust.sdk.Constants.SCHEME.equalsIgnoreCase(scheme))) {
            getwindowinfoannotations.read("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            getwindowinfoannotations.read("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            getwindowinfoannotations.read("URL port is less than or equal to 0");
            return false;
        }
        NetworkRequestMetric.RemoteActionCompatParcelizer httpMethod = networkRequestMetric.hasHttpMethod() ? networkRequestMetric.getHttpMethod() : null;
        if (httpMethod == null || httpMethod == NetworkRequestMetric.RemoteActionCompatParcelizer.HTTP_METHOD_UNKNOWN) {
            getwindowinfoannotations.read("HTTP Method is null or invalid: " + networkRequestMetric.getHttpMethod());
            return false;
        }
        if (networkRequestMetric.hasHttpResponseCode() && networkRequestMetric.getHttpResponseCode() <= 0) {
            getwindowinfoannotations.read("HTTP ResponseCode is a negative value:" + networkRequestMetric.getHttpResponseCode());
            return false;
        }
        if (networkRequestMetric.hasRequestPayloadBytes() && networkRequestMetric.getRequestPayloadBytes() < 0) {
            getwindowinfoannotations.read("Request Payload is a negative value:" + networkRequestMetric.getRequestPayloadBytes());
            return false;
        }
        if (networkRequestMetric.hasResponsePayloadBytes() && networkRequestMetric.getResponsePayloadBytes() < 0) {
            getwindowinfoannotations.read("Response Payload is a negative value:" + networkRequestMetric.getResponsePayloadBytes());
            return false;
        }
        if (!networkRequestMetric.hasClientStartTimeUs() || networkRequestMetric.getClientStartTimeUs() <= 0) {
            getwindowinfoannotations.read("Start time of the request is null, or zero, or a negative value:" + networkRequestMetric.getClientStartTimeUs());
            return false;
        }
        if (networkRequestMetric.hasTimeToRequestCompletedUs() && networkRequestMetric.getTimeToRequestCompletedUs() < 0) {
            getwindowinfoannotations.read("Time to complete the request is a negative value:" + networkRequestMetric.getTimeToRequestCompletedUs());
            return false;
        }
        if (networkRequestMetric.hasTimeToResponseInitiatedUs() && networkRequestMetric.getTimeToResponseInitiatedUs() < 0) {
            getwindowinfoannotations.read("Time from the start of the request to the start of the response is null or a negative value:" + networkRequestMetric.getTimeToResponseInitiatedUs());
            return false;
        }
        if (!networkRequestMetric.hasTimeToResponseCompletedUs() || networkRequestMetric.getTimeToResponseCompletedUs() <= 0) {
            getwindowinfoannotations.read("Time from the start of the request to the end of the response is null, negative or zero:" + networkRequestMetric.getTimeToResponseCompletedUs());
            return false;
        }
        if (networkRequestMetric.hasHttpResponseCode()) {
            return true;
        }
        getwindowinfoannotations.read("Did not receive a HTTP Response Code");
        return false;
    }

    public get_viewTreeOwners(NetworkRequestMetric networkRequestMetric, Context context) {
        this.serializer = context;
        this.RemoteActionCompatParcelizer = networkRequestMetric;
    }
}
