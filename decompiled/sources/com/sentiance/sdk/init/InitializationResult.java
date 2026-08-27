package com.sentiance.sdk.init;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class InitializationResult {
    private final InitializationFailureReason mFailureReason;
    private final boolean mIsSuccessful;
    private final Throwable mThrowable;

    public InitializationFailureReason getFailureReason() {
        return this.mFailureReason;
    }

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public boolean isSuccessful() {
        return this.mIsSuccessful;
    }

    public InitializationResult(boolean z, InitializationFailureReason initializationFailureReason, Throwable th) {
        this.mIsSuccessful = z;
        this.mFailureReason = initializationFailureReason;
        this.mThrowable = th;
    }
}
