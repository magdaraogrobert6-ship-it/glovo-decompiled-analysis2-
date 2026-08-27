package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface ResetCallback {

    @DontObfuscate
    public enum ResetFailureReason {
        SDK_INIT_IN_PROGRESS,
        SDK_RESET_IN_PROGRESS,
        EXCEPTION_OR_ERROR
    }

    void onResetFailure(ResetFailureReason resetFailureReason);

    void onResetSuccess();
}
