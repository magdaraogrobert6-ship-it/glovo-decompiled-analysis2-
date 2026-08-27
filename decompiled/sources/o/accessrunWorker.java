package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class accessrunWorker {
    public final MutableStateFlow serializer;
    public final StateFlow write;

    public accessrunWorker() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.TRUE);
        this.serializer = mutableStateFlow;
        this.write = mutableStateFlow;
    }
}
