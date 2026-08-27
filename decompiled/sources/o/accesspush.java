package o;

import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accesspush extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ PerseusUserLocalDataStoreImpl RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesspush(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = perseusUserLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.getSessionOffset(this);
    }
}
