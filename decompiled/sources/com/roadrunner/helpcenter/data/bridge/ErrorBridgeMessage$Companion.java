package com.roadrunner.helpcenter.data.bridge;

import androidx.compose.ui.graphics.Fields;
import o.InvalidProtocolBufferExceptionInvalidWireTypeException;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorBridgeMessage$Companion {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = read + 111;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            InvalidProtocolBufferExceptionInvalidWireTypeException invalidProtocolBufferExceptionInvalidWireTypeException = InvalidProtocolBufferExceptionInvalidWireTypeException.RemoteActionCompatParcelizer;
            throw null;
        }
        InvalidProtocolBufferExceptionInvalidWireTypeException invalidProtocolBufferExceptionInvalidWireTypeException2 = InvalidProtocolBufferExceptionInvalidWireTypeException.RemoteActionCompatParcelizer;
        int i3 = IconCompatParcelizer + 31;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return invalidProtocolBufferExceptionInvalidWireTypeException2;
    }
}
