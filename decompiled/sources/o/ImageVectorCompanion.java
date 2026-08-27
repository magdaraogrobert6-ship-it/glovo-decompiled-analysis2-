package o;

import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageVectorCompanion extends ContinuationImpl {
    public final /* synthetic */ PerseusConfigLocalDataStoreImpl IconCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageVectorCompanion(PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = perseusConfigLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.getMaxBackoffTime(this);
    }
}
