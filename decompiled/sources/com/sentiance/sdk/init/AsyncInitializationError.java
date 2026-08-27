package com.sentiance.sdk.init;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class AsyncInitializationError {
    private final InitializationFailureReason mFailureReason;
    private final Throwable mThrowable;

    public InitializationFailureReason getFailureReason() {
        return this.mFailureReason;
    }

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public AsyncInitializationError(InitializationFailureReason initializationFailureReason, Throwable th) {
        this.mFailureReason = initializationFailureReason;
        this.mThrowable = th;
    }
}
