package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class SubcomposeAsyncImageContent {
    public final MutableStateFlow read;
    public final StateFlow write;

    public SubcomposeAsyncImageContent() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.write = mutableStateFlow;
    }
}
