package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WindowInsetsCompatImpl28 {
    public final MutableStateFlow IconCompatParcelizer;
    public final CoreComponentFactory RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final StateFlow serializer;
    public final setTransactionSuccessful write;

    public WindowInsetsCompatImpl28(setTransactionSuccessful settransactionsuccessful, CoreComponentFactory coreComponentFactory, getQueryContext getquerycontext) {
        this.write = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = coreComponentFactory;
        this.read = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(canUseFullScreenIntent.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.serializer = mutableStateFlow;
    }
}
