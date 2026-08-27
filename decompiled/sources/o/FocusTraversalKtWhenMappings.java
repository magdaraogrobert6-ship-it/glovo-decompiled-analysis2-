package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTraversalKtWhenMappings extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore RemoteActionCompatParcelizer;
    public int read;
    public androidx.datastore.core.SingleProcessDataStore write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTraversalKtWhenMappings(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.readAndInitOrPropagateAndThrowFailure(this);
    }
}
