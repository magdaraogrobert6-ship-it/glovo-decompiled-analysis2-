package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class onPostMigrate {
    public final getQueryContext RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final setTransactionSuccessful serializer;
    public final StateFlow write;

    public onPostMigrate(getQueryContext getquerycontext, setTransactionSuccessful settransactionsuccessful) {
        settransactionsuccessful.getClass();
        getquerycontext.getClass();
        this.serializer = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(TriggerBasedInvalidationTracker.RemoteActionCompatParcelizer);
        this.read = mutableStateFlow;
        this.write = mutableStateFlow;
    }
}
