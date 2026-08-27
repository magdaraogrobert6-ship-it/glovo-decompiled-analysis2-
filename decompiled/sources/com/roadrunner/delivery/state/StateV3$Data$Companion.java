package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import o.AndroidPopup_androidKtPopup41;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class StateV3$Data$Companion {
    private static int read = 1;
    private static int write;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 63;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) AndroidPopup_androidKtPopup41.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        int i3 = write + 75;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp;
    }
}
