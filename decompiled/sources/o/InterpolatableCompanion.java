package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class InterpolatableCompanion extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ androidx.work.impl.WorkerWrapper serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterpolatableCompanion(androidx.work.impl.WorkerWrapper workerWrapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.work.impl.WorkerWrapper.access$runWorker(this.serializer, this);
    }
}
