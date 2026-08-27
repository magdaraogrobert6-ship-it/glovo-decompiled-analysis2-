package com.qualtrics.digital;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface IQualtricsRequestInterceptor {
    WebResourceResponse handleRequest(WebResourceRequest webResourceRequest, String str);
}
