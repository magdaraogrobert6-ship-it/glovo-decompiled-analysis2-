package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getEnterTransitionCallback {
    public final MutableStateFlow IconCompatParcelizer;
    public final MutableStateFlow serializer;

    public getEnterTransitionCallback() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(0);
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
    }
}
