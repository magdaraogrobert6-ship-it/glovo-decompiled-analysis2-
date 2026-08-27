package com.sentiance.sdk.usercontext.api;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class RequestUserContextError {
    private final RequestUserContextFailureReason mRequestUserContextFailureReason;

    public RequestUserContextFailureReason getReason() {
        return this.mRequestUserContextFailureReason;
    }

    public RequestUserContextError(RequestUserContextFailureReason requestUserContextFailureReason) {
        this.mRequestUserContextFailureReason = requestUserContextFailureReason;
    }
}
