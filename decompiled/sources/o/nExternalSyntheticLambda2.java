package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nExternalSyntheticLambda2 {
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow write;

    public nExternalSyntheticLambda2() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(typeParametersSerializers.read);
        this.write = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
    }
}
