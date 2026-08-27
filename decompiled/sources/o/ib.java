package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ib {
    public final StateFlow read;
    public final MutableStateFlow serializer;

    public ib() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(serialize.NAVIGATION);
        this.serializer = mutableStateFlow;
        this.read = mutableStateFlow;
    }
}
