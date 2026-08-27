package o;

import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accesspop extends ContinuationImpl {
    public final /* synthetic */ PerseusUserLocalDataStoreImpl IconCompatParcelizer;
    public createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public createInAppMessageEventSubscriber serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesspop(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = perseusUserLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.getClientId(this);
    }
}
