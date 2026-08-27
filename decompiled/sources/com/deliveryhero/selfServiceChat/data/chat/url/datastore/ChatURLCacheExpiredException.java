package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatURLCacheExpiredException extends UnsupportedOperationException {
    public static final ChatURLCacheExpiredException serializer = new ChatURLCacheExpiredException("Cache has exceeded the TTL. The cached Chat URL is invalid");

    public ChatURLCacheExpiredException(String str) {
        super(str);
    }
}
