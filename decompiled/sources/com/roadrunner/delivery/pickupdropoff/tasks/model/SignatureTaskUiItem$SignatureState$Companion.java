package com.roadrunner.delivery.pickupdropoff.tasks.model;

import androidx.compose.ui.graphics.Fields;
import o.Wallpapers;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class SignatureTaskUiItem$SignatureState$Companion {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public final setGraphicModalMaxWidthDp serializer() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp;
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) Wallpapers.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            int i3 = 50 / 0;
        } else {
            setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) Wallpapers.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = IconCompatParcelizer + 117;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp;
    }
}
