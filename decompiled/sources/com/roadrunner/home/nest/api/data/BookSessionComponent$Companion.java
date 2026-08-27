package com.roadrunner.home.nest.api.data;

import androidx.compose.ui.graphics.Fields;
import o.CoroutineLiveData;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class BookSessionComponent$Companion {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CoroutineLiveData coroutineLiveData = CoroutineLiveData.serializer;
            throw null;
        }
        CoroutineLiveData coroutineLiveData2 = CoroutineLiveData.serializer;
        int i3 = RemoteActionCompatParcelizer + 27;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return coroutineLiveData2;
        }
        throw null;
    }
}
