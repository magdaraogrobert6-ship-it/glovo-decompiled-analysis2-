package com.roadrunner.customerchat.selfservice.data.bridge;

import androidx.compose.ui.graphics.Fields;
import o.ToggleableStateKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class BridgeMessage$ClientNotifiesCallButtonClick$Payload$Companion {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ToggleableStateKt toggleableStateKt = ToggleableStateKt.IconCompatParcelizer;
        int i4 = write + 43;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return toggleableStateKt;
    }
}
