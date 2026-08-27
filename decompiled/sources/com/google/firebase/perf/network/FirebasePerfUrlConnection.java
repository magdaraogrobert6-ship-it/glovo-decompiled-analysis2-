package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import o.hasChangedDevices;
import o.invalidateLayers;
import o.invalidateLayoutNodeMeasurement;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = moveFocusInChildrenViewFocusFix3ESFkO8.write;
        Timer timer = new Timer();
        timer.write();
        long j = timer.read;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(movefocusinchildrenviewfocusfix3esfko8);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new invalidateLayoutNodeMeasurement((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilder).serializer.serializer();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new invalidateLayers((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilder).write.serializer() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(j);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(url.toString());
            hasChangedDevices.RemoteActionCompatParcelizer(networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = moveFocusInChildrenViewFocusFix3ESFkO8.write;
        Timer timer = new Timer();
        if (!movefocusinchildrenviewfocusfix3esfko8.MediaSessionCompatToken.get()) {
            return url.openConnection().getInputStream();
        }
        timer.write();
        long j = timer.read;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(movefocusinchildrenviewfocusfix3esfko8);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new invalidateLayoutNodeMeasurement((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilder).serializer.RemoteActionCompatParcelizer();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new invalidateLayers((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilder).write.RemoteActionCompatParcelizer() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(j);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(url.toString());
            hasChangedDevices.RemoteActionCompatParcelizer(networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new invalidateLayoutNodeMeasurement((HttpsURLConnection) obj, new Timer(), new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write));
        }
        return obj instanceof HttpURLConnection ? new invalidateLayers((HttpURLConnection) obj, new Timer(), new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write)) : obj;
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = moveFocusInChildrenViewFocusFix3ESFkO8.write;
        Timer timer = new Timer();
        timer.write();
        long j = timer.read;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(movefocusinchildrenviewfocusfix3esfko8);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new invalidateLayoutNodeMeasurement((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilder).serializer.write(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new invalidateLayers((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilder).write.write(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(j);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(url.toString());
            hasChangedDevices.RemoteActionCompatParcelizer(networkRequestMetricBuilder);
            throw e;
        }
    }
}
