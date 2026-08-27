package com.sentiance.sdk;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class NoSentianceUserException extends RuntimeException {
    public NoSentianceUserException() {
        super("A Sentiance user does not exist");
    }
}
