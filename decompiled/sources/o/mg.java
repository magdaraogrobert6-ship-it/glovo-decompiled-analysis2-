package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class mg {
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow read;

    public mg() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.read = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
    }
}
