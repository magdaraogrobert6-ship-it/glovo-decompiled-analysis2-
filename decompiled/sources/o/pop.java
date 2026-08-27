package o;

import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class pop extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ PerseusUserLocalDataStoreImpl RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pop(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = perseusUserLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.RatingCompat.putSessionOffset(0L, this);
    }
}
