package com.roadrunner.delivery.common.data.model.tasks;

import androidx.compose.ui.graphics.Fields;
import o.DeviceFontFamilyNameFontKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationTask$Companion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) DeviceFontFamilyNameFontKt.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        int i4 = serializer + 89;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdp;
        }
        throw null;
    }
}
