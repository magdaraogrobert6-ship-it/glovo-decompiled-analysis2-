package com.sentiance.sdk.usercreation;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserCreationError {
    private final String mDetails;
    private final UserCreationFailureReason mUserCreationFailureReason;

    public String getDetails() {
        return this.mDetails;
    }

    public UserCreationFailureReason getReason() {
        return this.mUserCreationFailureReason;
    }

    public UserCreationError(UserCreationFailureReason userCreationFailureReason, String str) {
        this.mUserCreationFailureReason = userCreationFailureReason;
        this.mDetails = str;
    }
}
