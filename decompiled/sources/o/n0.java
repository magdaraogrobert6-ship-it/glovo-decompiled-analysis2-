package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow write;

    public n0() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(g9.write);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.write = mutableStateFlow;
    }
}
