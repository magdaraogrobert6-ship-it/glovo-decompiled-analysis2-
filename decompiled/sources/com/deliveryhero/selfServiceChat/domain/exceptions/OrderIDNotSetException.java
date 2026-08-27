package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderIDNotSetException extends Exception {
    public static final OrderIDNotSetException read = new OrderIDNotSetException("Order ID not set. Web Chat cannot be loaded without setting the OrderID");

    public OrderIDNotSetException(String str) {
        super(str);
    }
}
