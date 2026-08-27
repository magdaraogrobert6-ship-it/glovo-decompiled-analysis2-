package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class CountryCodeNotSetException extends Exception {
    public static final CountryCodeNotSetException RemoteActionCompatParcelizer = new CountryCodeNotSetException("Country not set. Chat ID\ncannot be fetched without setting the Country code");

    public CountryCodeNotSetException(String str) {
        super(str);
    }
}
