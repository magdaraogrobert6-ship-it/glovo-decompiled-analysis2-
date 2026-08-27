package com.mapbox.common.module.okhttp;

import com.mapbox.common.HttpRequestError;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import java.util.concurrent.atomic.AtomicBoolean;
import o.RegistryMissingComponentException;
import o.RegistryNoSourceEncoderAvailableException;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.getMessageTextView;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpCallback implements CallbackWrapper.RequestCallback {
    private final long chunkSize;
    private final long id;
    private final RequestObserver observer;
    private final AtomicBoolean onFailureCalled;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRequestFinished;
    private final AtomicBoolean onResponseCalled;

    public HttpCallback(long j, RequestObserver requestObserver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        requestObserver.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.id = j;
        this.observer = requestObserver;
        this.onRequestFinished = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.onResponseCalled = new AtomicBoolean(false);
        this.onFailureCalled = new AtomicBoolean(false);
        this.chunkSize = 65536L;
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onFailure(HttpRequestError httpRequestError) {
        httpRequestError.getClass();
        if (this.onFailureCalled.compareAndSet(false, true)) {
            this.observer.onFailed(this.id, httpRequestError);
            return;
        }
        MapboxCommonLogger.INSTANCE.logE$common_release("http", "okhttp onFailure callback called twice for " + this.id + ". Error: " + httpRequestError);
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        getmessagetextview.getClass();
        _get_messagewebview_lambda1.getClass();
        if (!this.onResponseCalled.compareAndSet(false, true)) {
            MapboxCommonLogger.INSTANCE.logE$common_release("http", "okhttp onResponse callback called twice for " + this.id + ". Response: " + _get_messagewebview_lambda1);
            return;
        }
        try {
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            this.observer.onResponse(this.id, new ResponseData(HttpCallbackKt.generateOutputHeaders(_get_messagewebview_lambda1), _get_messagewebview_lambda1.code, new ResponseReadStream(registryMissingComponentException)));
            _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1.body;
            if (_get_messagewebview_lambda3 != null) {
                try {
                    RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = _get_messagewebview_lambda3.read();
                    boolean z = false;
                    while (!z) {
                        long j = 0;
                        do {
                            try {
                                long jRemoteActionCompatParcelizer = registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer(registryMissingComponentException, this.chunkSize - j);
                                if (jRemoteActionCompatParcelizer == -1) {
                                    z = true;
                                    break;
                                } else {
                                    j += jRemoteActionCompatParcelizer;
                                    if (jRemoteActionCompatParcelizer != 8192) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{registryNoSourceEncoderAvailableException, th}, sourceInformationContextOfdefault.read());
                                    throw th2;
                                }
                            }
                        } while (j < this.chunkSize);
                        if (j > 0) {
                            this.observer.onData(this.id);
                        }
                    }
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{registryNoSourceEncoderAvailableException, null}, sourceInformationContextOfdefault.read());
                    _get_messagewebview_lambda3.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{_get_messagewebview_lambda3, th3}, sourceInformationContextOfdefault.read());
                        throw th4;
                    }
                }
            }
            if (this.onFailureCalled.compareAndSet(false, true)) {
                this.observer.onSucceeded(this.id);
            }
            this.onRequestFinished.invoke(Long.valueOf(this.id));
        } catch (Throwable th5) {
            this.onRequestFinished.invoke(Long.valueOf(this.id));
            throw th5;
        }
    }
}
