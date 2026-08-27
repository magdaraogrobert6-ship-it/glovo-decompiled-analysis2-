package com.sentiance.sdk.authentication;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserLinkingError {
    private final String mDetails;
    private final UserLinkingFailureReason mUserLinkingFailureReason;

    public String getDetails() {
        return this.mDetails;
    }

    public UserLinkingFailureReason getReason() {
        return this.mUserLinkingFailureReason;
    }

    public UserLinkingError(UserLinkingFailureReason userLinkingFailureReason, String str) {
        this.mUserLinkingFailureReason = userLinkingFailureReason;
        this.mDetails = str;
    }
}
