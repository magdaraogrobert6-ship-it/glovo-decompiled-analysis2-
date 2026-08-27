package com.sentiance.sdk.authentication;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.usercreation.UserInfo;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserLinkingResult {
    private final UserInfo mUserInfo;

    public UserInfo getUserInfo() {
        return this.mUserInfo;
    }

    public UserLinkingResult(UserInfo userInfo) {
        this.mUserInfo = userInfo;
    }
}
