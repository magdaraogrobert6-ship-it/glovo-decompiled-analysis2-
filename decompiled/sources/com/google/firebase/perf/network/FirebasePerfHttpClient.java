package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline1;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import o.hasChangedDevices;
import o.isBadMotionEvent;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.serializer(httpRequest.getRequestLine().getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.write(httpResponseExecute.getStatusLine().getStatusCode());
            Long lRemoteActionCompatParcelizer2 = hasChangedDevices.RemoteActionCompatParcelizer(httpResponseExecute);
            if (lRemoteActionCompatParcelizer2 != null) {
                networkRequestMetricBuilder.read(lRemoteActionCompatParcelizer2.longValue());
            }
            String strIconCompatParcelizer = hasChangedDevices.IconCompatParcelizer(httpResponseExecute);
            if (strIconCompatParcelizer != null) {
                networkRequestMetricBuilder.IconCompatParcelizer(strIconCompatParcelizer);
            }
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
            return httpResponseExecute;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.serializer(httpUriRequest.getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpUriRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.write(httpResponseExecute.getStatusLine().getStatusCode());
            Long lRemoteActionCompatParcelizer2 = hasChangedDevices.RemoteActionCompatParcelizer(httpResponseExecute);
            if (lRemoteActionCompatParcelizer2 != null) {
                networkRequestMetricBuilder.read(lRemoteActionCompatParcelizer2.longValue());
            }
            String strIconCompatParcelizer = hasChangedDevices.IconCompatParcelizer(httpResponseExecute);
            if (strIconCompatParcelizer != null) {
                networkRequestMetricBuilder.IconCompatParcelizer(strIconCompatParcelizer);
            }
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
            return httpResponseExecute;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.serializer(httpUriRequest.getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpUriRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            return (T) httpClient.execute(httpUriRequest, new isBadMotionEvent(responseHandler, timer, networkRequestMetricBuilder));
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.serializer(httpUriRequest.getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpUriRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            return (T) httpClient.execute(httpUriRequest, new isBadMotionEvent(responseHandler, timer, networkRequestMetricBuilder), httpContext);
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.serializer(httpUriRequest.getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpUriRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.write(httpResponseExecute.getStatusLine().getStatusCode());
            Long lRemoteActionCompatParcelizer2 = hasChangedDevices.RemoteActionCompatParcelizer(httpResponseExecute);
            if (lRemoteActionCompatParcelizer2 != null) {
                networkRequestMetricBuilder.read(lRemoteActionCompatParcelizer2.longValue());
            }
            String strIconCompatParcelizer = hasChangedDevices.IconCompatParcelizer(httpResponseExecute);
            if (strIconCompatParcelizer != null) {
                networkRequestMetricBuilder.IconCompatParcelizer(strIconCompatParcelizer);
            }
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
            return httpResponseExecute;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.serializer(httpRequest.getRequestLine().getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.write(httpResponseExecute.getStatusLine().getStatusCode());
            Long lRemoteActionCompatParcelizer2 = hasChangedDevices.RemoteActionCompatParcelizer(httpResponseExecute);
            if (lRemoteActionCompatParcelizer2 != null) {
                networkRequestMetricBuilder.read(lRemoteActionCompatParcelizer2.longValue());
            }
            String strIconCompatParcelizer = hasChangedDevices.IconCompatParcelizer(httpResponseExecute);
            if (strIconCompatParcelizer != null) {
                networkRequestMetricBuilder.IconCompatParcelizer(strIconCompatParcelizer);
            }
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
            return httpResponseExecute;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.serializer(httpRequest.getRequestLine().getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            return (T) httpClient.execute(httpHost, httpRequest, new isBadMotionEvent(responseHandler, timer, networkRequestMetricBuilder));
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        try {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.serializer(httpRequest.getRequestLine().getMethod());
            Long lRemoteActionCompatParcelizer = hasChangedDevices.RemoteActionCompatParcelizer(httpRequest);
            if (lRemoteActionCompatParcelizer != null) {
                networkRequestMetricBuilder.write(lRemoteActionCompatParcelizer.longValue());
            }
            timer.write();
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(timer.read);
            return (T) httpClient.execute(httpHost, httpRequest, new isBadMotionEvent(responseHandler, timer, networkRequestMetricBuilder), httpContext);
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }
}
