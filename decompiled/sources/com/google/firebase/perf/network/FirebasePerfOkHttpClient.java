package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import androidx.camera.core.FocusMeteringAction;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import o.InAppMessageHtmlBaseView;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.clipCanvasToPath;
import o.getMessageTextView;
import o.hasChangedDevices;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.setInAppMessageImageViewAttributes;
import o.setMessageImageView;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    @Keep
    public static void enqueue(getMessageTextView getmessagetextview, setMessageImageView setmessageimageview) {
        Timer timer = new Timer();
        clipCanvasToPath clipcanvastopath = (clipCanvasToPath) getmessagetextview;
        clipcanvastopath.IconCompatParcelizer(new FocusMeteringAction(setmessageimageview, moveFocusInChildrenViewFocusFix3ESFkO8.write, timer, timer.read));
    }

    @Keep
    public static _get_messageWebView_lambda1 execute(getMessageTextView getmessagetextview) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        Timer timer = new Timer();
        long j = timer.read;
        try {
            _get_messageWebView_lambda1 _get_messagewebview_lambda1 = ((clipCanvasToPath) getmessagetextview).read();
            write(_get_messagewebview_lambda1, networkRequestMetricBuilder, j, timer.read());
            return _get_messagewebview_lambda1;
        } catch (IOException e) {
            r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = ((clipCanvasToPath) getmessagetextview).originalRequest;
            if (r8lambday113fdftsr5e4pzj6xssxltpl60 != null) {
                setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
                if (setinappmessageimageviewattributes != null) {
                    networkRequestMetricBuilder.RemoteActionCompatParcelizer(setinappmessageimageviewattributes.MediaMetadataCompat().toString());
                }
                String str = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
                if (str != null) {
                    networkRequestMetricBuilder.serializer(str);
                }
            }
            networkRequestMetricBuilder.RemoteActionCompatParcelizer(j);
            networkRequestMetricBuilder.IconCompatParcelizer(timer.read());
            hasChangedDevices.RemoteActionCompatParcelizer(networkRequestMetricBuilder);
            throw e;
        }
    }

    public static void write(_get_messageWebView_lambda1 _get_messagewebview_lambda1, NetworkRequestMetricBuilder networkRequestMetricBuilder, long j, long j2) {
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = _get_messagewebview_lambda1.request;
        if (r8lambday113fdftsr5e4pzj6xssxltpl60 == null) {
            return;
        }
        networkRequestMetricBuilder.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.url.MediaMetadataCompat().toString());
        networkRequestMetricBuilder.serializer(r8lambday113fdftsr5e4pzj6xssxltpl60.method);
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        if (requestBody != null) {
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                networkRequestMetricBuilder.write(jContentLength);
            }
        }
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1.body;
        if (_get_messagewebview_lambda3 != null) {
            long jIconCompatParcelizer = _get_messagewebview_lambda3.IconCompatParcelizer();
            if (jIconCompatParcelizer != -1) {
                networkRequestMetricBuilder.read(jIconCompatParcelizer);
            }
            InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = _get_messagewebview_lambda3.write();
            if (inAppMessageHtmlBaseViewWrite != null) {
                networkRequestMetricBuilder.IconCompatParcelizer(inAppMessageHtmlBaseViewWrite.mediaType);
            }
        }
        networkRequestMetricBuilder.write(_get_messagewebview_lambda1.code);
        networkRequestMetricBuilder.RemoteActionCompatParcelizer(j);
        networkRequestMetricBuilder.IconCompatParcelizer(j2);
        networkRequestMetricBuilder.RemoteActionCompatParcelizer();
    }
}
