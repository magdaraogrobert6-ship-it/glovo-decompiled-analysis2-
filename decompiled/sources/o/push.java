package o;

import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class push extends ContinuationImpl {
    public final /* synthetic */ PerseusUserLocalDataStoreImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public push(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = perseusUserLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.refreshSessionTimeStamp(this);
    }
}
