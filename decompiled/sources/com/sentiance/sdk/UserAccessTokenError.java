package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserAccessTokenError {
    private final UserAccessTokenFailureReason mUserAccessTokenFailureReason;

    public UserAccessTokenFailureReason getReason() {
        return this.mUserAccessTokenFailureReason;
    }

    public UserAccessTokenError(UserAccessTokenFailureReason userAccessTokenFailureReason) {
        this.mUserAccessTokenFailureReason = userAccessTokenFailureReason;
    }
}
