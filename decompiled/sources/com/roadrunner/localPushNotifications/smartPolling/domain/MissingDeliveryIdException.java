package com.roadrunner.localPushNotifications.smartPolling.domain;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes3.dex */
public final class MissingDeliveryIdException extends Exception {
    private static int read = 0;
    private static int serializer = 1;
    public final String write;

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 67;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 65;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MissingDeliveryIdException(String str) {
        super(str);
        this.write = str;
    }
}
