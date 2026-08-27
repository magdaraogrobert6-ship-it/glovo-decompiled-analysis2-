package com.roadrunner.home.nest.api.data;

import androidx.compose.ui.graphics.Fields;
import o.NavArgsLazy;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class TripPlannerComponent$Companion {
    private static int read = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = read + 31;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return NavArgsLazy.IconCompatParcelizer;
        }
        NavArgsLazy navArgsLazy = NavArgsLazy.IconCompatParcelizer;
        throw null;
    }
}
