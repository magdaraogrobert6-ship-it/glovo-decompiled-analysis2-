package com.roadrunner.nafath;

import androidx.compose.ui.graphics.Fields;
import o.q2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationStatus$Companion {
    private static int serializer = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 111;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        q2 q2Var = q2.write;
        int i4 = serializer + 5;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return q2Var;
    }
}
