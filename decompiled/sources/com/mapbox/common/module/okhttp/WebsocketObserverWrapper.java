package com.mapbox.common.module.okhttp;

import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.ResponseData;
import com.mapbox.common.experimental.wss_backend.WsOpCode;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.RegistryMissingComponentException;
import o.RequestBuilder;
import o._get_messageWebView_lambda1;
import o.ensureSubscribedToInAppMessageEvents;
import o.finishWebViewDisplay;
import o.removeNodeAtDepth;
import o.resetMessageMarginslambda00;
import okhttp3.WebSocketListener;

/* JADX INFO: loaded from: classes5.dex */
final class WebsocketObserverWrapper extends WebSocketListener {
    public static final Companion Companion = new Companion(null);
    private static final int websocketClosedNormalCode = 1000;
    private final RegistryMissingComponentException buffer;
    private final long id;
    public ResultCallback onClosedCallback;
    private final RequestObserver requestObserver;
    private final boolean verbose;
    public finishWebViewDisplay webSocket;

    public final RegistryMissingComponentException getBuffer() {
        return this.buffer;
    }

    public final RequestObserver getRequestObserver() {
        return this.requestObserver;
    }

    private final HashMap<String, String> generateOutputHeaders(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        HashMap<String, String> map = new HashMap<>();
        resetMessageMarginslambda00 resetmessagemarginslambda00 = _get_messagewebview_lambda1.headers;
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            String lowerCase = resetmessagemarginslambda00.serializer(i).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            map.put(lowerCase, resetmessagemarginslambda00.read(i));
        }
        return map;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWebsocketClosedNormalCode() {
            return WebsocketObserverWrapper.websocketClosedNormalCode;
        }

        private Companion() {
        }
    }

    public WebsocketObserverWrapper(RequestObserver requestObserver, long j, boolean z) {
        requestObserver.getClass();
        this.requestObserver = requestObserver;
        this.id = j;
        this.verbose = z;
        this.buffer = new RegistryMissingComponentException();
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(finishWebViewDisplay finishwebviewdisplay, Throwable th, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        String message;
        finishwebviewdisplay.getClass();
        th.getClass();
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onFailure: " + _get_messagewebview_lambda1 + ", " + th);
        }
        HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
        if ((_get_messagewebview_lambda1 == null || (message = _get_messagewebview_lambda1.message) == null) && (message = th.getMessage()) == null) {
            message = "Unknown error";
        }
        this.requestObserver.onFailed(this.id, new HttpRequestError(httpRequestErrorType, message), _get_messagewebview_lambda1 != null ? Integer.valueOf(_get_messagewebview_lambda1.code) : null);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(finishWebViewDisplay finishwebviewdisplay, String str) {
        finishwebviewdisplay.getClass();
        str.getClass();
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onMessage (text): ".concat(str));
        }
        RegistryMissingComponentException registryMissingComponentException = this.buffer;
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        registryMissingComponentException.getClass();
        registryMissingComponentException.write(bytes, 0, bytes.length);
        this.requestObserver.onData(this.id, WsOpCode.TEXT, true);
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(finishWebViewDisplay finishwebviewdisplay, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        finishwebviewdisplay.getClass();
        _get_messagewebview_lambda1.getClass();
        int i = _get_messagewebview_lambda1.code;
        if (i == 101) {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket opened with code 101, switching protocols");
            }
            this.requestObserver.onSwitchingProtocols(this.id);
        }
        ResponseData responseData = new ResponseData(generateOutputHeaders(_get_messagewebview_lambda1), i, new ResponseReadStream(this.buffer));
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Calling onResponse with code " + i + '}');
        }
        this.requestObserver.onResponse(this.id, responseData);
    }

    public final void setOnClosedCallback(ResultCallback resultCallback) {
        resultCallback.getClass();
        this.onClosedCallback = resultCallback;
    }

    public final void setWebSocket(finishWebViewDisplay finishwebviewdisplay) {
        finishwebviewdisplay.getClass();
        this.webSocket = finishwebviewdisplay;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(finishWebViewDisplay finishwebviewdisplay, int i, String str) {
        finishwebviewdisplay.getClass();
        str.getClass();
        try {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onClosed code: " + i + ", reason: " + str);
            }
            if (this.onClosedCallback != null) {
                if (i == websocketClosedNormalCode) {
                    getOnClosedCallback().run(true);
                    return;
                } else {
                    getOnClosedCallback().run(false);
                    return;
                }
            }
            this.requestObserver.onFailed(this.id, new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Unexpected socket closure: " + i + ' ' + str), null);
        } catch (Throwable unused) {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onClosed exception, probably callback is null or crashed");
            }
        }
    }

    public final ResultCallback getOnClosedCallback() {
        ResultCallback resultCallback = this.onClosedCallback;
        if (resultCallback != null) {
            return resultCallback;
        }
        removeNodeAtDepth.serializer("onClosedCallback");
        throw null;
    }

    public final finishWebViewDisplay getWebSocket() {
        finishWebViewDisplay finishwebviewdisplay = this.webSocket;
        if (finishwebviewdisplay != null) {
            return finishwebviewdisplay;
        }
        removeNodeAtDepth.serializer("webSocket");
        throw null;
    }

    public /* synthetic */ WebsocketObserverWrapper(RequestObserver requestObserver, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(requestObserver, j, (i & 4) != 0 ? false : z);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(finishWebViewDisplay finishwebviewdisplay, RequestBuilder requestBuilder) {
        finishwebviewdisplay.getClass();
        requestBuilder.getClass();
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onMessage (binary): " + requestBuilder);
        }
        this.buffer.serializer(requestBuilder);
        this.requestObserver.onData(this.id, WsOpCode.BINARY, true);
    }
}
