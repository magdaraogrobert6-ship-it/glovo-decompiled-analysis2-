package o;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class isBadMotionEvent implements ResponseHandler {
    public final ResponseHandler IconCompatParcelizer;
    public final com.google.firebase.perf.util.Timer serializer;
    public final NetworkRequestMetricBuilder write;

    public isBadMotionEvent(ResponseHandler responseHandler, com.google.firebase.perf.util.Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.IconCompatParcelizer = responseHandler;
        this.serializer = timer;
        this.write = networkRequestMetricBuilder;
    }
}
