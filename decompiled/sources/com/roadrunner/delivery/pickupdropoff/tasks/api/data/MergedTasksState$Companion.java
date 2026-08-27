package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import androidx.compose.ui.graphics.Fields;
import o.PreviewActivityExternalSyntheticLambda2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class MergedTasksState$Companion {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PreviewActivityExternalSyntheticLambda2 previewActivityExternalSyntheticLambda2 = PreviewActivityExternalSyntheticLambda2.RemoteActionCompatParcelizer;
        int i4 = IconCompatParcelizer + 23;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return previewActivityExternalSyntheticLambda2;
        }
        throw null;
    }
}
