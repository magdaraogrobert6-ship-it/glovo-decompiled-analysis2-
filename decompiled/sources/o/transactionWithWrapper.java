package o;

import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class transactionWithWrapper {
    public final ArrayList IconCompatParcelizer;
    public final ContextScope RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen serializer;
    public final accesstransactionWithWrapper write;

    public transactionWithWrapper(accesstransactionWithWrapper accesstransactionwithwrapper) {
        accesstransactionwithwrapper.getClass();
        this.write = accesstransactionwithwrapper;
        this.IconCompatParcelizer = new ArrayList();
        and andVar = new and(getOnBackInvokedCallback.RemoteActionCompatParcelizer, 6);
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(6));
        this.serializer = isadapterpositiononscreen;
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(((CoroutineDispatcher) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).plus(andVar));
        this.RemoteActionCompatParcelizer = contextScopeRemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 29), 3);
    }
}
