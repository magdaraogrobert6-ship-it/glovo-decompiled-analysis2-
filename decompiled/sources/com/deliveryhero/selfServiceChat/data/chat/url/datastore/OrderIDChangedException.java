package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderIDChangedException extends UnsupportedOperationException {
    public static final OrderIDChangedException read = new OrderIDChangedException("Order ID value changed. The cached Chat URL is invalid");

    public OrderIDChangedException(String str) {
        super(str);
    }
}
