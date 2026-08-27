package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class removeRearDisplayPresentationStatusListener {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow serializer;

    public removeRearDisplayPresentationStatusListener() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getWindowAreaStatus.read);
        this.IconCompatParcelizer = mutableStateFlow;
        this.serializer = mutableStateFlow;
    }
}
