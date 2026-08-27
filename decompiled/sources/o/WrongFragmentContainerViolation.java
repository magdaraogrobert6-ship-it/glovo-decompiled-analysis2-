package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WrongFragmentContainerViolation {
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow serializer;

    public WrongFragmentContainerViolation() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(ConicConverter.RemoteActionCompatParcelizer);
        this.serializer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
    }
}
