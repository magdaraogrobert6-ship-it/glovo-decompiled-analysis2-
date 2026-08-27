package com.roadrunner.rider.state.provider.database.entity;

import androidx.compose.ui.graphics.Fields;
import o.OnPurchaseVerificationFinishedListener;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class StartingAreaEntity$Companion {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = OnPurchaseVerificationFinishedListener.RemoteActionCompatParcelizer;
        int i4 = serializer + 125;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onPurchaseVerificationFinishedListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
