package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setInitialSavedState {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow read;

    public setInitialSavedState() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
    }
}
