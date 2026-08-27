package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.location.base.activity.constant.ActivityRecognitionConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import o.RenderIntentCompanion;
import o.Stroke;
import o.getInverseTransformui_graphics;
import o.getPrimaries;
import o.modulate5vOe2sY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I;
import o.rotateUv8p0NAdefault;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUrlFetcher implements getPrimaries {
    public InputStream IconCompatParcelizer;
    public volatile boolean RemoteActionCompatParcelizer;
    public HttpURLConnection read;
    public final modulate5vOe2sY serializer;
    public final int write;

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.REMOTE;
    }

    @Override // o.getPrimaries
    public final void read() {
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return InputStream.class;
    }

    public HttpUrlFetcher(modulate5vOe2sY modulate5voe2sy, int i) {
        this.serializer = modulate5voe2sy;
        this.write = i;
    }

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) {
        modulate5vOe2sY modulate5voe2sy = this.serializer;
        int i = Stroke.write;
        SystemClock.elapsedRealtimeNanos();
        try {
            getinversetransformui_graphics.serializer(serializer(modulate5voe2sy.serializer(), 0, null, modulate5voe2sy.RemoteActionCompatParcelizer.write()));
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            getinversetransformui_graphics.write(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // o.getPrimaries
    public final void write() {
        InputStream inputStream = this.IconCompatParcelizer;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.read;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.read = null;
    }

    public final InputStream serializer(URL url, int i, URL url2, Map map) throws HttpException {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.write;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.read = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.IconCompatParcelizer = this.read.getInputStream();
                if (this.RemoteActionCompatParcelizer) {
                    return null;
                }
                try {
                    responseCode = this.read.getResponseCode();
                } catch (IOException unused2) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.read;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.IconCompatParcelizer = new rotateUv8p0NAdefault(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.IconCompatParcelizer = httpURLConnection2.getInputStream();
                        }
                        return this.IconCompatParcelizer;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                            Log.isLoggable("HttpUrlFetcher", 3);
                        }
                        throw new HttpException("Failed to obtain InputStream", responseCode2, e);
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new HttpException("Http request failed", responseCode, null);
                    }
                    try {
                        throw new HttpException(this.read.getResponseMessage(), responseCode, null);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", responseCode, e2);
                    }
                }
                String headerField = this.read.getHeaderField(ActivityRecognitionConstants.LOCATION_MODULE);
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", responseCode, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    write();
                    return serializer(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Bad redirect url: ", headerField), responseCode, e3);
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.read.getResponseCode();
                } catch (IOException unused4) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                }
                throw new HttpException("Failed to connect or obtain data", responseCode2, e4);
            }
        } catch (IOException e5) {
            throw new HttpException("URL.openConnection threw", 0, e5);
        }
    }
}
