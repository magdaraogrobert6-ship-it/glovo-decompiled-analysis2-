package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface OnInitCallback {

    @DontObfuscate
    public enum InitIssue {
        INVALID_CREDENTIALS,
        CHANGED_CREDENTIALS,
        SERVICE_UNREACHABLE,
        LINK_FAILED,
        REMOTE_DISABLED,
        INITIALIZATION_ERROR,
        SDK_RESET_IN_PROGRESS
    }

    void onInitFailure(InitIssue initIssue, Throwable th);

    void onInitSuccess();
}
