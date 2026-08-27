package com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable;

import androidx.compose.ui.graphics.Fields;
import o.fixedWidthOenEA2s;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class UtccComponentUiItem$Companion {
    private static int read = 1;
    private static int write;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 71;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) fixedWidthOenEA2s.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        int i4 = read + 75;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdp;
        }
        throw null;
    }
}
