package com.roadrunner.password_rules.entity;

import androidx.compose.ui.graphics.Fields;
import o.LifecyclesKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class RuleList$Companion {
    private static int read = 1;
    private static int serializer;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = read + 21;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            LifecyclesKt lifecyclesKt = LifecyclesKt.RemoteActionCompatParcelizer;
            throw null;
        }
        LifecyclesKt lifecyclesKt2 = LifecyclesKt.RemoteActionCompatParcelizer;
        int i3 = read + 51;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return lifecyclesKt2;
    }
}
