package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nExternalSyntheticLambda4 {
    public final MutableStateFlow read;
    public final StateFlow serializer;

    public nExternalSyntheticLambda4() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(childSerializers.UNAVAILABLE);
        this.read = mutableStateFlow;
        this.serializer = mutableStateFlow;
    }
}
