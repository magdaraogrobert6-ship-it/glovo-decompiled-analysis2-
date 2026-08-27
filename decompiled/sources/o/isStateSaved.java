package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isStateSaved {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow read;

    public isStateSaved() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(onPrimaryNavigationFragmentChanged.COLLAPSED);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
    }
}
