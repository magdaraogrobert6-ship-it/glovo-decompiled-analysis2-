package com.roadrunner.home.nest.api.data;

import androidx.compose.ui.graphics.Fields;
import o.MultiDexV19;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStatisticsComponent$Companion {
    private static int read = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        MultiDexV19 multiDexV19;
        int i = 2 % 2;
        int i2 = read + 83;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            multiDexV19 = MultiDexV19.serializer;
            int i3 = 30 / 0;
        } else {
            multiDexV19 = MultiDexV19.serializer;
        }
        int i4 = write + 43;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return multiDexV19;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
