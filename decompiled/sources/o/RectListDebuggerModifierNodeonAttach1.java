package o;

import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class RectListDebuggerModifierNodeonAttach1 {
    public final ContextScope RemoteActionCompatParcelizer;
    public final StateFlow serializer;
    public final MutableStateFlow write;

    public RectListDebuggerModifierNodeonAttach1(isOpenInternalroom_runtime isopeninternalroom_runtime) {
        isopeninternalroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(RectListKt.IconCompatParcelizer);
        this.write = mutableStateFlow;
        this.serializer = mutableStateFlow;
    }
}
