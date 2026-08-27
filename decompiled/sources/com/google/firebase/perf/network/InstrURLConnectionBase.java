package com.google.firebase.perf.network;

import bo.app.af$$ExternalSyntheticOutline1;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import o.getAndroidViewsHandlerui;
import o.getWindowInfoannotations;
import o.get_composeViewContext;
import o.handleIndirectPointerEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class InstrURLConnectionBase {
    public static final getWindowInfoannotations read = getWindowInfoannotations.write();
    public final NetworkRequestMetricBuilder IconCompatParcelizer;
    public final Timer RatingCompat;
    public long RemoteActionCompatParcelizer = -1;
    public long serializer = -1;
    public final HttpURLConnection write;

    public final String MediaDescriptionCompat() throws IOException {
        HttpURLConnection httpURLConnection = this.write;
        MediaBrowserCompatMediaItem();
        long j = this.serializer;
        Timer timer = this.RatingCompat;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        if (j == -1) {
            long j2 = timer.read();
            this.serializer = j2;
            getAndroidViewsHandlerui getandroidviewshandlerui = networkRequestMetricBuilder.RemoteActionCompatParcelizer;
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setTimeToResponseInitiatedUs(j2);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            networkRequestMetricBuilder.write(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final InputStream RemoteActionCompatParcelizer() throws IOException {
        Timer timer = this.RatingCompat;
        MediaBrowserCompatMediaItem();
        HttpURLConnection httpURLConnection = this.write;
        int responseCode = httpURLConnection.getResponseCode();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        networkRequestMetricBuilder.write(responseCode);
        networkRequestMetricBuilder.IconCompatParcelizer(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new handleIndirectPointerEvent(inputStream, networkRequestMetricBuilder, timer) : inputStream;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.write.equals(obj);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final OutputStream read() throws IOException {
        Timer timer = this.RatingCompat;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        try {
            OutputStream outputStream = this.write.getOutputStream();
            return outputStream != null ? new get_composeViewContext(outputStream, networkRequestMetricBuilder, timer) : outputStream;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final Object serializer() throws IOException {
        Timer timer = this.RatingCompat;
        MediaBrowserCompatMediaItem();
        HttpURLConnection httpURLConnection = this.write;
        int responseCode = httpURLConnection.getResponseCode();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        networkRequestMetricBuilder.write(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                networkRequestMetricBuilder.IconCompatParcelizer(httpURLConnection.getContentType());
                return new handleIndirectPointerEvent((InputStream) content, networkRequestMetricBuilder, timer);
            }
            networkRequestMetricBuilder.IconCompatParcelizer(httpURLConnection.getContentType());
            networkRequestMetricBuilder.read(httpURLConnection.getContentLength());
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
            return content;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final String toString() {
        return this.write.toString();
    }

    public final InputStream write() {
        HttpURLConnection httpURLConnection = this.write;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        MediaBrowserCompatMediaItem();
        try {
            networkRequestMetricBuilder.write(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            read.read();
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new handleIndirectPointerEvent(errorStream, networkRequestMetricBuilder, this.RatingCompat) : errorStream;
    }

    public final int RatingCompat() throws IOException {
        MediaBrowserCompatMediaItem();
        long j = this.serializer;
        Timer timer = this.RatingCompat;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        if (j == -1) {
            long j2 = timer.read();
            this.serializer = j2;
            getAndroidViewsHandlerui getandroidviewshandlerui = networkRequestMetricBuilder.RemoteActionCompatParcelizer;
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setTimeToResponseInitiatedUs(j2);
        }
        try {
            int responseCode = this.write.getResponseCode();
            networkRequestMetricBuilder.write(responseCode);
            return responseCode;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public InstrURLConnectionBase(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.write = httpURLConnection;
        this.IconCompatParcelizer = networkRequestMetricBuilder;
        this.RatingCompat = timer;
        networkRequestMetricBuilder.RemoteActionCompatParcelizer(httpURLConnection.getURL().toString());
    }

    public final void IconCompatParcelizer() throws IOException {
        long j = this.RemoteActionCompatParcelizer;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        Timer timer = this.RatingCompat;
        if (j == -1) {
            timer.write();
            long j2 = timer.read;
            this.RemoteActionCompatParcelizer = j2;
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(j2);
        }
        try {
            this.write.connect();
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        long j = this.RemoteActionCompatParcelizer;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        if (j == -1) {
            Timer timer = this.RatingCompat;
            timer.write();
            long j2 = timer.read;
            this.RemoteActionCompatParcelizer = j2;
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(j2);
        }
        HttpURLConnection httpURLConnection = this.write;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            networkRequestMetricBuilder.serializer(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            networkRequestMetricBuilder.serializer("POST");
        } else {
            networkRequestMetricBuilder.serializer("GET");
        }
    }

    public final Object write(Class[] clsArr) throws IOException {
        Timer timer = this.RatingCompat;
        MediaBrowserCompatMediaItem();
        HttpURLConnection httpURLConnection = this.write;
        int responseCode = httpURLConnection.getResponseCode();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.IconCompatParcelizer;
        networkRequestMetricBuilder.write(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                networkRequestMetricBuilder.IconCompatParcelizer(httpURLConnection.getContentType());
                return new handleIndirectPointerEvent((InputStream) content, networkRequestMetricBuilder, timer);
            }
            networkRequestMetricBuilder.IconCompatParcelizer(httpURLConnection.getContentType());
            networkRequestMetricBuilder.read(httpURLConnection.getContentLength());
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
            return content;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }
}
