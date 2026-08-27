package com.roadrunner.web.download;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.fwf_http.ConstantKt;
import o.setCarryoverInAppMessage;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewDownloadHandler implements DownloadListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final DownloadManager write;

    public WebViewDownloadHandler(DownloadManager downloadManager) {
        this.write = downloadManager;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int i2 = read + 83;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0 ? setCarryoverInAppMessage.RemoteActionCompatParcelizer(scheme, "http", false) : setCarryoverInAppMessage.RemoteActionCompatParcelizer(scheme, "http", true)) {
                String strGuessFileName = URLUtil.guessFileName(str, str3, str4);
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setMimeType(str4);
                request.setTitle(strGuessFileName);
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                request.addRequestHeader(ConstantKt.USER_AGENT_HEADER, str2);
                String cookie = CookieManager.getInstance().getCookie(str);
                if (cookie != null) {
                    int i3 = RemoteActionCompatParcelizer + 3;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        request.addRequestHeader("Cookie", cookie);
                        throw null;
                    }
                    request.addRequestHeader("Cookie", cookie);
                }
                try {
                    this.write.enqueue(request);
                    return;
                } catch (SecurityException e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Missing permission to enqueue download for url: %s", str);
                    return;
                }
            }
        }
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Skipping download for unsupported URI scheme: %s", uri.getScheme());
    }
}
