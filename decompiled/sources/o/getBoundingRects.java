package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getBoundingRects {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow read;
    public final setTransactionSuccessful write;

    public getBoundingRects(setTransactionSuccessful settransactionsuccessful) {
        this.write = settransactionsuccessful;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(applyStandardTemplate.IconCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
    }
}
