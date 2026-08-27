package o;

import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageVectorKt extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final /* synthetic */ PerseusConfigLocalDataStoreImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageVectorKt(PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = perseusConfigLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.write.getBatchDispatchHitsDelay(this);
    }
}
