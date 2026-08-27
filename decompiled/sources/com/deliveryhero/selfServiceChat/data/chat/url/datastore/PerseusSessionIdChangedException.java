package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusSessionIdChangedException extends UnsupportedOperationException {
    public static final PerseusSessionIdChangedException RemoteActionCompatParcelizer = new PerseusSessionIdChangedException("Perseus session ID value changed. The cached Chat URL is invalid");

    public PerseusSessionIdChangedException(String str) {
        super(str);
    }
}
