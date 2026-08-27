package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleNotSetException extends Exception {
    public static final LocaleNotSetException read = new LocaleNotSetException("Locale not set. Web Chat cannot be loaded without setting the locale");

    public LocaleNotSetException(String str) {
        super(str);
    }
}
