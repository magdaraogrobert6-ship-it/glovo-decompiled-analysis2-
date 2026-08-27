package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface TokenResultCallback {
    void onFailure();

    void onSuccess(Token token);
}
