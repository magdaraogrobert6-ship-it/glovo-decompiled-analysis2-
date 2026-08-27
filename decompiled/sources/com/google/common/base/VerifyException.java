package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
public class VerifyException extends RuntimeException {
    public VerifyException(String str) {
        super(str);
    }

    public VerifyException(String str, Throwable th) {
        super(str, th);
    }

    public VerifyException(String str, int i) {
        super(str);
    }
}
