package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes4.dex */
public final class StateFlowKt {
    public static final Symbol RemoteActionCompatParcelizer = new Symbol("NONE");
    public static final Symbol serializer = new Symbol("PENDING");

    public static final MutableStateFlow read(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.RemoteActionCompatParcelizer;
        }
        return new StateFlowImpl(obj);
    }
}
