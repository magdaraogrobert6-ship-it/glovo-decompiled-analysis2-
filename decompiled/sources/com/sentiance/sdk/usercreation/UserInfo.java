package com.sentiance.sdk.usercreation;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.Token;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserInfo {
    private final Token mToken;
    private final String mUserId;

    public Token getToken() {
        return this.mToken;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public UserInfo(String str, Token token) {
        this.mUserId = str;
        this.mToken = token;
    }
}
