package com.sentiance.sdk.reset;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class ResetError {
    private final ResetFailureReason mResetFailureReason;
    private final Throwable mThrowable;

    public Throwable getException() {
        return this.mThrowable;
    }

    public ResetFailureReason getReason() {
        return this.mResetFailureReason;
    }

    public ResetError(ResetFailureReason resetFailureReason, Throwable th) {
        this.mResetFailureReason = resetFailureReason;
        this.mThrowable = th;
    }
}
