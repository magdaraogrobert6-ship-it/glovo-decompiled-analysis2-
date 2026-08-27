package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class mb {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;

    public mb(m3 m3Var) {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(deserialize.read);
        this.IconCompatParcelizer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
    }
}
