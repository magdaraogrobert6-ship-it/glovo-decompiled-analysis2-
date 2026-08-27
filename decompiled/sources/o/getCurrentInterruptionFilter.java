package o;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getCurrentInterruptionFilter {
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow write;
    public final LinkedHashMap IconCompatParcelizer = new LinkedHashMap();
    public final LinkedHashMap read = new LinkedHashMap();

    public getCurrentInterruptionFilter() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.write = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
    }
}
