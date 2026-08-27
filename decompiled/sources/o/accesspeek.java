package o;

import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accesspeek extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ PerseusConfigLocalDataStoreImpl serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesspeek(PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = perseusConfigLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.retrieveConfiguration(this);
    }
}
