package com.roadrunner.auth.domain.entity;

import androidx.compose.ui.graphics.Fields;
import o.getToggleableStatedelegate;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthEntity$Companion {
    private static int read = 0;
    private static int serializer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = read + 27;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getToggleableStatedelegate gettoggleablestatedelegate = getToggleableStatedelegate.RemoteActionCompatParcelizer;
        int i4 = serializer + 17;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return gettoggleablestatedelegate;
    }
}
