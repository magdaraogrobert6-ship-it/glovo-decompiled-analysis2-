package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class igExternalSyntheticLambda2 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow write;

    public igExternalSyntheticLambda2() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(igExternalSyntheticLambda7.NONE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.write = mutableStateFlow;
    }

    public final void IconCompatParcelizer(igExternalSyntheticLambda7 igexternalsyntheticlambda7) {
        int i = 2 % 2;
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        igexternalsyntheticlambda7.getClass();
        this.IconCompatParcelizer.IconCompatParcelizer(igexternalsyntheticlambda7);
        int i4 = RemoteActionCompatParcelizer + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
