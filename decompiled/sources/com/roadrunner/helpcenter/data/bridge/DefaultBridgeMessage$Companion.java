package com.roadrunner.helpcenter.data.bridge;

import androidx.compose.ui.graphics.Fields;
import o.InvalidProtocolBufferException;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultBridgeMessage$Companion {
    private static int read = 1;
    private static int serializer;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = read + 123;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        InvalidProtocolBufferException invalidProtocolBufferException = InvalidProtocolBufferException.write;
        int i4 = serializer + 41;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return invalidProtocolBufferException;
    }
}
