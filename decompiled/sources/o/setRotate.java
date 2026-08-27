package o;

import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setRotate extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ PerseusConfigLocalDataStoreImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setRotate(PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = perseusConfigLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.persistConfiguration(null, this);
    }
}
