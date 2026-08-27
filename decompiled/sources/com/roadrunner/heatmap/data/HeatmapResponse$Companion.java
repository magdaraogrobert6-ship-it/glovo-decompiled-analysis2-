package com.roadrunner.heatmap.data;

import androidx.compose.ui.graphics.Fields;
import o.SimpleActoroffer2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class HeatmapResponse$Companion {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SimpleActoroffer2 simpleActoroffer2 = SimpleActoroffer2.IconCompatParcelizer;
        int i4 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return simpleActoroffer2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
