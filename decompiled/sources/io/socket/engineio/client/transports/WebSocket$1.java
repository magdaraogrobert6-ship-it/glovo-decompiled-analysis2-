package io.socket.engineio.client.transports;

import kotlinx.coroutines.ResumeUndispatchedRunnable;
import o.RequestBuilder;
import o._get_messageWebView_lambda1;
import o.finishWebViewDisplay;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import o.r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74;
import o.setContentCardsUpdatedSubscriber;
import okhttp3.WebSocketListener;

/* JADX INFO: loaded from: classes4.dex */
public final class WebSocket$1 extends WebSocketListener {
    public final /* synthetic */ setContentCardsUpdatedSubscriber read;

    @Override // okhttp3.WebSocketListener
    public final void onFailure(finishWebViewDisplay finishwebviewdisplay, Throwable th, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new ResumeUndispatchedRunnable(this, (Exception) th, 4));
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(finishWebViewDisplay finishwebviewdisplay, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new ResumeUndispatchedRunnable(this, _get_messagewebview_lambda1.headers.IconCompatParcelizer(), 1));
    }

    public WebSocket$1(setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber) {
        this.read = setcontentcardsupdatedsubscriber;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(finishWebViewDisplay finishwebviewdisplay, int i, String str) {
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(5, this));
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(finishWebViewDisplay finishwebviewdisplay, String str) {
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new ResumeUndispatchedRunnable(this, str, 2));
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(finishWebViewDisplay finishwebviewdisplay, RequestBuilder requestBuilder) {
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new ResumeUndispatchedRunnable(this, requestBuilder, 3));
    }
}
