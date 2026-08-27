package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import o.InAppMessageModalView;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o.getMessageHeaderTextView;
import o.getShortEdge;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceInterceptor implements getShortEdge {
    private static final int ALLOWED_RETRY_ATTEMPTS = 2;
    private String mAppName;

    @Override // o.getShortEdge
    public _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws IOException {
        boolean z;
        try {
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = ((InAppMessageModalView) getmessageheadertextview).MediaDescriptionCompat.read();
            _get_messagewebview_lambda0.serializer("Referer", this.mAppName);
            r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
            InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
            _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(r8lambday113fdftsr5e4pzj6xssxltpl60);
            int i = 0;
            while (true) {
                z = _get_messagewebview_lambda1Write.isSuccessful;
                if (i >= 2 || z) {
                    break;
                }
                i++;
                _get_messagewebview_lambda1Write.close();
                _get_messagewebview_lambda1Write = inAppMessageModalView.write(r8lambday113fdftsr5e4pzj6xssxltpl60);
            }
            if (z) {
                return _get_messagewebview_lambda1Write;
            }
            throw new IOException(String.format(Locale.US, "Invalid response received from requested url: %s. ResponseBody: %s, ResponseCode:%d", r8lambday113fdftsr5e4pzj6xssxltpl60.url, _get_messagewebview_lambda1Write.body, Integer.valueOf(_get_messagewebview_lambda1Write.code)));
        } catch (Throwable th) {
            logCrash(th);
            throw th;
        }
    }

    private String stacktraceToString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void logCrash(Throwable th) {
        try {
            QualtricsLog.logError(th.getMessage() + "\\n" + stacktraceToString(th));
        } catch (Exception unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unknown Error from okhttp");
        }
    }

    public ServiceInterceptor(String str) {
        this.mAppName = str;
    }
}
