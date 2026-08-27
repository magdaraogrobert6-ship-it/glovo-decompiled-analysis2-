package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0 {
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;

    public r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SimpleItemTouchHelperCallback.serializer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
    }
}
