package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class scaledefault extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ coil3.memory.MemoryCacheService write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scaledefault(coil3.memory.MemoryCacheService memoryCacheService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = memoryCacheService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.write.collect(null, this);
    }
}
