package okhttp3;

import o.RequestBuilder;
import o._get_messageWebView_lambda1;
import o.finishWebViewDisplay;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WebSocketListener {
    public abstract void onClosed(finishWebViewDisplay finishwebviewdisplay, int i, String str);

    public abstract void onFailure(finishWebViewDisplay finishwebviewdisplay, Throwable th, _get_messageWebView_lambda1 _get_messagewebview_lambda1);

    public abstract void onMessage(finishWebViewDisplay finishwebviewdisplay, String str);

    public abstract void onMessage(finishWebViewDisplay finishwebviewdisplay, RequestBuilder requestBuilder);

    public abstract void onOpen(finishWebViewDisplay finishwebviewdisplay, _get_messageWebView_lambda1 _get_messagewebview_lambda1);

    public void onClosing(finishWebViewDisplay finishwebviewdisplay, int i, String str) {
        finishwebviewdisplay.getClass();
        str.getClass();
    }
}
