package com.roadrunner.home.bottomsheet.loading;

import androidx.compose.ui.graphics.Fields;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.onViewCreated;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomSheetShimmeringLoadingBarUiModel implements onViewCreated {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final StateFlow serializer = StateFlowKt.read(Boolean.TRUE);

    @Override // o.onViewCreated
    public final boolean x_() {
        int i = 2 % 2;
        int i2 = read + 27;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 53;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 19;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.serializer;
        int i5 = i3 + 103;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
