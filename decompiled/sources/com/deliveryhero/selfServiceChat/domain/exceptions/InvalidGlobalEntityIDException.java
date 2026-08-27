package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidGlobalEntityIDException extends Exception {
    public static final InvalidGlobalEntityIDException read = new InvalidGlobalEntityIDException("Helpcenter region could not be fetched for the provided Global Entity ID. \nPlease call setConfiguration again with DHEnvironment and Global Entity ID.");

    public InvalidGlobalEntityIDException(String str) {
        super(str);
    }
}
