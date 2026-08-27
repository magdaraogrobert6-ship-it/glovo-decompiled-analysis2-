package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class UnreadEndpointException extends Exception {
    public static final UnreadEndpointException IconCompatParcelizer = new UnreadEndpointException("Unread count could not be fetched");

    public UnreadEndpointException(String str) {
        super(str);
    }
}
