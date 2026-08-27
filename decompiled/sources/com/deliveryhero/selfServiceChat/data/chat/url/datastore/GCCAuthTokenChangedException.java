package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

/* JADX INFO: loaded from: classes2.dex */
public final class GCCAuthTokenChangedException extends UnsupportedOperationException {
    public static final GCCAuthTokenChangedException RemoteActionCompatParcelizer = new GCCAuthTokenChangedException("GCC Auth token changed. The cached Chat URL is invalid");

    public GCCAuthTokenChangedException(String str) {
        super(str);
    }
}
