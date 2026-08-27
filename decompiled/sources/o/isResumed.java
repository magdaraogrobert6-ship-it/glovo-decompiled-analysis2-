package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isResumed {
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow serializer;

    public isResumed() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Float.valueOf(0.0f));
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
    }
}
