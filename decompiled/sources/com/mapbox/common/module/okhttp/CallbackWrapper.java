package com.mapbox.common.module.okhttp;

import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import o._get_messageWebView_lambda1;
import o.clipCanvasToPath;
import o.getMessageTextView;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setMessageImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class CallbackWrapper implements setMessageImageView {
    private final getMessageTextView call;
    private final RequestCallback callback;
    private final long id;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRequestFinished;
    private HttpRequestError requestError;
    private final OkHttpClientDetail service;

    public interface RequestCallback {
        void onFailure(HttpRequestError httpRequestError);

        void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) throws IOException;
    }

    public final void cancel() {
        this.requestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, "Request cancelled");
        ((clipCanvasToPath) this.call).write();
    }

    public CallbackWrapper(OkHttpClientDetail okHttpClientDetail, long j, getMessageTextView getmessagetextview, RequestCallback requestCallback, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        okHttpClientDetail.getClass();
        getmessagetextview.getClass();
        requestCallback.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.service = okHttpClientDetail;
        this.id = j;
        this.call = getmessagetextview;
        this.callback = requestCallback;
        this.onRequestFinished = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.setMessageImageView
    public void onFailure(getMessageTextView getmessagetextview, IOException iOException) {
        HttpRequestError httpRequestError;
        getmessagetextview.getClass();
        iOException.getClass();
        if (!((clipCanvasToPath) getmessagetextview).canceled || (httpRequestError = this.requestError) == null) {
            HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
            if ((iOException instanceof UnknownHostException) || (iOException instanceof SSLException) || (iOException instanceof UnknownServiceException) || (iOException instanceof SocketException) || (iOException instanceof ProtocolException)) {
                httpRequestErrorType = HttpRequestErrorType.CONNECTION_ERROR;
            } else if (iOException instanceof InterruptedIOException) {
                httpRequestErrorType = HttpRequestErrorType.REQUEST_TIMED_OUT;
            }
            this.callback.onFailure(new HttpRequestError(httpRequestErrorType, String.valueOf(iOException.getMessage())));
        } else {
            this.callback.onFailure(httpRequestError);
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // o.setMessageImageView
    public void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) throws IOException {
        getmessagetextview.getClass();
        _get_messagewebview_lambda1.getClass();
        try {
            this.callback.onResponse(getmessagetextview, _get_messagewebview_lambda1);
        } catch (IOException e) {
            onFailure(getmessagetextview, e);
        } catch (Exception e2) {
            this.callback.onFailure(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, String.valueOf(e2.getMessage())));
        }
    }

    public final void cancel(HttpRequestError httpRequestError) {
        this.requestError = httpRequestError;
        ((clipCanvasToPath) this.call).write();
    }
}
