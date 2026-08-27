package o;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hasChangedDevices {
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static String IconCompatParcelizer(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static Long RemoteActionCompatParcelizer(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            getWindowInfoannotations.write().read();
            return null;
        }
    }

    public static void RemoteActionCompatParcelizer(NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        if (!((NetworkRequestMetric) networkRequestMetricBuilder.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).hasHttpResponseCode()) {
            getAndroidViewsHandlerui getandroidviewshandlerui = networkRequestMetricBuilder.RemoteActionCompatParcelizer;
            NetworkRequestMetric.read readVar = NetworkRequestMetric.read.GENERIC_CLIENT_ERROR;
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setNetworkClientErrorReason(readVar);
        }
        networkRequestMetricBuilder.RemoteActionCompatParcelizer();
    }
}
