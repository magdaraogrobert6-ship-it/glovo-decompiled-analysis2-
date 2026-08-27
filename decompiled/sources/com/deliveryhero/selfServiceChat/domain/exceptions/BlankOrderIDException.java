package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class BlankOrderIDException extends IllegalStateException {
    public static final BlankOrderIDException serializer = new BlankOrderIDException("Chat opened with blank Order ID");

    public BlankOrderIDException(String str) {
        super(str);
    }
}
