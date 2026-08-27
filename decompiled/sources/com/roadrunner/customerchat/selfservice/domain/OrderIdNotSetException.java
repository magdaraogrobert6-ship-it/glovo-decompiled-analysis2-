package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderIdNotSetException extends Exception {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    static {
        new OrderIdNotSetException("Order ID not set. Web Chat cannot be loaded without setting the OrderID");
        int i = RemoteActionCompatParcelizer + 37;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public OrderIdNotSetException(String str) {
        super(str);
    }
}
