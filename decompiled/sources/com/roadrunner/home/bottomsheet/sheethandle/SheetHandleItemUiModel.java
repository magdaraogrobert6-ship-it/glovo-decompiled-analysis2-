package com.roadrunner.home.bottomsheet.sheethandle;

import androidx.compose.ui.graphics.Fields;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.onViewCreated;

/* JADX INFO: loaded from: classes3.dex */
public final class SheetHandleItemUiModel implements onViewCreated {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final StateFlow serializer = StateFlowKt.read(Boolean.TRUE);

    @Override // o.onViewCreated
    public final boolean x_() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
