package com.roadrunner.rider.state.provider.database.entity;

import androidx.compose.ui.graphics.Fields;
import o.onGoogleAdIdRead;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class ShiftEntity$Companion {
    private static int read = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 117;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onGoogleAdIdRead ongoogleadidread = onGoogleAdIdRead.serializer;
        int i4 = read + 55;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return ongoogleadidread;
    }
}
