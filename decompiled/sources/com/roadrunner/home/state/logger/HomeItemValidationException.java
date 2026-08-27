package com.roadrunner.home.state.logger;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeItemValidationException extends RuntimeException {
    private static int read = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 17;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 37;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeItemValidationException(String str, Throwable th) {
        super("RiderHome validation failed", th);
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
    }
}
