package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getActiveChild extends ContinuationImpl {
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore IconCompatParcelizer;
    public /* synthetic */ Object read;
    public androidx.datastore.core.SingleProcessDataStore serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getActiveChild(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.readAndInitOrPropagateFailure(this);
    }
}
