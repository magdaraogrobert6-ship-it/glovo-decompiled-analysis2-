package com.roadrunner.customerchat.selfservice.domain.push;

import androidx.compose.ui.graphics.Fields;
import o.paintLG529CIdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class PushPayload$Companion {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 105;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        paintLG529CIdefault paintlg529cidefault = paintLG529CIdefault.write;
        int i4 = RemoteActionCompatParcelizer + 19;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return paintlg529cidefault;
    }
}
