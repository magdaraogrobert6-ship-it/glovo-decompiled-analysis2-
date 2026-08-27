package com.mapbox.common.module.okhttp;

import com.mapbox.common.NetworkUsageMetricsMeter;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import o._get_messageWebView_lambda1;
import o.clipCanvasToPath;
import o.getMessageTextView;
import o.r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkUsageListener extends EventListener {
    public static NetworkUsageMetricCallback CALLBACK = null;
    public static final r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI FACTORY = new MapboxMap$$ExternalSyntheticLambda0(20);
    private static final String TAG = "CommonNetworkUsage";
    private long bytesRequest;
    private long bytesResponse;
    private boolean reported;

    public interface NetworkUsageMetricCallback {
        void onBytesTransferred(String str, long j, long j2);
    }

    private NetworkUsageListener() {
    }

    public static void notifyInternalMetrics(String str, int i, int i2) {
        NetworkUsageMetricsMeter.onBytesTransferred(str, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ EventListener lambda$static$0(getMessageTextView getmessagetextview) {
        return new NetworkUsageListener();
    }

    @Override // okhttp3.EventListener
    public void callEnd(getMessageTextView getmessagetextview) {
        getmessagetextview.getClass();
        notifyCallback(getmessagetextview);
    }

    @Override // okhttp3.EventListener
    public void callFailed(getMessageTextView getmessagetextview, IOException iOException) {
        super.callFailed(getmessagetextview, iOException);
        notifyCallback(getmessagetextview);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(getMessageTextView getmessagetextview, long j) {
        getmessagetextview.getClass();
        this.bytesRequest += j;
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(getMessageTextView getmessagetextview, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        super.requestHeadersEnd(getmessagetextview, r8lambday113fdftsr5e4pzj6xssxltpl60);
        long j = this.bytesRequest;
        String[] strArr = r8lambday113fdftsr5e4pzj6xssxltpl60.headers.namesAndValues;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        this.bytesRequest = length + j;
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(getMessageTextView getmessagetextview, long j) {
        getmessagetextview.getClass();
        this.bytesResponse += j;
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        super.responseHeadersEnd(getmessagetextview, _get_messagewebview_lambda1);
        long j = this.bytesResponse;
        String[] strArr = _get_messagewebview_lambda1.headers.namesAndValues;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        this.bytesResponse = length + j;
        NetworkUsageMetricsMeter.onHttpCodeReceived(_get_messagewebview_lambda1.code);
    }

    private void notifyCallback(getMessageTextView getmessagetextview) {
        if (this.reported) {
            return;
        }
        String str = ((clipCanvasToPath) getmessagetextview).originalRequest.url.url;
        NetworkUsageMetricCallback networkUsageMetricCallback = CALLBACK;
        if (networkUsageMetricCallback != null) {
            try {
                networkUsageMetricCallback.onBytesTransferred(str, this.bytesRequest, this.bytesResponse);
            } catch (NullPointerException e) {
                SentryLogcatAdapter.write(TAG, "notifyCallback failed: ", e);
            }
        }
        notifyInternalMetrics(str, (int) this.bytesRequest, (int) this.bytesResponse);
        this.reported = true;
    }
}
