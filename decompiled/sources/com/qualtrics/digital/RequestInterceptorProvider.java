package com.qualtrics.digital;

/* JADX INFO: loaded from: classes4.dex */
public class RequestInterceptorProvider {
    private static RequestInterceptorProvider instance;
    private IQualtricsRequestInterceptor requestHandler;

    public IQualtricsRequestInterceptor getRequestHandler() {
        return this.requestHandler;
    }

    public void setRequestHandler(IQualtricsRequestInterceptor iQualtricsRequestInterceptor) {
        this.requestHandler = iQualtricsRequestInterceptor;
    }

    public static RequestInterceptorProvider getInstance() {
        if (instance == null) {
            instance = new RequestInterceptorProvider();
        }
        return instance;
    }
}
