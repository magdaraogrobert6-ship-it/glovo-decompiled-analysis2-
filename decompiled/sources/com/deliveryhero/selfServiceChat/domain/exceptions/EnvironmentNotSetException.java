package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class EnvironmentNotSetException extends Exception {
    public static final EnvironmentNotSetException RemoteActionCompatParcelizer = new EnvironmentNotSetException("DH Environment not set. Endpoint Region \ncannot be fetched without setting the environment");

    public EnvironmentNotSetException(String str) {
        super(str);
    }
}
