package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n6 {
    public final MutableStateFlow read;
    public final StateFlow write;

    public n6() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(geExternalSyntheticLambda0.IconCompatParcelizer);
        this.read = mutableStateFlow;
        this.write = mutableStateFlow;
    }
}
