package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import o.fastRoundToInt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptV2Data$Component$Companion {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) fastRoundToInt.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        int i3 = write + 45;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return setgraphicmodalmaxwidthdp;
        }
        throw null;
    }
}
