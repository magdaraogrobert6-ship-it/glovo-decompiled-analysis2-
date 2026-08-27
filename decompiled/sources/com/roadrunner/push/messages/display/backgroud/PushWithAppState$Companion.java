package com.roadrunner.push.messages.display.backgroud;

import androidx.compose.ui.graphics.Fields;
import o.handleAdidCallbackI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class PushWithAppState$Companion {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        handleAdidCallbackI handleadidcallbacki;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            handleadidcallbacki = handleAdidCallbackI.serializer;
            int i3 = 58 / 0;
        } else {
            handleadidcallbacki = handleAdidCallbackI.serializer;
        }
        int i4 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return handleadidcallbacki;
        }
        throw null;
    }
}
