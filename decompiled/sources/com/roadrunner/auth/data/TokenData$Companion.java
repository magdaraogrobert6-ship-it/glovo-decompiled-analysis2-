package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import o.SemanticsPropertiesKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class TokenData$Companion {
    private static int read = 1;
    private static int write;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 107;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SemanticsPropertiesKt semanticsPropertiesKt = SemanticsPropertiesKt.serializer;
        int i4 = read + 67;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return semanticsPropertiesKt;
    }
}
