package com.roadrunner.delivery.destination.data.models;

import androidx.compose.ui.graphics.Fields;
import o.accessgetValuescp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class DestinationComponent$Companion {
    private static int read = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 55;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) accessgetValuescp.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        int i3 = read + 101;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp;
    }
}
