package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidVerificationToken extends Exception {
    public static final InvalidVerificationToken read = new InvalidVerificationToken("Verification Token is invalid. Web Chat cannot be loaded without \nsetting the proper JWT Token");

    public InvalidVerificationToken(String str) {
        super(str);
    }
}
