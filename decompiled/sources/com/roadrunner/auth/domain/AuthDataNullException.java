package com.roadrunner.auth.domain;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthDataNullException extends RuntimeException {
    public AuthDataNullException() {
        super("Auth data is null in RefreshAccessTokenUseCase", null);
    }
}
