package com.roadrunner.customerchat.selfservice.data.bridge;

import androidx.compose.ui.graphics.Fields;
import o.getPathForRange;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class BridgeMessage$InitStarted$Payload$Companion {
    private static int serializer = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getPathForRange getpathforrange = getPathForRange.write;
        int i4 = serializer + 25;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getpathforrange;
    }
}
