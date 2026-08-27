package com.sentiance.sdk.authentication;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum UserLinkingFailureReason {
    NO_USER,
    USER_ALREADY_LINKED,
    NETWORK_ERROR,
    SERVER_ERROR,
    USER_DISABLED_REMOTELY,
    UNEXPECTED_ERROR,
    APP_SIDE_LINKING_FAILED
}
