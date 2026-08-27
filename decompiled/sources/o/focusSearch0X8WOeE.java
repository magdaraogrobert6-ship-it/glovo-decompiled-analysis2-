package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class focusSearch0X8WOeE extends ContinuationImpl {
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public focusSearch0X8WOeE(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.readDataOrHandleCorruption(this);
    }
}
