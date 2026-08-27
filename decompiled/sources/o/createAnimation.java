package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class createAnimation {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow serializer;

    public createAnimation() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.serializer = mutableStateFlow;
    }

    public final void read(boolean z) {
        int i = 2 % 2;
        int i2 = write + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(z));
        int i4 = write + 103;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
