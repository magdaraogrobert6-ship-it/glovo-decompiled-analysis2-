package com.sentiance.sdk.usercreation;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserCreationResult {
    private final UserInfo mUserInfo;

    public UserInfo getUserInfo() {
        return this.mUserInfo;
    }

    public UserCreationResult(UserInfo userInfo) {
        this.mUserInfo = userInfo;
    }
}
